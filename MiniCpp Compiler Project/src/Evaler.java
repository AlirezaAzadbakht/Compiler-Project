import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Evaler extends MiniCppBaseVisitor<Value> {

	public static final double SMALL_VALUE = 0.00000000001;

	public ProgramBlock PB = new ProgramBlock(50000);

	public Map<String, Value> SymbolTable = new HashMap<String, Value>();

	public SymbolTable st = new SymbolTable();

	public String CurrentBlock;

	public ArrayList<String> funcDeclared = new ArrayList<>();

	public ArrayList<String> funcBodyBeforeMain = new ArrayList<>();

	public int seenDeclare = 0;

	public ArrayList<String> funcBodyAfterMain = new ArrayList<>();

	public int seenBody = 0;

	public boolean MainSeen = false;

	public ArrayList<String> seenReturn = new ArrayList<>();

	// assignment/id overrides
	@Override
	public Value visitAssignment(MiniCppParser.AssignmentContext ctx) {
		String id = ctx.ID().getText();
		Value value = this.visit(ctx.expr());
		// System.out.println(value.asDouble());
		PB.add("pop " + st.findByIdBlock(id, this.CurrentBlock) + "[LSP]");
		st.add("ass", id, value, this.CurrentBlock);
		return SymbolTable.put(id, value);
	}

	@Override
	public Value visitIdAtom(MiniCppParser.IdAtomContext ctx) {
		String id = ctx.getText();
		Value value = SymbolTable.get(id);
		PB.add("push " + st.findByIdBlock(id, this.CurrentBlock) + "[LSP]");// pointer
																			// be
		// DS e
		// variable
		// ha
		if (value == null) {
			throw new RuntimeException("no such variable: " + id);
		}

		return value;
	}

	@Override
	public Value visitDeclare(MiniCppParser.DeclareContext ctx) {
		String id = ctx.ID().getText();
		// System.out.println(ctx.ASSIGN()==null);
		if (ctx.ASSIGN() == null) {

			Value value = new Value(new Double(0));
			st.add(ctx.type().getText(), id, value, this.CurrentBlock);
			PB.add("push 0");
			PB.add("pop " + st.findByIdBlock(id, this.CurrentBlock) + "[LSP]");
			return SymbolTable.put(id, value);
		}
		Value value = this.visit(ctx.expr());
		st.add(ctx.type().getText(), id, value, this.CurrentBlock);
		PB.add("pop " + st.findByIdBlock(id, this.CurrentBlock) + "[LSP]");

		return SymbolTable.put(id, value);

	}

	@Override
	public Value visitFor_ass(MiniCppParser.For_assContext ctx) {

		try {
			if (ctx.ASSIGN() != null) {
				String id = ctx.ID().getText();
				Value value = this.visit(ctx.expr());
				//System.out.println("sss");
				PB.add("pop " + st.findByIdBlock(id, this.CurrentBlock) + "[LSP]");

				st.add("ass", id, value, this.CurrentBlock);
				return SymbolTable.put(id, value);
			} else {
				String id = ctx.ID().getText();
				Value value = this.visit(ctx.expr());
				PB.add("push " + st.findByIdBlock(id, this.CurrentBlock) + "[LSP]");
				Value value1 = null;
				try {
					value1 = new Value(SymbolTable.get(id).asInteger() + value.asInteger());
				} catch (Exception e) {
					value1 = new Value(SymbolTable.get(id).asFloat() + value.asFloat());
				}
				//System.out.println("s");
				PB.add("add");
				PB.add("pop " + st.findByIdBlock(id, this.CurrentBlock) + "[LSP]");
				return SymbolTable.put(id, value1);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new RuntimeException("id not found : " + ctx.ID().getText());
		}

	}

	@Override
	public Value visitInDeclare(MiniCppParser.InDeclareContext ctx) {
		String id = ctx.ID().getText();
		Value value = this.visit(ctx.expr());
		st.add(ctx.type().getText(), id, value, this.CurrentBlock);
		// PB.add("push "+value);

		PB.add("pop " + st.findByIdBlock(id, this.CurrentBlock) + "[LSP]");
		return SymbolTable.put(id, value);

	}

	@Override
	public Value visitPlusplus_stat(MiniCppParser.Plusplus_statContext ctx) {

		String id = ctx.ID().getText();
		PB.add("push 1");
		PB.add("push " + st.findByIdBlock(id, this.CurrentBlock) + "[LSP]");
		PB.add("add");
		PB.add("pop " + st.findByIdBlock(id, this.CurrentBlock) + "[LSP]");
		try {
			return SymbolTable.put(id, new Value(SymbolTable.get(id).asInteger() + 1));
		} catch (Exception e) {
			try {
				return SymbolTable.put(id, new Value(SymbolTable.get(id).asInteger() + 1));
			} catch (Exception e2) {
				throw new RuntimeException("no such variable: " + id);
			}

		}

	}

	@Override
	public Value visitMinusminus_stat(MiniCppParser.Minusminus_statContext ctx) {
		String id = ctx.ID().getText();
		PB.add("push 1");
		PB.add("neg");
		PB.add("push " + st.findByIdBlock(id, this.CurrentBlock) + "[LSP]");
		PB.add("add");
		PB.add("pop " + st.findByIdBlock(id, this.CurrentBlock) + "[LSP]");
		// return SymbolTable.put(id, new Value(SymbolTable.get(id).asDouble() -
		// 1));
		try {
			return SymbolTable.put(id, new Value(SymbolTable.get(id).asInteger() - 1));
		} catch (Exception e) {
			try {
				return SymbolTable.put(id, new Value(SymbolTable.get(id).asFloat() - 1));
			} catch (Exception e2) {
				throw new RuntimeException("no such variable: " + id);
			}

		}
	}

	// atom overrides
	@Override
	public Value visitStringAtom(MiniCppParser.StringAtomContext ctx) {
		String str = ctx.getText();
		// strip quotes
		str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
		PB.add("push \'" + str + "\'");
		return new Value(str);
	}

	// @Override
	// public Value visitNumberAtom(MiniCppParser.NumberAtomContext ctx) {
	// PB.add("push " + Double.valueOf(ctx.getText()));// pointer be DS e
	// // number ha
	// return new Value(Double.valueOf(ctx.getText()));
	// }

	@Override
	public Value visitBooleanAtom(MiniCppParser.BooleanAtomContext ctx) {
		String result="0";
		if(Boolean.valueOf(ctx.getText().equals("true")))
			result="1";
		
		PB.add("push " + result);
		return new Value(Boolean.valueOf(ctx.getText()));
	}

	@Override
	public Value visitNilAtom(MiniCppParser.NilAtomContext ctx) {
		PB.add("push null");
		return new Value(null);
	}

	@Override
	public Value visitCharAtom(MiniCppParser.CharAtomContext ctx) {
		PB.add("push " + (ctx.getText()));
		return new Value(ctx.getText());
	}

	@Override
	public Value visitFloatAtom(MiniCppParser.FloatAtomContext ctx) {
		PB.add("push " + (ctx.getText()));
		return new Value(Float.valueOf(ctx.getText()));
	}

	@Override
	public Value visitIntAtom(MiniCppParser.IntAtomContext ctx) {
		PB.add("push " + (ctx.getText()));
		return new Value(Integer.valueOf(ctx.getText()));
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

		try {
			return new Value(-value.asInteger());
		} catch (Exception e) {
			return new Value(-value.asFloat());
		}
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
			try {
				return new Value(left.asInteger() * right.asInteger());
			} catch (Exception e) {
				return new Value(left.asFloat() * right.asFloat());
			}

		case MiniCppParser.DIV:
			PB.add("div");
			try {
				return new Value(left.asInteger() / right.asInteger());
			} catch (Exception e) {
				return new Value(left.asFloat() / right.asFloat());
			}

		case MiniCppParser.MOD:
			try {
				return new Value(left.asInteger() % right.asInteger());
			} catch (Exception e) {
				return new Value(left.asFloat() % right.asFloat());
			}
		default:
			throw new RuntimeException("unknown operator: " + ctx.op.getType());
		}
	}

	@Override
	public Value visitAdditiveExpr(MiniCppParser.AdditiveExprContext ctx) {

		Value left = this.visit(ctx.expr(0));
		Value right = this.visit(ctx.expr(1));

		// System.out.println(left.isDouble() + " " + right.isDouble());

		switch (ctx.op.getType()) {
		case MiniCppParser.PLUS:
			if (left.isString() && right.isString()) {
				PB.add("add");
				return new Value(left.asString() + right.asString());

			} else {
				PB.add("add");
				try {
					return new Value(left.asInteger() + right.asInteger());
				} catch (Exception e) {
					return new Value(left.asFloat() + right.asFloat());
				}
			}

		case MiniCppParser.MINUS:
			PB.add("sub");
			try {
				return new Value(left.asInteger() - right.asInteger());
			} catch (Exception e) {
				return new Value(left.asFloat() - right.asFloat());
			}

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
			PB.add("jlt " + (PB.getIndex() + 4));
			PB.add("push 0");
			PB.add("jmp " + (PB.getIndex() + 3));
			PB.add("push 1");

			try {
				return new Value(left.asInteger() < right.asInteger());
			} catch (Exception e) {
				return new Value(left.asFloat() < right.asFloat());
			}

		case MiniCppParser.LTEQ:
			PB.add("sub");
			PB.add("jlt " + (PB.getIndex() + 4));
			PB.add("push 0");
			PB.add("jmp " + (PB.getIndex() + 4));
			PB.add("push 1");
			PB.add("jmp " + (PB.getIndex() + 6));
			PB.add("jz " + (PB.getIndex() + 4));
			PB.add("push 0");
			PB.add("jmp " + (PB.getIndex() + 3));
			PB.add("push 1");

			try {
				return new Value(left.asInteger() <= right.asInteger());
			} catch (Exception e) {
				return new Value(left.asFloat() <= right.asFloat());
			}

		case MiniCppParser.GT:
			PB.add("sub");
			PB.add("jgt " + (PB.getIndex() + 4));
			PB.add("push 0");
			PB.add("jmp " + (PB.getIndex() + 3));
			PB.add("push 1");
			try {
				return new Value(left.asInteger() > right.asInteger());
			} catch (Exception e) {
				return new Value(left.asFloat() > right.asFloat());
			}
//TODO
		case MiniCppParser.GTEQ:
			PB.add("sub");
			PB.add("jgt " + (PB.getIndex() + 4));
			PB.add("push 0");
			PB.add("jmp " + (PB.getIndex() + 4));
			PB.add("push 1");
			PB.add("jmp " + (PB.getIndex() + 6));
			PB.add("jz " + (PB.getIndex() + 4));
			PB.add("push 0");
			PB.add("jmp " + (PB.getIndex() + 3));
			PB.add("push 1");
			try {
				return new Value(left.asInteger() >= right.asInteger());
			} catch (Exception e) {
				return new Value(left.asFloat() >= right.asFloat());
			}

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
			PB.add("jz " + (PB.getIndex() + 4));
			PB.add("push 0");
			PB.add("jmp " + (PB.getIndex() + 3));
			PB.add("push 1");
			try {
				return left.isInteger() && right.isInteger()
						? new Value(Math.abs(left.asInteger() - right.asInteger()) < SMALL_VALUE)
						: new Value(left.equals(right));
			} catch (Exception e) {
				return left.isFloat() && right.isFloat()
						? new Value(Math.abs(left.asFloat() - right.asFloat()) < SMALL_VALUE)
						: new Value(left.equals(right));

			}

		case MiniCppParser.NEQ:
			PB.add("sub");
			PB.add("jnz " + (PB.getIndex() + 4));
			PB.add("push 0");
			PB.add("jmp " + (PB.getIndex() + 3));
			PB.add("push 1");
			try {
				return left.isInteger() && right.isInteger()
						? new Value(Math.abs(left.asInteger() - right.asInteger()) >= SMALL_VALUE)
						: new Value(!left.equals(right));
			} catch (Exception e) {
				return left.isFloat() && right.isFloat()
						? new Value(Math.abs(left.asFloat() - right.asFloat()) >= SMALL_VALUE)
						: new Value(!left.equals(right));
			}

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
		// System.out.println(value);
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
			PB.add("jz ");// pormishe ke agar aflse bod koja bere true od ke
							// edame mide

			if (evaluated.asBoolean()) {
				evaluatedBlock = true;
				// evaluate this block whose expr==true
				this.visit(condition.stat_block());

				// break;//baraie code gen khamoshe
			} else
				this.visit(condition.stat_block());
			uncondiJump.add(PB.getIndex());
			PB.add("jmp ");
			PB.merge(tempi, PB.getNextIndexSTR());

		}

		if (!evaluatedBlock && ctx.stat_block() != null) {

			// evaluate the else-stat_block (if present == not null)
			this.visit(ctx.stat_block());
		} else
			this.visit(ctx.stat_block());
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
		PB.add("jz ");// pormishe ke agar aflse bod koja bere true od ke edame
						// mide

		// while (value.asBoolean()) {
		this.visit(ctx.stat_block());

		// value = this.visit(ctx.expr());
		PB.add("jmp " + tempi);
		// }

		PB.merge(tempi, PB.getNextIndexSTR());
		return Value.VOID;
	}

	/////////////// fuck this

	@Override
	public Value visitDo_while_stat(MiniCppParser.Do_while_statContext ctx) {
		Value value;
		int tempi = PB.getIndex() + 1;
		// do {

		// evaluate the code block
		this.visit(ctx.stat_block());

		// evaluate the expression

		value = this.visit(ctx.expr());
		PB.add("jnz " + tempi);
		// } while (value.asBoolean());

		return Value.VOID;
	}

	//////////////////// ta inja zadam
	@Override
	public Value visitFor_stat(MiniCppParser.For_statContext ctx) {
		this.visit(ctx.inDeclare());
		int uncodiI = PB.getIndex() + 1;
		Value value = this.visit(ctx.expr());
		int tempi = PB.getIndex();
		PB.add("jz ");
		// while (value.asBoolean()) {

		// evaluate the code block
		this.visit(ctx.stat_block());

		// evaluate the expression
		this.visit(ctx.for_ass());
		PB.add("jmp " + uncodiI);
		// value = this.visit(ctx.expr());

		// }
		PB.merge(tempi, PB.getNextIndexSTR());

		return Value.VOID;
	}

	@Override
	public Value visitMinusminus(MiniCppParser.MinusminusContext ctx) {
		PB.add("push 1");
		PB.add("neg");
		return new Value(new Integer(-1));
	}

	@Override
	public Value visitPlusplus(MiniCppParser.PlusplusContext ctx) {
		PB.add("push 1");
		return new Value(new Integer(1));
	}

	@Override
	public Value visitCout_stat(MiniCppParser.Cout_statContext ctx) {
		Value value = this.visit(ctx.expr());
		// System.out.println(value);
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
		PB.add("geti");
		PB.add("pop " + st.findByIdBlock(id, this.CurrentBlock) + "[LSP]");
		return SymbolTable.put(id, value);
	}

	@Override
	public Value visitSwitch_stat(MiniCppParser.Switch_statContext ctx) {
		String id = ctx.ID().getText();
		Value value = SymbolTable.get(id);

		PB.add("push " + id);

		List<MiniCppParser.Case_statContext> cases = ctx.case_stat();
		ArrayList<Integer> breakI = new ArrayList<>();
		int tempi = -1;
		PB.add("pop -1[LSP]");

		for (MiniCppParser.Case_statContext ccase : cases) {

			// System.out.println(Double.valueOf(ccase.atom().getText())+"
			// "+value.asDouble());

			if (tempi != -1)
				PB.merge(tempi, PB.getNextIndexSTR());

			PB.add("push -1[LSP]");
			PB.add("push " + ccase.atom().getText());
			PB.add("sub");
			tempi = PB.getIndex();

			PB.add("jnz ");

			// if
			// (Double.valueOf(ccase.atom().getText()).equals(value.asDouble()))
			// {
			this.visit(ccase.block());
			// break;
			// }
			if (ccase.BREAK() != null) {
				breakI.add(PB.getIndex());
				PB.add("jmp ");

			} else {
				PB.add("jmp " + (PB.getIndex() + 6));
			}

		}

		PB.merge(tempi, PB.getNextIndexSTR());

		if (ctx.default_stat() != null) {
			this.visit(ctx.default_stat());

		}

		for (Integer integer : breakI) {
			PB.merge(integer, PB.getNextIndexSTR());
		}
		return Value.VOID;
	}

	// return TODO ret 1??
	@Override
	public Value visitReturn_stat(MiniCppParser.Return_statContext ctx) {

		String seenType = "void";
		try {
			// this.visit(ctx.atom());
			seenType = this.visit(ctx.atom()).value.getClass().getSimpleName();
		} catch (Exception e) {

		}

		switch (seenType) {
		case "Integer":
			seenType = "int";
			break;
		case "String":
			seenType = "char";
			break;
		case "Boolean":
			seenType = "bool";
			break;
		case "Float":
			seenType = "float";
			break;
		case "void":
			seenType = "void";
			break;
		case "Double":
			seenType = "int";
			break;
		default:
			throw new RuntimeException("function return type not match: " + this.CurrentBlock + " - " + seenType);
		}

		String returnType = st.GetfuncReturnType(this.CurrentBlock);

		// System.out.println(seenType + " " + returnType);

		if (seenType.equals(returnType))
			seenReturn.add(this.CurrentBlock);
		// inja bayad type chking bokonam

		PB.add("ret 1");
		return Value.VOID;
	}

	@Override
	public Value visitEndof_body(MiniCppParser.Endof_bodyContext ctx) {
		String returnType = st.GetfuncReturnType(this.CurrentBlock);
		// System.out.println(seenReturn.toString());
		// System.out.println(returnType);

		if (!seenReturn.contains(this.CurrentBlock))
			throw new RuntimeException("return type not matched: " + this.CurrentBlock + " - " + returnType);
		seenReturn.remove(this.CurrentBlock);
		return super.visitEndof_body(ctx);
	}

	//////////////////////////////////////// function handeling
	// setting blocks
	@Override
	public Value visitMain_stat(MiniCppParser.Main_statContext ctx) {
		this.MainSeen = true;
		this.CurrentBlock = ctx.MAIN().getText();
		if (ctx.type() != null)
			st.add(ctx.type().getText(), "main", new Value("main"), "funcDeclare");
		else
			st.add("void", "main", new Value("main"), "funcDeclare");
		return super.visitMain_stat(ctx);
	}

	@Override
	public Value visitFunction_body(MiniCppParser.Function_bodyContext ctx) {
		this.CurrentBlock = ctx.ID().getText();

		if (MainSeen == true && st.GetfuncReturnType(ctx.ID().getText()) == null) {
			throw new RuntimeException("function without declare: " + this.CurrentBlock);
		}
		// exception handeling///////////////////////////////////
		if (MainSeen == false) {
			if (funcBodyBeforeMain.contains(ctx.ID().getText()))
				throw new RuntimeException("function double declare: " + ctx.ID().getText());

			funcBodyBeforeMain.add(ctx.ID().getText());

			seenDeclare++;
			seenBody++;

		} else {
			if (!funcDeclared.contains(ctx.ID().getText())) {
				throw new RuntimeException("function without declare: " + ctx.ID().getText());
			}
			if (funcBodyBeforeMain.contains(ctx.ID().getText())) {
				throw new RuntimeException("function double declare: " + ctx.ID().getText());
			}
			if (funcBodyAfterMain.contains(ctx.ID().getText())) {
				throw new RuntimeException("function double declare: " + ctx.ID().getText());
			}
			seenBody++;
			funcBodyAfterMain.add(ctx.ID().getText());

		}
		//////////////////////////////////////////////////////
		String headerInput = "";
		ArrayList<String> inputs = new ArrayList<>();
		try {
			for (MiniCppParser.Input_paramContext a : ctx.input_param()) {
				inputs.add(a.type().getText());
				// set new

				headerInput += a.type().getText() + a.ID().getText();
				// assign input in symboltable
				st.add(a.type().getText(), a.ID().getText(), new Value(0), this.CurrentBlock);
				// PB.add("push 0");
				PB.add("pop " + st.findByIdBlock(a.ID().getText(), this.CurrentBlock) + "[LSP]");

			}
		} catch (Exception e) {
		}
		String header = "void";
		try {
			ctx.type().getText();
		} catch (Exception e) {
		}
		Value temp = new Value(header + ctx.ID().getText() + headerInput);
		temp.setFuncInputValues(inputs);
		if (ctx.type() != null)
			st.add(ctx.type().getText(), ctx.ID().getText(), temp, "funcDeclare");
		else
			st.add(ctx.voidType().getText(), ctx.ID().getText(), temp, "funcDeclare");
		return super.visitFunction_body(ctx);
	}

	@Override
	public Value visitFunction_declare(MiniCppParser.Function_declareContext ctx) {

		ArrayList<String> inputs = new ArrayList<>();

		String headerInput = "";

		for (MiniCppParser.Input_paramContext a : ctx.input_param()) {
			inputs.add(a.type().getText());
			headerInput += a.type().getText() + a.ID().getText();

		}
		if (funcDeclared.contains(ctx.ID().getText()))
			throw new RuntimeException("function double declare: " + ctx.ID().getText());
		if (funcBodyBeforeMain.contains(ctx.ID().getText()))
			throw new RuntimeException("function declare after body: " + ctx.ID().getText());

		funcDeclared.add(ctx.ID().getText());

		seenDeclare++;

		String header = "void";
		try {
			ctx.type().getText();
		} catch (Exception e) {
		}

		Value temp = new Value(header + ctx.ID().getText() + headerInput);
		temp.setFuncInputValues(inputs);
		if (ctx.type() != null)
			st.add(ctx.type().getText(), ctx.ID().getText(), temp, "funcDeclare");
		else
			st.add(ctx.voidType().getText(), ctx.ID().getText(), temp, "funcDeclare");
		return super.visitFunction_declare(ctx);
	}

	@Override
	public Value visitFunction_call(MiniCppParser.Function_callContext ctx) {
		ArrayList<String> commingInput = new ArrayList<>();
		for (MiniCppParser.AtomContext a : ctx.atom()) {
			commingInput.add(this.visit(a).value.getClass().getSimpleName());
		}
		ArrayList<String> funcInput = st.GetfuncInputs(ctx.ID().getText());
		// System.out.println(funcInput.size() + " " + commingInput.size());
		if (funcInput.size() != commingInput.size())
			throw new RuntimeException("function input not match: " + ctx.ID().getText());
		try {
			for (int i = 0; i < commingInput.size(); i++) {
				// System.out.println(funcInput.get(i) + " " +
				// commingInput.get(i));
				if (!((funcInput.get(i).equals("int") && commingInput.get(i).equals("Double"))
						|| (funcInput.get(i).equals("bool") && commingInput.get(i).equals("Boolean"))
						|| (funcInput.get(i).equals("float") && commingInput.get(i).equals("Float"))
						|| (funcInput.get(i).equals("int") && commingInput.get(i).equals("Integer"))
						|| (funcInput.get(i).equals("char") && commingInput.get(i).equals("String"))))
					throw new RuntimeException("function input not match: " + ctx.ID().getText());

			}
		} catch (Exception e) {
			throw new RuntimeException("function input not match: " + ctx.ID().getText());
		}

		PB.add("call " + st.findByIdBlock(ctx.ID().getText(), "funcDeclare") + "[LSP]");
		return Value.VOID;
	}

	@Override
	public Value visitFunction_callExpr(MiniCppParser.Function_callExprContext ctx) {

		return super.visitFunction_callExpr(ctx);
	}

}
