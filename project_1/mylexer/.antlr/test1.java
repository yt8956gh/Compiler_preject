// Generated from /home/nian/Downloads/compiler/Java-example1/test1.g by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class test1 extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_TYPE=1, CHAR_TYPE=2, VOID_TYPE=3, FLOAT_TYPE=4, WHILE_=5, EQ_OP=6, 
		LE_OP=7, GE_OP=8, NE_OP=9, PP_OP=10, MM_OP=11, RSHIFT_OP=12, LSHIFT_OP=13, 
		DEC_NUM=14, ID=15, FLOAT_NUM=16, COMMENT1=17, COMMENT2=18, NEW_LINE=19, 
		WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT_TYPE", "CHAR_TYPE", "VOID_TYPE", "FLOAT_TYPE", "WHILE_", "EQ_OP", 
		"LE_OP", "GE_OP", "NE_OP", "PP_OP", "MM_OP", "RSHIFT_OP", "LSHIFT_OP", 
		"DEC_NUM", "ID", "FLOAT_NUM", "FLOAT_NUM1", "FLOAT_NUM2", "FLOAT_NUM3", 
		"COMMENT1", "COMMENT2", "NEW_LINE", "LETTER", "DIGIT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'integer'", "'char'", "'void'", "'float'", "'WHILE'", "'=='", "'<='", 
		"'>='", "'!='", "'++'", "'--'", "'<<'", "'>>'", null, null, null, null, 
		null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT_TYPE", "CHAR_TYPE", "VOID_TYPE", "FLOAT_TYPE", "WHILE_", "EQ_OP", 
		"LE_OP", "GE_OP", "NE_OP", "PP_OP", "MM_OP", "RSHIFT_OP", "LSHIFT_OP", 
		"DEC_NUM", "ID", "FLOAT_NUM", "COMMENT1", "COMMENT2", "NEW_LINE", "WS"
	};
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


	public test1(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "test1.g"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00bb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\7\17o\n\17\f\17\16\17r\13"+
		"\17\5\17t\n\17\3\20\3\20\3\20\7\20y\n\20\f\20\16\20|\13\20\3\21\3\21\3"+
		"\21\5\21\u0081\n\21\3\22\6\22\u0084\n\22\r\22\16\22\u0085\3\22\3\22\7"+
		"\22\u008a\n\22\f\22\16\22\u008d\13\22\3\23\3\23\6\23\u0091\n\23\r\23\16"+
		"\23\u0092\3\24\6\24\u0096\n\24\r\24\16\24\u0097\3\25\3\25\3\25\3\25\7"+
		"\25\u009e\n\25\f\25\16\25\u00a1\13\25\3\25\3\25\3\26\3\26\3\26\3\26\7"+
		"\26\u00a9\n\26\f\26\16\26\u00ac\13\26\3\26\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\6\32\u00b8\n\32\r\32\16\32\u00b9\2\2\33\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\2"+
		"%\2\'\2)\23+\24-\25/\2\61\2\63\26\3\2\4\5\2C\\aac|\5\2\13\13\17\17\"\""+
		"\2\u00c2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5=\3\2\2"+
		"\2\7B\3\2\2\2\tG\3\2\2\2\13M\3\2\2\2\rS\3\2\2\2\17V\3\2\2\2\21Y\3\2\2"+
		"\2\23\\\3\2\2\2\25_\3\2\2\2\27b\3\2\2\2\31e\3\2\2\2\33h\3\2\2\2\35s\3"+
		"\2\2\2\37u\3\2\2\2!\u0080\3\2\2\2#\u0083\3\2\2\2%\u008e\3\2\2\2\'\u0095"+
		"\3\2\2\2)\u0099\3\2\2\2+\u00a4\3\2\2\2-\u00b0\3\2\2\2/\u00b2\3\2\2\2\61"+
		"\u00b4\3\2\2\2\63\u00b7\3\2\2\2\65\66\7k\2\2\66\67\7p\2\2\678\7v\2\28"+
		"9\7g\2\29:\7i\2\2:;\7g\2\2;<\7t\2\2<\4\3\2\2\2=>\7e\2\2>?\7j\2\2?@\7c"+
		"\2\2@A\7t\2\2A\6\3\2\2\2BC\7x\2\2CD\7q\2\2DE\7k\2\2EF\7f\2\2F\b\3\2\2"+
		"\2GH\7h\2\2HI\7n\2\2IJ\7q\2\2JK\7c\2\2KL\7v\2\2L\n\3\2\2\2MN\7Y\2\2NO"+
		"\7J\2\2OP\7K\2\2PQ\7N\2\2QR\7G\2\2R\f\3\2\2\2ST\7?\2\2TU\7?\2\2U\16\3"+
		"\2\2\2VW\7>\2\2WX\7?\2\2X\20\3\2\2\2YZ\7@\2\2Z[\7?\2\2[\22\3\2\2\2\\]"+
		"\7#\2\2]^\7?\2\2^\24\3\2\2\2_`\7-\2\2`a\7-\2\2a\26\3\2\2\2bc\7/\2\2cd"+
		"\7/\2\2d\30\3\2\2\2ef\7>\2\2fg\7>\2\2g\32\3\2\2\2hi\7@\2\2ij\7@\2\2j\34"+
		"\3\2\2\2kt\7\62\2\2lp\4\63;\2mo\5\61\31\2nm\3\2\2\2or\3\2\2\2pn\3\2\2"+
		"\2pq\3\2\2\2qt\3\2\2\2rp\3\2\2\2sk\3\2\2\2sl\3\2\2\2t\36\3\2\2\2uz\5/"+
		"\30\2vy\5/\30\2wy\5\61\31\2xv\3\2\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{"+
		"\3\2\2\2{ \3\2\2\2|z\3\2\2\2}\u0081\5#\22\2~\u0081\5%\23\2\177\u0081\5"+
		"\'\24\2\u0080}\3\2\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\"\3\2\2"+
		"\2\u0082\u0084\5\61\31\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008b\7\60"+
		"\2\2\u0088\u008a\5\61\31\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c$\3\2\2\2\u008d\u008b\3\2\2\2"+
		"\u008e\u0090\7\60\2\2\u008f\u0091\5\61\31\2\u0090\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093&\3\2\2\2"+
		"\u0094\u0096\5\61\31\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098(\3\2\2\2\u0099\u009a\7\61\2\2\u009a"+
		"\u009b\7\61\2\2\u009b\u009f\3\2\2\2\u009c\u009e\13\2\2\2\u009d\u009c\3"+
		"\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\f\2\2\u00a3*\3\2\2\2"+
		"\u00a4\u00a5\7\61\2\2\u00a5\u00a6\7,\2\2\u00a6\u00aa\3\2\2\2\u00a7\u00a9"+
		"\13\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2"+
		"\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae"+
		"\7,\2\2\u00ae\u00af\7\61\2\2\u00af,\3\2\2\2\u00b0\u00b1\7\f\2\2\u00b1"+
		".\3\2\2\2\u00b2\u00b3\t\2\2\2\u00b3\60\3\2\2\2\u00b4\u00b5\4\62;\2\u00b5"+
		"\62\3\2\2\2\u00b6\u00b8\t\3\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2"+
		"\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\64\3\2\2\2\17\2psxz\u0080"+
		"\u0085\u008b\u0092\u0097\u009f\u00aa\u00b9\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}