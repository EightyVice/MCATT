// Generated from c:\Users\8yvic\source\repos\MCATT\MCATT\C.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, DECIMAL_LITERAL=58, 
		HEX_LITERAL=59, OCT_LITERAL=60, BINARY_LITERAL=61, FLOAT_LITERAL=62, HEX_FLOAT_LITERAL=63, 
		BOOL_LITERAL=64, CHAR_LITERAL=65, STRING_LITERAL=66, IDENTIFIER=67;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
			"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
			"DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", 
			"HEX_FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
			"IDENTIFIER", "ExponentPart", "EscapeSequence", "HexDigits", "HexDigit", 
			"Digits", "LetterOrDigit", "Letter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'struct'", "'{'", "'}'", "'('", "')'", "'char'", "'short'", 
			"'int'", "'long'", "'float'", "'double'", "'signed'", "'unsgined'", "','", 
			"'='", "'['", "']'", "'*'", "'.'", "'new'", "'++'", "'--'", "'+'", "'-'", 
			"'~'", "'!'", "'&'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", 
			"'!='", "'^'", "'|'", "'&&'", "'||'", "'?'", "':'", "'+='", "'-='", "'*='", 
			"'/='", "'&='", "'|='", "'^='", "'>>='", "'<<='", "'%='", "'if'", "'else'", 
			"'while'", "'do'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "DECIMAL_LITERAL", 
			"HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", 
			"BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "IDENTIFIER"
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


	public CLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "C.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2E\u0226\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3"+
		")\3)\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\3"+
		"8\38\39\39\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\5;\u0157\n;\3;\6;\u015a\n"+
		";\r;\16;\u015b\3;\5;\u015f\n;\5;\u0161\n;\3;\5;\u0164\n;\3<\3<\3<\3<\7"+
		"<\u016a\n<\f<\16<\u016d\13<\3<\5<\u0170\n<\3<\5<\u0173\n<\3=\3=\7=\u0177"+
		"\n=\f=\16=\u017a\13=\3=\3=\7=\u017e\n=\f=\16=\u0181\13=\3=\5=\u0184\n"+
		"=\3=\5=\u0187\n=\3>\3>\3>\3>\7>\u018d\n>\f>\16>\u0190\13>\3>\5>\u0193"+
		"\n>\3>\5>\u0196\n>\3?\3?\3?\5?\u019b\n?\3?\3?\5?\u019f\n?\3?\5?\u01a2"+
		"\n?\3?\5?\u01a5\n?\3?\3?\3?\5?\u01aa\n?\3?\5?\u01ad\n?\5?\u01af\n?\3@"+
		"\3@\3@\3@\5@\u01b5\n@\3@\5@\u01b8\n@\3@\3@\5@\u01bc\n@\3@\3@\5@\u01c0"+
		"\n@\3@\3@\5@\u01c4\n@\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u01cf\nA\3B\3B\3B"+
		"\5B\u01d4\nB\3B\3B\3C\3C\3C\7C\u01db\nC\fC\16C\u01de\13C\3C\3C\3D\3D\7"+
		"D\u01e4\nD\fD\16D\u01e7\13D\3E\3E\5E\u01eb\nE\3E\3E\3F\3F\3F\3F\5F\u01f3"+
		"\nF\3F\5F\u01f6\nF\3F\3F\3F\6F\u01fb\nF\rF\16F\u01fc\3F\3F\3F\3F\3F\5"+
		"F\u0204\nF\3G\3G\3G\7G\u0209\nG\fG\16G\u020c\13G\3G\5G\u020f\nG\3H\3H"+
		"\3I\3I\7I\u0215\nI\fI\16I\u0218\13I\3I\5I\u021b\nI\3J\3J\5J\u021f\nJ\3"+
		"K\3K\3K\3K\5K\u0225\nK\2\2L\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087"+
		"E\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\3\2\32\3\2\63"+
		";\4\2NNnn\4\2ZZzz\5\2\62;CHch\6\2\62;CHaach\3\2\629\4\2\629aa\4\2DDdd"+
		"\3\2\62\63\4\2\62\63aa\6\2FFHHffhh\4\2RRrr\4\2--//\6\2\f\f\17\17))^^\6"+
		"\2\f\f\17\17$$^^\4\2GGgg\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\62;\4\2\62"+
		";aa\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001"+
		"\2\u024c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y"+
		"\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3"+
		"\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\3\u0097\3\2\2\2\5\u0099\3\2\2\2"+
		"\7\u00a0\3\2\2\2\t\u00a2\3\2\2\2\13\u00a4\3\2\2\2\r\u00a6\3\2\2\2\17\u00a8"+
		"\3\2\2\2\21\u00ad\3\2\2\2\23\u00b3\3\2\2\2\25\u00b7\3\2\2\2\27\u00bc\3"+
		"\2\2\2\31\u00c2\3\2\2\2\33\u00c9\3\2\2\2\35\u00d0\3\2\2\2\37\u00d9\3\2"+
		"\2\2!\u00db\3\2\2\2#\u00dd\3\2\2\2%\u00df\3\2\2\2\'\u00e1\3\2\2\2)\u00e3"+
		"\3\2\2\2+\u00e5\3\2\2\2-\u00e9\3\2\2\2/\u00ec\3\2\2\2\61\u00ef\3\2\2\2"+
		"\63\u00f1\3\2\2\2\65\u00f3\3\2\2\2\67\u00f5\3\2\2\29\u00f7\3\2\2\2;\u00f9"+
		"\3\2\2\2=\u00fb\3\2\2\2?\u00fd\3\2\2\2A\u00ff\3\2\2\2C\u0101\3\2\2\2E"+
		"\u0104\3\2\2\2G\u0107\3\2\2\2I\u010a\3\2\2\2K\u010d\3\2\2\2M\u010f\3\2"+
		"\2\2O\u0111\3\2\2\2Q\u0114\3\2\2\2S\u0117\3\2\2\2U\u0119\3\2\2\2W\u011b"+
		"\3\2\2\2Y\u011e\3\2\2\2[\u0121\3\2\2\2]\u0124\3\2\2\2_\u0127\3\2\2\2a"+
		"\u012a\3\2\2\2c\u012d\3\2\2\2e\u0130\3\2\2\2g\u0134\3\2\2\2i\u0138\3\2"+
		"\2\2k\u013b\3\2\2\2m\u013e\3\2\2\2o\u0143\3\2\2\2q\u0149\3\2\2\2s\u014c"+
		"\3\2\2\2u\u0160\3\2\2\2w\u0165\3\2\2\2y\u0174\3\2\2\2{\u0188\3\2\2\2}"+
		"\u01ae\3\2\2\2\177\u01b0\3\2\2\2\u0081\u01ce\3\2\2\2\u0083\u01d0\3\2\2"+
		"\2\u0085\u01d7\3\2\2\2\u0087\u01e1\3\2\2\2\u0089\u01e8\3\2\2\2\u008b\u0203"+
		"\3\2\2\2\u008d\u0205\3\2\2\2\u008f\u0210\3\2\2\2\u0091\u0212\3\2\2\2\u0093"+
		"\u021e\3\2\2\2\u0095\u0224\3\2\2\2\u0097\u0098\7=\2\2\u0098\4\3\2\2\2"+
		"\u0099\u009a\7u\2\2\u009a\u009b\7v\2\2\u009b\u009c\7t\2\2\u009c\u009d"+
		"\7w\2\2\u009d\u009e\7e\2\2\u009e\u009f\7v\2\2\u009f\6\3\2\2\2\u00a0\u00a1"+
		"\7}\2\2\u00a1\b\3\2\2\2\u00a2\u00a3\7\177\2\2\u00a3\n\3\2\2\2\u00a4\u00a5"+
		"\7*\2\2\u00a5\f\3\2\2\2\u00a6\u00a7\7+\2\2\u00a7\16\3\2\2\2\u00a8\u00a9"+
		"\7e\2\2\u00a9\u00aa\7j\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7t\2\2\u00ac"+
		"\20\3\2\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7j\2\2\u00af\u00b0\7q\2\2\u00b0"+
		"\u00b1\7t\2\2\u00b1\u00b2\7v\2\2\u00b2\22\3\2\2\2\u00b3\u00b4\7k\2\2\u00b4"+
		"\u00b5\7p\2\2\u00b5\u00b6\7v\2\2\u00b6\24\3\2\2\2\u00b7\u00b8\7n\2\2\u00b8"+
		"\u00b9\7q\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7i\2\2\u00bb\26\3\2\2\2\u00bc"+
		"\u00bd\7h\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7c\2\2"+
		"\u00c0\u00c1\7v\2\2\u00c1\30\3\2\2\2\u00c2\u00c3\7f\2\2\u00c3\u00c4\7"+
		"q\2\2\u00c4\u00c5\7w\2\2\u00c5\u00c6\7d\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8"+
		"\7g\2\2\u00c8\32\3\2\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc"+
		"\7i\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7f\2\2\u00cf"+
		"\34\3\2\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7u\2\2\u00d3"+
		"\u00d4\7i\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7\7g\2\2"+
		"\u00d7\u00d8\7f\2\2\u00d8\36\3\2\2\2\u00d9\u00da\7.\2\2\u00da \3\2\2\2"+
		"\u00db\u00dc\7?\2\2\u00dc\"\3\2\2\2\u00dd\u00de\7]\2\2\u00de$\3\2\2\2"+
		"\u00df\u00e0\7_\2\2\u00e0&\3\2\2\2\u00e1\u00e2\7,\2\2\u00e2(\3\2\2\2\u00e3"+
		"\u00e4\7\60\2\2\u00e4*\3\2\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7\7g\2\2\u00e7"+
		"\u00e8\7y\2\2\u00e8,\3\2\2\2\u00e9\u00ea\7-\2\2\u00ea\u00eb\7-\2\2\u00eb"+
		".\3\2\2\2\u00ec\u00ed\7/\2\2\u00ed\u00ee\7/\2\2\u00ee\60\3\2\2\2\u00ef"+
		"\u00f0\7-\2\2\u00f0\62\3\2\2\2\u00f1\u00f2\7/\2\2\u00f2\64\3\2\2\2\u00f3"+
		"\u00f4\7\u0080\2\2\u00f4\66\3\2\2\2\u00f5\u00f6\7#\2\2\u00f68\3\2\2\2"+
		"\u00f7\u00f8\7(\2\2\u00f8:\3\2\2\2\u00f9\u00fa\7\61\2\2\u00fa<\3\2\2\2"+
		"\u00fb\u00fc\7\'\2\2\u00fc>\3\2\2\2\u00fd\u00fe\7>\2\2\u00fe@\3\2\2\2"+
		"\u00ff\u0100\7@\2\2\u0100B\3\2\2\2\u0101\u0102\7>\2\2\u0102\u0103\7?\2"+
		"\2\u0103D\3\2\2\2\u0104\u0105\7@\2\2\u0105\u0106\7?\2\2\u0106F\3\2\2\2"+
		"\u0107\u0108\7?\2\2\u0108\u0109\7?\2\2\u0109H\3\2\2\2\u010a\u010b\7#\2"+
		"\2\u010b\u010c\7?\2\2\u010cJ\3\2\2\2\u010d\u010e\7`\2\2\u010eL\3\2\2\2"+
		"\u010f\u0110\7~\2\2\u0110N\3\2\2\2\u0111\u0112\7(\2\2\u0112\u0113\7(\2"+
		"\2\u0113P\3\2\2\2\u0114\u0115\7~\2\2\u0115\u0116\7~\2\2\u0116R\3\2\2\2"+
		"\u0117\u0118\7A\2\2\u0118T\3\2\2\2\u0119\u011a\7<\2\2\u011aV\3\2\2\2\u011b"+
		"\u011c\7-\2\2\u011c\u011d\7?\2\2\u011dX\3\2\2\2\u011e\u011f\7/\2\2\u011f"+
		"\u0120\7?\2\2\u0120Z\3\2\2\2\u0121\u0122\7,\2\2\u0122\u0123\7?\2\2\u0123"+
		"\\\3\2\2\2\u0124\u0125\7\61\2\2\u0125\u0126\7?\2\2\u0126^\3\2\2\2\u0127"+
		"\u0128\7(\2\2\u0128\u0129\7?\2\2\u0129`\3\2\2\2\u012a\u012b\7~\2\2\u012b"+
		"\u012c\7?\2\2\u012cb\3\2\2\2\u012d\u012e\7`\2\2\u012e\u012f\7?\2\2\u012f"+
		"d\3\2\2\2\u0130\u0131\7@\2\2\u0131\u0132\7@\2\2\u0132\u0133\7?\2\2\u0133"+
		"f\3\2\2\2\u0134\u0135\7>\2\2\u0135\u0136\7>\2\2\u0136\u0137\7?\2\2\u0137"+
		"h\3\2\2\2\u0138\u0139\7\'\2\2\u0139\u013a\7?\2\2\u013aj\3\2\2\2\u013b"+
		"\u013c\7k\2\2\u013c\u013d\7h\2\2\u013dl\3\2\2\2\u013e\u013f\7g\2\2\u013f"+
		"\u0140\7n\2\2\u0140\u0141\7u\2\2\u0141\u0142\7g\2\2\u0142n\3\2\2\2\u0143"+
		"\u0144\7y\2\2\u0144\u0145\7j\2\2\u0145\u0146\7k\2\2\u0146\u0147\7n\2\2"+
		"\u0147\u0148\7g\2\2\u0148p\3\2\2\2\u0149\u014a\7f\2\2\u014a\u014b\7q\2"+
		"\2\u014br\3\2\2\2\u014c\u014d\7t\2\2\u014d\u014e\7g\2\2\u014e\u014f\7"+
		"v\2\2\u014f\u0150\7w\2\2\u0150\u0151\7t\2\2\u0151\u0152\7p\2\2\u0152t"+
		"\3\2\2\2\u0153\u0161\7\62\2\2\u0154\u015e\t\2\2\2\u0155\u0157\5\u0091"+
		"I\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u015f\3\2\2\2\u0158"+
		"\u015a\7a\2\2\u0159\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\5\u0091I\2\u015e"+
		"\u0156\3\2\2\2\u015e\u0159\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u0153\3\2"+
		"\2\2\u0160\u0154\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0164\t\3\2\2\u0163"+
		"\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164v\3\2\2\2\u0165\u0166\7\62\2\2"+
		"\u0166\u0167\t\4\2\2\u0167\u016f\t\5\2\2\u0168\u016a\t\6\2\2\u0169\u0168"+
		"\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0170\t\5\2\2\u016f\u016b\3\2"+
		"\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u0173\t\3\2\2\u0172"+
		"\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173x\3\2\2\2\u0174\u0178\7\62\2\2"+
		"\u0175\u0177\7a\2\2\u0176\u0175\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176"+
		"\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b"+
		"\u0183\t\7\2\2\u017c\u017e\t\b\2\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2"+
		"\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0182\u0184\t\7\2\2\u0183\u017f\3\2\2\2\u0183\u0184\3\2"+
		"\2\2\u0184\u0186\3\2\2\2\u0185\u0187\t\3\2\2\u0186\u0185\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187z\3\2\2\2\u0188\u0189\7\62\2\2\u0189\u018a\t\t\2\2"+
		"\u018a\u0192\t\n\2\2\u018b\u018d\t\13\2\2\u018c\u018b\3\2\2\2\u018d\u0190"+
		"\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0191\u0193\t\n\2\2\u0192\u018e\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193\u0195\3\2\2\2\u0194\u0196\t\3\2\2\u0195\u0194\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196|\3\2\2\2\u0197\u0198\5\u0091I\2\u0198\u019a\7\60"+
		"\2\2\u0199\u019b\5\u0091I\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u019f\3\2\2\2\u019c\u019d\7\60\2\2\u019d\u019f\5\u0091I\2\u019e\u0197"+
		"\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u01a2\5\u0089E"+
		"\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a5"+
		"\t\f\2\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01af\3\2\2\2\u01a6"+
		"\u01ac\5\u0091I\2\u01a7\u01a9\5\u0089E\2\u01a8\u01aa\t\f\2\2\u01a9\u01a8"+
		"\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01ad\t\f\2\2\u01ac"+
		"\u01a7\3\2\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u019e\3\2"+
		"\2\2\u01ae\u01a6\3\2\2\2\u01af~\3\2\2\2\u01b0\u01b1\7\62\2\2\u01b1\u01bb"+
		"\t\4\2\2\u01b2\u01b4\5\u008dG\2\u01b3\u01b5\7\60\2\2\u01b4\u01b3\3\2\2"+
		"\2\u01b4\u01b5\3\2\2\2\u01b5\u01bc\3\2\2\2\u01b6\u01b8\5\u008dG\2\u01b7"+
		"\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\7\60"+
		"\2\2\u01ba\u01bc\5\u008dG\2\u01bb\u01b2\3\2\2\2\u01bb\u01b7\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01bf\t\r\2\2\u01be\u01c0\t\16\2\2\u01bf\u01be\3"+
		"\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\5\u0091I\2"+
		"\u01c2\u01c4\t\f\2\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u0080"+
		"\3\2\2\2\u01c5\u01c6\7v\2\2\u01c6\u01c7\7t\2\2\u01c7\u01c8\7w\2\2\u01c8"+
		"\u01cf\7g\2\2\u01c9\u01ca\7h\2\2\u01ca\u01cb\7c\2\2\u01cb\u01cc\7n\2\2"+
		"\u01cc\u01cd\7u\2\2\u01cd\u01cf\7g\2\2\u01ce\u01c5\3\2\2\2\u01ce\u01c9"+
		"\3\2\2\2\u01cf\u0082\3\2\2\2\u01d0\u01d3\7)\2\2\u01d1\u01d4\n\17\2\2\u01d2"+
		"\u01d4\5\u008bF\2\u01d3\u01d1\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4\u01d5"+
		"\3\2\2\2\u01d5\u01d6\7)\2\2\u01d6\u0084\3\2\2\2\u01d7\u01dc\7$\2\2\u01d8"+
		"\u01db\n\20\2\2\u01d9\u01db\5\u008bF\2\u01da\u01d8\3\2\2\2\u01da\u01d9"+
		"\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e0\7$\2\2\u01e0\u0086\3\2"+
		"\2\2\u01e1\u01e5\5\u0095K\2\u01e2\u01e4\5\u0093J\2\u01e3\u01e2\3\2\2\2"+
		"\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u0088"+
		"\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01ea\t\21\2\2\u01e9\u01eb\t\16\2\2"+
		"\u01ea\u01e9\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed"+
		"\5\u0091I\2\u01ed\u008a\3\2\2\2\u01ee\u01ef\7^\2\2\u01ef\u0204\t\22\2"+
		"\2\u01f0\u01f5\7^\2\2\u01f1\u01f3\t\23\2\2\u01f2\u01f1\3\2\2\2\u01f2\u01f3"+
		"\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\t\7\2\2\u01f5\u01f2\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u0204\t\7\2\2\u01f8\u01fa\7^"+
		"\2\2\u01f9\u01fb\7w\2\2\u01fa\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc"+
		"\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\5\u008f"+
		"H\2\u01ff\u0200\5\u008fH\2\u0200\u0201\5\u008fH\2\u0201\u0202\5\u008f"+
		"H\2\u0202\u0204\3\2\2\2\u0203\u01ee\3\2\2\2\u0203\u01f0\3\2\2\2\u0203"+
		"\u01f8\3\2\2\2\u0204\u008c\3\2\2\2\u0205\u020e\5\u008fH\2\u0206\u0209"+
		"\5\u008fH\2\u0207\u0209\7a\2\2\u0208\u0206\3\2\2\2\u0208\u0207\3\2\2\2"+
		"\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020d"+
		"\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u020f\5\u008fH\2\u020e\u020a\3\2\2"+
		"\2\u020e\u020f\3\2\2\2\u020f\u008e\3\2\2\2\u0210\u0211\t\5\2\2\u0211\u0090"+
		"\3\2\2\2\u0212\u021a\t\24\2\2\u0213\u0215\t\25\2\2\u0214\u0213\3\2\2\2"+
		"\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0219"+
		"\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021b\t\24\2\2\u021a\u0216\3\2\2\2"+
		"\u021a\u021b\3\2\2\2\u021b\u0092\3\2\2\2\u021c\u021f\5\u0095K\2\u021d"+
		"\u021f\t\24\2\2\u021e\u021c\3\2\2\2\u021e\u021d\3\2\2\2\u021f\u0094\3"+
		"\2\2\2\u0220\u0225\t\26\2\2\u0221\u0225\n\27\2\2\u0222\u0223\t\30\2\2"+
		"\u0223\u0225\t\31\2\2\u0224\u0220\3\2\2\2\u0224\u0221\3\2\2\2\u0224\u0222"+
		"\3\2\2\2\u0225\u0096\3\2\2\2/\2\u0156\u015b\u015e\u0160\u0163\u016b\u016f"+
		"\u0172\u0178\u017f\u0183\u0186\u018e\u0192\u0195\u019a\u019e\u01a1\u01a4"+
		"\u01a9\u01ac\u01ae\u01b4\u01b7\u01bb\u01bf\u01c3\u01ce\u01d3\u01da\u01dc"+
		"\u01e5\u01ea\u01f2\u01f5\u01fc\u0203\u0208\u020a\u020e\u0216\u021a\u021e"+
		"\u0224\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}