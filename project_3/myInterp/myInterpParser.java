// $ANTLR 3.5.2 myInterp.g 2019-05-23 00:43:40

    import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myInterpParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ELSE", "EscapeSequence", 
		"FLOAT", "FOR", "Floating_point_constant", "IF", "INT", "Identifier", 
		"Integer_constant", "MAIN", "RelationOP", "STRING_LITERAL", "VOID", "WS", 
		"'&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "';'", "'='", 
		"'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int CHAR=4;
	public static final int COMMENT=5;
	public static final int ELSE=6;
	public static final int EscapeSequence=7;
	public static final int FLOAT=8;
	public static final int FOR=9;
	public static final int Floating_point_constant=10;
	public static final int IF=11;
	public static final int INT=12;
	public static final int Identifier=13;
	public static final int Integer_constant=14;
	public static final int MAIN=15;
	public static final int RelationOP=16;
	public static final int STRING_LITERAL=17;
	public static final int VOID=18;
	public static final int WS=19;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myInterpParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myInterpParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return myInterpParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myInterp.g"; }


	    boolean TRACEON = false;
	    HashMap memory = new HashMap();



	// $ANTLR start "program"
	// myInterp.g:16:1: program : VOID MAIN '(' ')' '{' declarations statements '}' ;
	public final void program() throws RecognitionException {
		try {
			// myInterp.g:16:8: ( VOID MAIN '(' ')' '{' declarations statements '}' )
			// myInterp.g:17:2: VOID MAIN '(' ')' '{' declarations statements '}'
			{
			match(input,VOID,FOLLOW_VOID_in_program35); 
			match(input,MAIN,FOLLOW_MAIN_in_program37); 
			match(input,21,FOLLOW_21_in_program39); 
			match(input,22,FOLLOW_22_in_program41); 
			match(input,30,FOLLOW_30_in_program43); 
			pushFollow(FOLLOW_declarations_in_program45);
			declarations();
			state._fsp--;

			pushFollow(FOLLOW_statements_in_program47);
			statements();
			state._fsp--;

			match(input,31,FOLLOW_31_in_program49); 
			 if (TRACEON)
					      System.out.println("VOID MAIN () {declarations statements}");
			        
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
	// myInterp.g:21:1: declarations : ( type Identifier ';' declarations |);
	public final void declarations() throws RecognitionException {
		try {
			// myInterp.g:21:13: ( type Identifier ';' declarations |)
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==CHAR||LA1_0==FLOAT||LA1_0==INT) ) {
				alt1=1;
			}
			else if ( (LA1_0==FOR||LA1_0==IF||LA1_0==Identifier||LA1_0==31) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// myInterp.g:22:2: type Identifier ';' declarations
					{
					pushFollow(FOLLOW_type_in_declarations59);
					type();
					state._fsp--;

					match(input,Identifier,FOLLOW_Identifier_in_declarations61); 
					match(input,28,FOLLOW_28_in_declarations63); 
					pushFollow(FOLLOW_declarations_in_declarations65);
					declarations();
					state._fsp--;

					 if (TRACEON)
						           System.out.println("declarations: type Identifier : declarations");
					              
					}
					break;
				case 2 :
					// myInterp.g:25:4: 
					{
					 if (TRACEON)
					                    System.out.println("declarations: ");
								  
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
	// myInterp.g:29:1: type : ( INT | CHAR | FLOAT );
	public final void type() throws RecognitionException {
		try {
			// myInterp.g:29:5: ( INT | CHAR | FLOAT )
			int alt2=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt2=1;
				}
				break;
			case CHAR:
				{
				alt2=2;
				}
				break;
			case FLOAT:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// myInterp.g:30:2: INT
					{
					match(input,INT,FOLLOW_INT_in_type80); 
					 if (TRACEON) System.out.println("type: INT"); 
					}
					break;
				case 2 :
					// myInterp.g:31:4: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_type87); 
					}
					break;
				case 3 :
					// myInterp.g:32:4: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type92); 
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



	// $ANTLR start "statements"
	// myInterp.g:34:1: statements : ( statement statements |);
	public final void statements() throws RecognitionException {
		try {
			// myInterp.g:34:11: ( statement statements |)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==FOR||LA3_0==IF||LA3_0==Identifier) ) {
				alt3=1;
			}
			else if ( (LA3_0==31) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// myInterp.g:34:13: statement statements
					{
					pushFollow(FOLLOW_statement_in_statements101);
					statement();
					state._fsp--;

					pushFollow(FOLLOW_statements_in_statements103);
					statements();
					state._fsp--;

					}
					break;
				case 2 :
					// myInterp.g:34:35: 
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



	// $ANTLR start "statement"
	// myInterp.g:36:1: statement : ( assign_stmt ';' | if_stmt | func_no_return_stmt ';' | for_stmt );
	public final void statement() throws RecognitionException {
		try {
			// myInterp.g:36:10: ( assign_stmt ';' | if_stmt | func_no_return_stmt ';' | for_stmt )
			int alt4=4;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA4_1 = input.LA(2);
				if ( (LA4_1==29) ) {
					alt4=1;
				}
				else if ( (LA4_1==21) ) {
					alt4=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case IF:
				{
				alt4=2;
				}
				break;
			case FOR:
				{
				alt4=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// myInterp.g:37:2: assign_stmt ';'
					{
					pushFollow(FOLLOW_assign_stmt_in_statement113);
					assign_stmt();
					state._fsp--;

					match(input,28,FOLLOW_28_in_statement115); 
					}
					break;
				case 2 :
					// myInterp.g:38:4: if_stmt
					{
					pushFollow(FOLLOW_if_stmt_in_statement120);
					if_stmt();
					state._fsp--;

					}
					break;
				case 3 :
					// myInterp.g:39:4: func_no_return_stmt ';'
					{
					pushFollow(FOLLOW_func_no_return_stmt_in_statement125);
					func_no_return_stmt();
					state._fsp--;

					match(input,28,FOLLOW_28_in_statement127); 
					}
					break;
				case 4 :
					// myInterp.g:40:4: for_stmt
					{
					pushFollow(FOLLOW_for_stmt_in_statement132);
					for_stmt();
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
	// $ANTLR end "statement"



	// $ANTLR start "for_stmt"
	// myInterp.g:42:1: for_stmt : FOR '(' assign_stmt ';' cond_expression ';' assign_stmt ')' block_stmt ;
	public final void for_stmt() throws RecognitionException {
		try {
			// myInterp.g:42:9: ( FOR '(' assign_stmt ';' cond_expression ';' assign_stmt ')' block_stmt )
			// myInterp.g:43:2: FOR '(' assign_stmt ';' cond_expression ';' assign_stmt ')' block_stmt
			{
			match(input,FOR,FOLLOW_FOR_in_for_stmt140); 
			match(input,21,FOLLOW_21_in_for_stmt142); 
			pushFollow(FOLLOW_assign_stmt_in_for_stmt144);
			assign_stmt();
			state._fsp--;

			match(input,28,FOLLOW_28_in_for_stmt146); 
			pushFollow(FOLLOW_cond_expression_in_for_stmt148);
			cond_expression();
			state._fsp--;

			match(input,28,FOLLOW_28_in_for_stmt150); 
			pushFollow(FOLLOW_assign_stmt_in_for_stmt152);
			assign_stmt();
			state._fsp--;

			match(input,22,FOLLOW_22_in_for_stmt154); 
			pushFollow(FOLLOW_block_stmt_in_for_stmt156);
			block_stmt();
			state._fsp--;

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
	// $ANTLR end "for_stmt"



	// $ANTLR start "if_stmt"
	// myInterp.g:45:1: if_stmt : if_then_stmt if_else_stmt[$if_then_stmt.exec_flag] ;
	public final void if_stmt() throws RecognitionException {
		int if_then_stmt1 =0;

		try {
			// myInterp.g:45:8: ( if_then_stmt if_else_stmt[$if_then_stmt.exec_flag] )
			// myInterp.g:46:2: if_then_stmt if_else_stmt[$if_then_stmt.exec_flag]
			{
			pushFollow(FOLLOW_if_then_stmt_in_if_stmt164);
			if_then_stmt1=if_then_stmt();
			state._fsp--;

			pushFollow(FOLLOW_if_else_stmt_in_if_stmt166);
			if_else_stmt(if_then_stmt1);
			state._fsp--;

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
	// $ANTLR end "if_stmt"



	// $ANTLR start "if_then_stmt"
	// myInterp.g:48:1: if_then_stmt returns [int exec_flag] : IF '(' cond_expression ')' block_stmt ;
	public final int if_then_stmt() throws RecognitionException {
		int exec_flag = 0;


		int cond_expression2 =0;

		try {
			// myInterp.g:49:24: ( IF '(' cond_expression ')' block_stmt )
			// myInterp.g:50:2: IF '(' cond_expression ')' block_stmt
			{
			match(input,IF,FOLLOW_IF_in_if_then_stmt179); 
			match(input,21,FOLLOW_21_in_if_then_stmt181); 
			pushFollow(FOLLOW_cond_expression_in_if_then_stmt183);
			cond_expression2=cond_expression();
			state._fsp--;

			match(input,22,FOLLOW_22_in_if_then_stmt185); 
			pushFollow(FOLLOW_block_stmt_in_if_then_stmt187);
			block_stmt();
			state._fsp--;

			 
			                  exec_flag = cond_expression2;
			              
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return exec_flag;
	}
	// $ANTLR end "if_then_stmt"



	// $ANTLR start "if_else_stmt"
	// myInterp.g:54:1: if_else_stmt[int flag] : ( ELSE block_stmt |);
	public final void if_else_stmt(int flag) throws RecognitionException {
		try {
			// myInterp.g:54:23: ( ELSE block_stmt |)
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ELSE) ) {
				alt5=1;
			}
			else if ( (LA5_0==FOR||LA5_0==IF||LA5_0==Identifier||LA5_0==31) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// myInterp.g:55:2: ELSE block_stmt
					{
					match(input,ELSE,FOLLOW_ELSE_in_if_else_stmt198); 
					pushFollow(FOLLOW_block_stmt_in_if_else_stmt200);
					block_stmt();
					state._fsp--;


					                  if (flag > 0) { System.out.println("Here\n"); }
					                  System.out.println(flag);

					              
					}
					break;
				case 2 :
					// myInterp.g:60:3: 
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
	// $ANTLR end "if_else_stmt"



	// $ANTLR start "block_stmt"
	// myInterp.g:62:1: block_stmt : '{' statements '}' ;
	public final void block_stmt() throws RecognitionException {
		try {
			// myInterp.g:62:11: ( '{' statements '}' )
			// myInterp.g:62:13: '{' statements '}'
			{
			match(input,30,FOLLOW_30_in_block_stmt212); 
			pushFollow(FOLLOW_statements_in_block_stmt214);
			statements();
			state._fsp--;

			match(input,31,FOLLOW_31_in_block_stmt216); 
			 if (TRACEON) System.out.println("block_stmt");
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
	// $ANTLR end "block_stmt"



	// $ANTLR start "assign_stmt"
	// myInterp.g:64:1: assign_stmt : Identifier '=' arith_expression ;
	public final void assign_stmt() throws RecognitionException {
		Token Identifier3=null;
		int arith_expression4 =0;

		try {
			// myInterp.g:64:12: ( Identifier '=' arith_expression )
			// myInterp.g:65:2: Identifier '=' arith_expression
			{
			Identifier3=(Token)match(input,Identifier,FOLLOW_Identifier_in_assign_stmt226); 
			match(input,29,FOLLOW_29_in_assign_stmt228); 
			pushFollow(FOLLOW_arith_expression_in_assign_stmt230);
			arith_expression4=arith_expression();
			state._fsp--;

			memory.put((Identifier3!=null?Identifier3.getText():null), new Integer(arith_expression4));
			        if (TRACEON)  System.out.println("assign_stmt:" + (Identifier3!=null?Identifier3.getText():null) +" <- " + arith_expression4); 
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
	// $ANTLR end "assign_stmt"



	// $ANTLR start "func_no_return_stmt"
	// myInterp.g:68:1: func_no_return_stmt : Identifier '(' STRING_LITERAL ( ',' arg )* ')' ;
	public final void func_no_return_stmt() throws RecognitionException {
		Token Identifier6=null;
		Token STRING_LITERAL7=null;
		float arg5 =0.0f;

		List<Float> args=new ArrayList<Float>(); 
		try {
			// myInterp.g:70:3: ( Identifier '(' STRING_LITERAL ( ',' arg )* ')' )
			// myInterp.g:70:3: Identifier '(' STRING_LITERAL ( ',' arg )* ')'
			{
			Identifier6=(Token)match(input,Identifier,FOLLOW_Identifier_in_func_no_return_stmt244); 
			match(input,21,FOLLOW_21_in_func_no_return_stmt246); 
			STRING_LITERAL7=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_func_no_return_stmt248); 
			// myInterp.g:70:33: ( ',' arg )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==25) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// myInterp.g:70:34: ',' arg
					{
					match(input,25,FOLLOW_25_in_func_no_return_stmt251); 
					pushFollow(FOLLOW_arg_in_func_no_return_stmt252);
					arg5=arg();
					state._fsp--;

					 if (TRACEON) {System.out.println(arg5);}   args.add(arg5);
					}
					break;

				default :
					break loop6;
				}
			}

			match(input,22,FOLLOW_22_in_func_no_return_stmt262); 

					if(TRACEON){
								System.out.println("Function NAME:" +(Identifier6!=null?Identifier6.getText():null));
					}
				
					if((Identifier6!=null?Identifier6.getText():null).equals("printf"))
					{
							String tmp = new String((STRING_LITERAL7!=null?STRING_LITERAL7.getText():null));
							tmp = tmp.substring(1,tmp.length()-1 ); //remove quotation mark
							int retD=1,retF=1;
							int index=0;

							while(retD!=-1 || retF!=-1)
							{
									retD = tmp.indexOf("%d");
									retF = tmp.indexOf("%f");

									if(TRACEON)
									{
											System.out.println("retD: "+retD);
											System.out.println("retF: "+retF);
									}
									
									if(index>=args.size()) 
									{
											if(retD!=-1 || retF!=-1)System.out.println("ERROR:  Number of argument  in printf is too less .");
											break;
									}


									if(retD!=-1 && (retF==-1 || retD<retF))
									{
												tmp = tmp.replaceFirst("%d",String.valueOf(Math.round(args.get(index++))));
									}
									else	if(retF!=-1 && (retD==-1 || retF<retD))
									{
												tmp = tmp.replaceFirst("%f", String.valueOf(args.get(index++) ) );
									}
									else{
										    System.out.println("ERROR: Number of argument in printf is too more.");
									}
							}

							System.out.println(tmp);
					}
					else if ((Identifier6!=null?Identifier6.getText():null).equals("scanf"))
					{
					   	System.out.println("SCANF: ");
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
	// $ANTLR end "func_no_return_stmt"



	// $ANTLR start "arg"
	// myInterp.g:124:1: arg returns [float value] : arith_expression ;
	public final float arg() throws RecognitionException {
		float value = 0.0f;


		int arith_expression8 =0;

		try {
			// myInterp.g:124:27: ( arith_expression )
			// myInterp.g:124:29: arith_expression
			{
			pushFollow(FOLLOW_arith_expression_in_arg276);
			arith_expression8=arith_expression();
			state._fsp--;

			value =arith_expression8;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "arg"



	// $ANTLR start "cond_expression"
	// myInterp.g:126:1: cond_expression returns [int result] : a= arith_expression ( RelationOP b= arith_expression )* ;
	public final int cond_expression() throws RecognitionException {
		int result = 0;


		Token RelationOP9=null;
		int a =0;
		int b =0;

		try {
			// myInterp.g:127:21: (a= arith_expression ( RelationOP b= arith_expression )* )
			// myInterp.g:128:2: a= arith_expression ( RelationOP b= arith_expression )*
			{
			pushFollow(FOLLOW_arith_expression_in_cond_expression293);
			a=arith_expression();
			state._fsp--;

			 result = a;
			// myInterp.g:129:2: ( RelationOP b= arith_expression )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==RelationOP) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// myInterp.g:130:3: RelationOP b= arith_expression
					{
					RelationOP9=(Token)match(input,RelationOP,FOLLOW_RelationOP_in_cond_expression302); 
					pushFollow(FOLLOW_arith_expression_in_cond_expression308);
					b=arith_expression();
					state._fsp--;

					 
						
															if((RelationOP9!=null?RelationOP9.getText():null).equals(">"))
															{
																	if(result > b) result = 1;
					                        else result = 0;
															}
															else	if((RelationOP9!=null?RelationOP9.getText():null).equals(">="))
															{
																	if(result >= b) result = 1;
					                        else result = 0;
															}
															else	if((RelationOP9!=null?RelationOP9.getText():null).equals("<"))
															{
																	if(result < b) result = 1;
					                        else result = 0;
															}
																else	if((RelationOP9!=null?RelationOP9.getText():null).equals("<="))
															{
																	if(result <= b) result = 1;
					                        else result = 0;
															}
															else	if((RelationOP9!=null?RelationOP9.getText():null).equals("=="))
															{
																	if(result == b) result = 1;
					                        else result = 0;
															}
															else	if((RelationOP9!=null?RelationOP9.getText():null).equals("!="))
															{
																	if(result != b) result = 1;
					                        else result = 0;
															}
					                 
					}
					break;

				default :
					break loop7;
				}
			}

			if(TRACEON){System.out.println("result:"+result);} 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "cond_expression"



	// $ANTLR start "arith_expression"
	// myInterp.g:165:1: arith_expression returns [int result] : a= multExpr ( '+' b= multExpr | '-' c= multExpr )* ;
	public final int arith_expression() throws RecognitionException {
		int result = 0;


		int a =0;
		int b =0;
		int c =0;

		try {
			// myInterp.g:166:21: (a= multExpr ( '+' b= multExpr | '-' c= multExpr )* )
			// myInterp.g:167:2: a= multExpr ( '+' b= multExpr | '-' c= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_arith_expression332);
			a=multExpr();
			state._fsp--;

			 result =a; 
			// myInterp.g:167:38: ( '+' b= multExpr | '-' c= multExpr )*
			loop8:
			while (true) {
				int alt8=3;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==24) ) {
					alt8=1;
				}
				else if ( (LA8_0==26) ) {
					alt8=2;
				}

				switch (alt8) {
				case 1 :
					// myInterp.g:168:3: '+' b= multExpr
					{
					match(input,24,FOLLOW_24_in_arith_expression340); 
					pushFollow(FOLLOW_multExpr_in_arith_expression346);
					b=multExpr();
					state._fsp--;

					result = result+b;
					}
					break;
				case 2 :
					// myInterp.g:169:5: '-' c= multExpr
					{
					match(input,26,FOLLOW_26_in_arith_expression354); 
					pushFollow(FOLLOW_multExpr_in_arith_expression360);
					c=multExpr();
					state._fsp--;

					result = result-c;
					}
					break;

				default :
					break loop8;
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
		return result;
	}
	// $ANTLR end "arith_expression"



	// $ANTLR start "multExpr"
	// myInterp.g:172:1: multExpr returns [int result] : a= signExpr ( '*' b= signExpr | '/' c= signExpr )* ;
	public final int multExpr() throws RecognitionException {
		int result = 0;


		int a =0;
		int b =0;
		int c =0;

		try {
			// myInterp.g:173:21: (a= signExpr ( '*' b= signExpr | '/' c= signExpr )* )
			// myInterp.g:174:2: a= signExpr ( '*' b= signExpr | '/' c= signExpr )*
			{
			pushFollow(FOLLOW_signExpr_in_multExpr382);
			a=signExpr();
			state._fsp--;

			 result =a; 
			// myInterp.g:174:38: ( '*' b= signExpr | '/' c= signExpr )*
			loop9:
			while (true) {
				int alt9=3;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==23) ) {
					alt9=1;
				}
				else if ( (LA9_0==27) ) {
					alt9=2;
				}

				switch (alt9) {
				case 1 :
					// myInterp.g:175:3: '*' b= signExpr
					{
					match(input,23,FOLLOW_23_in_multExpr390); 
					pushFollow(FOLLOW_signExpr_in_multExpr396);
					b=signExpr();
					state._fsp--;

					result = result*b;
					}
					break;
				case 2 :
					// myInterp.g:176:5: '/' c= signExpr
					{
					match(input,27,FOLLOW_27_in_multExpr404); 
					pushFollow(FOLLOW_signExpr_in_multExpr410);
					c=signExpr();
					state._fsp--;

					result = result/c;
					}
					break;

				default :
					break loop9;
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
		return result;
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "signExpr"
	// myInterp.g:179:1: signExpr returns [int result] : (a= primaryExpr | '-' primaryExpr );
	public final int signExpr() throws RecognitionException {
		int result = 0;


		int a =0;

		try {
			// myInterp.g:180:21: (a= primaryExpr | '-' primaryExpr )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==Floating_point_constant||(LA10_0 >= Identifier && LA10_0 <= Integer_constant)||(LA10_0 >= 20 && LA10_0 <= 21)) ) {
				alt10=1;
			}
			else if ( (LA10_0==26) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// myInterp.g:181:2: a= primaryExpr
					{
					pushFollow(FOLLOW_primaryExpr_in_signExpr432);
					a=primaryExpr();
					state._fsp--;

					 result =a; 
					}
					break;
				case 2 :
					// myInterp.g:182:4: '-' primaryExpr
					{
					match(input,26,FOLLOW_26_in_signExpr439); 
					pushFollow(FOLLOW_primaryExpr_in_signExpr441);
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
		return result;
	}
	// $ANTLR end "signExpr"



	// $ANTLR start "primaryExpr"
	// myInterp.g:184:1: primaryExpr returns [int result] : ( Integer_constant | Floating_point_constant | Identifier | '&' Identifier | '(' arith_expression ')' );
	public final int primaryExpr() throws RecognitionException {
		int result = 0;


		Token Integer_constant10=null;
		Token Identifier11=null;
		int arith_expression12 =0;

		try {
			// myInterp.g:185:21: ( Integer_constant | Floating_point_constant | Identifier | '&' Identifier | '(' arith_expression ')' )
			int alt11=5;
			switch ( input.LA(1) ) {
			case Integer_constant:
				{
				alt11=1;
				}
				break;
			case Floating_point_constant:
				{
				alt11=2;
				}
				break;
			case Identifier:
				{
				alt11=3;
				}
				break;
			case 20:
				{
				alt11=4;
				}
				break;
			case 21:
				{
				alt11=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// myInterp.g:186:2: Integer_constant
					{
					Integer_constant10=(Token)match(input,Integer_constant,FOLLOW_Integer_constant_in_primaryExpr453); 
					 result =Integer.parseInt((Integer_constant10!=null?Integer_constant10.getText():null)); 
					}
					break;
				case 2 :
					// myInterp.g:187:4: Floating_point_constant
					{
					match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_primaryExpr460); 
					}
					break;
				case 3 :
					// myInterp.g:188:4: Identifier
					{
					Identifier11=(Token)match(input,Identifier,FOLLOW_Identifier_in_primaryExpr465); 
					 result =  (Integer)memory.get((Identifier11!=null?Identifier11.getText():null)); 
					}
					break;
				case 4 :
					// myInterp.g:189:4: '&' Identifier
					{
					match(input,20,FOLLOW_20_in_primaryExpr472); 
					match(input,Identifier,FOLLOW_Identifier_in_primaryExpr474); 
					}
					break;
				case 5 :
					// myInterp.g:190:4: '(' arith_expression ')'
					{
					match(input,21,FOLLOW_21_in_primaryExpr479); 
					pushFollow(FOLLOW_arith_expression_in_primaryExpr481);
					arith_expression12=arith_expression();
					state._fsp--;

					match(input,22,FOLLOW_22_in_primaryExpr483); 
					result =arith_expression12;
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
		return result;
	}
	// $ANTLR end "primaryExpr"

	// Delegated rules



	public static final BitSet FOLLOW_VOID_in_program35 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MAIN_in_program37 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_program39 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_program41 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_program43 = new BitSet(new long[]{0x0000000080003B10L});
	public static final BitSet FOLLOW_declarations_in_program45 = new BitSet(new long[]{0x0000000080002A00L});
	public static final BitSet FOLLOW_statements_in_program47 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_program49 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declarations59 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_declarations61 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_declarations63 = new BitSet(new long[]{0x0000000000001110L});
	public static final BitSet FOLLOW_declarations_in_declarations65 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type80 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type92 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements101 = new BitSet(new long[]{0x0000000000002A00L});
	public static final BitSet FOLLOW_statements_in_statements103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_stmt_in_statement113 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_statement115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stmt_in_statement120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_no_return_stmt_in_statement125 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_statement127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_stmt_in_statement132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_for_stmt140 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_for_stmt142 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_assign_stmt_in_for_stmt144 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_for_stmt146 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_cond_expression_in_for_stmt148 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_for_stmt150 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_assign_stmt_in_for_stmt152 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_for_stmt154 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_block_stmt_in_for_stmt156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_then_stmt_in_if_stmt164 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_if_else_stmt_in_if_stmt166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_then_stmt179 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_if_then_stmt181 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_cond_expression_in_if_then_stmt183 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_if_then_stmt185 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_block_stmt_in_if_then_stmt187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_if_else_stmt198 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_block_stmt_in_if_else_stmt200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_block_stmt212 = new BitSet(new long[]{0x0000000080002A00L});
	public static final BitSet FOLLOW_statements_in_block_stmt214 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_block_stmt216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assign_stmt226 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_assign_stmt228 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_arith_expression_in_assign_stmt230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_func_no_return_stmt244 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_func_no_return_stmt246 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_func_no_return_stmt248 = new BitSet(new long[]{0x0000000002400000L});
	public static final BitSet FOLLOW_25_in_func_no_return_stmt251 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_arg_in_func_no_return_stmt252 = new BitSet(new long[]{0x0000000002400000L});
	public static final BitSet FOLLOW_22_in_func_no_return_stmt262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expression_in_arg276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expression_in_cond_expression293 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_RelationOP_in_cond_expression302 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_arith_expression_in_cond_expression308 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression332 = new BitSet(new long[]{0x0000000005000002L});
	public static final BitSet FOLLOW_24_in_arith_expression340 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression346 = new BitSet(new long[]{0x0000000005000002L});
	public static final BitSet FOLLOW_26_in_arith_expression354 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression360 = new BitSet(new long[]{0x0000000005000002L});
	public static final BitSet FOLLOW_signExpr_in_multExpr382 = new BitSet(new long[]{0x0000000008800002L});
	public static final BitSet FOLLOW_23_in_multExpr390 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_signExpr_in_multExpr396 = new BitSet(new long[]{0x0000000008800002L});
	public static final BitSet FOLLOW_27_in_multExpr404 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_signExpr_in_multExpr410 = new BitSet(new long[]{0x0000000008800002L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_signExpr439 = new BitSet(new long[]{0x0000000000306400L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_primaryExpr453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Floating_point_constant_in_primaryExpr460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_primaryExpr472 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_primaryExpr479 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_arith_expression_in_primaryExpr481 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_primaryExpr483 = new BitSet(new long[]{0x0000000000000002L});
}
