import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvalerJava extends MiniCppBaseVisitor<Value> {

	public static final double SMALL_VALUE = 0.00000000001;

	public ProgramBlock PB = new ProgramBlock(50000);

	public Map<String, Value> SymbolTable = new HashMap<String, Value>();

	// TODO bayad ye ds baraie variable a besazam
	// assignment/id overrides
	@Override
	public Value visitAssignment(MiniCppParser.AssignmentContext ctx) {
		String id = ctx.ID().getText();
		Value value = this.visit(ctx.expr());
		// PB.add("push " + value.toString());
		return SymbolTable.put(id, value);
	}

	@Override
	public Value visitIdAtom(MiniCppParser.IdAtomContext ctx) {
		String id = ctx.getText();
		Value value = SymbolTable.get(id);
		PB.add("push " + id);// pointer be DS e variable ha
		if (value == null) {
			throw new RuntimeException("no such variable: " + id);
		}
		return value;
	}

	// atom overrides
	@Override
	public Value visitStringAtom(MiniCppParser.StringAtomContext ctx) {
		String str = ctx.getText();
		// strip quotes
		str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
		return new Value(str);
	}

	@Override
	public Value visitNumberAtom(MiniCppParser.NumberAtomContext ctx) {
		PB.add("push " + Double.valueOf(ctx.getText()));// pointer be DS e
														// number ha
		return new Value(Double.valueOf(ctx.getText()));
	}

	@Override
	public Value visitBooleanAtom(MiniCppParser.BooleanAtomContext ctx) {
		PB.add("push " + Boolean.valueOf(ctx.getText()));
		return new Value(Boolean.valueOf(ctx.getText()));
	}

	@Override
	public Value visitNilAtom(MiniCppParser.NilAtomContext ctx) {
		PB.add("push null");
		return new Value(null);
	}

	// expr overrides
	@Override
	public Value visitParExpr(MiniCppParser.ParExprContext ctx) {
		return this.visit(ctx.expr());
	}

	@Override
	public Value visitPowExpr(MiniCppParser.PowExprContext ctx) {
		Value left = this.visit(ctx.expr(0));
		Value right = this.visit(ctx.expr(1));
		// stack ba a^b
		PB.add("pop tempB");// reg
		PB.add("pop tempA");
		PB.add("push tempA");
		for (int i = 0; i < right.asDouble(); i++) {
			PB.add("mlt");
		}
		return new Value(Math.pow(left.asDouble(), right.asDouble()));
	}

	@Override
	public Value visitUnaryMinusExpr(MiniCppParser.UnaryMinusExprContext ctx) {
		Value value = this.visit(ctx.expr());

		// stack a
		PB.add("neg");

		return new Value(-value.asDouble());
	}

	@Override
	public Value visitNotExpr(MiniCppParser.NotExprContext ctx) {
		Value value = this.visit(ctx.expr());

		// stack a
		PB.add("not");

		return new Value(!value.asBoolean());
	}

	@Override
	public Value visitMultiplicationExpr(MiniCppParser.MultiplicationExprContext ctx) {

		Value left = this.visit(ctx.expr(0));
		Value right = this.visit(ctx.expr(1));

		switch (ctx.op.getType()) {
		case MiniCppParser.MULT:
			PB.add("mlt");
			return new Value(left.asDouble() * right.asDouble());
		case MiniCppParser.DIV:
			PB.add("div");
			return new Value(left.asDouble() / right.asDouble());
		case MiniCppParser.MOD:
			return new Value(left.asDouble() % right.asDouble());
		default:
			throw new RuntimeException("unknown operator: " + ctx.op.getType());
		}
	}

	@Override
	public Value visitAdditiveExpr(MiniCppParser.AdditiveExprContext ctx) {

		Value left = this.visit(ctx.expr(0));
		Value right = this.visit(ctx.expr(1));

		switch (ctx.op.getType()) {
		case MiniCppParser.PLUS:
			if (left.isDouble() && right.isDouble()) {
				PB.add("add");
				return new Value(left.asDouble() + right.asDouble());
			} else {
				return new Value(left.asString() + right.asString());
			}

		case MiniCppParser.MINUS:
			PB.add("sub");
			return new Value(left.asDouble() - right.asDouble());
		default:
			throw new RuntimeException("unknown operator: " + MiniCppParser.tokenNames[ctx.op.getType()]);
		}
	}

	@Override
	public Value visitRelationalExpr(MiniCppParser.RelationalExprContext ctx) {

		Value left = this.visit(ctx.expr(0));
		Value right = this.visit(ctx.expr(1));

		// stack ab
		switch (ctx.op.getType()) {
		case MiniCppParser.LT:
			PB.add("sub");
			PB.add("call lessThanLabel");// mesle ye function mire agarbargharar
											// bod 1 agar nabod 2 bar migardone
			// PB.add("ret 1");// increment SP by nloc =1

			return new Value(left.asDouble() < right.asDouble());
		case MiniCppParser.LTEQ:
			PB.add("sub");
			PB.add("call lessThanEqualLabel");// mesle ye function mire
												// agarbargharar bod 1 agar
												// nabod 2 bar migardone
			// PB.add("ret 1");// increment SP by nloc =1
			return new Value(left.asDouble() <= right.asDouble());
		case MiniCppParser.GT:
			PB.add("sub");
			PB.add("call greaterThanLabel");// mesle ye function mire
											// agarbargharar bod 1 agar nabod 2
											// bar migardone
			// PB.add("ret 1");// increment SP by nloc =1
			return new Value(left.asDouble() > right.asDouble());
		case MiniCppParser.GTEQ:
			PB.add("sub");
			PB.add("call greaterThanEqualLabel");// mesle ye function mire
													// agarbargharar bod 1 agar
													// nabod 2 bar migardone
			// PB.add("ret 1");// increment SP by nloc =1
			return new Value(left.asDouble() >= right.asDouble());
		default:
			throw new RuntimeException("unknown operator: " + MiniCppParser.tokenNames[ctx.op.getType()]);
		}
	}

	@Override
	public Value visitEqualityExpr(MiniCppParser.EqualityExprContext ctx) {

		Value left = this.visit(ctx.expr(0));
		Value right = this.visit(ctx.expr(1));

		switch (ctx.op.getType()) {
		case MiniCppParser.EQ:
			PB.add("sub");
			PB.add("call EqualLabel");// mesle ye function mire agarbargharar
										// bod 1 agar nabod 2 bar migardone
			// PB.add("ret 1");// increment SP by nloc =1
			return left.isDouble() && right.isDouble()
					? new Value(Math.abs(left.asDouble() - right.asDouble()) < SMALL_VALUE)
					: new Value(left.equals(right));
		case MiniCppParser.NEQ:
			PB.add("sub");
			PB.add("call NotEqualLabel");// mesle ye function mire agarbargharar
											// bod 1 agar nabod 2 bar migardone
			// PB.add("ret 1");// increment SP by nloc =1
			return left.isDouble() && right.isDouble()
					? new Value(Math.abs(left.asDouble() - right.asDouble()) >= SMALL_VALUE)
					: new Value(!left.equals(right));
		default:
			throw new RuntimeException("unknown operator: " + MiniCppParser.tokenNames[ctx.op.getType()]);
		}
	}

	@Override
	public Value visitAndExpr(MiniCppParser.AndExprContext ctx) {
		Value left = this.visit(ctx.expr(0));
		Value right = this.visit(ctx.expr(1));
		PB.add("and");
		return new Value(left.asBoolean() && right.asBoolean());
	}

	@Override
	public Value visitOrExpr(MiniCppParser.OrExprContext ctx) {
		Value left = this.visit(ctx.expr(0));
		Value right = this.visit(ctx.expr(1));
		PB.add("or");
		return new Value(left.asBoolean() || right.asBoolean());
	}

	// log override
	@Override
	public Value visitLog(MiniCppParser.LogContext ctx) {
		Value value = this.visit(ctx.expr());
		if (value.asString() != null)
			PB.add("putc");
		else
			PB.add("puti");
		System.out.println(value);
		return value;
	}

	/////////////////////// ta inja zadam
	// if override
	@Override
	public Value visitIf_stat(MiniCppParser.If_statContext ctx) {

		List<MiniCppParser.Condition_blockContext> conditions = ctx.condition_block();

		boolean evaluatedBlock = false;
		ArrayList<Integer> uncondiJump = new ArrayList<>();
		for (MiniCppParser.Condition_blockContext condition : conditions) {

			Value evaluated = this.visit(condition.expr());
			int tempi = PB.getIndex();
			PB.add("jlt ");// pormishe ke agar aflse bod koja bere true od ke
							// edame mide

			if (evaluated.asBoolean()) {
				evaluatedBlock = true;
				// evaluate this block whose expr==true
				this.visit(condition.stat_block());

				// break;//baraie code gen khamoshe
			}
			uncondiJump.add(PB.getIndex());
			PB.add("jmp ");
			PB.merge(tempi, PB.getNextIndexSTR());

		}

		if (!evaluatedBlock && ctx.stat_block() != null) {

			// evaluate the else-stat_block (if present == not null)
			this.visit(ctx.stat_block());
		}
		for (Integer integer : uncondiJump) {
			PB.merge(integer, PB.getNextIndexSTR());
		}

		return Value.VOID;
	}

	// while override
	@Override
	public Value visitWhile_stat(MiniCppParser.While_statContext ctx) {

		Value value = this.visit(ctx.expr());

		int tempi = PB.getIndex();
		PB.add("jlt ");// pormishe ke agar aflse bod koja bere true od ke edame
						// mide

		while (value.asBoolean()) {
			this.visit(ctx.stat_block());

			value = this.visit(ctx.expr());
			PB.add("jmp " + tempi);
		}

		PB.merge(tempi, PB.getNextIndexSTR());
		return Value.VOID;
	}

	/////////////// fuck this

	@Override
	public Value visitPlusplus_stat(MiniCppParser.Plusplus_statContext ctx) {
		String id = ctx.ID().getText();
		return SymbolTable.put(id, new Value(SymbolTable.get(id).asDouble() + 1));
	}

	@Override
	public Value visitMinusminus_stat(MiniCppParser.Minusminus_statContext ctx) {
		String id = ctx.ID().getText();
		return SymbolTable.put(id, new Value(SymbolTable.get(id).asDouble() - 1));
	}

	@Override
	public Value visitDo_while_stat(MiniCppParser.Do_while_statContext ctx) {
		Value value = this.visit(ctx.expr());

		do {

			// evaluate the code block
			this.visit(ctx.stat_block());

			// evaluate the expression
			value = this.visit(ctx.expr());
		} while (value.asBoolean());

		return Value.VOID;
	}

	@Override
	public Value visitFor_stat(MiniCppParser.For_statContext ctx) {
		this.visit(ctx.inDeclare());
		Value value = this.visit(ctx.expr());
		while (value.asBoolean()) {

			// evaluate the code block
			this.visit(ctx.stat_block());

			// evaluate the expression
			this.visit(ctx.for_ass());
			value = this.visit(ctx.expr());
		}
		return Value.VOID;
	}

	@Override
	public Value visitFor_ass(MiniCppParser.For_assContext ctx) {
		if (!ctx.expr().isEmpty()) {
			String id = ctx.ID().getText();
			Value value = this.visit(ctx.expr());
			return SymbolTable.put(id, value);
		}
		if (!ctx.expr().isEmpty()) {
			String id = ctx.ID().getText();
			Value value = new Value(SymbolTable.get(id).asDouble() + 1);
			return SymbolTable.put(id, value);
		}
		throw new RuntimeException("id not found : " + ctx.ID().getText());
	}

	@Override
	public Value visitDeclare(MiniCppParser.DeclareContext ctx) {
		String id = ctx.ID().getText();

		try {
			Value value = this.visit(ctx.expr());
			return SymbolTable.put(id, value);
		} catch (Exception e) {
			Value value = new Value(0);
			return SymbolTable.put(id, value);
		}
	}

	@Override
	public Value visitCout_stat(MiniCppParser.Cout_statContext ctx) {
		Value value = this.visit(ctx.expr());
		System.out.println(value);
		if (value.asString() != null)
			PB.add("putc");
		else
			PB.add("puti");
		return value;
	}

	@Override
	public Value visitCin_stat(MiniCppParser.Cin_statContext ctx) {
		// TODO meghdar giri

		String id = ctx.ID().getText();
		Value value = new Value(123);

		return SymbolTable.put(id, value);
	}

	@Override
	public Value visitSwitch_stat(MiniCppParser.Switch_statContext ctx) {
		String id = ctx.ID().getText();
		Value value = SymbolTable.get(id);

		List<MiniCppParser.Case_statContext> cases = ctx.case_stat();

		for (MiniCppParser.Case_statContext ccase : cases) {

			// System.out.println(Double.valueOf(ccase.atom().getText())+"
			// "+value.asDouble());
			if (Double.valueOf(ccase.atom().getText()).equals(value.asDouble())) {
				this.visit(ccase.block());
				break;
			}

		}
		return Value.VOID;
	}

	@Override
	public Value visitCase_stat(MiniCppParser.Case_statContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCase_stat(ctx);
	}

	@Override
	public Value visitInDeclare(MiniCppParser.InDeclareContext ctx) {
		String id = ctx.ID().getText();

		try {
			Value value = this.visit(ctx.expr());
			return SymbolTable.put(id, value);
		} catch (Exception e) {
			Value value = this.visit(ctx.expr());
			return SymbolTable.put(id, value);
		}
	}

}
