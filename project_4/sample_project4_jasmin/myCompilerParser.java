// $ANTLR 3.5.2 myCompiler.g 2019-06-19 18:24:54

    import java.util.HashMap;
		import java.util.Scanner;
	  import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myCompilerParser extends Parser {
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


	public myCompilerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCompilerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return myCompilerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myCompiler.g"; }


	    boolean TRACEON = false;
	    HashMap memory = new HashMap();
			HashMap dataType = new HashMap();
			
			HashMap<String, ArrayList> symtab = new HashMap<String, ArrayList>();
	    int labelCount = 0;
		
		// storageIndex is used to represent/index the location (locals) in VM.
		// The first index is 0.
		int storageIndex = 0;

	    // Record all assembly instructions.
	    List<String> TextCode = new ArrayList<String>();

	    // Type information.
	    public enum Type{
	       INT, FLOAT;
	    }

	    /*
	     * Output prologue.
	     */
	    void prologue()
	    {
	       TextCode.add(";.source");
	       TextCode.add(".class public static myResult");
	       TextCode.add(".super java/lang/Object");
	       TextCode.add(".method public static main([Ljava/lang/String;)V");

	       /* The size of stack and locals should be properly set. */
	       TextCode.add(".limit stack 100");
	       TextCode.add(".limit locals 100");
	    }
	  
	    /*
	     * Output epilogue.
	     */
	    void epilogue()
	    {
	       /* handle epilogue */
	       TextCode.add("return");
	       TextCode.add(".end method");
	    }
	    
	    /* Generate a new label */
	    String newLabel()
	    {
	       labelCount ++;
	       return (new String("L")) + Integer.toString(labelCount);
	    } 
	    
	    public List<String> getTextCode()
	    {
	       return TextCode;
	    }



	// $ANTLR start "program"
	// myCompiler.g:71:1: program : VOID MAIN '(' ')' '{' declarations statements[1] '}' ;
	public final void program() throws RecognitionException {
		try {
			// myCompiler.g:71:8: ( VOID MAIN '(' ')' '{' declarations statements[1] '}' )
			// myCompiler.g:72:2: VOID MAIN '(' ')' '{' declarations statements[1] '}'
			{
			match(input,VOID,FOLLOW_VOID_in_program35); 
			match(input,MAIN,FOLLOW_MAIN_in_program37); 
			match(input,21,FOLLOW_21_in_program39); 
			match(input,22,FOLLOW_22_in_program41); 

			           prologue();
			        
			match(input,30,FOLLOW_30_in_program45); 
			pushFollow(FOLLOW_declarations_in_program47);
			declarations();
			state._fsp--;

			pushFollow(FOLLOW_statements_in_program49);
			statements(1);
			state._fsp--;

			match(input,31,FOLLOW_31_in_program52); 
			 if (TRACEON)
					      System.out.println("VOID MAIN () {declarations statements}");
								 epilogue();
			        
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
	// myCompiler.g:79:1: declarations : ( type Identifier ';' declarations |);
	public final void declarations() throws RecognitionException {
		Token Identifier1=null;
		ParserRuleReturnScope type2 =null;

		try {
			// myCompiler.g:79:13: ( type Identifier ';' declarations |)
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==FLOAT||LA1_0==INT) ) {
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
					// myCompiler.g:80:2: type Identifier ';' declarations
					{
					pushFollow(FOLLOW_type_in_declarations62);
					type2=type();
					state._fsp--;

					Identifier1=(Token)match(input,Identifier,FOLLOW_Identifier_in_declarations64); 
					match(input,28,FOLLOW_28_in_declarations66); 
					pushFollow(FOLLOW_declarations_in_declarations68);
					declarations();
					state._fsp--;


							 if (TRACEON) 
							 {System.out.println("declarations: type Identifier : declarations");}

							  //dataType.put((Identifier1!=null?Identifier1.getText():null), new String((type2!=null?input.toString(type2.start,type2.stop):null)));

								 if (symtab.containsKey((Identifier1!=null?Identifier1.getText():null))) 
								 {
									    // variable re-declared.
					                    System.out.println("Type Error: " +  Identifier1.getLine() + ": Redeclared identifier.");
					                    System.exit(0);
					        }
					                 
									 /* Add ID and its attr_type into the symbol table. */
									 ArrayList the_list = new ArrayList();
									 the_list.add((type2!=null?((myCompilerParser.type_return)type2).attr_type:null));
									 the_list.add(storageIndex);
									 storageIndex = storageIndex + 1;
					         symtab.put((Identifier1!=null?Identifier1.getText():null), the_list);

						
					}
					break;
				case 2 :
					// myCompiler.g:101:4: 
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
		public Type attr_type;
	};


	// $ANTLR start "type"
	// myCompiler.g:105:1: type returns [Type attr_type] : ( INT | FLOAT );
	public final myCompilerParser.type_return type() throws RecognitionException {
		myCompilerParser.type_return retval = new myCompilerParser.type_return();
		retval.start = input.LT(1);

		try {
			// myCompiler.g:106:25: ( INT | FLOAT )
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
					// myCompiler.g:107:2: INT
					{
					match(input,INT,FOLLOW_INT_in_type87); 
					 if (TRACEON) System.out.println("type: INT"); retval.attr_type =Type.INT; 
					}
					break;
				case 2 :
					// myCompiler.g:108:4: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type94); 
					if (TRACEON) System.out.println("type: FLOAT"); retval.attr_type =Type.FLOAT; 
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
	// myCompiler.g:110:1: statements[int flag] : ( statement[flag] statements[flag] |);
	public final void statements(int flag) throws RecognitionException {
		try {
			// myCompiler.g:110:21: ( statement[flag] statements[flag] |)
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
					// myCompiler.g:111:2: statement[flag] statements[flag]
					{
					pushFollow(FOLLOW_statement_in_statements105);
					statement(flag);
					state._fsp--;

					pushFollow(FOLLOW_statements_in_statements108);
					statements(flag);
					state._fsp--;

					}
					break;
				case 2 :
					// myCompiler.g:112:3: 
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
	// myCompiler.g:114:1: statement[int flag] : ( assign_stmt[flag] ';' | if_stmt[flag] | func_no_return_stmt[flag] ';' );
	public final void statement(int flag) throws RecognitionException {
		try {
			// myCompiler.g:114:20: ( assign_stmt[flag] ';' | if_stmt[flag] | func_no_return_stmt[flag] ';' )
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
					// myCompiler.g:115:2: assign_stmt[flag] ';'
					{
					pushFollow(FOLLOW_assign_stmt_in_statement121);
					assign_stmt(flag);
					state._fsp--;

					match(input,28,FOLLOW_28_in_statement124); 
					}
					break;
				case 2 :
					// myCompiler.g:116:4: if_stmt[flag]
					{
					pushFollow(FOLLOW_if_stmt_in_statement129);
					if_stmt(flag);
					state._fsp--;

					}
					break;
				case 3 :
					// myCompiler.g:117:4: func_no_return_stmt[flag] ';'
					{
					pushFollow(FOLLOW_func_no_return_stmt_in_statement135);
					func_no_return_stmt(flag);
					state._fsp--;

					match(input,28,FOLLOW_28_in_statement138); 
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
	// myCompiler.g:119:1: if_stmt[int flag] : if_then_stmt if_else_stmt[if_else_stmt_flag] ;
	public final void if_stmt(int flag) throws RecognitionException {
		int if_then_stmt3 =0;

		int if_else_stmt_flag=0; 
		try {
			// myCompiler.g:120:35: ( if_then_stmt if_else_stmt[if_else_stmt_flag] )
			// myCompiler.g:121:2: if_then_stmt if_else_stmt[if_else_stmt_flag]
			{
			pushFollow(FOLLOW_if_then_stmt_in_if_stmt153);
			if_then_stmt3=if_then_stmt();
			state._fsp--;

			 if(if_then_stmt3==0){if_else_stmt_flag=1; } 
			pushFollow(FOLLOW_if_else_stmt_in_if_stmt157);
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
	// myCompiler.g:124:1: if_then_stmt returns [int exec_flag] : IF '(' cond_expression ')' block_stmt[$exec_flag] ;
	public final int if_then_stmt() throws RecognitionException {
		int exec_flag = 0;


		float cond_expression4 =0.0f;

		try {
			// myCompiler.g:125:24: ( IF '(' cond_expression ')' block_stmt[$exec_flag] )
			// myCompiler.g:126:2: IF '(' cond_expression ')' block_stmt[$exec_flag]
			{
			match(input,IF,FOLLOW_IF_in_if_then_stmt173); 
			match(input,21,FOLLOW_21_in_if_then_stmt175); 
			pushFollow(FOLLOW_cond_expression_in_if_then_stmt177);
			cond_expression4=cond_expression();
			state._fsp--;

			match(input,22,FOLLOW_22_in_if_then_stmt179); 
			 exec_flag = (int)cond_expression4; 
			pushFollow(FOLLOW_block_stmt_in_if_then_stmt183);
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
	// myCompiler.g:129:1: if_else_stmt[int flag] : ( ELSE block_stmt[flag] |);
	public final void if_else_stmt(int flag) throws RecognitionException {
		try {
			// myCompiler.g:129:23: ( ELSE block_stmt[flag] |)
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
					// myCompiler.g:130:2: ELSE block_stmt[flag]
					{
					match(input,ELSE,FOLLOW_ELSE_in_if_else_stmt196); 
					pushFollow(FOLLOW_block_stmt_in_if_else_stmt198);
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
					// myCompiler.g:138:3: 
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
	// myCompiler.g:140:1: block_stmt[int flag] : '{' statements[flag] '}' ;
	public final void block_stmt(int flag) throws RecognitionException {
		try {
			// myCompiler.g:140:21: ( '{' statements[flag] '}' )
			// myCompiler.g:141:2: '{' statements[flag] '}'
			{
			match(input,30,FOLLOW_30_in_block_stmt213); 
			pushFollow(FOLLOW_statements_in_block_stmt215);
			statements(flag);
			state._fsp--;

			match(input,31,FOLLOW_31_in_block_stmt218); 
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
	// myCompiler.g:143:1: assign_stmt[int flag] : Identifier '=' arith_expression ;
	public final void assign_stmt(int flag) throws RecognitionException {
		Token Identifier5=null;
		Float arith_expression6 =null;

		try {
			// myCompiler.g:143:22: ( Identifier '=' arith_expression )
			// myCompiler.g:144:2: Identifier '=' arith_expression
			{
			Identifier5=(Token)match(input,Identifier,FOLLOW_Identifier_in_assign_stmt229); 
			match(input,29,FOLLOW_29_in_assign_stmt231); 
			pushFollow(FOLLOW_arith_expression_in_assign_stmt233);
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
	// myCompiler.g:149:1: func_no_return_stmt[int flag] : Identifier '(' STRING_LITERAL ( ',' arg )* ')' ;
	public final void func_no_return_stmt(int flag) throws RecognitionException {
		Token Identifier8=null;
		Token STRING_LITERAL9=null;
		ParserRuleReturnScope arg7 =null;


			
			List<Float> args=new ArrayList<Float>(); 
			List<String> refs=new ArrayList<String>(); 

		try {
			// myCompiler.g:154:2: ( Identifier '(' STRING_LITERAL ( ',' arg )* ')' )
			// myCompiler.g:155:2: Identifier '(' STRING_LITERAL ( ',' arg )* ')'
			{
			Identifier8=(Token)match(input,Identifier,FOLLOW_Identifier_in_func_no_return_stmt250); 
			match(input,21,FOLLOW_21_in_func_no_return_stmt252); 
			STRING_LITERAL9=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_func_no_return_stmt254); 
			// myCompiler.g:155:32: ( ',' arg )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==25) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// myCompiler.g:156:3: ',' arg
					{
					match(input,25,FOLLOW_25_in_func_no_return_stmt260); 
					pushFollow(FOLLOW_arg_in_func_no_return_stmt262);
					arg7=arg();
					state._fsp--;


								if((arg7!=null?((myCompilerParser.arg_return)arg7).mode:0)==1){
								 	if(TRACEON)	{System.out.println((arg7!=null?((myCompilerParser.arg_return)arg7).argName:null));}  
									refs.add((arg7!=null?((myCompilerParser.arg_return)arg7).argName:null));
								}
								else{
									if(TRACEON)	{System.out.println((arg7!=null?((myCompilerParser.arg_return)arg7).value:0.0f));}  
									args.add((arg7!=null?((myCompilerParser.arg_return)arg7).value:0.0f)); 
								}
					 
					}
					break;

				default :
					break loop6;
				}
			}

			match(input,22,FOLLOW_22_in_func_no_return_stmt270); 

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
	// myCompiler.g:299:1: arg returns [float value, String argName, int mode] : ( arith_expression | '&' Identifier );
	public final myCompilerParser.arg_return arg() throws RecognitionException {
		myCompilerParser.arg_return retval = new myCompilerParser.arg_return();
		retval.start = input.LT(1);

		Token Identifier11=null;
		Float arith_expression10 =null;

		try {
			// myCompiler.g:300:48: ( arith_expression | '&' Identifier )
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
					// myCompiler.g:301:2: arith_expression
					{
					pushFollow(FOLLOW_arith_expression_in_arg284);
					arith_expression10=arith_expression();
					state._fsp--;

					retval.value =arith_expression10; retval.mode =0;
					}
					break;
				case 2 :
					// myCompiler.g:302:4: '&' Identifier
					{
					match(input,20,FOLLOW_20_in_arg291); 
					Identifier11=(Token)match(input,Identifier,FOLLOW_Identifier_in_arg293); 
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
	// myCompiler.g:304:1: cond_expression returns [float result] : a= arith_expression ( RelationOP b= arith_expression )* ;
	public final float cond_expression() throws RecognitionException {
		float result = 0.0f;


		Token RelationOP12=null;
		Float a =null;
		Float b =null;

		try {
			// myCompiler.g:305:23: (a= arith_expression ( RelationOP b= arith_expression )* )
			// myCompiler.g:306:2: a= arith_expression ( RelationOP b= arith_expression )*
			{
			pushFollow(FOLLOW_arith_expression_in_cond_expression311);
			a=arith_expression();
			state._fsp--;

			 result = a;
			// myCompiler.g:306:47: ( RelationOP b= arith_expression )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==RelationOP) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// myCompiler.g:307:3: RelationOP b= arith_expression
					{
					RelationOP12=(Token)match(input,RelationOP,FOLLOW_RelationOP_in_cond_expression319); 
					pushFollow(FOLLOW_arith_expression_in_cond_expression325);
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
	// myCompiler.g:342:1: arith_expression returns [Float result] : a= multExpr ( '+' b= multExpr | '-' c= multExpr )* ;
	public final Float arith_expression() throws RecognitionException {
		Float result = null;


		Float a =null;
		Float b =null;
		Float c =null;

		try {
			// myCompiler.g:343:23: (a= multExpr ( '+' b= multExpr | '-' c= multExpr )* )
			// myCompiler.g:344:2: a= multExpr ( '+' b= multExpr | '-' c= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_arith_expression349);
			a=multExpr();
			state._fsp--;

			 result =a; 
			// myCompiler.g:344:38: ( '+' b= multExpr | '-' c= multExpr )*
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
					// myCompiler.g:345:3: '+' b= multExpr
					{
					match(input,24,FOLLOW_24_in_arith_expression357); 
					pushFollow(FOLLOW_multExpr_in_arith_expression363);
					b=multExpr();
					state._fsp--;

					result = result+b;
					}
					break;
				case 2 :
					// myCompiler.g:346:5: '-' c= multExpr
					{
					match(input,26,FOLLOW_26_in_arith_expression371); 
					pushFollow(FOLLOW_multExpr_in_arith_expression377);
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
	// myCompiler.g:349:1: multExpr returns [Float result] : a= signExpr ( '*' b= signExpr | '/' c= signExpr )* ;
	public final Float multExpr() throws RecognitionException {
		Float result = null;


		Float a =null;
		Float b =null;
		Float c =null;

		try {
			// myCompiler.g:350:23: (a= signExpr ( '*' b= signExpr | '/' c= signExpr )* )
			// myCompiler.g:351:2: a= signExpr ( '*' b= signExpr | '/' c= signExpr )*
			{
			pushFollow(FOLLOW_signExpr_in_multExpr399);
			a=signExpr();
			state._fsp--;

			 result =a; 
			// myCompiler.g:351:38: ( '*' b= signExpr | '/' c= signExpr )*
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
					// myCompiler.g:352:3: '*' b= signExpr
					{
					match(input,23,FOLLOW_23_in_multExpr407); 
					pushFollow(FOLLOW_signExpr_in_multExpr413);
					b=signExpr();
					state._fsp--;

					result = result*b;
					}
					break;
				case 2 :
					// myCompiler.g:353:5: '/' c= signExpr
					{
					match(input,27,FOLLOW_27_in_multExpr421); 
					pushFollow(FOLLOW_signExpr_in_multExpr427);
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
	// myCompiler.g:356:1: signExpr returns [Float result] : (a= primaryExpr | '-' primaryExpr );
	public final Float signExpr() throws RecognitionException {
		Float result = null;


		Float a =null;

		try {
			// myCompiler.g:357:23: (a= primaryExpr | '-' primaryExpr )
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
					// myCompiler.g:358:2: a= primaryExpr
					{
					pushFollow(FOLLOW_primaryExpr_in_signExpr449);
					a=primaryExpr();
					state._fsp--;

					 result =a; 
					}
					break;
				case 2 :
					// myCompiler.g:359:4: '-' primaryExpr
					{
					match(input,26,FOLLOW_26_in_signExpr456); 
					pushFollow(FOLLOW_primaryExpr_in_signExpr458);
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
	// myCompiler.g:361:1: primaryExpr returns [Float result] : ( Integer_constant | Floating_point_constant | Identifier | '(' arith_expression ')' );
	public final Float primaryExpr() throws RecognitionException {
		Float result = null;


		Token Integer_constant13=null;
		Token Floating_point_constant14=null;
		Token Identifier15=null;
		Float arith_expression16 =null;

		try {
			// myCompiler.g:362:23: ( Integer_constant | Floating_point_constant | Identifier | '(' arith_expression ')' )
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
					// myCompiler.g:363:2: Integer_constant
					{
					Integer_constant13=(Token)match(input,Integer_constant,FOLLOW_Integer_constant_in_primaryExpr470); 
					 result =Float.parseFloat((Integer_constant13!=null?Integer_constant13.getText():null)); 
					}
					break;
				case 2 :
					// myCompiler.g:364:4: Floating_point_constant
					{
					Floating_point_constant14=(Token)match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_primaryExpr477); 
					 result = Float.parseFloat((Floating_point_constant14!=null?Floating_point_constant14.getText():null)); 
					}
					break;
				case 3 :
					// myCompiler.g:365:4: Identifier
					{
					Identifier15=(Token)match(input,Identifier,FOLLOW_Identifier_in_primaryExpr484); 
					 result =  (Float)memory.get((Identifier15!=null?Identifier15.getText():null)); 
					}
					break;
				case 4 :
					// myCompiler.g:366:4: '(' arith_expression ')'
					{
					match(input,21,FOLLOW_21_in_primaryExpr491); 
					pushFollow(FOLLOW_arith_expression_in_primaryExpr493);
					arith_expression16=arith_expression();
					state._fsp--;

					match(input,22,FOLLOW_22_in_primaryExpr495); 
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
	public static final BitSet FOLLOW_30_in_program45 = new BitSet(new long[]{0x0000000080003900L});
	public static final BitSet FOLLOW_declarations_in_program47 = new BitSet(new long[]{0x0000000080002800L});
	public static final BitSet FOLLOW_statements_in_program49 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_program52 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declarations62 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_declarations64 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_declarations66 = new BitSet(new long[]{0x0000000000001100L});
	public static final BitSet FOLLOW_declarations_in_declarations68 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type94 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements105 = new BitSet(new long[]{0x0000000000002800L});
	public static final BitSet FOLLOW_statements_in_statements108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_stmt_in_statement121 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_statement124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stmt_in_statement129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_no_return_stmt_in_statement135 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_statement138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_then_stmt_in_if_stmt153 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_if_else_stmt_in_if_stmt157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_then_stmt173 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_if_then_stmt175 = new BitSet(new long[]{0x0000000004206400L});
	public static final BitSet FOLLOW_cond_expression_in_if_then_stmt177 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_if_then_stmt179 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_block_stmt_in_if_then_stmt183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_if_else_stmt196 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_block_stmt_in_if_else_stmt198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_block_stmt213 = new BitSet(new long[]{0x0000000080002800L});
	public static final BitSet FOLLOW_statements_in_block_stmt215 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_block_stmt218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assign_stmt229 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_assign_stmt231 = new BitSet(new long[]{0x0000000004206400L});
	public static final BitSet FOLLOW_arith_expression_in_assign_stmt233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_func_no_return_stmt250 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_func_no_return_stmt252 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_func_no_return_stmt254 = new BitSet(new long[]{0x0000000002400000L});
	public static final BitSet FOLLOW_25_in_func_no_return_stmt260 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_arg_in_func_no_return_stmt262 = new BitSet(new long[]{0x0000000002400000L});
	public static final BitSet FOLLOW_22_in_func_no_return_stmt270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expression_in_arg284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_arg291 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_arg293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expression_in_cond_expression311 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_RelationOP_in_cond_expression319 = new BitSet(new long[]{0x0000000004206400L});
	public static final BitSet FOLLOW_arith_expression_in_cond_expression325 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression349 = new BitSet(new long[]{0x0000000005000002L});
	public static final BitSet FOLLOW_24_in_arith_expression357 = new BitSet(new long[]{0x0000000004206400L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression363 = new BitSet(new long[]{0x0000000005000002L});
	public static final BitSet FOLLOW_26_in_arith_expression371 = new BitSet(new long[]{0x0000000004206400L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression377 = new BitSet(new long[]{0x0000000005000002L});
	public static final BitSet FOLLOW_signExpr_in_multExpr399 = new BitSet(new long[]{0x0000000008800002L});
	public static final BitSet FOLLOW_23_in_multExpr407 = new BitSet(new long[]{0x0000000004206400L});
	public static final BitSet FOLLOW_signExpr_in_multExpr413 = new BitSet(new long[]{0x0000000008800002L});
	public static final BitSet FOLLOW_27_in_multExpr421 = new BitSet(new long[]{0x0000000004206400L});
	public static final BitSet FOLLOW_signExpr_in_multExpr427 = new BitSet(new long[]{0x0000000008800002L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_signExpr456 = new BitSet(new long[]{0x0000000000206400L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_primaryExpr470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Floating_point_constant_in_primaryExpr477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_primaryExpr491 = new BitSet(new long[]{0x0000000004206400L});
	public static final BitSet FOLLOW_arith_expression_in_primaryExpr493 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_primaryExpr495 = new BitSet(new long[]{0x0000000000000002L});
}
