// Generated from MiniCpp.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniCppParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, OR=2, AND=3, EQ=4, PP=5, MM=6, NEQ=7, GT=8, LT=9, GTEQ=10, LTEQ=11, 
		PLUS=12, MINUS=13, MULT=14, DIV=15, MOD=16, POW=17, NOT=18, VIR=19, CINS=20, 
		COUTS=21, SCOL=22, DDOT=23, ASSIGN=24, OPAR=25, CPAR=26, OBRACE=27, CBRACE=28, 
		IntType=29, FloatType=30, BoolType=31, CharType=32, TRUE=33, FALSE=34, 
		NIL=35, IF=36, ELSE=37, FOR=38, WHILE=39, DO=40, LOG=41, SWITCH=42, CASE=43, 
		BREAK=44, MAIN=45, DEFAULT=46, RETURN=47, COUT=48, CIN=49, ID=50, INT=51, 
		FLOAT=52, STRING=53, CHAR=54, COMMENT=55, BlockComment=56, SPACE=57, OTHER=58;
	public static final int
		RULE_parse = 0, RULE_function_body = 1, RULE_endof_body = 2, RULE_function_declare = 3, 
		RULE_input_param = 4, RULE_block = 5, RULE_stat = 6, RULE_function_call = 7, 
		RULE_return_stat = 8, RULE_cout_stat = 9, RULE_cin_stat = 10, RULE_main_stat = 11, 
		RULE_switch_stat = 12, RULE_default_stat = 13, RULE_case_stat = 14, RULE_for_stat = 15, 
		RULE_for_ass = 16, RULE_do_while_stat = 17, RULE_assignment = 18, RULE_plusplus_stat = 19, 
		RULE_minusminus_stat = 20, RULE_declare = 21, RULE_inDeclare = 22, RULE_type = 23, 
		RULE_if_stat = 24, RULE_condition_block = 25, RULE_stat_block = 26, RULE_while_stat = 27, 
		RULE_log = 28, RULE_expr = 29, RULE_atom = 30, RULE_voidType = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "function_body", "endof_body", "function_declare", "input_param", 
			"block", "stat", "function_call", "return_stat", "cout_stat", "cin_stat", 
			"main_stat", "switch_stat", "default_stat", "case_stat", "for_stat", 
			"for_ass", "do_while_stat", "assignment", "plusplus_stat", "minusminus_stat", 
			"declare", "inDeclare", "type", "if_stat", "condition_block", "stat_block", 
			"while_stat", "log", "expr", "atom", "voidType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'||'", "'&&'", "'=='", "'++'", "'--'", "'!='", "'>'", 
			"'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'!'", 
			"','", "'>>'", "'<<'", "';'", "':'", "'='", "'('", "')'", "'{'", "'}'", 
			"'int'", "'float'", "'bool'", "'char'", "'true'", "'false'", "'nil'", 
			"'if'", "'else'", "'for'", "'while'", "'do'", "'log'", "'switch'", "'case'", 
			"'break'", "'main'", "'default'", "'return'", "'cout'", "'cin'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "OR", "AND", "EQ", "PP", "MM", "NEQ", "GT", "LT", "GTEQ", 
			"LTEQ", "PLUS", "MINUS", "MULT", "DIV", "MOD", "POW", "NOT", "VIR", "CINS", 
			"COUTS", "SCOL", "DDOT", "ASSIGN", "OPAR", "CPAR", "OBRACE", "CBRACE", 
			"IntType", "FloatType", "BoolType", "CharType", "TRUE", "FALSE", "NIL", 
			"IF", "ELSE", "FOR", "WHILE", "DO", "LOG", "SWITCH", "CASE", "BREAK", 
			"MAIN", "DEFAULT", "RETURN", "COUT", "CIN", "ID", "INT", "FLOAT", "STRING", 
			"CHAR", "COMMENT", "BlockComment", "SPACE", "OTHER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MiniCpp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniCppParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public Main_statContext main_stat() {
			return getRuleContext(Main_statContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniCppParser.EOF, 0); }
		public List<Function_declareContext> function_declare() {
			return getRuleContexts(Function_declareContext.class);
		}
		public Function_declareContext function_declare(int i) {
			return getRuleContext(Function_declareContext.class,i);
		}
		public List<Function_bodyContext> function_body() {
			return getRuleContexts(Function_bodyContext.class);
		}
		public Function_bodyContext function_body(int i) {
			return getRuleContext(Function_bodyContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(66);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(64);
						function_declare();
						}
						break;
					case 2:
						{
						setState(65);
						function_body();
						}
						break;
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(71);
			main_stat();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IntType) | (1L << FloatType) | (1L << BoolType) | (1L << CharType))) != 0)) {
				{
				{
				setState(72);
				function_body();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_bodyContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniCppParser.ID, 0); }
		public TerminalNode OPAR() { return getToken(MiniCppParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(MiniCppParser.CPAR, 0); }
		public TerminalNode OBRACE() { return getToken(MiniCppParser.OBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Endof_bodyContext endof_body() {
			return getRuleContext(Endof_bodyContext.class,0);
		}
		public List<Input_paramContext> input_param() {
			return getRuleContexts(Input_paramContext.class);
		}
		public Input_paramContext input_param(int i) {
			return getRuleContext(Input_paramContext.class,i);
		}
		public VoidTypeContext voidType() {
			return getRuleContext(VoidTypeContext.class,0);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function_body);
		int _la;
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntType:
			case FloatType:
			case BoolType:
			case CharType:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				type();
				setState(81);
				match(ID);
				setState(82);
				match(OPAR);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntType) | (1L << FloatType) | (1L << BoolType) | (1L << CharType))) != 0)) {
					{
					{
					setState(83);
					input_param();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(89);
				match(CPAR);
				setState(90);
				match(OBRACE);
				setState(91);
				block();
				setState(92);
				endof_body();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				voidType();
				setState(95);
				match(ID);
				setState(96);
				match(OPAR);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntType) | (1L << FloatType) | (1L << BoolType) | (1L << CharType))) != 0)) {
					{
					{
					setState(97);
					input_param();
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103);
				match(CPAR);
				setState(104);
				match(OBRACE);
				setState(105);
				block();
				setState(106);
				endof_body();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Endof_bodyContext extends ParserRuleContext {
		public TerminalNode CBRACE() { return getToken(MiniCppParser.CBRACE, 0); }
		public Endof_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endof_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterEndof_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitEndof_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitEndof_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Endof_bodyContext endof_body() throws RecognitionException {
		Endof_bodyContext _localctx = new Endof_bodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_endof_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(CBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_declareContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniCppParser.ID, 0); }
		public TerminalNode OPAR() { return getToken(MiniCppParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(MiniCppParser.CPAR, 0); }
		public TerminalNode SCOL() { return getToken(MiniCppParser.SCOL, 0); }
		public List<Input_paramContext> input_param() {
			return getRuleContexts(Input_paramContext.class);
		}
		public Input_paramContext input_param(int i) {
			return getRuleContext(Input_paramContext.class,i);
		}
		public VoidTypeContext voidType() {
			return getRuleContext(VoidTypeContext.class,0);
		}
		public Function_declareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterFunction_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitFunction_declare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitFunction_declare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declareContext function_declare() throws RecognitionException {
		Function_declareContext _localctx = new Function_declareContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_declare);
		int _la;
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntType:
			case FloatType:
			case BoolType:
			case CharType:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				type();
				setState(113);
				match(ID);
				setState(114);
				match(OPAR);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntType) | (1L << FloatType) | (1L << BoolType) | (1L << CharType))) != 0)) {
					{
					{
					setState(115);
					input_param();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				match(CPAR);
				setState(122);
				match(SCOL);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				voidType();
				setState(125);
				match(ID);
				setState(126);
				match(OPAR);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntType) | (1L << FloatType) | (1L << BoolType) | (1L << CharType))) != 0)) {
					{
					{
					setState(127);
					input_param();
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				match(CPAR);
				setState(134);
				match(SCOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Input_paramContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniCppParser.ID, 0); }
		public TerminalNode VIR() { return getToken(MiniCppParser.VIR, 0); }
		public Input_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterInput_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitInput_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitInput_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_paramContext input_param() throws RecognitionException {
		Input_paramContext _localctx = new Input_paramContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_input_param);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				type();
				setState(139);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				type();
				setState(142);
				match(ID);
				setState(143);
				match(VIR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntType) | (1L << FloatType) | (1L << BoolType) | (1L << CharType) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << LOG) | (1L << SWITCH) | (1L << RETURN) | (1L << COUT) | (1L << CIN) | (1L << ID) | (1L << OTHER))) != 0)) {
				{
				{
				setState(147);
				stat();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public Token OTHER;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public Do_while_statContext do_while_stat() {
			return getRuleContext(Do_while_statContext.class,0);
		}
		public For_statContext for_stat() {
			return getRuleContext(For_statContext.class,0);
		}
		public Switch_statContext switch_stat() {
			return getRuleContext(Switch_statContext.class,0);
		}
		public LogContext log() {
			return getRuleContext(LogContext.class,0);
		}
		public Cout_statContext cout_stat() {
			return getRuleContext(Cout_statContext.class,0);
		}
		public Cin_statContext cin_stat() {
			return getRuleContext(Cin_statContext.class,0);
		}
		public Plusplus_statContext plusplus_stat() {
			return getRuleContext(Plusplus_statContext.class,0);
		}
		public Minusminus_statContext minusminus_stat() {
			return getRuleContext(Minusminus_statContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Return_statContext return_stat() {
			return getRuleContext(Return_statContext.class,0);
		}
		public TerminalNode OTHER() { return getToken(MiniCppParser.OTHER, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stat);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				declare();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				if_stat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				while_stat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				do_while_stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				for_stat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(159);
				switch_stat();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(160);
				log();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(161);
				cout_stat();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(162);
				cin_stat();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(163);
				plusplus_stat();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(164);
				minusminus_stat();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(165);
				function_call();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(166);
				return_stat();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(167);
				((StatContext)_localctx).OTHER = match(OTHER);
				System.err.println("unknown char: " + (((StatContext)_localctx).OTHER!=null?((StatContext)_localctx).OTHER.getText():null));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniCppParser.ID, 0); }
		public TerminalNode OPAR() { return getToken(MiniCppParser.OPAR, 0); }
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode CPAR() { return getToken(MiniCppParser.CPAR, 0); }
		public TerminalNode SCOL() { return getToken(MiniCppParser.SCOL, 0); }
		public List<TerminalNode> VIR() { return getTokens(MiniCppParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(MiniCppParser.VIR, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_call);
		try {
			int _alt;
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(ID);
				setState(172);
				match(OPAR);
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(173);
						atom();
						setState(174);
						match(VIR);
						}
						} 
					}
					setState(180);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(181);
				atom();
				setState(182);
				match(CPAR);
				setState(183);
				match(SCOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(ID);
				setState(186);
				match(OPAR);
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(187);
						atom();
						setState(188);
						match(VIR);
						}
						} 
					}
					setState(194);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(195);
				atom();
				setState(196);
				match(CPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MiniCppParser.RETURN, 0); }
		public TerminalNode SCOL() { return getToken(MiniCppParser.SCOL, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public Return_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterReturn_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitReturn_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitReturn_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statContext return_stat() throws RecognitionException {
		Return_statContext _localctx = new Return_statContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_return_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(RETURN);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPAR) | (1L << TRUE) | (1L << FALSE) | (1L << NIL) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR))) != 0)) {
				{
				setState(201);
				atom();
				}
			}

			setState(204);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cout_statContext extends ParserRuleContext {
		public TerminalNode COUT() { return getToken(MiniCppParser.COUT, 0); }
		public TerminalNode COUTS() { return getToken(MiniCppParser.COUTS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(MiniCppParser.SCOL, 0); }
		public Cout_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cout_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterCout_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitCout_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitCout_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cout_statContext cout_stat() throws RecognitionException {
		Cout_statContext _localctx = new Cout_statContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cout_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(COUT);
			setState(207);
			match(COUTS);
			setState(208);
			expr(0);
			setState(209);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cin_statContext extends ParserRuleContext {
		public TerminalNode CIN() { return getToken(MiniCppParser.CIN, 0); }
		public TerminalNode CINS() { return getToken(MiniCppParser.CINS, 0); }
		public TerminalNode ID() { return getToken(MiniCppParser.ID, 0); }
		public TerminalNode SCOL() { return getToken(MiniCppParser.SCOL, 0); }
		public Cin_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cin_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterCin_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitCin_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitCin_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cin_statContext cin_stat() throws RecognitionException {
		Cin_statContext _localctx = new Cin_statContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cin_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(CIN);
			setState(212);
			match(CINS);
			setState(213);
			match(ID);
			setState(214);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_statContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode MAIN() { return getToken(MiniCppParser.MAIN, 0); }
		public TerminalNode OPAR() { return getToken(MiniCppParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(MiniCppParser.CPAR, 0); }
		public TerminalNode OBRACE() { return getToken(MiniCppParser.OBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Endof_bodyContext endof_body() {
			return getRuleContext(Endof_bodyContext.class,0);
		}
		public Main_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterMain_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitMain_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitMain_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_statContext main_stat() throws RecognitionException {
		Main_statContext _localctx = new Main_statContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_main_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			type();
			setState(217);
			match(MAIN);
			setState(218);
			match(OPAR);
			setState(219);
			match(CPAR);
			setState(220);
			match(OBRACE);
			setState(221);
			block();
			setState(222);
			endof_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_statContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(MiniCppParser.SWITCH, 0); }
		public TerminalNode OPAR() { return getToken(MiniCppParser.OPAR, 0); }
		public TerminalNode ID() { return getToken(MiniCppParser.ID, 0); }
		public TerminalNode CPAR() { return getToken(MiniCppParser.CPAR, 0); }
		public TerminalNode OBRACE() { return getToken(MiniCppParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(MiniCppParser.CBRACE, 0); }
		public List<Case_statContext> case_stat() {
			return getRuleContexts(Case_statContext.class);
		}
		public Case_statContext case_stat(int i) {
			return getRuleContext(Case_statContext.class,i);
		}
		public Default_statContext default_stat() {
			return getRuleContext(Default_statContext.class,0);
		}
		public Switch_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterSwitch_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitSwitch_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitSwitch_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_statContext switch_stat() throws RecognitionException {
		Switch_statContext _localctx = new Switch_statContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_switch_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(SWITCH);
			setState(225);
			match(OPAR);
			setState(226);
			match(ID);
			setState(227);
			match(CPAR);
			setState(228);
			match(OBRACE);
			setState(230); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(229);
				case_stat();
				}
				}
				setState(232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(234);
				default_stat();
				}
			}

			setState(237);
			match(CBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_statContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(MiniCppParser.DEFAULT, 0); }
		public TerminalNode DDOT() { return getToken(MiniCppParser.DDOT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(MiniCppParser.BREAK, 0); }
		public TerminalNode SCOL() { return getToken(MiniCppParser.SCOL, 0); }
		public Default_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterDefault_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitDefault_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitDefault_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_statContext default_stat() throws RecognitionException {
		Default_statContext _localctx = new Default_statContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_default_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(DEFAULT);
			setState(240);
			match(DDOT);
			setState(241);
			block();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(242);
				match(BREAK);
				setState(243);
				match(SCOL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_statContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(MiniCppParser.CASE, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode DDOT() { return getToken(MiniCppParser.DDOT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(MiniCppParser.BREAK, 0); }
		public TerminalNode SCOL() { return getToken(MiniCppParser.SCOL, 0); }
		public Case_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterCase_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitCase_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitCase_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_statContext case_stat() throws RecognitionException {
		Case_statContext _localctx = new Case_statContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_case_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(CASE);
			setState(247);
			atom();
			setState(248);
			match(DDOT);
			setState(249);
			block();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(250);
				match(BREAK);
				setState(251);
				match(SCOL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MiniCppParser.FOR, 0); }
		public TerminalNode OPAR() { return getToken(MiniCppParser.OPAR, 0); }
		public InDeclareContext inDeclare() {
			return getRuleContext(InDeclareContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(MiniCppParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(MiniCppParser.SCOL, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public For_assContext for_ass() {
			return getRuleContext(For_assContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(MiniCppParser.CPAR, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public For_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterFor_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitFor_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitFor_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statContext for_stat() throws RecognitionException {
		For_statContext _localctx = new For_statContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_for_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(FOR);
			setState(255);
			match(OPAR);
			setState(256);
			inDeclare();
			setState(257);
			match(SCOL);
			setState(258);
			expr(0);
			setState(259);
			match(SCOL);
			setState(260);
			for_ass();
			setState(261);
			match(CPAR);
			setState(262);
			stat_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_assContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniCppParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MiniCppParser.ASSIGN, 0); }
		public For_assContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_ass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterFor_ass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitFor_ass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitFor_ass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_assContext for_ass() throws RecognitionException {
		For_assContext _localctx = new For_assContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for_ass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(ID);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(265);
				match(ASSIGN);
				}
			}

			setState(268);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_while_statContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(MiniCppParser.DO, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(MiniCppParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(MiniCppParser.SCOL, 0); }
		public Do_while_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterDo_while_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitDo_while_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitDo_while_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_statContext do_while_stat() throws RecognitionException {
		Do_while_statContext _localctx = new Do_while_statContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_do_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(DO);
			setState(271);
			stat_block();
			setState(272);
			match(WHILE);
			setState(273);
			expr(0);
			setState(274);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniCppParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(MiniCppParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(MiniCppParser.SCOL, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(ID);
			setState(277);
			match(ASSIGN);
			setState(278);
			expr(0);
			setState(279);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Plusplus_statContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniCppParser.ID, 0); }
		public TerminalNode PP() { return getToken(MiniCppParser.PP, 0); }
		public TerminalNode SCOL() { return getToken(MiniCppParser.SCOL, 0); }
		public Plusplus_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusplus_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterPlusplus_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitPlusplus_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitPlusplus_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Plusplus_statContext plusplus_stat() throws RecognitionException {
		Plusplus_statContext _localctx = new Plusplus_statContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_plusplus_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(ID);
			setState(282);
			match(PP);
			setState(283);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Minusminus_statContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniCppParser.ID, 0); }
		public TerminalNode MM() { return getToken(MiniCppParser.MM, 0); }
		public TerminalNode SCOL() { return getToken(MiniCppParser.SCOL, 0); }
		public Minusminus_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minusminus_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterMinusminus_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitMinusminus_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitMinusminus_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Minusminus_statContext minusminus_stat() throws RecognitionException {
		Minusminus_statContext _localctx = new Minusminus_statContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_minusminus_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(ID);
			setState(286);
			match(MM);
			setState(287);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniCppParser.ID, 0); }
		public TerminalNode SCOL() { return getToken(MiniCppParser.SCOL, 0); }
		public TerminalNode ASSIGN() { return getToken(MiniCppParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_declare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			type();
			setState(290);
			match(ID);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(291);
				match(ASSIGN);
				setState(292);
				expr(0);
				}
			}

			setState(295);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InDeclareContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniCppParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(MiniCppParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterInDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitInDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitInDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InDeclareContext inDeclare() throws RecognitionException {
		InDeclareContext _localctx = new InDeclareContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_inDeclare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			type();
			setState(298);
			match(ID);
			setState(299);
			match(ASSIGN);
			setState(300);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IntType() { return getToken(MiniCppParser.IntType, 0); }
		public TerminalNode FloatType() { return getToken(MiniCppParser.FloatType, 0); }
		public TerminalNode BoolType() { return getToken(MiniCppParser.BoolType, 0); }
		public TerminalNode CharType() { return getToken(MiniCppParser.CharType, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntType) | (1L << FloatType) | (1L << BoolType) | (1L << CharType))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(MiniCppParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(MiniCppParser.IF, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(MiniCppParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(MiniCppParser.ELSE, i);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitIf_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_if_stat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(IF);
			setState(305);
			condition_block();
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(306);
					match(ELSE);
					setState(307);
					match(IF);
					setState(308);
					condition_block();
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(314);
				match(ELSE);
				setState(315);
				stat_block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_blockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitCondition_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			expr(0);
			setState(319);
			stat_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(MiniCppParser.OBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(MiniCppParser.CBRACE, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterStat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitStat_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_stat_block);
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(OBRACE);
				setState(322);
				block();
				setState(323);
				match(CBRACE);
				}
				break;
			case IntType:
			case FloatType:
			case BoolType:
			case CharType:
			case IF:
			case FOR:
			case WHILE:
			case DO:
			case LOG:
			case SWITCH:
			case RETURN:
			case COUT:
			case CIN:
			case ID:
			case OTHER:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				stat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MiniCppParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitWhile_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(WHILE);
			setState(329);
			expr(0);
			setState(330);
			stat_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogContext extends ParserRuleContext {
		public TerminalNode LOG() { return getToken(MiniCppParser.LOG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(MiniCppParser.SCOL, 0); }
		public LogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_log);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(LOG);
			setState(333);
			expr(0);
			setState(334);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PlusplusContext extends ExprContext {
		public TerminalNode PP() { return getToken(MiniCppParser.PP, 0); }
		public PlusplusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterPlusplus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitPlusplus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitPlusplus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExprContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(MiniCppParser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(MiniCppParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MiniCppParser.MINUS, 0); }
		public AdditiveExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LTEQ() { return getToken(MiniCppParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(MiniCppParser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(MiniCppParser.LT, 0); }
		public TerminalNode GT() { return getToken(MiniCppParser.GT, 0); }
		public RelationalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitRelationalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(MiniCppParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusExprContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(MiniCppParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryMinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterUnaryMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitUnaryMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitUnaryMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Function_callExprContext extends ExprContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Function_callExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterFunction_callExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitFunction_callExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitFunction_callExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(MiniCppParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(MiniCppParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MiniCppParser.MOD, 0); }
		public MultiplicationExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterMultiplicationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitMultiplicationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitMultiplicationExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(MiniCppParser.POW, 0); }
		public PowExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterPowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitPowExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitPowExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(MiniCppParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(MiniCppParser.NEQ, 0); }
		public EqualityExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusminusContext extends ExprContext {
		public TerminalNode MM() { return getToken(MiniCppParser.MM, 0); }
		public MinusminusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterMinusminus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitMinusminus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitMinusminus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(MiniCppParser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(337);
				match(MINUS);
				setState(338);
				expr(12);
				}
				break;
			case 2:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(339);
				match(NOT);
				setState(340);
				expr(11);
				}
				break;
			case 3:
				{
				_localctx = new PlusplusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(341);
				match(PP);
				}
				break;
			case 4:
				{
				_localctx = new MinusminusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(342);
				match(MM);
				}
				break;
			case 5:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(343);
				atom();
				}
				break;
			case 6:
				{
				_localctx = new Function_callExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(344);
				function_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(370);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(368);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(347);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(348);
						match(POW);
						setState(349);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(350);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(351);
						((MultiplicationExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MultiplicationExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(352);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(353);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(354);
						((AdditiveExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AdditiveExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(355);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(356);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(357);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ))) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(358);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(359);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(360);
						((EqualityExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(361);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(362);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(363);
						match(AND);
						setState(364);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(365);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(366);
						match(OR);
						setState(367);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParExprContext extends AtomContext {
		public TerminalNode OPAR() { return getToken(MiniCppParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(MiniCppParser.CPAR, 0); }
		public ParExprContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitParExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanAtomContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(MiniCppParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MiniCppParser.FALSE, 0); }
		public BooleanAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterBooleanAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitBooleanAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitBooleanAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdAtomContext extends AtomContext {
		public TerminalNode ID() { return getToken(MiniCppParser.ID, 0); }
		public IdAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterIdAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitIdAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitIdAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatAtomContext extends AtomContext {
		public TerminalNode FLOAT() { return getToken(MiniCppParser.FLOAT, 0); }
		public FloatAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterFloatAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitFloatAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitFloatAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntAtomContext extends AtomContext {
		public TerminalNode INT() { return getToken(MiniCppParser.INT, 0); }
		public IntAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterIntAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitIntAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitIntAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STRING() { return getToken(MiniCppParser.STRING, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NilAtomContext extends AtomContext {
		public TerminalNode NIL() { return getToken(MiniCppParser.NIL, 0); }
		public NilAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterNilAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitNilAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitNilAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharAtomContext extends AtomContext {
		public TerminalNode CHAR() { return getToken(MiniCppParser.CHAR, 0); }
		public CharAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterCharAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitCharAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitCharAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_atom);
		int _la;
		try {
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAR:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				match(OPAR);
				setState(374);
				expr(0);
				setState(375);
				match(CPAR);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ID:
				_localctx = new IdAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				match(ID);
				}
				break;
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(379);
				match(STRING);
				}
				break;
			case NIL:
				_localctx = new NilAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(380);
				match(NIL);
				}
				break;
			case CHAR:
				_localctx = new CharAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(381);
				match(CHAR);
				}
				break;
			case FLOAT:
				_localctx = new FloatAtomContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(382);
				match(FLOAT);
				}
				break;
			case INT:
				_localctx = new IntAtomContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(383);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VoidTypeContext extends ParserRuleContext {
		public VoidTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).enterVoidType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCppListener ) ((MiniCppListener)listener).exitVoidType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCppVisitor ) return ((MiniCppVisitor<? extends T>)visitor).visitVoidType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidTypeContext voidType() throws RecognitionException {
		VoidTypeContext _localctx = new VoidTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_voidType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 29:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u0187\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\7\3W\n\3\f\3\16\3Z\13\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3e\n\3\f\3\16\3h\13\3\3\3\3\3\3\3\3\3\3\3\5\3o\n\3\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\7\5w\n\5\f\5\16\5z\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5\u0083\n\5\f\5\16\5\u0086\13\5\3\5\3\5\3\5\5\5\u008b\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u0094\n\6\3\7\7\7\u0097\n\7\f\7\16\7\u009a\13"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u00ac\n\b\3\t\3\t\3\t\3\t\3\t\7\t\u00b3\n\t\f\t\16\t\u00b6\13\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00c1\n\t\f\t\16\t\u00c4\13\t\3\t\3"+
		"\t\3\t\5\t\u00c9\n\t\3\n\3\n\5\n\u00cd\n\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\6\16\u00e9\n\16\r\16\16\16\u00ea\3\16\5\16\u00ee\n"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00f7\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00ff\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\5\22\u010d\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\5\27\u0128\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\7\32\u0138\n\32\f\32\16\32\u013b\13"+
		"\32\3\32\3\32\5\32\u013f\n\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u0149\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u015c\n\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\7\37\u0173\n\37\f\37\16\37\u0176\13\37\3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \5 \u0183\n \3!\3!\3!\2\3<\"\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\b\3\2\37\"\3\2\20\22\3\2\16\17\3"+
		"\2\n\r\4\2\6\6\t\t\3\2#$\2\u019f\2F\3\2\2\2\4n\3\2\2\2\6p\3\2\2\2\b\u008a"+
		"\3\2\2\2\n\u0093\3\2\2\2\f\u0098\3\2\2\2\16\u00ab\3\2\2\2\20\u00c8\3\2"+
		"\2\2\22\u00ca\3\2\2\2\24\u00d0\3\2\2\2\26\u00d5\3\2\2\2\30\u00da\3\2\2"+
		"\2\32\u00e2\3\2\2\2\34\u00f1\3\2\2\2\36\u00f8\3\2\2\2 \u0100\3\2\2\2\""+
		"\u010a\3\2\2\2$\u0110\3\2\2\2&\u0116\3\2\2\2(\u011b\3\2\2\2*\u011f\3\2"+
		"\2\2,\u0123\3\2\2\2.\u012b\3\2\2\2\60\u0130\3\2\2\2\62\u0132\3\2\2\2\64"+
		"\u0140\3\2\2\2\66\u0148\3\2\2\28\u014a\3\2\2\2:\u014e\3\2\2\2<\u015b\3"+
		"\2\2\2>\u0182\3\2\2\2@\u0184\3\2\2\2BE\5\b\5\2CE\5\4\3\2DB\3\2\2\2DC\3"+
		"\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IM\5\30\r\2JL"+
		"\5\4\3\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2P"+
		"Q\7\2\2\3Q\3\3\2\2\2RS\5\60\31\2ST\7\64\2\2TX\7\33\2\2UW\5\n\6\2VU\3\2"+
		"\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\34\2\2\\]"+
		"\7\35\2\2]^\5\f\7\2^_\5\6\4\2_o\3\2\2\2`a\5@!\2ab\7\64\2\2bf\7\33\2\2"+
		"ce\5\n\6\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2"+
		"ij\7\34\2\2jk\7\35\2\2kl\5\f\7\2lm\5\6\4\2mo\3\2\2\2nR\3\2\2\2n`\3\2\2"+
		"\2o\5\3\2\2\2pq\7\36\2\2q\7\3\2\2\2rs\5\60\31\2st\7\64\2\2tx\7\33\2\2"+
		"uw\5\n\6\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2"+
		"{|\7\34\2\2|}\7\30\2\2}\u008b\3\2\2\2~\177\5@!\2\177\u0080\7\64\2\2\u0080"+
		"\u0084\7\33\2\2\u0081\u0083\5\n\6\2\u0082\u0081\3\2\2\2\u0083\u0086\3"+
		"\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u0088\7\34\2\2\u0088\u0089\7\30\2\2\u0089\u008b\3"+
		"\2\2\2\u008ar\3\2\2\2\u008a~\3\2\2\2\u008b\t\3\2\2\2\u008c\u008d\5\60"+
		"\31\2\u008d\u008e\7\64\2\2\u008e\u0094\3\2\2\2\u008f\u0090\5\60\31\2\u0090"+
		"\u0091\7\64\2\2\u0091\u0092\7\25\2\2\u0092\u0094\3\2\2\2\u0093\u008c\3"+
		"\2\2\2\u0093\u008f\3\2\2\2\u0094\13\3\2\2\2\u0095\u0097\5\16\b\2\u0096"+
		"\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\r\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u00ac\5&\24\2\u009c\u00ac"+
		"\5,\27\2\u009d\u00ac\5\62\32\2\u009e\u00ac\58\35\2\u009f\u00ac\5$\23\2"+
		"\u00a0\u00ac\5 \21\2\u00a1\u00ac\5\32\16\2\u00a2\u00ac\5:\36\2\u00a3\u00ac"+
		"\5\24\13\2\u00a4\u00ac\5\26\f\2\u00a5\u00ac\5(\25\2\u00a6\u00ac\5*\26"+
		"\2\u00a7\u00ac\5\20\t\2\u00a8\u00ac\5\22\n\2\u00a9\u00aa\7<\2\2\u00aa"+
		"\u00ac\b\b\1\2\u00ab\u009b\3\2\2\2\u00ab\u009c\3\2\2\2\u00ab\u009d\3\2"+
		"\2\2\u00ab\u009e\3\2\2\2\u00ab\u009f\3\2\2\2\u00ab\u00a0\3\2\2\2\u00ab"+
		"\u00a1\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ab\u00a3\3\2\2\2\u00ab\u00a4\3\2"+
		"\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ab"+
		"\u00a8\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\17\3\2\2\2\u00ad\u00ae\7\64\2"+
		"\2\u00ae\u00b4\7\33\2\2\u00af\u00b0\5> \2\u00b0\u00b1\7\25\2\2\u00b1\u00b3"+
		"\3\2\2\2\u00b2\u00af\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\5>"+
		" \2\u00b8\u00b9\7\34\2\2\u00b9\u00ba\7\30\2\2\u00ba\u00c9\3\2\2\2\u00bb"+
		"\u00bc\7\64\2\2\u00bc\u00c2\7\33\2\2\u00bd\u00be\5> \2\u00be\u00bf\7\25"+
		"\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c5\u00c6\5> \2\u00c6\u00c7\7\34\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00ad\3\2\2\2\u00c8\u00bb\3\2\2\2\u00c9\21\3\2\2\2\u00ca\u00cc\7\61\2"+
		"\2\u00cb\u00cd\5> \2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\u00cf\7\30\2\2\u00cf\23\3\2\2\2\u00d0\u00d1\7\62\2\2\u00d1"+
		"\u00d2\7\27\2\2\u00d2\u00d3\5<\37\2\u00d3\u00d4\7\30\2\2\u00d4\25\3\2"+
		"\2\2\u00d5\u00d6\7\63\2\2\u00d6\u00d7\7\26\2\2\u00d7\u00d8\7\64\2\2\u00d8"+
		"\u00d9\7\30\2\2\u00d9\27\3\2\2\2\u00da\u00db\5\60\31\2\u00db\u00dc\7/"+
		"\2\2\u00dc\u00dd\7\33\2\2\u00dd\u00de\7\34\2\2\u00de\u00df\7\35\2\2\u00df"+
		"\u00e0\5\f\7\2\u00e0\u00e1\5\6\4\2\u00e1\31\3\2\2\2\u00e2\u00e3\7,\2\2"+
		"\u00e3\u00e4\7\33\2\2\u00e4\u00e5\7\64\2\2\u00e5\u00e6\7\34\2\2\u00e6"+
		"\u00e8\7\35\2\2\u00e7\u00e9\5\36\20\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec"+
		"\u00ee\5\34\17\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3"+
		"\2\2\2\u00ef\u00f0\7\36\2\2\u00f0\33\3\2\2\2\u00f1\u00f2\7\60\2\2\u00f2"+
		"\u00f3\7\31\2\2\u00f3\u00f6\5\f\7\2\u00f4\u00f5\7.\2\2\u00f5\u00f7\7\30"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\35\3\2\2\2\u00f8\u00f9"+
		"\7-\2\2\u00f9\u00fa\5> \2\u00fa\u00fb\7\31\2\2\u00fb\u00fe\5\f\7\2\u00fc"+
		"\u00fd\7.\2\2\u00fd\u00ff\7\30\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\37\3\2\2\2\u0100\u0101\7(\2\2\u0101\u0102\7\33\2\2\u0102\u0103"+
		"\5.\30\2\u0103\u0104\7\30\2\2\u0104\u0105\5<\37\2\u0105\u0106\7\30\2\2"+
		"\u0106\u0107\5\"\22\2\u0107\u0108\7\34\2\2\u0108\u0109\5\66\34\2\u0109"+
		"!\3\2\2\2\u010a\u010c\7\64\2\2\u010b\u010d\7\32\2\2\u010c\u010b\3\2\2"+
		"\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\5<\37\2\u010f#"+
		"\3\2\2\2\u0110\u0111\7*\2\2\u0111\u0112\5\66\34\2\u0112\u0113\7)\2\2\u0113"+
		"\u0114\5<\37\2\u0114\u0115\7\30\2\2\u0115%\3\2\2\2\u0116\u0117\7\64\2"+
		"\2\u0117\u0118\7\32\2\2\u0118\u0119\5<\37\2\u0119\u011a\7\30\2\2\u011a"+
		"\'\3\2\2\2\u011b\u011c\7\64\2\2\u011c\u011d\7\7\2\2\u011d\u011e\7\30\2"+
		"\2\u011e)\3\2\2\2\u011f\u0120\7\64\2\2\u0120\u0121\7\b\2\2\u0121\u0122"+
		"\7\30\2\2\u0122+\3\2\2\2\u0123\u0124\5\60\31\2\u0124\u0127\7\64\2\2\u0125"+
		"\u0126\7\32\2\2\u0126\u0128\5<\37\2\u0127\u0125\3\2\2\2\u0127\u0128\3"+
		"\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\7\30\2\2\u012a-\3\2\2\2\u012b\u012c"+
		"\5\60\31\2\u012c\u012d\7\64\2\2\u012d\u012e\7\32\2\2\u012e\u012f\5<\37"+
		"\2\u012f/\3\2\2\2\u0130\u0131\t\2\2\2\u0131\61\3\2\2\2\u0132\u0133\7&"+
		"\2\2\u0133\u0139\5\64\33\2\u0134\u0135\7\'\2\2\u0135\u0136\7&\2\2\u0136"+
		"\u0138\5\64\33\2\u0137\u0134\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3"+
		"\2\2\2\u0139\u013a\3\2\2\2\u013a\u013e\3\2\2\2\u013b\u0139\3\2\2\2\u013c"+
		"\u013d\7\'\2\2\u013d\u013f\5\66\34\2\u013e\u013c\3\2\2\2\u013e\u013f\3"+
		"\2\2\2\u013f\63\3\2\2\2\u0140\u0141\5<\37\2\u0141\u0142\5\66\34\2\u0142"+
		"\65\3\2\2\2\u0143\u0144\7\35\2\2\u0144\u0145\5\f\7\2\u0145\u0146\7\36"+
		"\2\2\u0146\u0149\3\2\2\2\u0147\u0149\5\16\b\2\u0148\u0143\3\2\2\2\u0148"+
		"\u0147\3\2\2\2\u0149\67\3\2\2\2\u014a\u014b\7)\2\2\u014b\u014c\5<\37\2"+
		"\u014c\u014d\5\66\34\2\u014d9\3\2\2\2\u014e\u014f\7+\2\2\u014f\u0150\5"+
		"<\37\2\u0150\u0151\7\30\2\2\u0151;\3\2\2\2\u0152\u0153\b\37\1\2\u0153"+
		"\u0154\7\17\2\2\u0154\u015c\5<\37\16\u0155\u0156\7\24\2\2\u0156\u015c"+
		"\5<\37\r\u0157\u015c\7\7\2\2\u0158\u015c\7\b\2\2\u0159\u015c\5> \2\u015a"+
		"\u015c\5\20\t\2\u015b\u0152\3\2\2\2\u015b\u0155\3\2\2\2\u015b\u0157\3"+
		"\2\2\2\u015b\u0158\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015c"+
		"\u0174\3\2\2\2\u015d\u015e\f\17\2\2\u015e\u015f\7\23\2\2\u015f\u0173\5"+
		"<\37\17\u0160\u0161\f\f\2\2\u0161\u0162\t\3\2\2\u0162\u0173\5<\37\r\u0163"+
		"\u0164\f\13\2\2\u0164\u0165\t\4\2\2\u0165\u0173\5<\37\f\u0166\u0167\f"+
		"\n\2\2\u0167\u0168\t\5\2\2\u0168\u0173\5<\37\13\u0169\u016a\f\t\2\2\u016a"+
		"\u016b\t\6\2\2\u016b\u0173\5<\37\n\u016c\u016d\f\b\2\2\u016d\u016e\7\5"+
		"\2\2\u016e\u0173\5<\37\t\u016f\u0170\f\7\2\2\u0170\u0171\7\4\2\2\u0171"+
		"\u0173\5<\37\b\u0172\u015d\3\2\2\2\u0172\u0160\3\2\2\2\u0172\u0163\3\2"+
		"\2\2\u0172\u0166\3\2\2\2\u0172\u0169\3\2\2\2\u0172\u016c\3\2\2\2\u0172"+
		"\u016f\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175=\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0178\7\33\2\2\u0178\u0179"+
		"\5<\37\2\u0179\u017a\7\34\2\2\u017a\u0183\3\2\2\2\u017b\u0183\t\7\2\2"+
		"\u017c\u0183\7\64\2\2\u017d\u0183\7\67\2\2\u017e\u0183\7%\2\2\u017f\u0183"+
		"\78\2\2\u0180\u0183\7\66\2\2\u0181\u0183\7\65\2\2\u0182\u0177\3\2\2\2"+
		"\u0182\u017b\3\2\2\2\u0182\u017c\3\2\2\2\u0182\u017d\3\2\2\2\u0182\u017e"+
		"\3\2\2\2\u0182\u017f\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183"+
		"?\3\2\2\2\u0184\u0185\7\3\2\2\u0185A\3\2\2\2\37DFMXfnx\u0084\u008a\u0093"+
		"\u0098\u00ab\u00b4\u00c2\u00c8\u00cc\u00ea\u00ed\u00f6\u00fe\u010c\u0127"+
		"\u0139\u013e\u0148\u015b\u0172\u0174\u0182";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}