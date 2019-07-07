// Generated from MiniCpp.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniCppParser}.
 */
public interface MiniCppListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(MiniCppParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(MiniCppParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(MiniCppParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(MiniCppParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#endof_body}.
	 * @param ctx the parse tree
	 */
	void enterEndof_body(MiniCppParser.Endof_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#endof_body}.
	 * @param ctx the parse tree
	 */
	void exitEndof_body(MiniCppParser.Endof_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#function_declare}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declare(MiniCppParser.Function_declareContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#function_declare}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declare(MiniCppParser.Function_declareContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#input_param}.
	 * @param ctx the parse tree
	 */
	void enterInput_param(MiniCppParser.Input_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#input_param}.
	 * @param ctx the parse tree
	 */
	void exitInput_param(MiniCppParser.Input_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MiniCppParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MiniCppParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(MiniCppParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(MiniCppParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(MiniCppParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(MiniCppParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#return_stat}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stat(MiniCppParser.Return_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#return_stat}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stat(MiniCppParser.Return_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#cout_stat}.
	 * @param ctx the parse tree
	 */
	void enterCout_stat(MiniCppParser.Cout_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#cout_stat}.
	 * @param ctx the parse tree
	 */
	void exitCout_stat(MiniCppParser.Cout_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#cin_stat}.
	 * @param ctx the parse tree
	 */
	void enterCin_stat(MiniCppParser.Cin_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#cin_stat}.
	 * @param ctx the parse tree
	 */
	void exitCin_stat(MiniCppParser.Cin_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#main_stat}.
	 * @param ctx the parse tree
	 */
	void enterMain_stat(MiniCppParser.Main_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#main_stat}.
	 * @param ctx the parse tree
	 */
	void exitMain_stat(MiniCppParser.Main_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#switch_stat}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_stat(MiniCppParser.Switch_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#switch_stat}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_stat(MiniCppParser.Switch_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#default_stat}.
	 * @param ctx the parse tree
	 */
	void enterDefault_stat(MiniCppParser.Default_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#default_stat}.
	 * @param ctx the parse tree
	 */
	void exitDefault_stat(MiniCppParser.Default_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#case_stat}.
	 * @param ctx the parse tree
	 */
	void enterCase_stat(MiniCppParser.Case_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#case_stat}.
	 * @param ctx the parse tree
	 */
	void exitCase_stat(MiniCppParser.Case_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterFor_stat(MiniCppParser.For_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitFor_stat(MiniCppParser.For_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#for_ass}.
	 * @param ctx the parse tree
	 */
	void enterFor_ass(MiniCppParser.For_assContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#for_ass}.
	 * @param ctx the parse tree
	 */
	void exitFor_ass(MiniCppParser.For_assContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#do_while_stat}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_stat(MiniCppParser.Do_while_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#do_while_stat}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_stat(MiniCppParser.Do_while_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MiniCppParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MiniCppParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#plusplus_stat}.
	 * @param ctx the parse tree
	 */
	void enterPlusplus_stat(MiniCppParser.Plusplus_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#plusplus_stat}.
	 * @param ctx the parse tree
	 */
	void exitPlusplus_stat(MiniCppParser.Plusplus_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#minusminus_stat}.
	 * @param ctx the parse tree
	 */
	void enterMinusminus_stat(MiniCppParser.Minusminus_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#minusminus_stat}.
	 * @param ctx the parse tree
	 */
	void exitMinusminus_stat(MiniCppParser.Minusminus_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(MiniCppParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(MiniCppParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#inDeclare}.
	 * @param ctx the parse tree
	 */
	void enterInDeclare(MiniCppParser.InDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#inDeclare}.
	 * @param ctx the parse tree
	 */
	void exitInDeclare(MiniCppParser.InDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiniCppParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiniCppParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(MiniCppParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(MiniCppParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(MiniCppParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(MiniCppParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(MiniCppParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(MiniCppParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(MiniCppParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(MiniCppParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(MiniCppParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(MiniCppParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusplus}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusplus(MiniCppParser.PlusplusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusplus}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusplus(MiniCppParser.PlusplusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(MiniCppParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(MiniCppParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(MiniCppParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(MiniCppParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(MiniCppParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(MiniCppParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(MiniCppParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(MiniCppParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(MiniCppParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(MiniCppParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(MiniCppParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(MiniCppParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function_callExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunction_callExpr(MiniCppParser.Function_callExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function_callExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunction_callExpr(MiniCppParser.Function_callExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(MiniCppParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(MiniCppParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(MiniCppParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(MiniCppParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(MiniCppParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(MiniCppParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusminus}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinusminus(MiniCppParser.MinusminusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusminus}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinusminus(MiniCppParser.MinusminusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(MiniCppParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MiniCppParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(MiniCppParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link MiniCppParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(MiniCppParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link MiniCppParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(MiniCppParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link MiniCppParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(MiniCppParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link MiniCppParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(MiniCppParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link MiniCppParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(MiniCppParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link MiniCppParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(MiniCppParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link MiniCppParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(MiniCppParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link MiniCppParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(MiniCppParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link MiniCppParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(MiniCppParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link MiniCppParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(MiniCppParser.NilAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charAtom}
	 * labeled alternative in {@link MiniCppParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterCharAtom(MiniCppParser.CharAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charAtom}
	 * labeled alternative in {@link MiniCppParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitCharAtom(MiniCppParser.CharAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatAtom}
	 * labeled alternative in {@link MiniCppParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFloatAtom(MiniCppParser.FloatAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatAtom}
	 * labeled alternative in {@link MiniCppParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFloatAtom(MiniCppParser.FloatAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intAtom}
	 * labeled alternative in {@link MiniCppParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIntAtom(MiniCppParser.IntAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intAtom}
	 * labeled alternative in {@link MiniCppParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIntAtom(MiniCppParser.IntAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCppParser#voidType}.
	 * @param ctx the parse tree
	 */
	void enterVoidType(MiniCppParser.VoidTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCppParser#voidType}.
	 * @param ctx the parse tree
	 */
	void exitVoidType(MiniCppParser.VoidTypeContext ctx);
}