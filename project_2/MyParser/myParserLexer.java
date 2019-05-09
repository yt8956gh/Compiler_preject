// $ANTLR 3.5.2 myParser.g 2019-05-09 18:36:08

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myParserLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int AND=4;
	public static final int CHAR=5;
	public static final int CHARACTER=6;
	public static final int COMMENT=7;
	public static final int DO=8;
	public static final int ELSE=9;
	public static final int EQ_OP=10;
	public static final int FLOAT=11;
	public static final int FOR=12;
	public static final int Floating_point_constant=13;
	public static final int GE_OP=14;
	public static final int G_OP=15;
	public static final int IF=16;
	public static final int INT=17;
	public static final int Identifier=18;
	public static final int Integer_constant=19;
	public static final int LE_OP=20;
	public static final int L_OP=21;
	public static final int MAIN=22;
	public static final int MINUS_MINUS=23;
	public static final int NE_OP=24;
	public static final int NOT=25;
	public static final int OR=26;
	public static final int PLUS_PLUS=27;
	public static final int PRINTF=28;
	public static final int STRING=29;
	public static final int SWITCH=30;
	public static final int VOID=31;
	public static final int WHILE=32;
	public static final int WS=33;
	public static final int XOR=34;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public myParserLexer() {} 
	public myParserLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myParserLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "myParser.g"; }

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:7:7: ( '(' )
			// myParser.g:7:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:8:7: ( ')' )
			// myParser.g:8:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:9:7: ( '*' )
			// myParser.g:9:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:10:7: ( '+' )
			// myParser.g:10:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:11:7: ( ',' )
			// myParser.g:11:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:12:7: ( '-' )
			// myParser.g:12:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:13:7: ( '/' )
			// myParser.g:13:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:14:7: ( ':' )
			// myParser.g:14:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:15:7: ( ';' )
			// myParser.g:15:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:16:7: ( '=' )
			// myParser.g:16:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:17:7: ( '[' )
			// myParser.g:17:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:18:7: ( ']' )
			// myParser.g:18:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:19:7: ( 'break;' )
			// myParser.g:19:9: 'break;'
			{
			match("break;"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:20:7: ( 'case' )
			// myParser.g:20:9: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:21:7: ( 'default: ' )
			// myParser.g:21:9: 'default: '
			{
			match("default: "); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:22:7: ( '{' )
			// myParser.g:22:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:23:7: ( '}' )
			// myParser.g:23:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:141:6: ( 'float' )
			// myParser.g:141:8: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:142:4: ( 'int' )
			// myParser.g:142:6: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:143:5: ( 'char' )
			// myParser.g:143:7: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "MAIN"
	public final void mMAIN() throws RecognitionException {
		try {
			int _type = MAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:144:5: ( 'main' )
			// myParser.g:144:7: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIN"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:145:5: ( 'void' )
			// myParser.g:145:7: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:146:3: ( 'if' )
			// myParser.g:146:5: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:147:5: ( 'else' )
			// myParser.g:147:7: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:148:4: ( 'for' )
			// myParser.g:148:6: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:149:6: ( 'while' )
			// myParser.g:149:8: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "SWITCH"
	public final void mSWITCH() throws RecognitionException {
		try {
			int _type = SWITCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:150:7: ( 'switch' )
			// myParser.g:150:9: 'switch'
			{
			match("switch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWITCH"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:151:3: ( 'do' )
			// myParser.g:151:5: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "EQ_OP"
	public final void mEQ_OP() throws RecognitionException {
		try {
			int _type = EQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:154:6: ( '==' )
			// myParser.g:154:8: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ_OP"

	// $ANTLR start "LE_OP"
	public final void mLE_OP() throws RecognitionException {
		try {
			int _type = LE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:155:6: ( '<=' )
			// myParser.g:155:8: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE_OP"

	// $ANTLR start "GE_OP"
	public final void mGE_OP() throws RecognitionException {
		try {
			int _type = GE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:156:6: ( '>=' )
			// myParser.g:156:8: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE_OP"

	// $ANTLR start "NE_OP"
	public final void mNE_OP() throws RecognitionException {
		try {
			int _type = NE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:157:6: ( '!=' )
			// myParser.g:157:8: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NE_OP"

	// $ANTLR start "L_OP"
	public final void mL_OP() throws RecognitionException {
		try {
			int _type = L_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:158:5: ( '<' )
			// myParser.g:158:7: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "L_OP"

	// $ANTLR start "G_OP"
	public final void mG_OP() throws RecognitionException {
		try {
			int _type = G_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:159:5: ( '>' )
			// myParser.g:159:7: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "G_OP"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:161:4: ( '&&' )
			// myParser.g:161:6: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:162:3: ( '||' )
			// myParser.g:162:5: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:163:4: ( '!' )
			// myParser.g:163:6: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "XOR"
	public final void mXOR() throws RecognitionException {
		try {
			int _type = XOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:164:4: ( '^' )
			// myParser.g:164:6: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XOR"

	// $ANTLR start "PLUS_PLUS"
	public final void mPLUS_PLUS() throws RecognitionException {
		try {
			int _type = PLUS_PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:166:10: ( '++' )
			// myParser.g:166:12: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS_PLUS"

	// $ANTLR start "MINUS_MINUS"
	public final void mMINUS_MINUS() throws RecognitionException {
		try {
			int _type = MINUS_MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:167:12: ( '--' )
			// myParser.g:167:14: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS_MINUS"

	// $ANTLR start "PRINTF"
	public final void mPRINTF() throws RecognitionException {
		try {
			int _type = PRINTF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:169:7: ( 'printf' )
			// myParser.g:169:9: 'printf'
			{
			match("printf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINTF"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:171:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// myParser.g:171:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myParser.g:171:43: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myParser.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Identifier"

	// $ANTLR start "Integer_constant"
	public final void mInteger_constant() throws RecognitionException {
		try {
			int _type = Integer_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:177:17: ( ( '0' .. '9' )+ )
			// myParser.g:177:19: ( '0' .. '9' )+
			{
			// myParser.g:177:19: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// myParser.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Integer_constant"

	// $ANTLR start "Floating_point_constant"
	public final void mFloating_point_constant() throws RecognitionException {
		try {
			int _type = Floating_point_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:178:24: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
			// myParser.g:178:26: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
			{
			// myParser.g:178:26: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// myParser.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			match('.'); 
			// myParser.g:178:41: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// myParser.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Floating_point_constant"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:183:7: ( '\"' ( options {greedy=false; } : . )+ '\"' )
			// myParser.g:183:9: '\"' ( options {greedy=false; } : . )+ '\"'
			{
			match('\"'); 
			// myParser.g:183:13: ( options {greedy=false; } : . )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='\"') ) {
					alt5=2;
				}
				else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// myParser.g:183:41: .
					{
					matchAny(); 
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "CHARACTER"
	public final void mCHARACTER() throws RecognitionException {
		try {
			int _type = CHARACTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:184:10: ( '\\'' ( options {greedy=false; } : . )+ '\\'' )
			// myParser.g:184:12: '\\'' ( options {greedy=false; } : . )+ '\\''
			{
			match('\''); 
			// myParser.g:184:17: ( options {greedy=false; } : . )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='\'') ) {
					alt6=2;
				}
				else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '&')||(LA6_0 >= '(' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// myParser.g:184:45: .
					{
					matchAny(); 
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHARACTER"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:186:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// myParser.g:186:5: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myParser.g:187:8: ( '/*' ( . )* '*/' )
			// myParser.g:187:10: '/*' ( . )* '*/'
			{
			match("/*"); 

			// myParser.g:187:15: ( . )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0=='*') ) {
					int LA7_1 = input.LA(2);
					if ( (LA7_1=='/') ) {
						alt7=2;
					}
					else if ( ((LA7_1 >= '\u0000' && LA7_1 <= '.')||(LA7_1 >= '0' && LA7_1 <= '\uFFFF')) ) {
						alt7=1;
					}

				}
				else if ( ((LA7_0 >= '\u0000' && LA7_0 <= ')')||(LA7_0 >= '+' && LA7_0 <= '\uFFFF')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// myParser.g:187:15: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop7;
				}
			}

			match("*/"); 

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// myParser.g:1:8: ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | FLOAT | INT | CHAR | MAIN | VOID | IF | ELSE | FOR | WHILE | SWITCH | DO | EQ_OP | LE_OP | GE_OP | NE_OP | L_OP | G_OP | AND | OR | NOT | XOR | PLUS_PLUS | MINUS_MINUS | PRINTF | Identifier | Integer_constant | Floating_point_constant | STRING | CHARACTER | WS | COMMENT )
		int alt8=48;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// myParser.g:1:10: T__35
				{
				mT__35(); 

				}
				break;
			case 2 :
				// myParser.g:1:16: T__36
				{
				mT__36(); 

				}
				break;
			case 3 :
				// myParser.g:1:22: T__37
				{
				mT__37(); 

				}
				break;
			case 4 :
				// myParser.g:1:28: T__38
				{
				mT__38(); 

				}
				break;
			case 5 :
				// myParser.g:1:34: T__39
				{
				mT__39(); 

				}
				break;
			case 6 :
				// myParser.g:1:40: T__40
				{
				mT__40(); 

				}
				break;
			case 7 :
				// myParser.g:1:46: T__41
				{
				mT__41(); 

				}
				break;
			case 8 :
				// myParser.g:1:52: T__42
				{
				mT__42(); 

				}
				break;
			case 9 :
				// myParser.g:1:58: T__43
				{
				mT__43(); 

				}
				break;
			case 10 :
				// myParser.g:1:64: T__44
				{
				mT__44(); 

				}
				break;
			case 11 :
				// myParser.g:1:70: T__45
				{
				mT__45(); 

				}
				break;
			case 12 :
				// myParser.g:1:76: T__46
				{
				mT__46(); 

				}
				break;
			case 13 :
				// myParser.g:1:82: T__47
				{
				mT__47(); 

				}
				break;
			case 14 :
				// myParser.g:1:88: T__48
				{
				mT__48(); 

				}
				break;
			case 15 :
				// myParser.g:1:94: T__49
				{
				mT__49(); 

				}
				break;
			case 16 :
				// myParser.g:1:100: T__50
				{
				mT__50(); 

				}
				break;
			case 17 :
				// myParser.g:1:106: T__51
				{
				mT__51(); 

				}
				break;
			case 18 :
				// myParser.g:1:112: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 19 :
				// myParser.g:1:118: INT
				{
				mINT(); 

				}
				break;
			case 20 :
				// myParser.g:1:122: CHAR
				{
				mCHAR(); 

				}
				break;
			case 21 :
				// myParser.g:1:127: MAIN
				{
				mMAIN(); 

				}
				break;
			case 22 :
				// myParser.g:1:132: VOID
				{
				mVOID(); 

				}
				break;
			case 23 :
				// myParser.g:1:137: IF
				{
				mIF(); 

				}
				break;
			case 24 :
				// myParser.g:1:140: ELSE
				{
				mELSE(); 

				}
				break;
			case 25 :
				// myParser.g:1:145: FOR
				{
				mFOR(); 

				}
				break;
			case 26 :
				// myParser.g:1:149: WHILE
				{
				mWHILE(); 

				}
				break;
			case 27 :
				// myParser.g:1:155: SWITCH
				{
				mSWITCH(); 

				}
				break;
			case 28 :
				// myParser.g:1:162: DO
				{
				mDO(); 

				}
				break;
			case 29 :
				// myParser.g:1:165: EQ_OP
				{
				mEQ_OP(); 

				}
				break;
			case 30 :
				// myParser.g:1:171: LE_OP
				{
				mLE_OP(); 

				}
				break;
			case 31 :
				// myParser.g:1:177: GE_OP
				{
				mGE_OP(); 

				}
				break;
			case 32 :
				// myParser.g:1:183: NE_OP
				{
				mNE_OP(); 

				}
				break;
			case 33 :
				// myParser.g:1:189: L_OP
				{
				mL_OP(); 

				}
				break;
			case 34 :
				// myParser.g:1:194: G_OP
				{
				mG_OP(); 

				}
				break;
			case 35 :
				// myParser.g:1:199: AND
				{
				mAND(); 

				}
				break;
			case 36 :
				// myParser.g:1:203: OR
				{
				mOR(); 

				}
				break;
			case 37 :
				// myParser.g:1:206: NOT
				{
				mNOT(); 

				}
				break;
			case 38 :
				// myParser.g:1:210: XOR
				{
				mXOR(); 

				}
				break;
			case 39 :
				// myParser.g:1:214: PLUS_PLUS
				{
				mPLUS_PLUS(); 

				}
				break;
			case 40 :
				// myParser.g:1:224: MINUS_MINUS
				{
				mMINUS_MINUS(); 

				}
				break;
			case 41 :
				// myParser.g:1:236: PRINTF
				{
				mPRINTF(); 

				}
				break;
			case 42 :
				// myParser.g:1:243: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 43 :
				// myParser.g:1:254: Integer_constant
				{
				mInteger_constant(); 

				}
				break;
			case 44 :
				// myParser.g:1:271: Floating_point_constant
				{
				mFloating_point_constant(); 

				}
				break;
			case 45 :
				// myParser.g:1:295: STRING
				{
				mSTRING(); 

				}
				break;
			case 46 :
				// myParser.g:1:302: CHARACTER
				{
				mCHARACTER(); 

				}
				break;
			case 47 :
				// myParser.g:1:312: WS
				{
				mWS(); 

				}
				break;
			case 48 :
				// myParser.g:1:315: COMMENT
				{
				mCOMMENT(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\4\uffff\1\46\1\uffff\1\50\1\52\2\uffff\1\54\2\uffff\3\40\2\uffff\7\40"+
		"\1\74\1\76\1\100\3\uffff\1\40\1\uffff\1\102\13\uffff\4\40\1\110\3\40\1"+
		"\114\5\40\6\uffff\1\40\2\uffff\4\40\1\uffff\1\40\1\130\1\131\1\uffff\7"+
		"\40\1\141\1\142\2\40\2\uffff\1\145\1\146\1\147\4\40\2\uffff\1\40\1\155"+
		"\3\uffff\1\156\2\40\1\uffff\1\40\2\uffff\1\162\1\163\1\40\3\uffff";
	static final String DFA8_eofS =
		"\165\uffff";
	static final String DFA8_minS =
		"\1\11\3\uffff\1\53\1\uffff\1\55\1\52\2\uffff\1\75\2\uffff\1\162\1\141"+
		"\1\145\2\uffff\1\154\1\146\1\141\1\157\1\154\1\150\1\167\3\75\3\uffff"+
		"\1\162\1\uffff\1\56\13\uffff\1\145\1\163\1\141\1\146\1\60\1\157\1\162"+
		"\1\164\1\60\2\151\1\163\2\151\6\uffff\1\151\2\uffff\1\141\1\145\1\162"+
		"\1\141\1\uffff\1\141\2\60\1\uffff\1\156\1\144\1\145\1\154\1\164\1\156"+
		"\1\153\2\60\1\165\1\164\2\uffff\3\60\1\145\1\143\1\164\1\73\2\uffff\1"+
		"\154\1\60\3\uffff\1\60\1\150\1\146\1\uffff\1\164\2\uffff\2\60\1\72\3\uffff";
	static final String DFA8_maxS =
		"\1\175\3\uffff\1\53\1\uffff\1\55\1\52\2\uffff\1\75\2\uffff\1\162\1\150"+
		"\1\157\2\uffff\1\157\1\156\1\141\1\157\1\154\1\150\1\167\3\75\3\uffff"+
		"\1\162\1\uffff\1\71\13\uffff\1\145\1\163\1\141\1\146\1\172\1\157\1\162"+
		"\1\164\1\172\2\151\1\163\2\151\6\uffff\1\151\2\uffff\1\141\1\145\1\162"+
		"\1\141\1\uffff\1\141\2\172\1\uffff\1\156\1\144\1\145\1\154\1\164\1\156"+
		"\1\153\2\172\1\165\1\164\2\uffff\3\172\1\145\1\143\1\164\1\73\2\uffff"+
		"\1\154\1\172\3\uffff\1\172\1\150\1\146\1\uffff\1\164\2\uffff\2\172\1\72"+
		"\3\uffff";
	static final String DFA8_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\uffff\1\5\2\uffff\1\10\1\11\1\uffff\1\13\1\14\3"+
		"\uffff\1\20\1\21\12\uffff\1\43\1\44\1\46\1\uffff\1\52\1\uffff\1\55\1\56"+
		"\1\57\1\47\1\4\1\50\1\6\1\60\1\7\1\35\1\12\16\uffff\1\36\1\41\1\37\1\42"+
		"\1\40\1\45\1\uffff\1\53\1\54\4\uffff\1\34\3\uffff\1\27\13\uffff\1\31\1"+
		"\23\7\uffff\1\16\1\24\2\uffff\1\25\1\26\1\30\3\uffff\1\15\1\uffff\1\22"+
		"\1\32\3\uffff\1\33\1\51\1\17";
	static final String DFA8_specialS =
		"\165\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\44\2\uffff\1\44\22\uffff\1\44\1\33\1\42\3\uffff\1\34\1\43\1\1\1\2"+
			"\1\3\1\4\1\5\1\6\1\uffff\1\7\12\41\1\10\1\11\1\31\1\12\1\32\2\uffff\32"+
			"\40\1\13\1\uffff\1\14\1\36\1\40\1\uffff\1\40\1\15\1\16\1\17\1\26\1\22"+
			"\2\40\1\23\3\40\1\24\2\40\1\37\2\40\1\30\2\40\1\25\1\27\3\40\1\20\1\35"+
			"\1\21",
			"",
			"",
			"",
			"\1\45",
			"",
			"\1\47",
			"\1\51",
			"",
			"",
			"\1\53",
			"",
			"",
			"\1\55",
			"\1\56\6\uffff\1\57",
			"\1\60\11\uffff\1\61",
			"",
			"",
			"\1\62\2\uffff\1\63",
			"\1\65\7\uffff\1\64",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\75",
			"\1\77",
			"",
			"",
			"",
			"\1\101",
			"",
			"\1\103\1\uffff\12\41",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\111",
			"\1\112",
			"\1\113",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\122",
			"",
			"",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"",
			"\1\127",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\143",
			"\1\144",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"",
			"",
			"\1\154",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\157",
			"\1\160",
			"",
			"\1\161",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\164",
			"",
			"",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | FLOAT | INT | CHAR | MAIN | VOID | IF | ELSE | FOR | WHILE | SWITCH | DO | EQ_OP | LE_OP | GE_OP | NE_OP | L_OP | G_OP | AND | OR | NOT | XOR | PLUS_PLUS | MINUS_MINUS | PRINTF | Identifier | Integer_constant | Floating_point_constant | STRING | CHARACTER | WS | COMMENT );";
		}
	}

}
