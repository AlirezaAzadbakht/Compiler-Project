// Generated from MiniCpp.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniCppLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "OR", "AND", "EQ", "PP", "MM", "NEQ", "GT", "LT", "GTEQ", "LTEQ", 
			"PLUS", "MINUS", "MULT", "DIV", "MOD", "POW", "NOT", "VIR", "CINS", "COUTS", 
			"SCOL", "DDOT", "ASSIGN", "OPAR", "CPAR", "OBRACE", "CBRACE", "IntType", 
			"FloatType", "BoolType", "CharType", "TRUE", "FALSE", "NIL", "IF", "ELSE", 
			"FOR", "WHILE", "DO", "LOG", "SWITCH", "CASE", "BREAK", "MAIN", "DEFAULT", 
			"RETURN", "COUT", "CIN", "ID", "INT", "FLOAT", "STRING", "CHAR", "COMMENT", 
			"BlockComment", "SPACE", "OTHER"
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


	public MiniCppLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniCpp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u0179\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3"+
		"$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3"+
		")\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3"+
		"-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\7\63\u012a"+
		"\n\63\f\63\16\63\u012d\13\63\3\64\6\64\u0130\n\64\r\64\16\64\u0131\3\65"+
		"\6\65\u0135\n\65\r\65\16\65\u0136\3\65\3\65\7\65\u013b\n\65\f\65\16\65"+
		"\u013e\13\65\3\65\3\65\6\65\u0142\n\65\r\65\16\65\u0143\5\65\u0146\n\65"+
		"\3\66\3\66\3\66\3\66\7\66\u014c\n\66\f\66\16\66\u014f\13\66\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\5\67\u0157\n\67\3\67\3\67\38\38\38\38\78\u015f\n"+
		"8\f8\168\u0162\138\38\38\39\39\39\39\79\u016a\n9\f9\169\u016d\139\39\3"+
		"9\39\39\39\3:\3:\3:\3:\3;\3;\3\u016b\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<\3\2\b\5\2C\\aac|\6\2\62"+
		";C\\aac|\3\2\62;\5\2\f\f\17\17$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0183"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3w\3\2\2\2\5|\3\2\2\2\7"+
		"\177\3\2\2\2\t\u0082\3\2\2\2\13\u0085\3\2\2\2\r\u0088\3\2\2\2\17\u008b"+
		"\3\2\2\2\21\u008e\3\2\2\2\23\u0090\3\2\2\2\25\u0092\3\2\2\2\27\u0095\3"+
		"\2\2\2\31\u0098\3\2\2\2\33\u009a\3\2\2\2\35\u009c\3\2\2\2\37\u009e\3\2"+
		"\2\2!\u00a0\3\2\2\2#\u00a2\3\2\2\2%\u00a4\3\2\2\2\'\u00a6\3\2\2\2)\u00a8"+
		"\3\2\2\2+\u00ab\3\2\2\2-\u00ae\3\2\2\2/\u00b0\3\2\2\2\61\u00b2\3\2\2\2"+
		"\63\u00b4\3\2\2\2\65\u00b6\3\2\2\2\67\u00b8\3\2\2\29\u00ba\3\2\2\2;\u00bc"+
		"\3\2\2\2=\u00c0\3\2\2\2?\u00c6\3\2\2\2A\u00cb\3\2\2\2C\u00d0\3\2\2\2E"+
		"\u00d5\3\2\2\2G\u00db\3\2\2\2I\u00df\3\2\2\2K\u00e2\3\2\2\2M\u00e7\3\2"+
		"\2\2O\u00eb\3\2\2\2Q\u00f1\3\2\2\2S\u00f4\3\2\2\2U\u00f8\3\2\2\2W\u00ff"+
		"\3\2\2\2Y\u0104\3\2\2\2[\u010a\3\2\2\2]\u010f\3\2\2\2_\u0117\3\2\2\2a"+
		"\u011e\3\2\2\2c\u0123\3\2\2\2e\u0127\3\2\2\2g\u012f\3\2\2\2i\u0145\3\2"+
		"\2\2k\u0147\3\2\2\2m\u0152\3\2\2\2o\u015a\3\2\2\2q\u0165\3\2\2\2s\u0173"+
		"\3\2\2\2u\u0177\3\2\2\2wx\7x\2\2xy\7q\2\2yz\7k\2\2z{\7f\2\2{\4\3\2\2\2"+
		"|}\7~\2\2}~\7~\2\2~\6\3\2\2\2\177\u0080\7(\2\2\u0080\u0081\7(\2\2\u0081"+
		"\b\3\2\2\2\u0082\u0083\7?\2\2\u0083\u0084\7?\2\2\u0084\n\3\2\2\2\u0085"+
		"\u0086\7-\2\2\u0086\u0087\7-\2\2\u0087\f\3\2\2\2\u0088\u0089\7/\2\2\u0089"+
		"\u008a\7/\2\2\u008a\16\3\2\2\2\u008b\u008c\7#\2\2\u008c\u008d\7?\2\2\u008d"+
		"\20\3\2\2\2\u008e\u008f\7@\2\2\u008f\22\3\2\2\2\u0090\u0091\7>\2\2\u0091"+
		"\24\3\2\2\2\u0092\u0093\7@\2\2\u0093\u0094\7?\2\2\u0094\26\3\2\2\2\u0095"+
		"\u0096\7>\2\2\u0096\u0097\7?\2\2\u0097\30\3\2\2\2\u0098\u0099\7-\2\2\u0099"+
		"\32\3\2\2\2\u009a\u009b\7/\2\2\u009b\34\3\2\2\2\u009c\u009d\7,\2\2\u009d"+
		"\36\3\2\2\2\u009e\u009f\7\61\2\2\u009f \3\2\2\2\u00a0\u00a1\7\'\2\2\u00a1"+
		"\"\3\2\2\2\u00a2\u00a3\7`\2\2\u00a3$\3\2\2\2\u00a4\u00a5\7#\2\2\u00a5"+
		"&\3\2\2\2\u00a6\u00a7\7.\2\2\u00a7(\3\2\2\2\u00a8\u00a9\7@\2\2\u00a9\u00aa"+
		"\7@\2\2\u00aa*\3\2\2\2\u00ab\u00ac\7>\2\2\u00ac\u00ad\7>\2\2\u00ad,\3"+
		"\2\2\2\u00ae\u00af\7=\2\2\u00af.\3\2\2\2\u00b0\u00b1\7<\2\2\u00b1\60\3"+
		"\2\2\2\u00b2\u00b3\7?\2\2\u00b3\62\3\2\2\2\u00b4\u00b5\7*\2\2\u00b5\64"+
		"\3\2\2\2\u00b6\u00b7\7+\2\2\u00b7\66\3\2\2\2\u00b8\u00b9\7}\2\2\u00b9"+
		"8\3\2\2\2\u00ba\u00bb\7\177\2\2\u00bb:\3\2\2\2\u00bc\u00bd\7k\2\2\u00bd"+
		"\u00be\7p\2\2\u00be\u00bf\7v\2\2\u00bf<\3\2\2\2\u00c0\u00c1\7h\2\2\u00c1"+
		"\u00c2\7n\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7v\2\2"+
		"\u00c5>\3\2\2\2\u00c6\u00c7\7d\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7q\2"+
		"\2\u00c9\u00ca\7n\2\2\u00ca@\3\2\2\2\u00cb\u00cc\7e\2\2\u00cc\u00cd\7"+
		"j\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7t\2\2\u00cfB\3\2\2\2\u00d0\u00d1"+
		"\7v\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4\7g\2\2\u00d4"+
		"D\3\2\2\2\u00d5\u00d6\7h\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7n\2\2\u00d8"+
		"\u00d9\7u\2\2\u00d9\u00da\7g\2\2\u00daF\3\2\2\2\u00db\u00dc\7p\2\2\u00dc"+
		"\u00dd\7k\2\2\u00dd\u00de\7n\2\2\u00deH\3\2\2\2\u00df\u00e0\7k\2\2\u00e0"+
		"\u00e1\7h\2\2\u00e1J\3\2\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7n\2\2\u00e4"+
		"\u00e5\7u\2\2\u00e5\u00e6\7g\2\2\u00e6L\3\2\2\2\u00e7\u00e8\7h\2\2\u00e8"+
		"\u00e9\7q\2\2\u00e9\u00ea\7t\2\2\u00eaN\3\2\2\2\u00eb\u00ec\7y\2\2\u00ec"+
		"\u00ed\7j\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7g\2\2"+
		"\u00f0P\3\2\2\2\u00f1\u00f2\7f\2\2\u00f2\u00f3\7q\2\2\u00f3R\3\2\2\2\u00f4"+
		"\u00f5\7n\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7i\2\2\u00f7T\3\2\2\2\u00f8"+
		"\u00f9\7u\2\2\u00f9\u00fa\7y\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7v\2\2"+
		"\u00fc\u00fd\7e\2\2\u00fd\u00fe\7j\2\2\u00feV\3\2\2\2\u00ff\u0100\7e\2"+
		"\2\u0100\u0101\7c\2\2\u0101\u0102\7u\2\2\u0102\u0103\7g\2\2\u0103X\3\2"+
		"\2\2\u0104\u0105\7d\2\2\u0105\u0106\7t\2\2\u0106\u0107\7g\2\2\u0107\u0108"+
		"\7c\2\2\u0108\u0109\7m\2\2\u0109Z\3\2\2\2\u010a\u010b\7o\2\2\u010b\u010c"+
		"\7c\2\2\u010c\u010d\7k\2\2\u010d\u010e\7p\2\2\u010e\\\3\2\2\2\u010f\u0110"+
		"\7f\2\2\u0110\u0111\7g\2\2\u0111\u0112\7h\2\2\u0112\u0113\7c\2\2\u0113"+
		"\u0114\7w\2\2\u0114\u0115\7n\2\2\u0115\u0116\7v\2\2\u0116^\3\2\2\2\u0117"+
		"\u0118\7t\2\2\u0118\u0119\7g\2\2\u0119\u011a\7v\2\2\u011a\u011b\7w\2\2"+
		"\u011b\u011c\7t\2\2\u011c\u011d\7p\2\2\u011d`\3\2\2\2\u011e\u011f\7e\2"+
		"\2\u011f\u0120\7q\2\2\u0120\u0121\7w\2\2\u0121\u0122\7v\2\2\u0122b\3\2"+
		"\2\2\u0123\u0124\7e\2\2\u0124\u0125\7k\2\2\u0125\u0126\7p\2\2\u0126d\3"+
		"\2\2\2\u0127\u012b\t\2\2\2\u0128\u012a\t\3\2\2\u0129\u0128\3\2\2\2\u012a"+
		"\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012cf\3\2\2\2"+
		"\u012d\u012b\3\2\2\2\u012e\u0130\t\4\2\2\u012f\u012e\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132h\3\2\2\2\u0133"+
		"\u0135\t\4\2\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013c\7\60\2\2\u0139"+
		"\u013b\t\4\2\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013c\u013d\3\2\2\2\u013d\u0146\3\2\2\2\u013e\u013c\3\2\2\2\u013f"+
		"\u0141\7\60\2\2\u0140\u0142\t\4\2\2\u0141\u0140\3\2\2\2\u0142\u0143\3"+
		"\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145"+
		"\u0134\3\2\2\2\u0145\u013f\3\2\2\2\u0146j\3\2\2\2\u0147\u014d\7$\2\2\u0148"+
		"\u014c\n\5\2\2\u0149\u014a\7$\2\2\u014a\u014c\7$\2\2\u014b\u0148\3\2\2"+
		"\2\u014b\u0149\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e"+
		"\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\7$\2\2\u0151"+
		"l\3\2\2\2\u0152\u0156\7)\2\2\u0153\u0157\n\5\2\2\u0154\u0155\7$\2\2\u0155"+
		"\u0157\7$\2\2\u0156\u0153\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u0159\7)\2\2\u0159n\3\2\2\2\u015a\u015b\7\61\2\2\u015b\u015c"+
		"\7\61\2\2\u015c\u0160\3\2\2\2\u015d\u015f\n\6\2\2\u015e\u015d\3\2\2\2"+
		"\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163"+
		"\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\b8\2\2\u0164p\3\2\2\2\u0165\u0166"+
		"\7\61\2\2\u0166\u0167\7,\2\2\u0167\u016b\3\2\2\2\u0168\u016a\13\2\2\2"+
		"\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u016c\3\2\2\2\u016b\u0169"+
		"\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u016f\7,\2\2\u016f"+
		"\u0170\7\61\2\2\u0170\u0171\3\2\2\2\u0171\u0172\b9\2\2\u0172r\3\2\2\2"+
		"\u0173\u0174\t\7\2\2\u0174\u0175\3\2\2\2\u0175\u0176\b:\2\2\u0176t\3\2"+
		"\2\2\u0177\u0178\13\2\2\2\u0178v\3\2\2\2\16\2\u012b\u0131\u0136\u013c"+
		"\u0143\u0145\u014b\u014d\u0156\u0160\u016b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}