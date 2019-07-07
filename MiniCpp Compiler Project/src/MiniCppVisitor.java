// Generated from MiniCpp.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniCppParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniCppVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(MiniCppParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(MiniCppParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#endof_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndof_body(MiniCppParser.Endof_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#function_declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declare(MiniCppParser.Function_declareContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#input_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_param(MiniCppParser.Input_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MiniCppParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(MiniCppParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(MiniCppParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#return_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stat(MiniCppParser.Return_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#cout_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCout_stat(MiniCppParser.Cout_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#cin_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCin_stat(MiniCppParser.Cin_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#main_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_stat(MiniCppParser.Main_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#switch_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_stat(MiniCppParser.Switch_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#default_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_stat(MiniCppParser.Default_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#case_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_stat(MiniCppParser.Case_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#for_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stat(MiniCppParser.For_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#for_ass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_ass(MiniCppParser.For_assContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#do_while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_stat(MiniCppParser.Do_while_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MiniCppParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#plusplus_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusplus_stat(MiniCppParser.Plusplus_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#minusminus_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusminus_stat(MiniCppParser.Minusminus_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(MiniCppParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#inDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInDeclare(MiniCppParser.InDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MiniCppParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(MiniCppParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(MiniCppParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(MiniCppParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(MiniCppParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(MiniCppParser.LogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusplus}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusplus(MiniCppParser.PlusplusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(MiniCppParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(MiniCppParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(MiniCppParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(MiniCppParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(MiniCppParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpr(MiniCppParser.UnaryMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function_callExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_callExpr(MiniCppParser.Function_callExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(MiniCppParser.MultiplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(MiniCppParser.PowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(MiniCppParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusminus}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusminus(MiniCppParser.MinusminusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(MiniCppParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link MiniCppParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(MiniCppParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link MiniCppParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(MiniCppParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link MiniCppParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(MiniCppParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link MiniCppParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(MiniCppParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link MiniCppParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilAtom(MiniCppParser.NilAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charAtom}
	 * labeled alternative in {@link MiniCppParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharAtom(MiniCppParser.CharAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatAtom}
	 * labeled alternative in {@link MiniCppParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatAtom(MiniCppParser.FloatAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intAtom}
	 * labeled alternative in {@link MiniCppParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAtom(MiniCppParser.IntAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCppParser#voidType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidType(MiniCppParser.VoidTypeContext ctx);
}