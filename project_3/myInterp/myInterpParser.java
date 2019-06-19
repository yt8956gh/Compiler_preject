// $ANTLR 3.5.2 myInterp.g 2019-06-19 15:17:17

    import java.util.HashMap;
		import java.util.Scanner;


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
			HashMap dataType = new HashMap();



	// $ANTLR start "program"
	// myInterp.g:18:1: program : VOID MAIN '(' ')' '{' declarations statements[1] '}' ;
	public final void program() throws RecognitionException {
		try {
			// myInterp.g:18:8: ( VOID MAIN '(' ')' '{' declarations statements[1] '}' )
			// myInterp.g:19:2: VOID MAIN '(' ')' '{' declarations statements[1] '}'
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
			statements(1);
			state._fsp--;

			match(input,31,FOLLOW_31_in_program50); 
			 if (TRACEON)
					      System.out.println("VOID MAIN () {declarations statements[1]}");
			        
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
	// myInterp.g:23:1: declarations : ( type Identifier ';' declarations |);
	public final void declarations() throws RecognitionException {
		Token Identifier1=null;
		ParserRuleReturnScope type2 =null;

		try {
			// myInterp.g:23:13: ( type Identifier ';' declarations |)
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==CHAR||LA1_0==FLOAT||LA1_0==INT) ) {
				alt1=1;
			}
			else if ( (LA1_0==IF||LA1_0==Identifier||LA1_0==31) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// myInterp.g:24:2: type Identifier ';' declarations
					{
					pushFollow(FOLLOW_type_in_declarations60);
					type2=type();
					state._fsp--;

					Identifier1=(Token)match(input,Identifier,FOLLOW_Identifier_in_declarations62); 
					match(input,28,FOLLOW_28_in_declarations64); 
					pushFollow(FOLLOW_declarations_in_declarations66);
					declarations();
					state._fsp--;


							 if (TRACEON) {System.out.println("declarations: type Identifier : declarations");}
							  dataType.put((Identifier1!=null?Identifier1.getText():null), new String((type2!=null?input.toString(type2.start,type2.stop):null)));
					}
					break;
				case 2 :
					// myInterp.g:27:4: 
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


	public static class type_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "type"
	// myInterp.g:31:1: type : ( INT | CHAR | FLOAT );
	public final myInterpParser.type_return type() throws RecognitionException {
		myInterpParser.type_return retval = new myInterpParser.type_return();
		retval.start = input.LT(1);

		try {
			// myInterp.g:31:5: ( INT | CHAR | FLOAT )
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
					// myInterp.g:32:2: INT
					{
					match(input,INT,FOLLOW_INT_in_type81); 
					 if (TRACEON) System.out.println("type: INT"); 
					}
					break;
				case 2 :
					// myInterp.g:33:4: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_type88); 
					}
					break;
				case 3 :
					// myInterp.g:34:4: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type93); 
					if (TRACEON) System.out.println("type: FLOAT"); 
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"



	// $ANTLR start "statements"
	// myInterp.g:36:1: statements[int flag] : ( statement[flag] statements[flag] |);
	public final void statements(int flag) throws RecognitionException {
		try {
			// myInterp.g:36:21: ( statement[flag] statements[flag] |)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==IF||LA3_0==Identifier) ) {
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
					// myInterp.g:36:23: statement[flag] statements[flag]
					{
					pushFollow(FOLLOW_statement_in_statements103);
					statement(flag);
					state._fsp--;

					pushFollow(FOLLOW_statements_in_statements106);
					statements(flag);
					state._fsp--;

					}
					break;
				case 2 :
					// myInterp.g:36:57: 
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
	// myInterp.g:38:1: statement[int flag] : ( assign_stmt[flag] ';' | if_stmt[flag] | func_no_return_stmt[flag] ';' );
	public final void statement(int flag) throws RecognitionException {
		try {
			// myInterp.g:38:20: ( assign_stmt[flag] ';' | if_stmt[flag] | func_no_return_stmt[flag] ';' )
			int alt4=3;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==Identifier) ) {
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
			else if ( (LA4_0==IF) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// myInterp.g:39:2: assign_stmt[flag] ';'
					{
					pushFollow(FOLLOW_assign_stmt_in_statement118);
					assign_stmt(flag);
					state._fsp--;

					match(input,28,FOLLOW_28_in_statement121); 
					}
					break;
				case 2 :
					// myInterp.g:40:4: if_stmt[flag]
					{
					pushFollow(FOLLOW_if_stmt_in_statement126);
					if_stmt(flag);
					state._fsp--;

					}
					break;
				case 3 :
					// myInterp.g:41:4: func_no_return_stmt[flag] ';'
					{
					pushFollow(FOLLOW_func_no_return_stmt_in_statement132);
					func_no_return_stmt(flag);
					state._fsp--;

					match(input,28,FOLLOW_28_in_statement135); 
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



	// $ANTLR start "if_stmt"
	// myInterp.g:44:1: if_stmt[int flag] : if_then_stmt if_else_stmt[if_else_stmt_flag] ;
	public final void if_stmt(int flag) throws RecognitionException {
		int if_then_stmt3 =0;

		int if_else_stmt_flag=0; 
		try {
			// myInterp.g:45:33: ( if_then_stmt if_else_stmt[if_else_stmt_flag] )
			// myInterp.g:46:2: if_then_stmt if_else_stmt[if_else_stmt_flag]
			{
			pushFollow(FOLLOW_if_then_stmt_in_if_stmt149);
			if_then_stmt3=if_then_stmt();
			state._fsp--;

			 if(if_then_stmt3==0){if_else_stmt_flag=1; } 
			pushFollow(FOLLOW_if_else_stmt_in_if_stmt152);
			if_else_stmt(if_else_stmt_flag);
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
	// myInterp.g:48:1: if_then_stmt returns [int exec_flag] : IF '(' cond_expression ')' block_stmt[$exec_flag] ;
	public final int if_then_stmt() throws RecognitionException {
		int exec_flag = 0;


		float cond_expression4 =0.0f;

		try {
			// myInterp.g:49:24: ( IF '(' cond_expression ')' block_stmt[$exec_flag] )
			// myInterp.g:50:2: IF '(' cond_expression ')' block_stmt[$exec_flag]
			{
			match(input,IF,FOLLOW_IF_in_if_then_stmt165); 
			match(input,21,FOLLOW_21_in_if_then_stmt167); 
			pushFollow(FOLLOW_cond_expression_in_if_then_stmt169);
			cond_expression4=cond_expression();
			state._fsp--;

			match(input,22,FOLLOW_22_in_if_then_stmt171); 
			 exec_flag = (int)cond_expression4; 
			pushFollow(FOLLOW_block_stmt_in_if_then_stmt175);
			block_stmt(exec_flag);
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
		return exec_flag;
	}
	// $ANTLR end "if_then_stmt"



	// $ANTLR start "if_else_stmt"
	// myInterp.g:52:1: if_else_stmt[int flag] : ( ELSE block_stmt[flag] |);
	public final void if_else_stmt(int flag) throws RecognitionException {
		try {
			// myInterp.g:52:23: ( ELSE block_stmt[flag] |)
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ELSE) ) {
				alt5=1;
			}
			else if ( (LA5_0==IF||LA5_0==Identifier||LA5_0==31) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// myInterp.g:53:2: ELSE block_stmt[flag]
					{
					match(input,ELSE,FOLLOW_ELSE_in_if_else_stmt185); 
					pushFollow(FOLLOW_block_stmt_in_if_else_stmt187);
					block_stmt(flag);
					state._fsp--;



									if(TRACEON)
									{
											 if (flag > 0) { System.out.println("Here\n"); }
					             System.out.println(flag);
									}

					}
					break;
				case 2 :
					// myInterp.g:61:3: 
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
	// myInterp.g:63:1: block_stmt[int flag] : '{' statements[flag] '}' ;
	public final void block_stmt(int flag) throws RecognitionException {
		try {
			// myInterp.g:63:21: ( '{' statements[flag] '}' )
			// myInterp.g:63:23: '{' statements[flag] '}'
			{
			match(input,30,FOLLOW_30_in_block_stmt201); 
			pushFollow(FOLLOW_statements_in_block_stmt203);
			statements(flag);
			state._fsp--;

			match(input,31,FOLLOW_31_in_block_stmt206); 
			 if (TRACEON) System.out.println("Flag["+flag+"] block_stmt");
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
	// myInterp.g:65:1: assign_stmt[int flag] : Identifier '=' arith_expression ;
	public final void assign_stmt(int flag) throws RecognitionException {
		Token Identifier5=null;
		Float arith_expression6 =null;

		try {
			// myInterp.g:65:22: ( Identifier '=' arith_expression )
			// myInterp.g:66:2: Identifier '=' arith_expression
			{
			Identifier5=(Token)match(input,Identifier,FOLLOW_Identifier_in_assign_stmt217); 
			match(input,29,FOLLOW_29_in_assign_stmt219); 
			pushFollow(FOLLOW_arith_expression_in_assign_stmt221);
			arith_expression6=arith_expression();
			state._fsp--;


							if (flag!=0) {memory.put((Identifier5!=null?Identifier5.getText():null), new Float(arith_expression6));}
			        if (TRACEON)  {System.out.println("Flag["+flag+"]assign_stmt:" + (Identifier5!=null?Identifier5.getText():null) +" <- " + arith_expression6); }
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
	// myInterp.g:70:1: func_no_return_stmt[int flag] : Identifier '(' STRING_LITERAL ( ',' arg )* ')' ;
	public final void func_no_return_stmt(int flag) throws RecognitionException {
		Token Identifier8=null;
		Token STRING_LITERAL9=null;
		ParserRuleReturnScope arg7 =null;


			
			List<Float> args=new ArrayList<Float>(); 
			List<String> refs=new ArrayList<String>(); 

		try {
			// myInterp.g:76:3: ( Identifier '(' STRING_LITERAL ( ',' arg )* ')' )
			// myInterp.g:76:3: Identifier '(' STRING_LITERAL ( ',' arg )* ')'
			{
			Identifier8=(Token)match(input,Identifier,FOLLOW_Identifier_in_func_no_return_stmt236); 
			match(input,21,FOLLOW_21_in_func_no_return_stmt238); 
			STRING_LITERAL9=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_func_no_return_stmt240); 
			// myInterp.g:76:33: ( ',' arg )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==25) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// myInterp.g:76:34: ',' arg
					{
					match(input,25,FOLLOW_25_in_func_no_return_stmt243); 
					pushFollow(FOLLOW_arg_in_func_no_return_stmt244);
					arg7=arg();
					state._fsp--;


								if((arg7!=null?((myInterpParser.arg_return)arg7).mode:0)==1){
								 	if(TRACEON)	{System.out.println((arg7!=null?((myInterpParser.arg_return)arg7).argName:null));}  
									refs.add((arg7!=null?((myInterpParser.arg_return)arg7).argName:null));
								}
								else{
									if(TRACEON)	{System.out.println((arg7!=null?((myInterpParser.arg_return)arg7).value:0.0f));}  
									args.add((arg7!=null?((myInterpParser.arg_return)arg7).value:0.0f)); 
								}
					 
					}
					break;

				default :
					break loop6;
				}
			}

			match(input,22,FOLLOW_22_in_func_no_return_stmt250); 

					if(TRACEON){
								System.out.println("Flag["+flag+"]Function NAME:" +(Identifier8!=null?Identifier8.getText():null));
					}

					if(flag==0)
					{
						System.out.println((Identifier8!=null?Identifier8.getText():null)+": not work.");
					}
					else if((Identifier8!=null?Identifier8.getText():null).equals("printf"))
					{
							String tmp = new String((STRING_LITERAL9!=null?STRING_LITERAL9.getText():null));
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
												tmp = tmp.replaceFirst("%d",String.valueOf((int)Math.floor(args.get(index++))));
									}
									else	if(retF!=-1 && (retD==-1 || retF<retD))
									{
												tmp = tmp.replaceFirst("%f", String.valueOf(args.get(index++) ) );
									}
									else{
										    System.out.println("ERROR: Number of argument in printf is too more.");
									}
							}

							int newLineIndex=0;
							String fragment=null;

							while(newLineIndex!=-1){

									newLineIndex = tmp.indexOf("\\n");

									if(newLineIndex==-1) {fragment = tmp;}
									else{
										fragment = tmp.substring(0,newLineIndex);
										tmp = tmp.substring(newLineIndex+2, tmp.length());
									}
									
									System.out.println(fragment);
							}
							
					}
					else if ((Identifier8!=null?Identifier8.getText():null).equals("scanf"))
					{
					   	if(TRACEON)	System.out.println("SCANF: ");
							String str = new String((STRING_LITERAL9!=null?STRING_LITERAL9.getText():null)), argType=null;				
							str = str.substring(1,str.length()-1 ); //remove quotation mark
							int retD=1,retF=1,index=0,tmpInt=0;
							float tmpFloat=0.0f;
							Scanner scanner = new Scanner(System.in);

							while(retD!=-1 || retF!=-1)
							{
									retD = str.indexOf("%d");
									retF = str.indexOf("%f");


									if(TRACEON)
									{
											System.out.println("retD: "+retD);
											System.out.println("retF: "+retF);
											System.out.println("INDEX: "+index);
									}
									
									if(index>=refs.size()) 
									{
											if(retD!=-1 || retF!=-1)System.out.println("ERROR:  Number of argument  in scanf is too less .");
											break;
									}

									if(retD!=-1 && (retF==-1 || retD<retF)) // for int 
									{
												tmpInt=scanner.nextInt();
												argType = (String)dataType.get(refs.get(index));

												tmpFloat = (float) tmpInt;

												if(argType.equals("int")){
														memory.put(refs.get(index), tmpFloat);
												}
												else{
														memory.put(refs.get(index), tmpFloat);
												}

												str = str.substring(retD+2,str.length());

												index++;
									}
									else	if(retF!=-1 && (retD==-1 || retF<retD)) // for float
									{
												tmpFloat=scanner.nextFloat();

												argType = (String)dataType.get(refs.get(index));

												if(argType.equals("int")){
															memory.put(refs.get(index), new Float(Math.floor(tmpFloat)));
												}
												else{
															memory.put(refs.get(index), new Float(tmpFloat));
												}

											 str = str.substring(retF+2,str.length());
											index++;
									}
									else{
										    System.out.println("ERROR: Number of argument in scanf is too more.");
									}
							}
				 	} //else-if 

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


	public static class arg_return extends ParserRuleReturnScope {
		public float value;
		public String argName;
		public int mode;
	};


	// $ANTLR start "arg"
	// myInterp.g:221:1: arg returns [float value, String argName, int mode] : ( arith_expression | '&' Identifier );
	public final myInterpParser.arg_return arg() throws RecognitionException {
		myInterpParser.arg_return retval = new myInterpParser.arg_return();
		retval.start = input.LT(1);

		Token Identifier11=null;
		Float arith_expression10 =null;

		try {
			// myInterp.g:221:53: ( arith_expression | '&' Identifier )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==Floating_point_constant||(LA7_0 >= Identifier && LA7_0 <= Integer_constant)||LA7_0==21||LA7_0==26) ) {
				alt7=1;
			}
			else if ( (LA7_0==20) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// myInterp.g:221:55: arith_expression
					{
					pushFollow(FOLLOW_arith_expression_in_arg264);
					arith_expression10=arith_expression();
					state._fsp--;

					retval.value =arith_expression10; retval.mode =0;
					}
					break;
				case 2 :
					// myInterp.g:222:2: '&' Identifier
					{
					match(input,20,FOLLOW_20_in_arg268); 
					Identifier11=(Token)match(input,Identifier,FOLLOW_Identifier_in_arg269); 
					retval.argName =(Identifier11!=null?Identifier11.getText():null); retval.mode =1;
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arg"



	// $ANTLR start "cond_expression"
	// myInterp.g:225:1: cond_expression returns [float result] : a= arith_expression ( RelationOP b= arith_expression )* ;
	public final float cond_expression() throws RecognitionException {
		float result = 0.0f;


		Token RelationOP12=null;
		Float a =null;
		Float b =null;

		try {
			// myInterp.g:226:23: (a= arith_expression ( RelationOP b= arith_expression )* )
			// myInterp.g:227:2: a= arith_expression ( RelationOP b= arith_expression )*
			{
			pushFollow(FOLLOW_arith_expression_in_cond_expression287);
			a=arith_expression();
			state._fsp--;

			 result = a;
			// myInterp.g:228:2: ( RelationOP b= arith_expression )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==RelationOP) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// myInterp.g:229:3: RelationOP b= arith_expression
					{
					RelationOP12=(Token)match(input,RelationOP,FOLLOW_RelationOP_in_cond_expression296); 
					pushFollow(FOLLOW_arith_expression_in_cond_expression302);
					b=arith_expression();
					state._fsp--;

					 
						
															if((RelationOP12!=null?RelationOP12.getText():null).equals(">"))
															{
																	if(result > b) result = 1;
					                        else result = 0;
															}
															else	if((RelationOP12!=null?RelationOP12.getText():null).equals(">="))
															{
																	if(result >= b) result = 1;
					                        else result = 0;
															}
															else	if((RelationOP12!=null?RelationOP12.getText():null).equals("<"))
															{
																	if(result < b) result = 1;
					                        else result = 0;
															}
																else	if((RelationOP12!=null?RelationOP12.getText():null).equals("<="))
															{
																	if(result <= b) result = 1;
					                        else result = 0;
															}
															else	if((RelationOP12!=null?RelationOP12.getText():null).equals("=="))
															{
																	if(result == b) result = 1;
					                        else result = 0;
															}
															else	if((RelationOP12!=null?RelationOP12.getText():null).equals("!="))
															{
																	if(result != b) result = 1;
					                        else result = 0;
															}
					                 
					}
					break;

				default :
					break loop8;
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
	// myInterp.g:264:1: arith_expression returns [Float result] : a= multExpr ( '+' b= multExpr | '-' c= multExpr )* ;
	public final Float arith_expression() throws RecognitionException {
		Float result = null;


		Float a =null;
		Float b =null;
		Float c =null;

		try {
			// myInterp.g:265:23: (a= multExpr ( '+' b= multExpr | '-' c= multExpr )* )
			// myInterp.g:266:2: a= multExpr ( '+' b= multExpr | '-' c= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_arith_expression326);
			a=multExpr();
			state._fsp--;

			 result =a; 
			// myInterp.g:266:38: ( '+' b= multExpr | '-' c= multExpr )*
			loop9:
			while (true) {
				int alt9=3;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==24) ) {
					alt9=1;
				}
				else if ( (LA9_0==26) ) {
					alt9=2;
				}

				switch (alt9) {
				case 1 :
					// myInterp.g:267:3: '+' b= multExpr
					{
					match(input,24,FOLLOW_24_in_arith_expression334); 
					pushFollow(FOLLOW_multExpr_in_arith_expression340);
					b=multExpr();
					state._fsp--;

					result = result+b;
					}
					break;
				case 2 :
					// myInterp.g:268:5: '-' c= multExpr
					{
					match(input,26,FOLLOW_26_in_arith_expression348); 
					pushFollow(FOLLOW_multExpr_in_arith_expression354);
					c=multExpr();
					state._fsp--;

					result = result-c;
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
	// $ANTLR end "arith_expression"



	// $ANTLR start "multExpr"
	// myInterp.g:271:1: multExpr returns [Float result] : a= signExpr ( '*' b= signExpr | '/' c= signExpr )* ;
	public final Float multExpr() throws RecognitionException {
		Float result = null;


		Float a =null;
		Float b =null;
		Float c =null;

		try {
			// myInterp.g:272:23: (a= signExpr ( '*' b= signExpr | '/' c= signExpr )* )
			// myInterp.g:273:2: a= signExpr ( '*' b= signExpr | '/' c= signExpr )*
			{
			pushFollow(FOLLOW_signExpr_in_multExpr376);
			a=signExpr();
			state._fsp--;

			 result =a; 
			// myInterp.g:273:38: ( '*' b= signExpr | '/' c= signExpr )*
			loop10:
			while (true) {
				int alt10=3;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==23) ) {
					alt10=1;
				}
				else if ( (LA10_0==27) ) {
					alt10=2;
				}

				switch (alt10) {
				case 1 :
					// myInterp.g:274:3: '*' b= signExpr
					{
					match(input,23,FOLLOW_23_in_multExpr384); 
					pushFollow(FOLLOW_signExpr_in_multExpr390);
					b=signExpr();
					state._fsp--;

					result = result*b;
					}
					break;
				case 2 :
					// myInterp.g:275:5: '/' c= signExpr
					{
					match(input,27,FOLLOW_27_in_multExpr398); 
					pushFollow(FOLLOW_signExpr_in_multExpr404);
					c=signExpr();
					state._fsp--;

					result = result/c;
					}
					break;

				default :
					break loop10;
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
	// myInterp.g:278:1: signExpr returns [Float result] : (a= primaryExpr | '-' primaryExpr );
	public final Float signExpr() throws RecognitionException {
		Float result = null;


		Float a =null;

		try {
			// myInterp.g:279:23: (a= primaryExpr | '-' primaryExpr )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==Floating_point_constant||(LA11_0 >= Identifier && LA11_0 <= Integer_constant)||LA11_0==21) ) {
				alt11=1;
			}
			else if ( (LA11_0==26) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// myInterp.g:280:2: a= primaryExpr
					{
					pushFollow(FOLLOW_primaryExpr_in_signExpr426);
					a=primaryExpr();
					state._fsp--;

					 result =a; 
					}
					break;
				case 2 :
					// myInterp.g:281:4: '-' primaryExpr
					{
					match(input,26,FOLLOW_26_in_signExpr433); 
					pushFollow(FOLLOW_primaryExpr_in_signExpr435);
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
	// myInterp.g:283:1: primaryExpr returns [Float result] : ( Integer_constant | Floating_point_constant | Identifier | '(' arith_expression ')' );
	public final Float primaryExpr() throws RecognitionException {
		Float result = null;


		Token Integer_constant13=null;
		Token Floating_point_constant14=null;
		Token Identifier15=null;
		Float arith_expression16 =null;

		try {
			// myInterp.g:284:23: ( Integer_constant | Floating_point_constant | Identifier | '(' arith_expression ')' )
			int alt12=4;
			switch ( input.LA(1) ) {
			case Integer_constant:
				{
				alt12=1;
				}
				break;
			case Floating_point_constant:
				{
				alt12=2;
				}
				break;
			case Identifier:
				{
				alt12=3;
				}
				break;
			case 21:
				{
				alt12=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// myInterp.g:285:2: Integer_constant
					{
					Integer_constant13=(Token)match(input,Integer_constant,FOLLOW_Integer_constant_in_primaryExpr447); 
					 result =Float.parseFloat((Integer_constant13!=null?Integer_constant13.getText():null)); 
					}
					break;
				case 2 :
					// myInterp.g:286:4: Floating_point_constant
					{
					Floating_point_constant14=(Token)match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_primaryExpr454); 
					 result = Float.parseFloat((Floating_point_constant14!=null?Floating_point_constant14.getText():null)); 
					}
					break;
				case 3 :
					// myInterp.g:287:4: Identifier
					{
					Identifier15=(Token)match(input,Identifier,FOLLOW_Identifier_in_primaryExpr461); 
					 result =  (Float)memory.get((Identifier15!=null?Identifier15.getText():null)); 
					}
					break;
				case 4 :
					// myInterp.g:288:4: '(' arith_expression ')'
					{
					match(input,21,FOLLOW_21_in_primaryExpr468); 
					pushFollow(FOLLOW_arith_expression_in_primaryExpr470);
					arith_expression16=arith_expression();
					state._fsp--;

					match(input,22,FOLLOW_22_in_primaryExpr472); 
					result =arith_expression16;
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
	public static final BitSet FOLLOW_30_in_program43 = new BitSet(new long[]{0x0000000080003910L});
	public static final BitSet FOLLOW_declarations_in_program45 = new BitSet(new long[]{0x0000000080002800L});
	public static final BitSet FOLLOW_statements_in_program47 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_program50 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declarations60 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_declarations62 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_declarations64 = new BitSet(new long[]{0x0000000000001110L});
	public static final BitSet FOLLOW_declarations_in_declarations66 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type81 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type88 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements103 = new BitSet(new long[]{0x0000000000002800L});
	public static final BitSet FOLLOW_statements_in_statements106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_stmt_in_statement118 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_statement121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stmt_in_statement126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_no_return_stmt_in_statement132 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_statement135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_then_stmt_in_if_stmt149 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_if_else_stmt_in_if_stmt152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_then_stmt165 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_if_then_stmt167 = new BitSet(new long[]{0x0000000004206400L});
	public static final BitSet FOLLOW_cond_expression_in_if_then_stmt169 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_if_then_stmt171 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_block_stmt_in_if_then_stmt175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_if_else_stmt185 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_block_stmt_in_if_else_stmt187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_block_stmt201 = new BitSet(new long[]{0x0000000080002800L});
	public static final BitSet FOLLOW_statements_in_block_stmt203 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_block_stmt206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assign_stmt217 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_assign_stmt219 = new BitSet(new long[]{0x0000000004206400L});
	public static final BitSet FOLLOW_arith_expression_in_assign_stmt221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_func_no_return_stmt236 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_func_no_return_stmt238 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_func_no_return_stmt240 = new BitSet(new long[]{0x0000000002400000L});
	public static final BitSet FOLLOW_25_in_func_no_return_stmt243 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_arg_in_func_no_return_stmt244 = new BitSet(new long[]{0x0000000002400000L});
	public static final BitSet FOLLOW_22_in_func_no_return_stmt250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expression_in_arg264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_arg268 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_arg269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expression_in_cond_expression287 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_RelationOP_in_cond_expression296 = new BitSet(new long[]{0x0000000004206400L});
	public static final BitSet FOLLOW_arith_expression_in_cond_expression302 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression326 = new BitSet(new long[]{0x0000000005000002L});
	public static final BitSet FOLLOW_24_in_arith_expression334 = new BitSet(new long[]{0x0000000004206400L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression340 = new BitSet(new long[]{0x0000000005000002L});
	public static final BitSet FOLLOW_26_in_arith_expression348 = new BitSet(new long[]{0x0000000004206400L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression354 = new BitSet(new long[]{0x0000000005000002L});
	public static final BitSet FOLLOW_signExpr_in_multExpr376 = new BitSet(new long[]{0x0000000008800002L});
	public static final BitSet FOLLOW_23_in_multExpr384 = new BitSet(new long[]{0x0000000004206400L});
	public static final BitSet FOLLOW_signExpr_in_multExpr390 = new BitSet(new long[]{0x0000000008800002L});
	public static final BitSet FOLLOW_27_in_multExpr398 = new BitSet(new long[]{0x0000000004206400L});
	public static final BitSet FOLLOW_signExpr_in_multExpr404 = new BitSet(new long[]{0x0000000008800002L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_signExpr433 = new BitSet(new long[]{0x0000000000206400L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_primaryExpr447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Floating_point_constant_in_primaryExpr454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_primaryExpr468 = new BitSet(new long[]{0x0000000004206400L});
	public static final BitSet FOLLOW_arith_expression_in_primaryExpr470 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_primaryExpr472 = new BitSet(new long[]{0x0000000000000002L});
}
