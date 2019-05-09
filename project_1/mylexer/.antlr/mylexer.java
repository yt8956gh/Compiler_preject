// Generated from /home/nian/Downloads/compiler/Java-example1/mylexer.g by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mylexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHILE_=1, DO=2, FOR=3, IF=4, ELSE=5, SWITCH=6, CASE=7, STRUCT=8, INLINE=9, 
		TYPEDEF=10, DEFINE=11, IFNDEF=12, IFDEF=13, ENDIF=14, INT_TYPE=15, CHAR_TYPE=16, 
		VOID_TYPE=17, FLOAT_TYPE=18, LONG=19, DOUBLE=20, UNSIGNED=21, SIGNED=22, 
		NULL=23, STDIN=24, STDOUT=25, STDERR=26, RETURN=27, BREAK=28, CONTINUE=29, 
		MAIN=30, SIZEOF=31, PRINTF=32, SCANF=33, STRCPY=34, STRSTR=35, STRCHR=36, 
		STRCMP=37, STRCAT=38, STRLEN=39, STRTOK=40, GETCHAR=41, PUTCHAR=42, FGETS=43, 
		MALLOC=44, FREE=45, MEMSET=46, SPINTF=47, FPTINF=48, SSCANF=49, QSORT=50, 
		ATOI=51, ITOA=52, SQRT=53, RAND=54, RANDOM=55, SRANDOM=56, TIME=57, EQ_OP=58, 
		LE_OP=59, GE_OP=60, NE_OP=61, PP_OP=62, MM_OP=63, ADD_EQ=64, SUB_EQ=65, 
		MULT_EQ=66, DIV_EQ=67, RSHIFT_OP=68, LSHIFT_OP=69, BIGGER=70, SMALLER=71, 
		AND=72, OR=73, NOT=74, XOR=75, COMMA=76, SEMICOLON=77, ADD_OP=78, SUB_OP=79, 
		DIV_OP=80, MOD_OP=81, ASSIGN=82, ROUND_BRACKET_LEFT=83, ROUND_BRACKET_RIGHT=84, 
		SQUARE_BRACKET_LEFT=85, SQUARE_BRACKET_RIGHT=86, CURLY_BRACKET_LEFT=87, 
		CURLY_BRACKET_RIGHT=88, STAR=89, ARROW=90, ADDRESS_OF_OPERATOR=91, STRING=92, 
		CHARACTER=93, ID=94, DEC_NUM=95, FLOAT_NUM=96, COMMENT1=97, COMMENT2=98, 
		NEW_LINE=99, WS=100;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WHILE_", "DO", "FOR", "IF", "ELSE", "SWITCH", "CASE", "STRUCT", "INLINE", 
		"TYPEDEF", "DEFINE", "IFNDEF", "IFDEF", "ENDIF", "INT_TYPE", "CHAR_TYPE", 
		"VOID_TYPE", "FLOAT_TYPE", "LONG", "DOUBLE", "UNSIGNED", "SIGNED", "NULL", 
		"STDIN", "STDOUT", "STDERR", "RETURN", "BREAK", "CONTINUE", "MAIN", "SIZEOF", 
		"PRINTF", "SCANF", "STRCPY", "STRSTR", "STRCHR", "STRCMP", "STRCAT", "STRLEN", 
		"STRTOK", "GETCHAR", "PUTCHAR", "FGETS", "MALLOC", "FREE", "MEMSET", "SPINTF", 
		"FPTINF", "SSCANF", "QSORT", "ATOI", "ITOA", "SQRT", "RAND", "RANDOM", 
		"SRANDOM", "TIME", "EQ_OP", "LE_OP", "GE_OP", "NE_OP", "PP_OP", "MM_OP", 
		"ADD_EQ", "SUB_EQ", "MULT_EQ", "DIV_EQ", "RSHIFT_OP", "LSHIFT_OP", "BIGGER", 
		"SMALLER", "AND", "OR", "NOT", "XOR", "COMMA", "SEMICOLON", "ADD_OP", 
		"SUB_OP", "DIV_OP", "MOD_OP", "ASSIGN", "ROUND_BRACKET_LEFT", "ROUND_BRACKET_RIGHT", 
		"SQUARE_BRACKET_LEFT", "SQUARE_BRACKET_RIGHT", "CURLY_BRACKET_LEFT", "CURLY_BRACKET_RIGHT", 
		"STAR", "ARROW", "ADDRESS_OF_OPERATOR", "STRING", "CHARACTER", "ID", "DEC_NUM", 
		"FLOAT_NUM", "FLOAT_NUM1", "FLOAT_NUM2", "FLOAT_NUM3", "COMMENT1", "COMMENT2", 
		"NEW_LINE", "LETTER", "DIGIT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'while'", "'do'", "'for'", "'if'", "'else'", "'switch'", "'case'", 
		"'struct'", "'inline'", "'typedef'", "'#define'", "'#ifndef'", "'#ifdef'", 
		"'#endif'", "'int'", "'char'", "'void'", "'float'", "'long'", "'double'", 
		"'unsigned'", "'signed'", "'NULL'", "'stdin'", "'stdout'", "'strerr'", 
		"'return'", "'break'", "'continue'", "'main'", "'sizeof'", "'printf'", 
		"'scanf'", "'strcpy'", "'strstr'", "'strchr'", "'strcmp'", "'strcat'", 
		"'strlen'", "'strtok'", "'getchar'", "'putchar'", "'fgets'", "'malloc'", 
		"'free'", "'memset'", "'sprintf'", "'fprintf'", "'sscanf'", "'qsort'", 
		"'atoi'", "'itoa'", "'sqrt'", "'rand'", "'random'", "'srandom'", "'time'", 
		"'=='", "'<='", "'>='", "'!='", "'++'", "'--'", "'+='", "'-='", "'*='", 
		"'/='", "'<<'", "'>>'", "'>'", "'<'", "'&&'", "'||'", "'!'", "'^'", "','", 
		"';'", "'+'", "'-'", "'/'", "'%'", "'='", "'('", "')'", "'['", "']'", 
		"'{'", "'}'", "'*'", "'->'", "'&'", null, null, null, null, null, null, 
		null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHILE_", "DO", "FOR", "IF", "ELSE", "SWITCH", "CASE", "STRUCT", 
		"INLINE", "TYPEDEF", "DEFINE", "IFNDEF", "IFDEF", "ENDIF", "INT_TYPE", 
		"CHAR_TYPE", "VOID_TYPE", "FLOAT_TYPE", "LONG", "DOUBLE", "UNSIGNED", 
		"SIGNED", "NULL", "STDIN", "STDOUT", "STDERR", "RETURN", "BREAK", "CONTINUE", 
		"MAIN", "SIZEOF", "PRINTF", "SCANF", "STRCPY", "STRSTR", "STRCHR", "STRCMP", 
		"STRCAT", "STRLEN", "STRTOK", "GETCHAR", "PUTCHAR", "FGETS", "MALLOC", 
		"FREE", "MEMSET", "SPINTF", "FPTINF", "SSCANF", "QSORT", "ATOI", "ITOA", 
		"SQRT", "RAND", "RANDOM", "SRANDOM", "TIME", "EQ_OP", "LE_OP", "GE_OP", 
		"NE_OP", "PP_OP", "MM_OP", "ADD_EQ", "SUB_EQ", "MULT_EQ", "DIV_EQ", "RSHIFT_OP", 
		"LSHIFT_OP", "BIGGER", "SMALLER", "AND", "OR", "NOT", "XOR", "COMMA", 
		"SEMICOLON", "ADD_OP", "SUB_OP", "DIV_OP", "MOD_OP", "ASSIGN", "ROUND_BRACKET_LEFT", 
		"ROUND_BRACKET_RIGHT", "SQUARE_BRACKET_LEFT", "SQUARE_BRACKET_RIGHT", 
		"CURLY_BRACKET_LEFT", "CURLY_BRACKET_RIGHT", "STAR", "ARROW", "ADDRESS_OF_OPERATOR", 
		"STRING", "CHARACTER", "ID", "DEC_NUM", "FLOAT_NUM", "COMMENT1", "COMMENT2", 
		"NEW_LINE", "WS"
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


	public mylexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "mylexer.g"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2f\u02f4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3"+
		"%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3"+
		"/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3"+
		"\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38"+
		"\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>"+
		"\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E"+
		"\3F\3F\3F\3G\3G\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O"+
		"\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3["+
		"\3[\3[\3\\\3\\\3]\3]\6]\u0297\n]\r]\16]\u0298\3]\3]\3^\3^\6^\u029f\n^"+
		"\r^\16^\u02a0\3^\3^\3_\3_\3_\7_\u02a8\n_\f_\16_\u02ab\13_\3`\3`\3`\7`"+
		"\u02b0\n`\f`\16`\u02b3\13`\5`\u02b5\n`\3a\3a\3a\5a\u02ba\na\3b\6b\u02bd"+
		"\nb\rb\16b\u02be\3b\3b\7b\u02c3\nb\fb\16b\u02c6\13b\3c\3c\6c\u02ca\nc"+
		"\rc\16c\u02cb\3d\6d\u02cf\nd\rd\16d\u02d0\3e\3e\3e\3e\7e\u02d7\ne\fe\16"+
		"e\u02da\13e\3e\3e\3f\3f\3f\3f\7f\u02e2\nf\ff\16f\u02e5\13f\3f\3f\3f\3"+
		"g\3g\3h\3h\3i\3i\3j\6j\u02f1\nj\rj\16j\u02f2\2\2k\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095"+
		"L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9"+
		"V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd"+
		"`\u00bfa\u00c1b\u00c3\2\u00c5\2\u00c7\2\u00c9c\u00cbd\u00cde\u00cf\2\u00d1"+
		"\2\u00d3f\3\2\4\5\2C\\aac|\5\2\13\13\17\17\"\"\2\u02fd\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q"+
		"\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2"+
		"\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab"+
		"\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2"+
		"\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd"+
		"\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2"+
		"\2\2\u00cd\3\2\2\2\2\u00d3\3\2\2\2\3\u00d5\3\2\2\2\5\u00db\3\2\2\2\7\u00de"+
		"\3\2\2\2\t\u00e2\3\2\2\2\13\u00e5\3\2\2\2\r\u00ea\3\2\2\2\17\u00f1\3\2"+
		"\2\2\21\u00f6\3\2\2\2\23\u00fd\3\2\2\2\25\u0104\3\2\2\2\27\u010c\3\2\2"+
		"\2\31\u0114\3\2\2\2\33\u011c\3\2\2\2\35\u0123\3\2\2\2\37\u012a\3\2\2\2"+
		"!\u012e\3\2\2\2#\u0133\3\2\2\2%\u0138\3\2\2\2\'\u013e\3\2\2\2)\u0143\3"+
		"\2\2\2+\u014a\3\2\2\2-\u0153\3\2\2\2/\u015a\3\2\2\2\61\u015f\3\2\2\2\63"+
		"\u0165\3\2\2\2\65\u016c\3\2\2\2\67\u0173\3\2\2\29\u017a\3\2\2\2;\u0180"+
		"\3\2\2\2=\u0189\3\2\2\2?\u018e\3\2\2\2A\u0195\3\2\2\2C\u019c\3\2\2\2E"+
		"\u01a2\3\2\2\2G\u01a9\3\2\2\2I\u01b0\3\2\2\2K\u01b7\3\2\2\2M\u01be\3\2"+
		"\2\2O\u01c5\3\2\2\2Q\u01cc\3\2\2\2S\u01d3\3\2\2\2U\u01db\3\2\2\2W\u01e3"+
		"\3\2\2\2Y\u01e9\3\2\2\2[\u01f0\3\2\2\2]\u01f5\3\2\2\2_\u01fc\3\2\2\2a"+
		"\u0204\3\2\2\2c\u020c\3\2\2\2e\u0213\3\2\2\2g\u0219\3\2\2\2i\u021e\3\2"+
		"\2\2k\u0223\3\2\2\2m\u0228\3\2\2\2o\u022d\3\2\2\2q\u0234\3\2\2\2s\u023c"+
		"\3\2\2\2u\u0241\3\2\2\2w\u0244\3\2\2\2y\u0247\3\2\2\2{\u024a\3\2\2\2}"+
		"\u024d\3\2\2\2\177\u0250\3\2\2\2\u0081\u0253\3\2\2\2\u0083\u0256\3\2\2"+
		"\2\u0085\u0259\3\2\2\2\u0087\u025c\3\2\2\2\u0089\u025f\3\2\2\2\u008b\u0262"+
		"\3\2\2\2\u008d\u0265\3\2\2\2\u008f\u0267\3\2\2\2\u0091\u0269\3\2\2\2\u0093"+
		"\u026c\3\2\2\2\u0095\u026f\3\2\2\2\u0097\u0271\3\2\2\2\u0099\u0273\3\2"+
		"\2\2\u009b\u0275\3\2\2\2\u009d\u0277\3\2\2\2\u009f\u0279\3\2\2\2\u00a1"+
		"\u027b\3\2\2\2\u00a3\u027d\3\2\2\2\u00a5\u027f\3\2\2\2\u00a7\u0281\3\2"+
		"\2\2\u00a9\u0283\3\2\2\2\u00ab\u0285\3\2\2\2\u00ad\u0287\3\2\2\2\u00af"+
		"\u0289\3\2\2\2\u00b1\u028b\3\2\2\2\u00b3\u028d\3\2\2\2\u00b5\u028f\3\2"+
		"\2\2\u00b7\u0292\3\2\2\2\u00b9\u0294\3\2\2\2\u00bb\u029c\3\2\2\2\u00bd"+
		"\u02a4\3\2\2\2\u00bf\u02b4\3\2\2\2\u00c1\u02b9\3\2\2\2\u00c3\u02bc\3\2"+
		"\2\2\u00c5\u02c7\3\2\2\2\u00c7\u02ce\3\2\2\2\u00c9\u02d2\3\2\2\2\u00cb"+
		"\u02dd\3\2\2\2\u00cd\u02e9\3\2\2\2\u00cf\u02eb\3\2\2\2\u00d1\u02ed\3\2"+
		"\2\2\u00d3\u02f0\3\2\2\2\u00d5\u00d6\7y\2\2\u00d6\u00d7\7j\2\2\u00d7\u00d8"+
		"\7k\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7g\2\2\u00da\4\3\2\2\2\u00db\u00dc"+
		"\7f\2\2\u00dc\u00dd\7q\2\2\u00dd\6\3\2\2\2\u00de\u00df\7h\2\2\u00df\u00e0"+
		"\7q\2\2\u00e0\u00e1\7t\2\2\u00e1\b\3\2\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4"+
		"\7h\2\2\u00e4\n\3\2\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8"+
		"\7u\2\2\u00e8\u00e9\7g\2\2\u00e9\f\3\2\2\2\u00ea\u00eb\7u\2\2\u00eb\u00ec"+
		"\7y\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7e\2\2\u00ef"+
		"\u00f0\7j\2\2\u00f0\16\3\2\2\2\u00f1\u00f2\7e\2\2\u00f2\u00f3\7c\2\2\u00f3"+
		"\u00f4\7u\2\2\u00f4\u00f5\7g\2\2\u00f5\20\3\2\2\2\u00f6\u00f7\7u\2\2\u00f7"+
		"\u00f8\7v\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7w\2\2\u00fa\u00fb\7e\2\2"+
		"\u00fb\u00fc\7v\2\2\u00fc\22\3\2\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7"+
		"p\2\2\u00ff\u0100\7n\2\2\u0100\u0101\7k\2\2\u0101\u0102\7p\2\2\u0102\u0103"+
		"\7g\2\2\u0103\24\3\2\2\2\u0104\u0105\7v\2\2\u0105\u0106\7{\2\2\u0106\u0107"+
		"\7r\2\2\u0107\u0108\7g\2\2\u0108\u0109\7f\2\2\u0109\u010a\7g\2\2\u010a"+
		"\u010b\7h\2\2\u010b\26\3\2\2\2\u010c\u010d\7%\2\2\u010d\u010e\7f\2\2\u010e"+
		"\u010f\7g\2\2\u010f\u0110\7h\2\2\u0110\u0111\7k\2\2\u0111\u0112\7p\2\2"+
		"\u0112\u0113\7g\2\2\u0113\30\3\2\2\2\u0114\u0115\7%\2\2\u0115\u0116\7"+
		"k\2\2\u0116\u0117\7h\2\2\u0117\u0118\7p\2\2\u0118\u0119\7f\2\2\u0119\u011a"+
		"\7g\2\2\u011a\u011b\7h\2\2\u011b\32\3\2\2\2\u011c\u011d\7%\2\2\u011d\u011e"+
		"\7k\2\2\u011e\u011f\7h\2\2\u011f\u0120\7f\2\2\u0120\u0121\7g\2\2\u0121"+
		"\u0122\7h\2\2\u0122\34\3\2\2\2\u0123\u0124\7%\2\2\u0124\u0125\7g\2\2\u0125"+
		"\u0126\7p\2\2\u0126\u0127\7f\2\2\u0127\u0128\7k\2\2\u0128\u0129\7h\2\2"+
		"\u0129\36\3\2\2\2\u012a\u012b\7k\2\2\u012b\u012c\7p\2\2\u012c\u012d\7"+
		"v\2\2\u012d \3\2\2\2\u012e\u012f\7e\2\2\u012f\u0130\7j\2\2\u0130\u0131"+
		"\7c\2\2\u0131\u0132\7t\2\2\u0132\"\3\2\2\2\u0133\u0134\7x\2\2\u0134\u0135"+
		"\7q\2\2\u0135\u0136\7k\2\2\u0136\u0137\7f\2\2\u0137$\3\2\2\2\u0138\u0139"+
		"\7h\2\2\u0139\u013a\7n\2\2\u013a\u013b\7q\2\2\u013b\u013c\7c\2\2\u013c"+
		"\u013d\7v\2\2\u013d&\3\2\2\2\u013e\u013f\7n\2\2\u013f\u0140\7q\2\2\u0140"+
		"\u0141\7p\2\2\u0141\u0142\7i\2\2\u0142(\3\2\2\2\u0143\u0144\7f\2\2\u0144"+
		"\u0145\7q\2\2\u0145\u0146\7w\2\2\u0146\u0147\7d\2\2\u0147\u0148\7n\2\2"+
		"\u0148\u0149\7g\2\2\u0149*\3\2\2\2\u014a\u014b\7w\2\2\u014b\u014c\7p\2"+
		"\2\u014c\u014d\7u\2\2\u014d\u014e\7k\2\2\u014e\u014f\7i\2\2\u014f\u0150"+
		"\7p\2\2\u0150\u0151\7g\2\2\u0151\u0152\7f\2\2\u0152,\3\2\2\2\u0153\u0154"+
		"\7u\2\2\u0154\u0155\7k\2\2\u0155\u0156\7i\2\2\u0156\u0157\7p\2\2\u0157"+
		"\u0158\7g\2\2\u0158\u0159\7f\2\2\u0159.\3\2\2\2\u015a\u015b\7P\2\2\u015b"+
		"\u015c\7W\2\2\u015c\u015d\7N\2\2\u015d\u015e\7N\2\2\u015e\60\3\2\2\2\u015f"+
		"\u0160\7u\2\2\u0160\u0161\7v\2\2\u0161\u0162\7f\2\2\u0162\u0163\7k\2\2"+
		"\u0163\u0164\7p\2\2\u0164\62\3\2\2\2\u0165\u0166\7u\2\2\u0166\u0167\7"+
		"v\2\2\u0167\u0168\7f\2\2\u0168\u0169\7q\2\2\u0169\u016a\7w\2\2\u016a\u016b"+
		"\7v\2\2\u016b\64\3\2\2\2\u016c\u016d\7u\2\2\u016d\u016e\7v\2\2\u016e\u016f"+
		"\7t\2\2\u016f\u0170\7g\2\2\u0170\u0171\7t\2\2\u0171\u0172\7t\2\2\u0172"+
		"\66\3\2\2\2\u0173\u0174\7t\2\2\u0174\u0175\7g\2\2\u0175\u0176\7v\2\2\u0176"+
		"\u0177\7w\2\2\u0177\u0178\7t\2\2\u0178\u0179\7p\2\2\u01798\3\2\2\2\u017a"+
		"\u017b\7d\2\2\u017b\u017c\7t\2\2\u017c\u017d\7g\2\2\u017d\u017e\7c\2\2"+
		"\u017e\u017f\7m\2\2\u017f:\3\2\2\2\u0180\u0181\7e\2\2\u0181\u0182\7q\2"+
		"\2\u0182\u0183\7p\2\2\u0183\u0184\7v\2\2\u0184\u0185\7k\2\2\u0185\u0186"+
		"\7p\2\2\u0186\u0187\7w\2\2\u0187\u0188\7g\2\2\u0188<\3\2\2\2\u0189\u018a"+
		"\7o\2\2\u018a\u018b\7c\2\2\u018b\u018c\7k\2\2\u018c\u018d\7p\2\2\u018d"+
		">\3\2\2\2\u018e\u018f\7u\2\2\u018f\u0190\7k\2\2\u0190\u0191\7|\2\2\u0191"+
		"\u0192\7g\2\2\u0192\u0193\7q\2\2\u0193\u0194\7h\2\2\u0194@\3\2\2\2\u0195"+
		"\u0196\7r\2\2\u0196\u0197\7t\2\2\u0197\u0198\7k\2\2\u0198\u0199\7p\2\2"+
		"\u0199\u019a\7v\2\2\u019a\u019b\7h\2\2\u019bB\3\2\2\2\u019c\u019d\7u\2"+
		"\2\u019d\u019e\7e\2\2\u019e\u019f\7c\2\2\u019f\u01a0\7p\2\2\u01a0\u01a1"+
		"\7h\2\2\u01a1D\3\2\2\2\u01a2\u01a3\7u\2\2\u01a3\u01a4\7v\2\2\u01a4\u01a5"+
		"\7t\2\2\u01a5\u01a6\7e\2\2\u01a6\u01a7\7r\2\2\u01a7\u01a8\7{\2\2\u01a8"+
		"F\3\2\2\2\u01a9\u01aa\7u\2\2\u01aa\u01ab\7v\2\2\u01ab\u01ac\7t\2\2\u01ac"+
		"\u01ad\7u\2\2\u01ad\u01ae\7v\2\2\u01ae\u01af\7t\2\2\u01afH\3\2\2\2\u01b0"+
		"\u01b1\7u\2\2\u01b1\u01b2\7v\2\2\u01b2\u01b3\7t\2\2\u01b3\u01b4\7e\2\2"+
		"\u01b4\u01b5\7j\2\2\u01b5\u01b6\7t\2\2\u01b6J\3\2\2\2\u01b7\u01b8\7u\2"+
		"\2\u01b8\u01b9\7v\2\2\u01b9\u01ba\7t\2\2\u01ba\u01bb\7e\2\2\u01bb\u01bc"+
		"\7o\2\2\u01bc\u01bd\7r\2\2\u01bdL\3\2\2\2\u01be\u01bf\7u\2\2\u01bf\u01c0"+
		"\7v\2\2\u01c0\u01c1\7t\2\2\u01c1\u01c2\7e\2\2\u01c2\u01c3\7c\2\2\u01c3"+
		"\u01c4\7v\2\2\u01c4N\3\2\2\2\u01c5\u01c6\7u\2\2\u01c6\u01c7\7v\2\2\u01c7"+
		"\u01c8\7t\2\2\u01c8\u01c9\7n\2\2\u01c9\u01ca\7g\2\2\u01ca\u01cb\7p\2\2"+
		"\u01cbP\3\2\2\2\u01cc\u01cd\7u\2\2\u01cd\u01ce\7v\2\2\u01ce\u01cf\7t\2"+
		"\2\u01cf\u01d0\7v\2\2\u01d0\u01d1\7q\2\2\u01d1\u01d2\7m\2\2\u01d2R\3\2"+
		"\2\2\u01d3\u01d4\7i\2\2\u01d4\u01d5\7g\2\2\u01d5\u01d6\7v\2\2\u01d6\u01d7"+
		"\7e\2\2\u01d7\u01d8\7j\2\2\u01d8\u01d9\7c\2\2\u01d9\u01da\7t\2\2\u01da"+
		"T\3\2\2\2\u01db\u01dc\7r\2\2\u01dc\u01dd\7w\2\2\u01dd\u01de\7v\2\2\u01de"+
		"\u01df\7e\2\2\u01df\u01e0\7j\2\2\u01e0\u01e1\7c\2\2\u01e1\u01e2\7t\2\2"+
		"\u01e2V\3\2\2\2\u01e3\u01e4\7h\2\2\u01e4\u01e5\7i\2\2\u01e5\u01e6\7g\2"+
		"\2\u01e6\u01e7\7v\2\2\u01e7\u01e8\7u\2\2\u01e8X\3\2\2\2\u01e9\u01ea\7"+
		"o\2\2\u01ea\u01eb\7c\2\2\u01eb\u01ec\7n\2\2\u01ec\u01ed\7n\2\2\u01ed\u01ee"+
		"\7q\2\2\u01ee\u01ef\7e\2\2\u01efZ\3\2\2\2\u01f0\u01f1\7h\2\2\u01f1\u01f2"+
		"\7t\2\2\u01f2\u01f3\7g\2\2\u01f3\u01f4\7g\2\2\u01f4\\\3\2\2\2\u01f5\u01f6"+
		"\7o\2\2\u01f6\u01f7\7g\2\2\u01f7\u01f8\7o\2\2\u01f8\u01f9\7u\2\2\u01f9"+
		"\u01fa\7g\2\2\u01fa\u01fb\7v\2\2\u01fb^\3\2\2\2\u01fc\u01fd\7u\2\2\u01fd"+
		"\u01fe\7r\2\2\u01fe\u01ff\7t\2\2\u01ff\u0200\7k\2\2\u0200\u0201\7p\2\2"+
		"\u0201\u0202\7v\2\2\u0202\u0203\7h\2\2\u0203`\3\2\2\2\u0204\u0205\7h\2"+
		"\2\u0205\u0206\7r\2\2\u0206\u0207\7t\2\2\u0207\u0208\7k\2\2\u0208\u0209"+
		"\7p\2\2\u0209\u020a\7v\2\2\u020a\u020b\7h\2\2\u020bb\3\2\2\2\u020c\u020d"+
		"\7u\2\2\u020d\u020e\7u\2\2\u020e\u020f\7e\2\2\u020f\u0210\7c\2\2\u0210"+
		"\u0211\7p\2\2\u0211\u0212\7h\2\2\u0212d\3\2\2\2\u0213\u0214\7s\2\2\u0214"+
		"\u0215\7u\2\2\u0215\u0216\7q\2\2\u0216\u0217\7t\2\2\u0217\u0218\7v\2\2"+
		"\u0218f\3\2\2\2\u0219\u021a\7c\2\2\u021a\u021b\7v\2\2\u021b\u021c\7q\2"+
		"\2\u021c\u021d\7k\2\2\u021dh\3\2\2\2\u021e\u021f\7k\2\2\u021f\u0220\7"+
		"v\2\2\u0220\u0221\7q\2\2\u0221\u0222\7c\2\2\u0222j\3\2\2\2\u0223\u0224"+
		"\7u\2\2\u0224\u0225\7s\2\2\u0225\u0226\7t\2\2\u0226\u0227\7v\2\2\u0227"+
		"l\3\2\2\2\u0228\u0229\7t\2\2\u0229\u022a\7c\2\2\u022a\u022b\7p\2\2\u022b"+
		"\u022c\7f\2\2\u022cn\3\2\2\2\u022d\u022e\7t\2\2\u022e\u022f\7c\2\2\u022f"+
		"\u0230\7p\2\2\u0230\u0231\7f\2\2\u0231\u0232\7q\2\2\u0232\u0233\7o\2\2"+
		"\u0233p\3\2\2\2\u0234\u0235\7u\2\2\u0235\u0236\7t\2\2\u0236\u0237\7c\2"+
		"\2\u0237\u0238\7p\2\2\u0238\u0239\7f\2\2\u0239\u023a\7q\2\2\u023a\u023b"+
		"\7o\2\2\u023br\3\2\2\2\u023c\u023d\7v\2\2\u023d\u023e\7k\2\2\u023e\u023f"+
		"\7o\2\2\u023f\u0240\7g\2\2\u0240t\3\2\2\2\u0241\u0242\7?\2\2\u0242\u0243"+
		"\7?\2\2\u0243v\3\2\2\2\u0244\u0245\7>\2\2\u0245\u0246\7?\2\2\u0246x\3"+
		"\2\2\2\u0247\u0248\7@\2\2\u0248\u0249\7?\2\2\u0249z\3\2\2\2\u024a\u024b"+
		"\7#\2\2\u024b\u024c\7?\2\2\u024c|\3\2\2\2\u024d\u024e\7-\2\2\u024e\u024f"+
		"\7-\2\2\u024f~\3\2\2\2\u0250\u0251\7/\2\2\u0251\u0252\7/\2\2\u0252\u0080"+
		"\3\2\2\2\u0253\u0254\7-\2\2\u0254\u0255\7?\2\2\u0255\u0082\3\2\2\2\u0256"+
		"\u0257\7/\2\2\u0257\u0258\7?\2\2\u0258\u0084\3\2\2\2\u0259\u025a\7,\2"+
		"\2\u025a\u025b\7?\2\2\u025b\u0086\3\2\2\2\u025c\u025d\7\61\2\2\u025d\u025e"+
		"\7?\2\2\u025e\u0088\3\2\2\2\u025f\u0260\7>\2\2\u0260\u0261\7>\2\2\u0261"+
		"\u008a\3\2\2\2\u0262\u0263\7@\2\2\u0263\u0264\7@\2\2\u0264\u008c\3\2\2"+
		"\2\u0265\u0266\7@\2\2\u0266\u008e\3\2\2\2\u0267\u0268\7>\2\2\u0268\u0090"+
		"\3\2\2\2\u0269\u026a\7(\2\2\u026a\u026b\7(\2\2\u026b\u0092\3\2\2\2\u026c"+
		"\u026d\7~\2\2\u026d\u026e\7~\2\2\u026e\u0094\3\2\2\2\u026f\u0270\7#\2"+
		"\2\u0270\u0096\3\2\2\2\u0271\u0272\7`\2\2\u0272\u0098\3\2\2\2\u0273\u0274"+
		"\7.\2\2\u0274\u009a\3\2\2\2\u0275\u0276\7=\2\2\u0276\u009c\3\2\2\2\u0277"+
		"\u0278\7-\2\2\u0278\u009e\3\2\2\2\u0279\u027a\7/\2\2\u027a\u00a0\3\2\2"+
		"\2\u027b\u027c\7\61\2\2\u027c\u00a2\3\2\2\2\u027d\u027e\7\'\2\2\u027e"+
		"\u00a4\3\2\2\2\u027f\u0280\7?\2\2\u0280\u00a6\3\2\2\2\u0281\u0282\7*\2"+
		"\2\u0282\u00a8\3\2\2\2\u0283\u0284\7+\2\2\u0284\u00aa\3\2\2\2\u0285\u0286"+
		"\7]\2\2\u0286\u00ac\3\2\2\2\u0287\u0288\7_\2\2\u0288\u00ae\3\2\2\2\u0289"+
		"\u028a\7}\2\2\u028a\u00b0\3\2\2\2\u028b\u028c\7\177\2\2\u028c\u00b2\3"+
		"\2\2\2\u028d\u028e\7,\2\2\u028e\u00b4\3\2\2\2\u028f\u0290\7/\2\2\u0290"+
		"\u0291\7@\2\2\u0291\u00b6\3\2\2\2\u0292\u0293\7(\2\2\u0293\u00b8\3\2\2"+
		"\2\u0294\u0296\7$\2\2\u0295\u0297\13\2\2\2\u0296\u0295\3\2\2\2\u0297\u0298"+
		"\3\2\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a\3\2\2\2\u029a"+
		"\u029b\7$\2\2\u029b\u00ba\3\2\2\2\u029c\u029e\7)\2\2\u029d\u029f\13\2"+
		"\2\2\u029e\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0"+
		"\u02a1\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\7)\2\2\u02a3\u00bc\3\2"+
		"\2\2\u02a4\u02a9\5\u00cfh\2\u02a5\u02a8\5\u00cfh\2\u02a6\u02a8\5\u00d1"+
		"i\2\u02a7\u02a5\3\2\2\2\u02a7\u02a6\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9"+
		"\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u00be\3\2\2\2\u02ab\u02a9\3\2"+
		"\2\2\u02ac\u02b5\7\62\2\2\u02ad\u02b1\4\63;\2\u02ae\u02b0\5\u00d1i\2\u02af"+
		"\u02ae\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b2\3\2"+
		"\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02ac\3\2\2\2\u02b4"+
		"\u02ad\3\2\2\2\u02b5\u00c0\3\2\2\2\u02b6\u02ba\5\u00c3b\2\u02b7\u02ba"+
		"\5\u00c5c\2\u02b8\u02ba\5\u00c7d\2\u02b9\u02b6\3\2\2\2\u02b9\u02b7\3\2"+
		"\2\2\u02b9\u02b8\3\2\2\2\u02ba\u00c2\3\2\2\2\u02bb\u02bd\5\u00d1i\2\u02bc"+
		"\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bc\3\2\2\2\u02be\u02bf\3\2"+
		"\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c4\7\60\2\2\u02c1\u02c3\5\u00d1i\2\u02c2"+
		"\u02c1\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5\3\2"+
		"\2\2\u02c5\u00c4\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02c9\7\60\2\2\u02c8"+
		"\u02ca\5\u00d1i\2\u02c9\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02c9"+
		"\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u00c6\3\2\2\2\u02cd\u02cf\5\u00d1i"+
		"\2\u02ce\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02d1"+
		"\3\2\2\2\u02d1\u00c8\3\2\2\2\u02d2\u02d3\7\61\2\2\u02d3\u02d4\7\61\2\2"+
		"\u02d4\u02d8\3\2\2\2\u02d5\u02d7\13\2\2\2\u02d6\u02d5\3\2\2\2\u02d7\u02da"+
		"\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02db\3\2\2\2\u02da"+
		"\u02d8\3\2\2\2\u02db\u02dc\7\f\2\2\u02dc\u00ca\3\2\2\2\u02dd\u02de\7\61"+
		"\2\2\u02de\u02df\7,\2\2\u02df\u02e3\3\2\2\2\u02e0\u02e2\13\2\2\2\u02e1"+
		"\u02e0\3\2\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4\3\2"+
		"\2\2\u02e4\u02e6\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e6\u02e7\7,\2\2\u02e7"+
		"\u02e8\7\61\2\2\u02e8\u00cc\3\2\2\2\u02e9\u02ea\7\f\2\2\u02ea\u00ce\3"+
		"\2\2\2\u02eb\u02ec\t\2\2\2\u02ec\u00d0\3\2\2\2\u02ed\u02ee\4\62;\2\u02ee"+
		"\u00d2\3\2\2\2\u02ef\u02f1\t\3\2\2\u02f0\u02ef\3\2\2\2\u02f1\u02f2\3\2"+
		"\2\2\u02f2\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u00d4\3\2\2\2\21\2"+
		"\u0298\u02a0\u02a7\u02a9\u02b1\u02b4\u02b9\u02be\u02c4\u02cb\u02d0\u02d8"+
		"\u02e3\u02f2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}