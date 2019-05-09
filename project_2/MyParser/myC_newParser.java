// $ANTLR 3.5.2 myC_new.g 2019-05-09 14:32:40

    // import packages here.


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myC_newParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "CHAR", "CHARACTER", "COMMENT", 
		"ELSE", "EQ_OP", "FLOAT", "FOR", "Floating_point_constant", "GE_OP", "G_OP", 
		"IF", "INT", "Identifier", "Integer_constant", "LE_OP", "L_OP", "MAIN", 
		"MINUS_MINUS", "NE_OP", "NOT", "OR", "PLUS_PLUS", "PRINTF", "STRING", 
		"SWITCH", "VOID", "WHILE", "WS", "XOR", "'('", "')'", "'*'", "'+'", "','", 
		"'-'", "'/'", "':'", "';'", "'='", "'['", "']'", "'break;'", "'case'", 
		"'default: '", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__34=34;
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
	public static final int AND=4;
	public static final int CHAR=5;
	public static final int CHARACTER=6;
	public static final int COMMENT=7;
	public static final int ELSE=8;
	public static final int EQ_OP=9;
	public static final int FLOAT=10;
	public static final int FOR=11;
	public static final int Floating_point_constant=12;
	public static final int GE_OP=13;
	public static final int G_OP=14;
	public static final int IF=15;
	public static final int INT=16;
	public static final int Identifier=17;
	public static final int Integer_constant=18;
	public static final int LE_OP=19;
	public static final int L_OP=20;
	public static final int MAIN=21;
	public static final int MINUS_MINUS=22;
	public static final int NE_OP=23;
	public static final int NOT=24;
	public static final int OR=25;
	public static final int PLUS_PLUS=26;
	public static final int PRINTF=27;
	public static final int STRING=28;
	public static final int SWITCH=29;
	public static final int VOID=30;
	public static final int WHILE=31;
	public static final int WS=32;
	public static final int XOR=33;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myC_newParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myC_newParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return myC_newParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myC_new.g"; }


	    boolean TRACEON = true;



	// $ANTLR start "program"
	// myC_new.g:15:1: program : VOID MAIN '(' ')' '{' declarations statements '}' ;
	public final void program() throws RecognitionException {
		try {
			// myC_new.g:15:8: ( VOID MAIN '(' ')' '{' declarations statements '}' )
			// myC_new.g:16:2: VOID MAIN '(' ')' '{' declarations statements '}'
			{
			match(input,VOID,FOLLOW_VOID_in_program35); 
			match(input,MAIN,FOLLOW_MAIN_in_program37); 
			match(input,34,FOLLOW_34_in_program39); 
			match(input,35,FOLLOW_35_in_program41); 
			match(input,49,FOLLOW_49_in_program43); 
			pushFollow(FOLLOW_declarations_in_program45);
			declarations();
			state._fsp--;

			pushFollow(FOLLOW_statements_in_program47);
			statements();
			state._fsp--;

			match(input,50,FOLLOW_50_in_program49); 
			if (TRACEON) System.out.println("VOID MAIN () {declarations statements}");
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "declarations"
	// myC_new.g:19:1: declarations : ( type Identifier ';' declarations | type Identifier '=' real ';' declarations | CHAR Identifier '=' CHARACTER ';' declarations | CHAR Identifier '[' index ']' '=' STRING ';' declarations |);
	public final void declarations() throws RecognitionException {
		try {
			// myC_new.g:19:13: ( type Identifier ';' declarations | type Identifier '=' real ';' declarations | CHAR Identifier '=' CHARACTER ';' declarations | CHAR Identifier '[' index ']' '=' STRING ';' declarations |)
			int alt1=5;
			switch ( input.LA(1) ) {
			case INT:
				{
				int LA1_1 = input.LA(2);
				if ( (LA1_1==Identifier) ) {
					int LA1_5 = input.LA(3);
					if ( (LA1_5==42) ) {
						alt1=1;
					}
					else if ( (LA1_5==43) ) {
						alt1=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FLOAT:
				{
				int LA1_2 = input.LA(2);
				if ( (LA1_2==Identifier) ) {
					int LA1_5 = input.LA(3);
					if ( (LA1_5==42) ) {
						alt1=1;
					}
					else if ( (LA1_5==43) ) {
						alt1=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHAR:
				{
				int LA1_3 = input.LA(2);
				if ( (LA1_3==Identifier) ) {
					int LA1_6 = input.LA(3);
					if ( (LA1_6==43) ) {
						alt1=3;
					}
					else if ( (LA1_6==44) ) {
						alt1=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FOR:
			case Floating_point_constant:
			case IF:
			case Identifier:
			case Integer_constant:
			case NOT:
			case PRINTF:
			case SWITCH:
			case WHILE:
			case 34:
			case 42:
			case 50:
				{
				alt1=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// myC_new.g:20:2: type Identifier ';' declarations
					{
					pushFollow(FOLLOW_type_in_declarations59);
					type();
					state._fsp--;

					match(input,Identifier,FOLLOW_Identifier_in_declarations61); 
					match(input,42,FOLLOW_42_in_declarations63); 
					pushFollow(FOLLOW_declarations_in_declarations65);
					declarations();
					state._fsp--;

					 if (TRACEON) System.out.println("declarations: type Identifier : declarations"); 
							
					}
					break;
				case 2 :
					// myC_new.g:22:4: type Identifier '=' real ';' declarations
					{
					pushFollow(FOLLOW_type_in_declarations72);
					type();
					state._fsp--;

					match(input,Identifier,FOLLOW_Identifier_in_declarations74); 
					match(input,43,FOLLOW_43_in_declarations76); 
					pushFollow(FOLLOW_real_in_declarations78);
					real();
					state._fsp--;

					match(input,42,FOLLOW_42_in_declarations80); 
					pushFollow(FOLLOW_declarations_in_declarations82);
					declarations();
					state._fsp--;

					 if (TRACEON) System.out.println("declarations: type Identifier = REAL: declarations"); 
							
					}
					break;
				case 3 :
					// myC_new.g:24:4: CHAR Identifier '=' CHARACTER ';' declarations
					{
					match(input,CHAR,FOLLOW_CHAR_in_declarations89); 
					match(input,Identifier,FOLLOW_Identifier_in_declarations91); 
					match(input,43,FOLLOW_43_in_declarations93); 
					match(input,CHARACTER,FOLLOW_CHARACTER_in_declarations95); 
					match(input,42,FOLLOW_42_in_declarations97); 
					pushFollow(FOLLOW_declarations_in_declarations99);
					declarations();
					state._fsp--;

					 if (TRACEON) System.out.println("declarations: CHAR Identifier = CHARACTER : declarations"); 
							
					}
					break;
				case 4 :
					// myC_new.g:26:4: CHAR Identifier '[' index ']' '=' STRING ';' declarations
					{
					match(input,CHAR,FOLLOW_CHAR_in_declarations106); 
					match(input,Identifier,FOLLOW_Identifier_in_declarations108); 
					match(input,44,FOLLOW_44_in_declarations110); 
					pushFollow(FOLLOW_index_in_declarations112);
					index();
					state._fsp--;

					match(input,45,FOLLOW_45_in_declarations114); 
					match(input,43,FOLLOW_43_in_declarations116); 
					match(input,STRING,FOLLOW_STRING_in_declarations118); 
					match(input,42,FOLLOW_42_in_declarations120); 
					pushFollow(FOLLOW_declarations_in_declarations122);
					declarations();
					state._fsp--;

					 if (TRACEON) System.out.println("declarations: CHAR Identifier [index]=STRING  : declarations"); 
							
					}
					break;
				case 5 :
					// myC_new.g:28:4: 
					{
					 if (TRACEON) System.out.println("declarations: ");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declarations"



	// $ANTLR start "type"
	// myC_new.g:30:1: type : ( INT | FLOAT );
	public final void type() throws RecognitionException {
		try {
			// myC_new.g:30:5: ( INT | FLOAT )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==INT) ) {
				alt2=1;
			}
			else if ( (LA2_0==FLOAT) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// myC_new.g:31:2: INT
					{
					match(input,INT,FOLLOW_INT_in_type137); 
					 if (TRACEON) System.out.println("type: INT"); 
					}
					break;
				case 2 :
					// myC_new.g:32:4: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type144); 
					if (TRACEON) System.out.println("type: FLOAT"); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type"



	// $ANTLR start "real"
	// myC_new.g:34:1: real : ( Integer_constant | Floating_point_constant );
	public final void real() throws RecognitionException {
		try {
			// myC_new.g:34:5: ( Integer_constant | Floating_point_constant )
			// myC_new.g:
			{
			if ( input.LA(1)==Floating_point_constant||input.LA(1)==Integer_constant ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "real"



	// $ANTLR start "index"
	// myC_new.g:35:1: index : ( Integer_constant )* ;
	public final void index() throws RecognitionException {
		try {
			// myC_new.g:35:6: ( ( Integer_constant )* )
			// myC_new.g:35:8: ( Integer_constant )*
			{
			// myC_new.g:35:8: ( Integer_constant )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==Integer_constant) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// myC_new.g:35:8: Integer_constant
					{
					match(input,Integer_constant,FOLLOW_Integer_constant_in_index163); 
					}
					break;

				default :
					break loop3;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "index"



	// $ANTLR start "statements"
	// myC_new.g:37:1: statements : ( statement statements |);
	public final void statements() throws RecognitionException {
		try {
			// myC_new.g:37:11: ( statement statements |)
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==FOR||LA4_0==IF||LA4_0==Identifier||LA4_0==PRINTF||LA4_0==SWITCH||LA4_0==WHILE) ) {
				alt4=1;
			}
			else if ( ((LA4_0 >= 46 && LA4_0 <= 48)||LA4_0==50) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// myC_new.g:37:13: statement statements
					{
					pushFollow(FOLLOW_statement_in_statements171);
					statement();
					state._fsp--;

					pushFollow(FOLLOW_statements_in_statements173);
					statements();
					state._fsp--;

					}
					break;
				case 2 :
					// myC_new.g:37:35: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statements"



	// $ANTLR start "arith_expression"
	// myC_new.g:39:1: arith_expression : multExpr ( '+' multExpr | '-' multExpr )* ;
	public final void arith_expression() throws RecognitionException {
		try {
			// myC_new.g:39:17: ( multExpr ( '+' multExpr | '-' multExpr )* )
			// myC_new.g:39:19: multExpr ( '+' multExpr | '-' multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_arith_expression182);
			multExpr();
			state._fsp--;

			// myC_new.g:39:28: ( '+' multExpr | '-' multExpr )*
			loop5:
			while (true) {
				int alt5=3;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==37) ) {
					alt5=1;
				}
				else if ( (LA5_0==39) ) {
					alt5=2;
				}

				switch (alt5) {
				case 1 :
					// myC_new.g:39:30: '+' multExpr
					{
					match(input,37,FOLLOW_37_in_arith_expression186); 
					pushFollow(FOLLOW_multExpr_in_arith_expression188);
					multExpr();
					state._fsp--;

					}
					break;
				case 2 :
					// myC_new.g:39:45: '-' multExpr
					{
					match(input,39,FOLLOW_39_in_arith_expression192); 
					pushFollow(FOLLOW_multExpr_in_arith_expression194);
					multExpr();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "arith_expression"



	// $ANTLR start "multExpr"
	// myC_new.g:41:1: multExpr : signExpr ( '*' signExpr | '/' signExpr )* ;
	public final void multExpr() throws RecognitionException {
		try {
			// myC_new.g:41:9: ( signExpr ( '*' signExpr | '/' signExpr )* )
			// myC_new.g:41:11: signExpr ( '*' signExpr | '/' signExpr )*
			{
			pushFollow(FOLLOW_signExpr_in_multExpr203);
			signExpr();
			state._fsp--;

			// myC_new.g:41:20: ( '*' signExpr | '/' signExpr )*
			loop6:
			while (true) {
				int alt6=3;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==36) ) {
					alt6=1;
				}
				else if ( (LA6_0==40) ) {
					alt6=2;
				}

				switch (alt6) {
				case 1 :
					// myC_new.g:41:22: '*' signExpr
					{
					match(input,36,FOLLOW_36_in_multExpr207); 
					pushFollow(FOLLOW_signExpr_in_multExpr209);
					signExpr();
					state._fsp--;

					}
					break;
				case 2 :
					// myC_new.g:41:37: '/' signExpr
					{
					match(input,40,FOLLOW_40_in_multExpr213); 
					pushFollow(FOLLOW_signExpr_in_multExpr215);
					signExpr();
					state._fsp--;

					}
					break;

				default :
					break loop6;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "signExpr"
	// myC_new.g:43:1: signExpr : ( primaryExpr | '-' primaryExpr );
	public final void signExpr() throws RecognitionException {
		try {
			// myC_new.g:43:9: ( primaryExpr | '-' primaryExpr )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==Floating_point_constant||(LA7_0 >= Identifier && LA7_0 <= Integer_constant)||LA7_0==34) ) {
				alt7=1;
			}
			else if ( (LA7_0==39) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// myC_new.g:43:11: primaryExpr
					{
					pushFollow(FOLLOW_primaryExpr_in_signExpr224);
					primaryExpr();
					state._fsp--;

					}
					break;
				case 2 :
					// myC_new.g:43:25: '-' primaryExpr
					{
					match(input,39,FOLLOW_39_in_signExpr228); 
					pushFollow(FOLLOW_primaryExpr_in_signExpr230);
					primaryExpr();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "signExpr"



	// $ANTLR start "primaryExpr"
	// myC_new.g:45:1: primaryExpr : ( Integer_constant | Floating_point_constant | Identifier ( doubleOperator )? | '(' arith_expression ')' );
	public final void primaryExpr() throws RecognitionException {
		try {
			// myC_new.g:45:12: ( Integer_constant | Floating_point_constant | Identifier ( doubleOperator )? | '(' arith_expression ')' )
			int alt9=4;
			switch ( input.LA(1) ) {
			case Integer_constant:
				{
				alt9=1;
				}
				break;
			case Floating_point_constant:
				{
				alt9=2;
				}
				break;
			case Identifier:
				{
				alt9=3;
				}
				break;
			case 34:
				{
				alt9=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// myC_new.g:46:2: Integer_constant
					{
					match(input,Integer_constant,FOLLOW_Integer_constant_in_primaryExpr238); 
					}
					break;
				case 2 :
					// myC_new.g:47:4: Floating_point_constant
					{
					match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_primaryExpr243); 
					}
					break;
				case 3 :
					// myC_new.g:48:4: Identifier ( doubleOperator )?
					{
					match(input,Identifier,FOLLOW_Identifier_in_primaryExpr248); 
					// myC_new.g:48:15: ( doubleOperator )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==MINUS_MINUS||LA8_0==PLUS_PLUS) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// myC_new.g:48:15: doubleOperator
							{
							pushFollow(FOLLOW_doubleOperator_in_primaryExpr250);
							doubleOperator();
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 4 :
					// myC_new.g:49:4: '(' arith_expression ')'
					{
					match(input,34,FOLLOW_34_in_primaryExpr256); 
					pushFollow(FOLLOW_arith_expression_in_primaryExpr258);
					arith_expression();
					state._fsp--;

					match(input,35,FOLLOW_35_in_primaryExpr260); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "primaryExpr"



	// $ANTLR start "doubleOperator"
	// myC_new.g:51:1: doubleOperator : ( PLUS_PLUS | MINUS_MINUS );
	public final void doubleOperator() throws RecognitionException {
		try {
			// myC_new.g:51:15: ( PLUS_PLUS | MINUS_MINUS )
			// myC_new.g:
			{
			if ( input.LA(1)==MINUS_MINUS||input.LA(1)==PLUS_PLUS ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "doubleOperator"



	// $ANTLR start "compareSign"
	// myC_new.g:55:1: compareSign : ( AND | OR | XOR | EQ_OP | LE_OP | GE_OP | NE_OP | L_OP | G_OP );
	public final void compareSign() throws RecognitionException {
		try {
			// myC_new.g:55:12: ( AND | OR | XOR | EQ_OP | LE_OP | GE_OP | NE_OP | L_OP | G_OP )
			// myC_new.g:
			{
			if ( input.LA(1)==AND||input.LA(1)==EQ_OP||(input.LA(1) >= GE_OP && input.LA(1) <= G_OP)||(input.LA(1) >= LE_OP && input.LA(1) <= L_OP)||input.LA(1)==NE_OP||input.LA(1)==OR||input.LA(1)==XOR ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "compareSign"



	// $ANTLR start "compare_expression"
	// myC_new.g:66:1: compare_expression : ( mult_compare ( compareSign mult_compare )* |);
	public final void compare_expression() throws RecognitionException {
		try {
			// myC_new.g:66:19: ( mult_compare ( compareSign mult_compare )* |)
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==Floating_point_constant||(LA11_0 >= Identifier && LA11_0 <= Integer_constant)||LA11_0==NOT||LA11_0==34) ) {
				alt11=1;
			}
			else if ( (LA11_0==35||LA11_0==42) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// myC_new.g:67:2: mult_compare ( compareSign mult_compare )*
					{
					pushFollow(FOLLOW_mult_compare_in_compare_expression336);
					mult_compare();
					state._fsp--;

					// myC_new.g:67:15: ( compareSign mult_compare )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==AND||LA10_0==EQ_OP||(LA10_0 >= GE_OP && LA10_0 <= G_OP)||(LA10_0 >= LE_OP && LA10_0 <= L_OP)||LA10_0==NE_OP||LA10_0==OR||LA10_0==XOR) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// myC_new.g:67:16: compareSign mult_compare
							{
							pushFollow(FOLLOW_compareSign_in_compare_expression339);
							compareSign();
							state._fsp--;

							pushFollow(FOLLOW_mult_compare_in_compare_expression341);
							mult_compare();
							state._fsp--;

							}
							break;

						default :
							break loop10;
						}
					}

					 if (TRACEON) System.out.println("compare_expression: mult_compare ( compareSign mult_compare )* ");
							
					}
					break;
				case 2 :
					// myC_new.g:69:3: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "compare_expression"



	// $ANTLR start "mult_compare"
	// myC_new.g:71:1: mult_compare : ( compare_atom | NOT compare_atom );
	public final void mult_compare() throws RecognitionException {
		try {
			// myC_new.g:71:13: ( compare_atom | NOT compare_atom )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==Floating_point_constant||(LA12_0 >= Identifier && LA12_0 <= Integer_constant)||LA12_0==34) ) {
				alt12=1;
			}
			else if ( (LA12_0==NOT) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// myC_new.g:71:15: compare_atom
					{
					pushFollow(FOLLOW_compare_atom_in_mult_compare355);
					compare_atom();
					state._fsp--;

					}
					break;
				case 2 :
					// myC_new.g:71:30: NOT compare_atom
					{
					match(input,NOT,FOLLOW_NOT_in_mult_compare359); 
					pushFollow(FOLLOW_compare_atom_in_mult_compare361);
					compare_atom();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "mult_compare"



	// $ANTLR start "compare_atom"
	// myC_new.g:73:1: compare_atom : ( Identifier | real | '(' compare_expression ')' );
	public final void compare_atom() throws RecognitionException {
		try {
			// myC_new.g:73:13: ( Identifier | real | '(' compare_expression ')' )
			int alt13=3;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				alt13=1;
				}
				break;
			case Floating_point_constant:
			case Integer_constant:
				{
				alt13=2;
				}
				break;
			case 34:
				{
				alt13=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// myC_new.g:74:2: Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_compare_atom369); 
					 if (TRACEON) System.out.println("compare_atom: ID");
					}
					break;
				case 2 :
					// myC_new.g:75:4: real
					{
					pushFollow(FOLLOW_real_in_compare_atom376);
					real();
					state._fsp--;

					 if (TRACEON) System.out.println("compare_atom: REAL");
					}
					break;
				case 3 :
					// myC_new.g:76:4: '(' compare_expression ')'
					{
					match(input,34,FOLLOW_34_in_compare_atom383); 
					pushFollow(FOLLOW_compare_expression_in_compare_atom385);
					compare_expression();
					state._fsp--;

					match(input,35,FOLLOW_35_in_compare_atom387); 
					 if (TRACEON) System.out.println("compare_atom: compare_expression");
							
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "compare_atom"



	// $ANTLR start "statement"
	// myC_new.g:79:1: statement : ( Identifier '=' arith_expression ';' | Identifier doubleOperator ';' | IF '(' compare_expression ')' if_then_statements | FOR '(' declarations compare_expression ';' statement_in_for ')' for_statement | WHILE '(' compare_expression ')' while_statement | printf_function ';' | SWITCH '(' Identifier ')' switch_statement );
	public final void statement() throws RecognitionException {
		try {
			// myC_new.g:79:10: ( Identifier '=' arith_expression ';' | Identifier doubleOperator ';' | IF '(' compare_expression ')' if_then_statements | FOR '(' declarations compare_expression ';' statement_in_for ')' for_statement | WHILE '(' compare_expression ')' while_statement | printf_function ';' | SWITCH '(' Identifier ')' switch_statement )
			int alt14=7;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA14_1 = input.LA(2);
				if ( (LA14_1==43) ) {
					alt14=1;
				}
				else if ( (LA14_1==MINUS_MINUS||LA14_1==PLUS_PLUS) ) {
					alt14=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case IF:
				{
				alt14=3;
				}
				break;
			case FOR:
				{
				alt14=4;
				}
				break;
			case WHILE:
				{
				alt14=5;
				}
				break;
			case PRINTF:
				{
				alt14=6;
				}
				break;
			case SWITCH:
				{
				alt14=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// myC_new.g:80:2: Identifier '=' arith_expression ';'
					{
					match(input,Identifier,FOLLOW_Identifier_in_statement397); 
					match(input,43,FOLLOW_43_in_statement399); 
					pushFollow(FOLLOW_arith_expression_in_statement401);
					arith_expression();
					state._fsp--;

					match(input,42,FOLLOW_42_in_statement403); 
					 if (TRACEON) System.out.println("statement: Identifier = arith_expression;");
					}
					break;
				case 2 :
					// myC_new.g:82:7: Identifier doubleOperator ';'
					{
					match(input,Identifier,FOLLOW_Identifier_in_statement421); 
					pushFollow(FOLLOW_doubleOperator_in_statement423);
					doubleOperator();
					state._fsp--;

					match(input,42,FOLLOW_42_in_statement425); 
					 if (TRACEON) System.out.println("statement: Identifier doubleOperator;");
					}
					break;
				case 3 :
					// myC_new.g:84:4: IF '(' compare_expression ')' if_then_statements
					{
					match(input,IF,FOLLOW_IF_in_statement440); 
					match(input,34,FOLLOW_34_in_statement442); 
					pushFollow(FOLLOW_compare_expression_in_statement444);
					compare_expression();
					state._fsp--;

					match(input,35,FOLLOW_35_in_statement446); 
					pushFollow(FOLLOW_if_then_statements_in_statement448);
					if_then_statements();
					state._fsp--;

					 if (TRACEON) System.out.println("statement: IF (compare_expression ) if_then_statements");
					}
					break;
				case 4 :
					// myC_new.g:86:7: FOR '(' declarations compare_expression ';' statement_in_for ')' for_statement
					{
					match(input,FOR,FOLLOW_FOR_in_statement467); 
					match(input,34,FOLLOW_34_in_statement469); 
					pushFollow(FOLLOW_declarations_in_statement471);
					declarations();
					state._fsp--;

					pushFollow(FOLLOW_compare_expression_in_statement473);
					compare_expression();
					state._fsp--;

					match(input,42,FOLLOW_42_in_statement475); 
					pushFollow(FOLLOW_statement_in_for_in_statement477);
					statement_in_for();
					state._fsp--;

					match(input,35,FOLLOW_35_in_statement479); 
					pushFollow(FOLLOW_for_statement_in_statement481);
					for_statement();
					state._fsp--;

					 if (TRACEON) System.out.println("statement: FOR (declarations;compare_expression;statement) for_statement");
					}
					break;
				case 5 :
					// myC_new.g:88:7: WHILE '(' compare_expression ')' while_statement
					{
					match(input,WHILE,FOLLOW_WHILE_in_statement499); 
					match(input,34,FOLLOW_34_in_statement501); 
					pushFollow(FOLLOW_compare_expression_in_statement502);
					compare_expression();
					state._fsp--;

					match(input,35,FOLLOW_35_in_statement503); 
					pushFollow(FOLLOW_while_statement_in_statement505);
					while_statement();
					state._fsp--;

					 if (TRACEON) System.out.println("statement: WHILE (compare_expression) while_statement");
					}
					break;
				case 6 :
					// myC_new.g:90:7: printf_function ';'
					{
					pushFollow(FOLLOW_printf_function_in_statement523);
					printf_function();
					state._fsp--;

					match(input,42,FOLLOW_42_in_statement525); 
					 if (TRACEON) System.out.println("statement: printf_function");
					}
					break;
				case 7 :
					// myC_new.g:92:7: SWITCH '(' Identifier ')' switch_statement
					{
					match(input,SWITCH,FOLLOW_SWITCH_in_statement543); 
					match(input,34,FOLLOW_34_in_statement545); 
					match(input,Identifier,FOLLOW_Identifier_in_statement546); 
					match(input,35,FOLLOW_35_in_statement547); 
					pushFollow(FOLLOW_switch_statement_in_statement549);
					switch_statement();
					state._fsp--;

					 if (TRACEON) System.out.println("statement: SWITCH (Identifier) switch_statement");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "statement_in_for"
	// myC_new.g:96:1: statement_in_for : ( Identifier '=' arith_expression | Identifier doubleOperator );
	public final void statement_in_for() throws RecognitionException {
		try {
			// myC_new.g:96:17: ( Identifier '=' arith_expression | Identifier doubleOperator )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==Identifier) ) {
				int LA15_1 = input.LA(2);
				if ( (LA15_1==43) ) {
					alt15=1;
				}
				else if ( (LA15_1==MINUS_MINUS||LA15_1==PLUS_PLUS) ) {
					alt15=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// myC_new.g:97:5: Identifier '=' arith_expression
					{
					match(input,Identifier,FOLLOW_Identifier_in_statement_in_for575); 
					match(input,43,FOLLOW_43_in_statement_in_for577); 
					pushFollow(FOLLOW_arith_expression_in_statement_in_for579);
					arith_expression();
					state._fsp--;

					}
					break;
				case 2 :
					// myC_new.g:98:7: Identifier doubleOperator
					{
					match(input,Identifier,FOLLOW_Identifier_in_statement_in_for587); 
					pushFollow(FOLLOW_doubleOperator_in_statement_in_for589);
					doubleOperator();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statement_in_for"



	// $ANTLR start "if_then_statements"
	// myC_new.g:100:1: if_then_statements : ( statement | '{' statements '}' else_statement );
	public final void if_then_statements() throws RecognitionException {
		try {
			// myC_new.g:100:19: ( statement | '{' statements '}' else_statement )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==FOR||LA16_0==IF||LA16_0==Identifier||LA16_0==PRINTF||LA16_0==SWITCH||LA16_0==WHILE) ) {
				alt16=1;
			}
			else if ( (LA16_0==49) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// myC_new.g:101:2: statement
					{
					pushFollow(FOLLOW_statement_in_if_then_statements597);
					statement();
					state._fsp--;

					 if (TRACEON) System.out.println("if_then_statements :statements");
					}
					break;
				case 2 :
					// myC_new.g:102:4: '{' statements '}' else_statement
					{
					match(input,49,FOLLOW_49_in_if_then_statements604); 
					pushFollow(FOLLOW_statements_in_if_then_statements606);
					statements();
					state._fsp--;

					match(input,50,FOLLOW_50_in_if_then_statements608); 
					pushFollow(FOLLOW_else_statement_in_if_then_statements610);
					else_statement();
					state._fsp--;

					 if (TRACEON) System.out.println("if_then_statements :{statements } else_statement");
							
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "if_then_statements"



	// $ANTLR start "else_statement"
	// myC_new.g:105:1: else_statement : ( ELSE '{' statements '}' |);
	public final void else_statement() throws RecognitionException {
		try {
			// myC_new.g:105:15: ( ELSE '{' statements '}' |)
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==ELSE) ) {
				alt17=1;
			}
			else if ( (LA17_0==FOR||LA17_0==IF||LA17_0==Identifier||LA17_0==PRINTF||LA17_0==SWITCH||LA17_0==WHILE||(LA17_0 >= 46 && LA17_0 <= 48)||LA17_0==50) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// myC_new.g:106:2: ELSE '{' statements '}'
					{
					match(input,ELSE,FOLLOW_ELSE_in_else_statement620); 
					match(input,49,FOLLOW_49_in_else_statement622); 
					pushFollow(FOLLOW_statements_in_else_statement624);
					statements();
					state._fsp--;

					match(input,50,FOLLOW_50_in_else_statement626); 
					 if (TRACEON) System.out.println("else_statement :{statements } ");
					}
					break;
				case 2 :
					// myC_new.g:107:3: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "else_statement"



	// $ANTLR start "for_statement"
	// myC_new.g:109:1: for_statement : ( statement | '{' statements '}' );
	public final void for_statement() throws RecognitionException {
		try {
			// myC_new.g:109:14: ( statement | '{' statements '}' )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==FOR||LA18_0==IF||LA18_0==Identifier||LA18_0==PRINTF||LA18_0==SWITCH||LA18_0==WHILE) ) {
				alt18=1;
			}
			else if ( (LA18_0==49) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// myC_new.g:110:5: statement
					{
					pushFollow(FOLLOW_statement_in_for_statement642);
					statement();
					state._fsp--;

					 if (TRACEON) System.out.println("for_statements :statements");
					}
					break;
				case 2 :
					// myC_new.g:111:4: '{' statements '}'
					{
					match(input,49,FOLLOW_49_in_for_statement649); 
					pushFollow(FOLLOW_statements_in_for_statement651);
					statements();
					state._fsp--;

					match(input,50,FOLLOW_50_in_for_statement653); 
					 if (TRACEON) System.out.println("for_statements :{statements } else_statement");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "for_statement"



	// $ANTLR start "while_statement"
	// myC_new.g:113:1: while_statement : ( statement | '{' statements '}' );
	public final void while_statement() throws RecognitionException {
		try {
			// myC_new.g:113:16: ( statement | '{' statements '}' )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==FOR||LA19_0==IF||LA19_0==Identifier||LA19_0==PRINTF||LA19_0==SWITCH||LA19_0==WHILE) ) {
				alt19=1;
			}
			else if ( (LA19_0==49) ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// myC_new.g:114:5: statement
					{
					pushFollow(FOLLOW_statement_in_while_statement665);
					statement();
					state._fsp--;

					 if (TRACEON) System.out.println("for_statements :statements");
					}
					break;
				case 2 :
					// myC_new.g:115:4: '{' statements '}'
					{
					match(input,49,FOLLOW_49_in_while_statement672); 
					pushFollow(FOLLOW_statements_in_while_statement674);
					statements();
					state._fsp--;

					match(input,50,FOLLOW_50_in_while_statement676); 
					 if (TRACEON) System.out.println("for_statements :{statements } else_statement");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "while_statement"



	// $ANTLR start "printf_function"
	// myC_new.g:117:1: printf_function : PRINTF '(' STRING ( ',' Identifier )* ')' ;
	public final void printf_function() throws RecognitionException {
		try {
			// myC_new.g:117:16: ( PRINTF '(' STRING ( ',' Identifier )* ')' )
			// myC_new.g:118:5: PRINTF '(' STRING ( ',' Identifier )* ')'
			{
			match(input,PRINTF,FOLLOW_PRINTF_in_printf_function688); 
			match(input,34,FOLLOW_34_in_printf_function690); 
			match(input,STRING,FOLLOW_STRING_in_printf_function692); 
			// myC_new.g:118:23: ( ',' Identifier )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==38) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// myC_new.g:118:24: ',' Identifier
					{
					match(input,38,FOLLOW_38_in_printf_function695); 
					match(input,Identifier,FOLLOW_Identifier_in_printf_function696); 
					}
					break;

				default :
					break loop20;
				}
			}

			match(input,35,FOLLOW_35_in_printf_function700); 
			 if (TRACEON) System.out.println("printf_function: PRINTF '(' STRING (','Identifier)* ')'");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "printf_function"



	// $ANTLR start "switch_statement"
	// myC_new.g:122:1: switch_statement : '{' my_cases '}' ;
	public final void switch_statement() throws RecognitionException {
		try {
			// myC_new.g:122:17: ( '{' my_cases '}' )
			// myC_new.g:123:5: '{' my_cases '}'
			{
			match(input,49,FOLLOW_49_in_switch_statement722); 
			pushFollow(FOLLOW_my_cases_in_switch_statement724);
			my_cases();
			state._fsp--;

			match(input,50,FOLLOW_50_in_switch_statement726); 
			 if (TRACEON) System.out.println("for_statements :{statements } else_statement");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "switch_statement"



	// $ANTLR start "my_case"
	// myC_new.g:125:1: my_case : ( 'case' ( CHARACTER | real ) ':' statements ( 'break;' )? | 'default: ' statements );
	public final void my_case() throws RecognitionException {
		try {
			// myC_new.g:125:8: ( 'case' ( CHARACTER | real ) ':' statements ( 'break;' )? | 'default: ' statements )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==47) ) {
				alt23=1;
			}
			else if ( (LA23_0==48) ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// myC_new.g:126:5: 'case' ( CHARACTER | real ) ':' statements ( 'break;' )?
					{
					match(input,47,FOLLOW_47_in_my_case738); 
					// myC_new.g:126:12: ( CHARACTER | real )
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==CHARACTER) ) {
						alt21=1;
					}
					else if ( (LA21_0==Floating_point_constant||LA21_0==Integer_constant) ) {
						alt21=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 21, 0, input);
						throw nvae;
					}

					switch (alt21) {
						case 1 :
							// myC_new.g:126:13: CHARACTER
							{
							match(input,CHARACTER,FOLLOW_CHARACTER_in_my_case741); 
							}
							break;
						case 2 :
							// myC_new.g:126:23: real
							{
							pushFollow(FOLLOW_real_in_my_case743);
							real();
							state._fsp--;

							}
							break;

					}

					match(input,41,FOLLOW_41_in_my_case746); 
					pushFollow(FOLLOW_statements_in_my_case748);
					statements();
					state._fsp--;

					// myC_new.g:126:44: ( 'break;' )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==46) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// myC_new.g:126:44: 'break;'
							{
							match(input,46,FOLLOW_46_in_my_case750); 
							}
							break;

					}

					 if (TRACEON) System.out.println("case: case (CHARACTER|real) : statements break;?");
					}
					break;
				case 2 :
					// myC_new.g:128:7: 'default: ' statements
					{
					match(input,48,FOLLOW_48_in_my_case769); 
					pushFollow(FOLLOW_statements_in_my_case771);
					statements();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "my_case"



	// $ANTLR start "my_cases"
	// myC_new.g:130:1: my_cases : ( my_case my_cases |);
	public final void my_cases() throws RecognitionException {
		try {
			// myC_new.g:130:9: ( my_case my_cases |)
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( ((LA24_0 >= 47 && LA24_0 <= 48)) ) {
				alt24=1;
			}
			else if ( (LA24_0==50) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// myC_new.g:130:11: my_case my_cases
					{
					pushFollow(FOLLOW_my_case_in_my_cases778);
					my_case();
					state._fsp--;

					pushFollow(FOLLOW_my_cases_in_my_cases780);
					my_cases();
					state._fsp--;

					}
					break;
				case 2 :
					// myC_new.g:130:28: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "my_cases"

	// Delegated rules



	public static final BitSet FOLLOW_VOID_in_program35 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_MAIN_in_program37 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_program39 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_program41 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_program43 = new BitSet(new long[]{0x00040000A8038C20L});
	public static final BitSet FOLLOW_declarations_in_program45 = new BitSet(new long[]{0x00040000A8028800L});
	public static final BitSet FOLLOW_statements_in_program47 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_program49 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declarations59 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_Identifier_in_declarations61 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_declarations63 = new BitSet(new long[]{0x0000000000010420L});
	public static final BitSet FOLLOW_declarations_in_declarations65 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declarations72 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_Identifier_in_declarations74 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_declarations76 = new BitSet(new long[]{0x0000000000041000L});
	public static final BitSet FOLLOW_real_in_declarations78 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_declarations80 = new BitSet(new long[]{0x0000000000010420L});
	public static final BitSet FOLLOW_declarations_in_declarations82 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_declarations89 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_Identifier_in_declarations91 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_declarations93 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CHARACTER_in_declarations95 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_declarations97 = new BitSet(new long[]{0x0000000000010420L});
	public static final BitSet FOLLOW_declarations_in_declarations99 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_declarations106 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_Identifier_in_declarations108 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_declarations110 = new BitSet(new long[]{0x0000200000040000L});
	public static final BitSet FOLLOW_index_in_declarations112 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_declarations114 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_declarations116 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_STRING_in_declarations118 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_declarations120 = new BitSet(new long[]{0x0000000000010420L});
	public static final BitSet FOLLOW_declarations_in_declarations122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_index163 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_statement_in_statements171 = new BitSet(new long[]{0x00000000A8028800L});
	public static final BitSet FOLLOW_statements_in_statements173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression182 = new BitSet(new long[]{0x000000A000000002L});
	public static final BitSet FOLLOW_37_in_arith_expression186 = new BitSet(new long[]{0x0000008400061000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression188 = new BitSet(new long[]{0x000000A000000002L});
	public static final BitSet FOLLOW_39_in_arith_expression192 = new BitSet(new long[]{0x0000008400061000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression194 = new BitSet(new long[]{0x000000A000000002L});
	public static final BitSet FOLLOW_signExpr_in_multExpr203 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_36_in_multExpr207 = new BitSet(new long[]{0x0000008400061000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr209 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_40_in_multExpr213 = new BitSet(new long[]{0x0000008400061000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr215 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_signExpr228 = new BitSet(new long[]{0x0000000400061000L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_primaryExpr238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Floating_point_constant_in_primaryExpr243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr248 = new BitSet(new long[]{0x0000000004400002L});
	public static final BitSet FOLLOW_doubleOperator_in_primaryExpr250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_primaryExpr256 = new BitSet(new long[]{0x0000008400061000L});
	public static final BitSet FOLLOW_arith_expression_in_primaryExpr258 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_primaryExpr260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mult_compare_in_compare_expression336 = new BitSet(new long[]{0x0000000202986212L});
	public static final BitSet FOLLOW_compareSign_in_compare_expression339 = new BitSet(new long[]{0x0000000401061000L});
	public static final BitSet FOLLOW_mult_compare_in_compare_expression341 = new BitSet(new long[]{0x0000000202986212L});
	public static final BitSet FOLLOW_compare_atom_in_mult_compare355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_mult_compare359 = new BitSet(new long[]{0x0000000400061000L});
	public static final BitSet FOLLOW_compare_atom_in_mult_compare361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_compare_atom369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_real_in_compare_atom376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_compare_atom383 = new BitSet(new long[]{0x0000000C01061000L});
	public static final BitSet FOLLOW_compare_expression_in_compare_atom385 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_compare_atom387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_statement397 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_statement399 = new BitSet(new long[]{0x0000008400061000L});
	public static final BitSet FOLLOW_arith_expression_in_statement401 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_statement403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_statement421 = new BitSet(new long[]{0x0000000004400000L});
	public static final BitSet FOLLOW_doubleOperator_in_statement423 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_statement425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_statement440 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_statement442 = new BitSet(new long[]{0x0000000C01061000L});
	public static final BitSet FOLLOW_compare_expression_in_statement444 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_statement446 = new BitSet(new long[]{0x00020000A8028800L});
	public static final BitSet FOLLOW_if_then_statements_in_statement448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_statement467 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_statement469 = new BitSet(new long[]{0x0000040401071420L});
	public static final BitSet FOLLOW_declarations_in_statement471 = new BitSet(new long[]{0x0000040401061000L});
	public static final BitSet FOLLOW_compare_expression_in_statement473 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_statement475 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_statement_in_for_in_statement477 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_statement479 = new BitSet(new long[]{0x00020000A8028800L});
	public static final BitSet FOLLOW_for_statement_in_statement481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_statement499 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_statement501 = new BitSet(new long[]{0x0000000C01061000L});
	public static final BitSet FOLLOW_compare_expression_in_statement502 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_statement503 = new BitSet(new long[]{0x00020000A8028800L});
	public static final BitSet FOLLOW_while_statement_in_statement505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printf_function_in_statement523 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_statement525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWITCH_in_statement543 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_statement545 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_Identifier_in_statement546 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_statement547 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_switch_statement_in_statement549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_statement_in_for575 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_statement_in_for577 = new BitSet(new long[]{0x0000008400061000L});
	public static final BitSet FOLLOW_arith_expression_in_statement_in_for579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_statement_in_for587 = new BitSet(new long[]{0x0000000004400000L});
	public static final BitSet FOLLOW_doubleOperator_in_statement_in_for589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_if_then_statements597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_if_then_statements604 = new BitSet(new long[]{0x00040000A8028800L});
	public static final BitSet FOLLOW_statements_in_if_then_statements606 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_if_then_statements608 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_else_statement_in_if_then_statements610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_else_statement620 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_else_statement622 = new BitSet(new long[]{0x00040000A8028800L});
	public static final BitSet FOLLOW_statements_in_else_statement624 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_else_statement626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_for_statement642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_for_statement649 = new BitSet(new long[]{0x00040000A8028800L});
	public static final BitSet FOLLOW_statements_in_for_statement651 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_for_statement653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_while_statement665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_while_statement672 = new BitSet(new long[]{0x00040000A8028800L});
	public static final BitSet FOLLOW_statements_in_while_statement674 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_while_statement676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINTF_in_printf_function688 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_printf_function690 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_STRING_in_printf_function692 = new BitSet(new long[]{0x0000004800000000L});
	public static final BitSet FOLLOW_38_in_printf_function695 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_Identifier_in_printf_function696 = new BitSet(new long[]{0x0000004800000000L});
	public static final BitSet FOLLOW_35_in_printf_function700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_switch_statement722 = new BitSet(new long[]{0x0005800000000000L});
	public static final BitSet FOLLOW_my_cases_in_switch_statement724 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_switch_statement726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_my_case738 = new BitSet(new long[]{0x0000000000041040L});
	public static final BitSet FOLLOW_CHARACTER_in_my_case741 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_real_in_my_case743 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_my_case746 = new BitSet(new long[]{0x00004000A8028800L});
	public static final BitSet FOLLOW_statements_in_my_case748 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_46_in_my_case750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_my_case769 = new BitSet(new long[]{0x00000000A8028800L});
	public static final BitSet FOLLOW_statements_in_my_case771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_my_case_in_my_cases778 = new BitSet(new long[]{0x0001800000000000L});
	public static final BitSet FOLLOW_my_cases_in_my_cases780 = new BitSet(new long[]{0x0000000000000002L});
}
