
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvalVisitor extends MiniCppBaseVisitor<Value> {

	// used to compare floating point numbers
	public static final double SMALL_VALUE = 0.00000000001;

	// store variables (there's only one global scope!)
	private Map<String, Value> memory = new HashMap<String, Value>();
	 public Map<String, Value> getMemory() {
		return memory;
	}
	// assignment/id overrides
	@Override
	public Value visitAssignment(MiniCppParser.AssignmentContext ctx) {
		String id = ctx.ID().getText();
		Value value = this.visit(ctx.expr());

		return memory.put(id, value);
	}

	@Override
	public Value visitIdAtom(MiniCppParser.IdAtomContext ctx) {
		String id = ctx.getText();
		Value value = memory.get(id);
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
		return new Value(Double.valueOf(ctx.getText()));
	}

	@Override
	public Value visitBooleanAtom(MiniCppParser.BooleanAtomContext ctx) {
		return new Value(Boolean.valueOf(ctx.getText()));
	}

	@Override
	public Value visitNilAtom(MiniCppParser.NilAtomContext ctx) {
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
		return new Value(Math.pow(left.asDouble(), right.asDouble()));
	}

	@Override
	public Value visitUnaryMinusExpr(MiniCppParser.UnaryMinusExprContext ctx) {
		Value value = this.visit(ctx.expr());
		return new Value(-value.asDouble());
	}

	@Override
	public Value visitNotExpr(MiniCppParser.NotExprContext ctx) {
		Value value = this.visit(ctx.expr());
		return new Value(!value.asBoolean());
	}

	@Override
	public Value visitMultiplicationExpr(MiniCppParser.MultiplicationExprContext ctx) {

		Value left = this.visit(ctx.expr(0));
		Value right = this.visit(ctx.expr(1));

		switch (ctx.op.getType()) {
		case MiniCppParser.MULT:
			return new Value(left.asDouble() * right.asDouble());
		case MiniCppParser.DIV:
			return new Value(left.asDouble() / right.asDouble());
		case MiniCppParser.MOD:
			return new Value(left.asDouble() % right.asDouble());
		default:
			throw new RuntimeException("unknown operator: " + MiniCppParser.tokenNames[ctx.op.getType()]);
		}

	}

	@Override
	public Value visitAdditiveExpr(MiniCppParser.AdditiveExprContext ctx) {

		Value left = this.visit(ctx.expr(0));
		Value right = this.visit(ctx.expr(1));

		switch (ctx.op.getType()) {
		case MiniCppParser.PLUS:
			return left.isDouble() && right.isDouble() ? new Value(left.asDouble() + right.asDouble())
					: new Value(left.asString() + right.asString());
		case MiniCppParser.MINUS:
			return new Value(left.asDouble() - right.asDouble());
		default:
			throw new RuntimeException("unknown operator: " + MiniCppParser.tokenNames[ctx.op.getType()]);
		}
	}

	@Override
	public Value visitRelationalExpr(MiniCppParser.RelationalExprContext ctx) {

		Value left = this.visit(ctx.expr(0));
		Value right = this.visit(ctx.expr(1));

		switch (ctx.op.getType()) {
		case MiniCppParser.LT:
			return new Value(left.asDouble() < right.asDouble());
		case MiniCppParser.LTEQ:
			return new Value(left.asDouble() <= right.asDouble());
		case MiniCppParser.GT:
			return new Value(left.asDouble() > right.asDouble());
		case MiniCppParser.GTEQ:
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
			return left.isDouble() && right.isDouble()
					? new Value(Math.abs(left.asDouble() - right.asDouble()) < SMALL_VALUE)
					: new Value(left.equals(right));
		case MiniCppParser.NEQ:
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
		return new Value(left.asBoolean() && right.asBoolean());
	}

	@Override
	public Value visitOrExpr(MiniCppParser.OrExprContext ctx) {
		Value left = this.visit(ctx.expr(0));
		Value right = this.visit(ctx.expr(1));
		return new Value(left.asBoolean() || right.asBoolean());
	}

	// log override
	@Override
	public Value visitLog(MiniCppParser.LogContext ctx) {
		Value value = this.visit(ctx.expr());
		System.out.println(value);
		return value;
	}

	// if override
	@Override
	public Value visitIf_stat(MiniCppParser.If_statContext ctx) {

		List<MiniCppParser.Condition_blockContext> conditions = ctx.condition_block();

		boolean evaluatedBlock = false;

		for (MiniCppParser.Condition_blockContext condition : conditions) {

			Value evaluated = this.visit(condition.expr());

			if (evaluated.asBoolean()) {
				evaluatedBlock = true;
				// evaluate this block whose expr==true
				this.visit(condition.stat_block());
				break;
			}
		}

		if (!evaluatedBlock && ctx.stat_block() != null) {
			// evaluate the else-stat_block (if present == not null)
			this.visit(ctx.stat_block());
		}

		return Value.VOID;
	}

	// while override
	@Override
	public Value visitWhile_stat(MiniCppParser.While_statContext ctx) {
System.out.println("ddd"+this.visit(ctx.expr()));
		Value value = this.visit(ctx.expr());
		

		while (value.asBoolean()) {

			// evaluate the code block
			this.visit(ctx.stat_block());

			// evaluate the expression
			value = this.visit(ctx.expr());
		}

		return Value.VOID;
	}
}