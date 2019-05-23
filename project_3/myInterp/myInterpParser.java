// $ANTLR 3.5.2 myInterp.g 2019-05-24 00:08:45

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
	// myInterp.g:18:1: program : VOID MAIN '(' ')' '{' declarations statements '}' ;
	public final void program() throws RecognitionException {
		try {
			// myInterp.g:18:8: ( VOID MAIN '(' ')' '{' declarations statements '}' )
			// myInterp.g:19:2: VOID MAIN '(' ')' '{' declarations statements '}'
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
					// myInterp.g:24:2: type Identifier ';' declarations
					{
					pushFollow(FOLLOW_type_in_declarations59);
					type2=type();
					state._fsp--;

					Identifier1=(Token)match(input,Identifier,FOLLOW_Identifier_in_declarations61); 
					match(input,28,FOLLOW_28_in_declarations63); 
					pushFollow(FOLLOW_declarations_in_declarations65);
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
					match(input,INT,FOLLOW_INT_in_type80); 
					 if (TRACEON) System.out.println("type: INT"); 
					}
					break;
				case 2 :
					// myInterp.g:33:4: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_type87); 
					}
					break;
				case 3 :
					// myInterp.g:34:4: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type92); 
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
	// myInterp.g:36:1: statements : ( statement statements |);
	public final void statements() throws RecognitionException {
		try {
			// myInterp.g:36:11: ( statement statements |)
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
					// myInterp.g:36:13: statement statements
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
					// myInterp.g:36:35: 
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
	// myInterp.g:38:1: statement : ( assign_stmt ';' | if_stmt | func_no_return_stmt ';' | for_stmt );
	public final void statement() throws RecognitionException {
		try {
			// myInterp.g:38:10: ( assign_stmt ';' | if_stmt | func_no_return_stmt ';' | for_stmt )
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
					// myInterp.g:39:2: assign_stmt ';'
					{
					pushFollow(FOLLOW_assign_stmt_in_statement113);
					assign_stmt();
					state._fsp--;

					match(input,28,FOLLOW_28_in_statement115); 
					}
					break;
				case 2 :
					// myInterp.g:40:4: if_stmt
					{
					pushFollow(FOLLOW_if_stmt_in_statement120);
					if_stmt();
					state._fsp--;

					}
					break;
				case 3 :
					// myInterp.g:41:4: func_no_return_stmt ';'
					{
					pushFollow(FOLLOW_func_no_return_stmt_in_statement125);
					func_no_return_stmt();
					state._fsp--;

					match(input,28,FOLLOW_28_in_statement127); 
					}
					break;
				case 4 :
					// myInterp.g:42:4: for_stmt
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
	// myInterp.g:44:1: for_stmt : FOR '(' assign_stmt ';' cond_expression ';' assign_stmt ')' block_stmt ;
	public final void for_stmt() throws RecognitionException {
		try {
			// myInterp.g:44:9: ( FOR '(' assign_stmt ';' cond_expression ';' assign_stmt ')' block_stmt )
			// myInterp.g:45:2: FOR '(' assign_stmt ';' cond_expression ';' assign_stmt ')' block_stmt
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
	// myInterp.g:47:1: if_stmt : if_then_stmt if_else_stmt[$if_then_stmt.exec_flag] ;
	public final void if_stmt() throws RecognitionException {
		int if_then_stmt3 =0;

		try {
			// myInterp.g:47:8: ( if_then_stmt if_else_stmt[$if_then_stmt.exec_flag] )
			// myInterp.g:48:2: if_then_stmt if_else_stmt[$if_then_stmt.exec_flag]
			{
			pushFollow(FOLLOW_if_then_stmt_in_if_stmt164);
			if_then_stmt3=if_then_stmt();
			state._fsp--;

			pushFollow(FOLLOW_if_else_stmt_in_if_stmt166);
			if_else_stmt(if_then_stmt3);
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
	// myInterp.g:50:1: if_then_stmt returns [int exec_flag] : IF '(' cond_expression ')' block_stmt ;
	public final int if_then_stmt() throws RecognitionException {
		int exec_flag = 0;


		float cond_expression4 =0.0f;

		try {
			// myInterp.g:51:24: ( IF '(' cond_expression ')' block_stmt )
			// myInterp.g:52:2: IF '(' cond_expression ')' block_stmt
			{
			match(input,IF,FOLLOW_IF_in_if_then_stmt179); 
			match(input,21,FOLLOW_21_in_if_then_stmt181); 
			pushFollow(FOLLOW_cond_expression_in_if_then_stmt183);
			cond_expression4=cond_expression();
			state._fsp--;

			match(input,22,FOLLOW_22_in_if_then_stmt185); 
			pushFollow(FOLLOW_block_stmt_in_if_then_stmt187);
			block_stmt();
			state._fsp--;

			 
			                  //exec_flag = cond_expression4;
			              
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
	// myInterp.g:56:1: if_else_stmt[int flag] : ( ELSE block_stmt |);
	public final void if_else_stmt(int flag) throws RecognitionException {
		try {
			// myInterp.g:56:23: ( ELSE block_stmt |)
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
					// myInterp.g:57:2: ELSE block_stmt
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
					// myInterp.g:62:3: 
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
	// myInterp.g:64:1: block_stmt : '{' statements '}' ;
	public final void block_stmt() throws RecognitionException {
		try {
			// myInterp.g:64:11: ( '{' statements '}' )
			// myInterp.g:64:13: '{' statements '}'
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
	// myInterp.g:66:1: assign_stmt : Identifier '=' arith_expression ;
	public final void assign_stmt() throws RecognitionException {
		Token Identifier5=null;
		Float arith_expression6 =null;

		try {
			// myInterp.g:66:12: ( Identifier '=' arith_expression )
			// myInterp.g:67:2: Identifier '=' arith_expression
			{
			Identifier5=(Token)match(input,Identifier,FOLLOW_Identifier_in_assign_stmt226); 
			match(input,29,FOLLOW_29_in_assign_stmt228); 
			pushFollow(FOLLOW_arith_expression_in_assign_stmt230);
			arith_expression6=arith_expression();
			state._fsp--;

			memory.put((Identifier5!=null?Identifier5.getText():null), new Float(arith_expression6));
			        if (TRACEON)  System.out.println("assign_stmt:" + (Identifier5!=null?Identifier5.getText():null) +" <- " + arith_expression6); 
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
	// myInterp.g:70:1: func_no_return_stmt : Identifier '(' STRING_LITERAL ( ',' arg )* ')' ;
	public final void func_no_return_stmt() throws RecognitionException {
		Token Identifier8=null;
		Token STRING_LITERAL9=null;
		ParserRuleReturnScope arg7 =null;


			
			List<Float> args=new ArrayList<Float>(); 
			List<String> refs=new ArrayList<String>(); 

		try {
			// myInterp.g:76:3: ( Identifier '(' STRING_LITERAL ( ',' arg )* ')' )
			// myInterp.g:76:3: Identifier '(' STRING_LITERAL ( ',' arg )* ')'
			{
			Identifier8=(Token)match(input,Identifier,FOLLOW_Identifier_in_func_no_return_stmt244); 
			match(input,21,FOLLOW_21_in_func_no_return_stmt246); 
			STRING_LITERAL9=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_func_no_return_stmt248); 
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
					match(input,25,FOLLOW_25_in_func_no_return_stmt251); 
					pushFollow(FOLLOW_arg_in_func_no_return_stmt252);
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

			match(input,22,FOLLOW_22_in_func_no_return_stmt258); 

					if(TRACEON){
								System.out.println("Function NAME:" +(Identifier8!=null?Identifier8.getText():null));
					}
				
					if((Identifier8!=null?Identifier8.getText():null).equals("printf"))
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
							System.out.println(tmp);
					}
					else if ((Identifier8!=null?Identifier8.getText():null).equals("scanf"))
					{
					   	if(TRACEON)	System.out.println("SCANF: ");
							String str = new String((STRING_LITERAL9!=null?STRING_LITERAL9.getText():null)), argType=null;				
							str = str.substring(1,str.length()-1 ); //remove quotation mark
							int retD=1,retF=1,index=0,tmpInt=0;
							float tmpFloat=0.0f;
							Scanner scanner = new Scanner(System.in);

							for(int i=0;i<refs.size();i++)
							{
									System.out.println("REFS: "+refs.get(i));
							}

							while(retD!=-1 || retF!=-1)
							{
									retD = str.indexOf("%d");
									retF = str.indexOf("%f");


									if(TRACEON)
									{
											System.out.println("retD: "+retD);
											System.out.println("retF: "+retF);
									}
									
									if(index>=refs.size()) 
									{
											if(retD!=-1 || retF!=-1)System.out.println("ERROR:  Number of argument  in printf is too less .");
											break;
									}

									System.out.println("INDEX: "+index);


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

													System.out.println("IN INT");
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
											System.out.println("STR:"+str);

											index++;
									}
									else{
										    System.out.println("ERROR: Number of argument in printf is too more.");
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
	// myInterp.g:212:1: arg returns [float value, String argName, int mode] : ( arith_expression | '&' Identifier );
	public final myInterpParser.arg_return arg() throws RecognitionException {
		myInterpParser.arg_return retval = new myInterpParser.arg_return();
		retval.start = input.LT(1);

		Token Identifier11=null;
		Float arith_expression10 =null;

		try {
			// myInterp.g:212:53: ( arith_expression | '&' Identifier )
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
					// myInterp.g:212:55: arith_expression
					{
					pushFollow(FOLLOW_arith_expression_in_arg272);
					arith_expression10=arith_expression();
					state._fsp--;

					retval.value =arith_expression10; retval.mode =0;
					}
					break;
				case 2 :
					// myInterp.g:213:2: '&' Identifier
					{
					match(input,20,FOLLOW_20_in_arg276); 
					Identifier11=(Token)match(input,Identifier,FOLLOW_Identifier_in_arg277); 
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
	// myInterp.g:216:1: cond_expression returns [float result] : a= arith_expression ( RelationOP b= arith_expression )* ;
	public final float cond_expression() throws RecognitionException {
		float result = 0.0f;


		Token RelationOP12=null;
		Float a =null;
		Float b =null;

		try {
			// myInterp.g:217:23: (a= arith_expression ( RelationOP b= arith_expression )* )
			// myInterp.g:218:2: a= arith_expression ( RelationOP b= arith_expression )*
			{
			pushFollow(FOLLOW_arith_expression_in_cond_expression295);
			a=arith_expression();
			state._fsp--;

			 result = a;
			// myInterp.g:219:2: ( RelationOP b= arith_expression )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==RelationOP) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// myInterp.g:220:3: RelationOP b= arith_expression
					{
					RelationOP12=(Token)match(input,RelationOP,FOLLOW_RelationOP_in_cond_expression304); 
					pushFollow(FOLLOW_arith_expression_in_cond_expression310);
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
	// myInterp.g:255:1: arith_expression returns [Float result] : a= multExpr ( '+' b= multExpr | '-' c= multExpr )* ;
	public final Float arith_expression() throws RecognitionException {
		Float result = null;


		Float a =null;
		Float b =null;
		Float c =null;

		try {
			// myInterp.g:256:23: (a= multExpr ( '+' b= multExpr | '-' c= multExpr )* )
			// myInterp.g:257:2: a= multExpr ( '+' b= multExpr | '-' c= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_arith_expression334);
			a=multExpr();
			state._fsp--;

			 result =a; 
			// myInterp.g:257:38: ( '+' b= multExpr | '-' c= multExpr )*
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
					// myInterp.g:258:3: '+' b= multExpr
					{
					match(input,24,FOLLOW_24_in_arith_expression342); 
					pushFollow(FOLLOW_multExpr_in_arith_expression348);
					b=multExpr();
					state._fsp--;

					result = result+b;
					}
					break;
				case 2 :
					// myInterp.g:259:5: '-' c= multExpr
					{
					match(input,26,FOLLOW_26_in_arith_expression356); 
					pushFollow(FOLLOW_multExpr_in_arith_expression362);
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
	// myInterp.g:262:1: multExpr returns [Float result] : a= signExpr ( '*' b= signExpr | '/' c= signExpr )* ;
	public final Float multExpr() throws RecognitionException {
		Float result = null;


		Float a =null;
		Float b =null;
		Float c =null;

		try {
			// myInterp.g:263:23: (a= signExpr ( '*' b= signExpr | '/' c= signExpr )* )
			// myInterp.g:264:2: a= signExpr ( '*' b= signExpr | '/' c= signExpr )*
			{
			pushFollow(FOLLOW_signExpr_in_multExpr384);
			a=signExpr();
			state._fsp--;

			 result =a; 
			// myInterp.g:264:38: ( '*' b= signExpr | '/' c= signExpr )*
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
					// myInterp.g:265:3: '*' b= signExpr
					{
					match(input,23,FOLLOW_23_in_multExpr392); 
					pushFollow(FOLLOW_signExpr_in_multExpr398);
					b=signExpr();
					state._fsp--;

					result = result*b;
					}
					break;
				case 2 :
					// myInterp.g:266:5: '/' c= signExpr
					{
					match(input,27,FOLLOW_27_in_multExpr406); 
					pushFollow(FOLLOW_signExpr_in_multExpr412);
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
	// myInterp.g:269:1: signExpr returns [Float result] : (a= primaryExpr | '-' primaryExpr );
	public final Float signExpr() throws RecognitionException {
		Float result = null;


		Float a =null;

		try {
			// myInterp.g:270:23: (a= primaryExpr | '-' primaryExpr )
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
					// myInterp.g:271:2: a= primaryExpr
					{
					pushFollow(FOLLOW_primaryExpr_in_signExpr434);
					a=primaryExpr();
					state._fsp--;

					 result =a; 
					}
					break;
				case 2 :
					// myInterp.g:272:4: '-' primaryExpr
					{
					match(input,26,FOLLOW_26_in_signExpr441); 
					pushFollow(FOLLOW_primaryExpr_in_signExpr443);
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
	// myInterp.g:274:1: primaryExpr returns [Float result] : ( Integer_constant | Floating_point_constant | Identifier | '(' arith_expression ')' );
	public final Float primaryExpr() throws RecognitionException {
		Float result = null;


		Token Integer_constant13=null;
		Token Floating_point_constant14=null;
		Token Identifier15=null;
		Float arith_expression16 =null;

		try {
			// myInterp.g:275:23: ( Integer_constant | Floating_point_constant | Identifier | '(' arith_expression ')' )
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
					// myInterp.g:276:2: Integer_constant
					{
					Integer_constant13=(Token)match(input,Integer_constant,FOLLOW_Integer_constant_in_primaryExpr455); 
					 result =Float.parseFloat((Integer_constant13!=null?Integer_constant13.getText():null)); 
					}
					break;
				case 2 :
					// myInterp.g:277:4: Floating_point_constant
					{
					Floating_point_constant14=(Token)match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_primaryExpr462); 
					 result = Float.parseFloat((Floating_point_constant14!=null?Floating_point_constant14.getText():null)); 
					}
					break;
				case 3 :
					// myInterp.g:278:4: Identifier
					{
					Identifier15=(Token)match(input,Identifier,FOLLOW_Identifier_in_primaryExpr469); 
					 result =  (Float)memory.get((Identifier15!=null?Identifier15.getText():null)); 
					}
					break;
				case 4 :
					// myInterp.g:279:4: '(' arith_expression ')'
					{
					match(input,21,FOLLOW_21_in_primaryExpr476); 
					pushFollow(FOLLOW_arith_expression_in_primaryExpr478);
					arith_expression16=arith_expression();
					state._fsp--;

					match(input,22,FOLLOW_22_in_primaryExpr480); 
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
	public static final BitSet FOLLOW_28_in_for_stmt146 = new BitSet(new long[]{0x0000000004206400L});
	public static final BitSet FOLLOW_cond_expression_in_for_stmt148 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_for_stmt150 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_assign_stmt_in_for_stmt152 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_for_stmt154 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_block_stmt_in_for_stmt156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_then_stmt_in_if_stmt164 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_if_else_stmt_in_if_stmt166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_then_stmt179 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_if_then_stmt181 = new BitSet(new long[]{0x0000000004206400L});
	public static final BitSet FOLLOW_cond_expression_in_if_then_stmt183 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_if_then_stmt185 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_block_stmt_in_if_then_stmt187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_if_else_stmt198 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_block_stmt_in_if_else_stmt200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_block_stmt212 = new BitSet(new long[]{0x0000000080002A00L});
	public static final BitSet FOLLOW_statements_in_block_stmt214 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_block_stmt216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assign_stmt226 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_assign_stmt228 = new BitSet(new long[]{0x0000000004206400L});
	public static final BitSet FOLLOW_arith_expression_in_assign_stmt230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_func_no_return_stmt244 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_func_no_return_stmt246 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_func_no_return_stmt248 = new BitSet(new long[]{0x0000000002400000L});
	public static final BitSet FOLLOW_25_in_func_no_return_stmt251 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_arg_in_func_no_return_stmt252 = new BitSet(new long[]{0x0000000002400000L});
	public static final BitSet FOLLOW_22_in_func_no_return_stmt258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expression_in_arg272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_arg276 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_arg277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expression_in_cond_expression295 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_RelationOP_in_cond_expression304 = new BitSet(new long[]{0x0000000004206400L});
	public static final BitSet FOLLOW_arith_expression_in_cond_expression310 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression334 = new BitSet(new long[]{0x0000000005000002L});
	public static final BitSet FOLLOW_24_in_arith_expression342 = new BitSet(new long[]{0x0000000004206400L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression348 = new BitSet(new long[]{0x0000000005000002L});
	public static final BitSet FOLLOW_26_in_arith_expression356 = new BitSet(new long[]{0x0000000004206400L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression362 = new BitSet(new long[]{0x0000000005000002L});
	public static final BitSet FOLLOW_signExpr_in_multExpr384 = new BitSet(new long[]{0x0000000008800002L});
	public static final BitSet FOLLOW_23_in_multExpr392 = new BitSet(new long[]{0x0000000004206400L});
	public static final BitSet FOLLOW_signExpr_in_multExpr398 = new BitSet(new long[]{0x0000000008800002L});
	public static final BitSet FOLLOW_27_in_multExpr406 = new BitSet(new long[]{0x0000000004206400L});
	public static final BitSet FOLLOW_signExpr_in_multExpr412 = new BitSet(new long[]{0x0000000008800002L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_signExpr441 = new BitSet(new long[]{0x0000000000206400L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_primaryExpr455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Floating_point_constant_in_primaryExpr462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_primaryExpr476 = new BitSet(new long[]{0x0000000004206400L});
	public static final BitSet FOLLOW_arith_expression_in_primaryExpr478 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_primaryExpr480 = new BitSet(new long[]{0x0000000000000002L});
}
