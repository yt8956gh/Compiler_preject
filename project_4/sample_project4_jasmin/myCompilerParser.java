// $ANTLR 3.5.2 myCompiler.g 2019-06-20 15:08:31

	// import packages here.
	import java.util.HashMap;
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

		// ============================================
		// Create a symbol table.
		// ArrayList is easy to extend to add more info. into symbol table.
		//
		// The structure of symbol table:
		// <variable ID, type, memory location>
		//	- type: the variable type	(please check "enum Type")
		//	- memory location: the location (locals in VM) the variable will be stored at.
		// ============================================
		HashMap<String, ArrayList> symtab = new HashMap<String, ArrayList>();

		int labelCount = 0;

		// storageIndex is used to represent/index the location (locals) in VM.
		// The first index is 0.
		int storageIndex = 0;

		// Record all assembly instructions.
		List<String> TextCode = new ArrayList<String>();

		// Type information.
		public enum Type{
			INT, FLOAT, CHAR;
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
	// myCompiler.g:83:1: program : VOID MAIN '(' ')' '{' declarations statements '}' ;
	public final void program() throws RecognitionException {
		try {
			// myCompiler.g:83:8: ( VOID MAIN '(' ')' '{' declarations statements '}' )
			// myCompiler.g:84:2: VOID MAIN '(' ')' '{' declarations statements '}'
			{
			match(input,VOID,FOLLOW_VOID_in_program35); 
			match(input,MAIN,FOLLOW_MAIN_in_program37); 
			match(input,21,FOLLOW_21_in_program39); 
			match(input,22,FOLLOW_22_in_program41); 

						/* Output function prologue */
						prologue();
					
			match(input,30,FOLLOW_30_in_program45); 
			pushFollow(FOLLOW_declarations_in_program47);
			declarations();
			state._fsp--;

			pushFollow(FOLLOW_statements_in_program49);
			statements();
			state._fsp--;

			match(input,31,FOLLOW_31_in_program51); 


						if (TRACEON)  System.out.println("VOID MAIN () {declarations statements}");
						/* output function epilogue */	
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
	// myCompiler.g:94:1: declarations : ( type Identifier ';' declarations |);
	public final void declarations() throws RecognitionException {
		Token Identifier1=null;
		Type type2 =null;

		try {
			// myCompiler.g:94:13: ( type Identifier ';' declarations |)
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==FLOAT||LA1_0==INT) ) {
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
					// myCompiler.g:95:2: type Identifier ';' declarations
					{
					pushFollow(FOLLOW_type_in_declarations61);
					type2=type();
					state._fsp--;

					Identifier1=(Token)match(input,Identifier,FOLLOW_Identifier_in_declarations63); 
					match(input,28,FOLLOW_28_in_declarations65); 
					pushFollow(FOLLOW_declarations_in_declarations67);
					declarations();
					state._fsp--;


								if (TRACEON)
									System.out.println("declarations: type Identifier : declarations");

								if (symtab.containsKey((Identifier1!=null?Identifier1.getText():null))) 
								{
										// variable re-declared.
										System.out.println("Type Error: " + Identifier1.getLine() +	": Redeclared identifier.");
										System.exit(0);
								}
									/* Add ID and its attr_type into the symbol table. */
									ArrayList the_list = new ArrayList();
									the_list.add(type2);
									the_list.add(storageIndex);
									storageIndex = storageIndex + 1;
									symtab.put((Identifier1!=null?Identifier1.getText():null), the_list);
						
					}
					break;
				case 2 :
					// myCompiler.g:114:2: 
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
	// myCompiler.g:119:1: type returns [Type attr_type] : ( INT | FLOAT );
	public final Type type() throws RecognitionException {
		Type attr_type = null;


		try {
			// myCompiler.g:120:25: ( INT | FLOAT )
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
					// myCompiler.g:121:2: INT
					{
					match(input,INT,FOLLOW_INT_in_type90); 
					 if (TRACEON) System.out.println("type: INT"); attr_type=Type.INT; 
					}
					break;
				case 2 :
					// myCompiler.g:122:4: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type97); 
					if (TRACEON) System.out.println("type: FLOAT"); attr_type=Type.FLOAT; 
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
		return attr_type;
	}
	// $ANTLR end "type"



	// $ANTLR start "statements"
	// myCompiler.g:124:1: statements : ( statement statements |);
	public final void statements() throws RecognitionException {
		try {
			// myCompiler.g:124:11: ( statement statements |)
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
					// myCompiler.g:124:13: statement statements
					{
					pushFollow(FOLLOW_statement_in_statements106);
					statement();
					state._fsp--;

					pushFollow(FOLLOW_statements_in_statements108);
					statements();
					state._fsp--;

					}
					break;
				case 2 :
					// myCompiler.g:124:35: 
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
	// myCompiler.g:126:1: statement : ( assign_stmt ';' | if_stmt | func_no_return_stmt ';' | for_stmt );
	public final void statement() throws RecognitionException {
		try {
			// myCompiler.g:126:10: ( assign_stmt ';' | if_stmt | func_no_return_stmt ';' | for_stmt )
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
					// myCompiler.g:127:2: assign_stmt ';'
					{
					pushFollow(FOLLOW_assign_stmt_in_statement118);
					assign_stmt();
					state._fsp--;

					match(input,28,FOLLOW_28_in_statement120); 
					}
					break;
				case 2 :
					// myCompiler.g:128:4: if_stmt
					{
					pushFollow(FOLLOW_if_stmt_in_statement125);
					if_stmt();
					state._fsp--;

					}
					break;
				case 3 :
					// myCompiler.g:129:4: func_no_return_stmt ';'
					{
					pushFollow(FOLLOW_func_no_return_stmt_in_statement130);
					func_no_return_stmt();
					state._fsp--;

					match(input,28,FOLLOW_28_in_statement132); 
					}
					break;
				case 4 :
					// myCompiler.g:130:4: for_stmt
					{
					pushFollow(FOLLOW_for_stmt_in_statement137);
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
	// myCompiler.g:132:1: for_stmt : FOR '(' assign_stmt ';' cond_expression ';' assign_stmt ')' block_stmt ;
	public final void for_stmt() throws RecognitionException {
		try {
			// myCompiler.g:132:9: ( FOR '(' assign_stmt ';' cond_expression ';' assign_stmt ')' block_stmt )
			// myCompiler.g:133:2: FOR '(' assign_stmt ';' cond_expression ';' assign_stmt ')' block_stmt
			{
			match(input,FOR,FOLLOW_FOR_in_for_stmt145); 
			match(input,21,FOLLOW_21_in_for_stmt147); 
			pushFollow(FOLLOW_assign_stmt_in_for_stmt149);
			assign_stmt();
			state._fsp--;

			match(input,28,FOLLOW_28_in_for_stmt151); 
			pushFollow(FOLLOW_cond_expression_in_for_stmt153);
			cond_expression();
			state._fsp--;

			match(input,28,FOLLOW_28_in_for_stmt155); 
			pushFollow(FOLLOW_assign_stmt_in_for_stmt157);
			assign_stmt();
			state._fsp--;

			match(input,22,FOLLOW_22_in_for_stmt159); 
			pushFollow(FOLLOW_block_stmt_in_for_stmt161);
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
	// myCompiler.g:135:1: if_stmt : if_then_stmt if_else_stmt ;
	public final void if_stmt() throws RecognitionException {
		int if_then_stmt3 =0;

		try {
			// myCompiler.g:135:8: ( if_then_stmt if_else_stmt )
			// myCompiler.g:135:10: if_then_stmt if_else_stmt
			{
			pushFollow(FOLLOW_if_then_stmt_in_if_stmt168);
			if_then_stmt3=if_then_stmt();
			state._fsp--;

			pushFollow(FOLLOW_if_else_stmt_in_if_stmt170);
			if_else_stmt();
			state._fsp--;


					TextCode.add("endLabel" + String.valueOf(if_then_stmt3)+":");

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
	// myCompiler.g:140:1: if_then_stmt returns [int endLabel] : IF '(' cond_expression ')' block_stmt ;
	public final int if_then_stmt() throws RecognitionException {
		int endLabel = 0;


		String cond_expression4 =null;


			int elseLabel = labelCount;
			labelCount++;
			endLabel = labelCount;
			labelCount++;

		try {
			// myCompiler.g:147:3: ( IF '(' cond_expression ')' block_stmt )
			// myCompiler.g:147:3: IF '(' cond_expression ')' block_stmt
			{
			match(input,IF,FOLLOW_IF_in_if_then_stmt188); 
			match(input,21,FOLLOW_21_in_if_then_stmt190); 
			pushFollow(FOLLOW_cond_expression_in_if_then_stmt192);
			cond_expression4=cond_expression();
			state._fsp--;

			match(input,22,FOLLOW_22_in_if_then_stmt194); 

					if(cond_expression4.equals("=="))
					{
							TextCode.add("ifne elseLabel" + String.valueOf(elseLabel));
					}
					else if(cond_expression4.equals("!="))
					{
							TextCode.add("ifeq elseLabel" + String.valueOf(elseLabel));
					}
					else if(cond_expression4.equals("<="))
					{
							TextCode.add("iflt elseLabel" + String.valueOf(elseLabel));
					}
					else if(cond_expression4.equals(">="))
					{
							TextCode.add("ifgt elseLabel" + String.valueOf(elseLabel));
					}
					else if(cond_expression4.equals("<"))
					{
							TextCode.add("ifle elseLabel" + String.valueOf(elseLabel));
					}
					else if(cond_expression4.equals(">"))
					{
							TextCode.add("ifge elseLabel" + String.valueOf(elseLabel));
					}
				
			pushFollow(FOLLOW_block_stmt_in_if_then_stmt201);
			block_stmt();
			state._fsp--;


					TextCode.add("goto endLabel" + String.valueOf(endLabel));
					TextCode.add("elseLabel" + String.valueOf(elseLabel) + ":");
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return endLabel;
	}
	// $ANTLR end "if_then_stmt"



	// $ANTLR start "if_else_stmt"
	// myCompiler.g:180:1: if_else_stmt : ( ELSE block_stmt |);
	public final void if_else_stmt() throws RecognitionException {
		try {
			// myCompiler.g:180:13: ( ELSE block_stmt |)
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
					// myCompiler.g:180:15: ELSE block_stmt
					{
					match(input,ELSE,FOLLOW_ELSE_in_if_else_stmt212); 
					pushFollow(FOLLOW_block_stmt_in_if_else_stmt214);
					block_stmt();
					state._fsp--;

					}
					break;
				case 2 :
					// myCompiler.g:180:32: 
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
	// myCompiler.g:182:1: block_stmt : '{' statements '}' ;
	public final void block_stmt() throws RecognitionException {
		try {
			// myCompiler.g:182:11: ( '{' statements '}' )
			// myCompiler.g:182:13: '{' statements '}'
			{
			match(input,30,FOLLOW_30_in_block_stmt223); 
			pushFollow(FOLLOW_statements_in_block_stmt225);
			statements();
			state._fsp--;

			match(input,31,FOLLOW_31_in_block_stmt227); 
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
	// myCompiler.g:184:1: assign_stmt : Identifier '=' arith_expression ;
	public final void assign_stmt() throws RecognitionException {
		Token Identifier5=null;
		Type arith_expression6 =null;

		try {
			// myCompiler.g:184:12: ( Identifier '=' arith_expression )
			// myCompiler.g:185:2: Identifier '=' arith_expression
			{
			Identifier5=(Token)match(input,Identifier,FOLLOW_Identifier_in_assign_stmt235); 
			match(input,29,FOLLOW_29_in_assign_stmt237); 
			pushFollow(FOLLOW_arith_expression_in_assign_stmt239);
			arith_expression6=arith_expression();
			state._fsp--;


							Type the_type;
							int the_mem;
							
							// get the ID's location and type from symtab.
							the_type = (Type) symtab.get((Identifier5!=null?Identifier5.getText():null)).get(0);
							the_mem = (int) symtab.get((Identifier5!=null?Identifier5.getText():null)).get(1);
							
							if (the_type != arith_expression6) {
							System.out.println("Type error!\n");
							System.exit(0);
							}
							
							// issue store insruction:
							// => store the top element of the operand stack into the locals.
							switch (the_type) {
							case INT:
									TextCode.add("istore " + the_mem);
									break;
							case FLOAT:
									TextCode.add("fstore " + the_mem);
									break;
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
	// $ANTLR end "assign_stmt"



	// $ANTLR start "func_no_return_stmt"
	// myCompiler.g:210:1: func_no_return_stmt : Identifier '(' STRING_LITERAL ( ',' arg )* ')' ;
	public final void func_no_return_stmt() throws RecognitionException {
		Token Identifier7=null;
		Token STRING_LITERAL8=null;


			List<Float> args=new ArrayList<Float>(); 
			List<String> refs=new ArrayList<String>();
			boolean isPrintf = false;
			String tmp = null;

		try {
			// myCompiler.g:216:2: ( Identifier '(' STRING_LITERAL ( ',' arg )* ')' )
			// myCompiler.g:217:2: Identifier '(' STRING_LITERAL ( ',' arg )* ')'
			{
			Identifier7=(Token)match(input,Identifier,FOLLOW_Identifier_in_func_no_return_stmt255); 
			match(input,21,FOLLOW_21_in_func_no_return_stmt257); 
			STRING_LITERAL8=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_func_no_return_stmt259); 

					if((Identifier7!=null?Identifier7.getText():null).equals("printf"))
					{
						isPrintf = true;
							tmp = new String((STRING_LITERAL8!=null?STRING_LITERAL8.getText():null));
							tmp = tmp.substring(1,tmp.length()-1 ); //remove quotation mark

						int retD = tmp.indexOf("%d");
							int retF = tmp.indexOf("%f");
						int retN = tmp.indexOf("\\n");

						if(retN==-1 && retD==-1 && retF==-1){
							TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
							TextCode.add("ldc \""+tmp+"\"");
							TextCode.add("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
						}
					}

			// myCompiler.g:234:3: ( ',' arg )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==25) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// myCompiler.g:235:3: ',' arg
					{
					match(input,25,FOLLOW_25_in_func_no_return_stmt267); 
					pushFollow(FOLLOW_arg_in_func_no_return_stmt269);
					arg();
					state._fsp--;


									int retD=0, retF=0, retN=0;
									retD = tmp.indexOf("%d");
									retF = tmp.indexOf("%f");
									retN = tmp.indexOf("\\n");

											if(TRACEON)
											{
													System.out.println("RETn: "+ retN);
													System.out.println("retD: "+retD);
													System.out.println("retF: "+retF);
											}

									while(retN!=-1 && (retD==-1||retN<retD)&&(retF==-1||retN<retF)) //newline
									{
											TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
											TextCode.add("ldc \""+tmp.substring(0,retN)+"\"");
											TextCode.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");

											tmp = tmp.substring(retN+2, tmp.length());
											if(TRACEON) System.out.println("NewLINE REM: "+tmp);

											retD = tmp.indexOf("%d");
												retF = tmp.indexOf("%f");
											retN = tmp.indexOf("\\n");
									}

											if(retD!=-1 && (retF==-1 || retD<retF)) // int
											{
												TextCode.add("istore 99");

												TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
												TextCode.add("ldc \""+tmp.substring(0,retD)+"\"");
												TextCode.add("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");

												if(TRACEON) System.out.println("OUT: "+tmp.substring(0,retD));

												TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
												TextCode.add("iload 99");
												TextCode.add("invokevirtual java/io/PrintStream/print(I)V"); // for integer

												tmp = tmp.substring(retD+2, tmp.length());
												if(TRACEON) System.out.println("REM: "+tmp);
											}
											else	if(retF!=-1 && (retD==-1 || retF<retD)) //float
											{
												TextCode.add("fstore 99");

												TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
												TextCode.add("ldc \""+tmp.substring(0,retF)+"\"");
												TextCode.add("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");

												if(TRACEON) System.out.println("OUT: "+tmp.substring(0,retF));

												TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
												TextCode.add("fload 99");
												TextCode.add("invokevirtual java/io/PrintStream/print(F)V"); // for integer

												tmp = tmp.substring(retF+2, tmp.length());
												if(TRACEON) System.out.println("REM: "+tmp);
											}
											else{
													System.out.println("ERROR: Number of argument in printf is too more.");
											}
							
					}
					break;

				default :
					break loop6;
				}
			}

			match(input,22,FOLLOW_22_in_func_no_return_stmt277); 


				int retN=0;
				retN = tmp.indexOf("\\n");
				while(retN!=-1) //newline
				{
							TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
							TextCode.add("ldc \""+tmp.substring(0,retN)+"\"");
							TextCode.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");

							tmp = tmp.substring(retN+2, tmp.length());
							if(TRACEON) System.out.println("NewLINE REM: "+tmp);
							
							retN = tmp.indexOf("\\n");
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



	// $ANTLR start "argument"
	// myCompiler.g:317:1: argument : arg ( ',' arg )* ;
	public final void argument() throws RecognitionException {
		try {
			// myCompiler.g:317:9: ( arg ( ',' arg )* )
			// myCompiler.g:317:11: arg ( ',' arg )*
			{
			pushFollow(FOLLOW_arg_in_argument286);
			arg();
			state._fsp--;

			// myCompiler.g:317:15: ( ',' arg )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==25) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// myCompiler.g:317:16: ',' arg
					{
					match(input,25,FOLLOW_25_in_argument289); 
					pushFollow(FOLLOW_arg_in_argument291);
					arg();
					state._fsp--;

					}
					break;

				default :
					break loop7;
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
	// $ANTLR end "argument"



	// $ANTLR start "arg"
	// myCompiler.g:319:1: arg : arith_expression ;
	public final void arg() throws RecognitionException {
		try {
			// myCompiler.g:319:4: ( arith_expression )
			// myCompiler.g:319:6: arith_expression
			{
			pushFollow(FOLLOW_arith_expression_in_arg300);
			arith_expression();
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
	// $ANTLR end "arg"



	// $ANTLR start "cond_expression"
	// myCompiler.g:321:1: cond_expression returns [String op] : a= arith_expression ( RelationOP b= arith_expression )* ;
	public final String cond_expression() throws RecognitionException {
		String op = null;


		Token RelationOP9=null;
		Type a =null;
		Type b =null;


			boolean last_is_int = false;

		try {
			// myCompiler.g:324:2: (a= arith_expression ( RelationOP b= arith_expression )* )
			// myCompiler.g:325:2: a= arith_expression ( RelationOP b= arith_expression )*
			{
			pushFollow(FOLLOW_arith_expression_in_cond_expression319);
			a=arith_expression();
			state._fsp--;


					if(a==Type.INT) TextCode.add("i2f");

					TextCode.add("fstore 97");
				
			// myCompiler.g:331:2: ( RelationOP b= arith_expression )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==RelationOP) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// myCompiler.g:331:3: RelationOP b= arith_expression
					{
					RelationOP9=(Token)match(input,RelationOP,FOLLOW_RelationOP_in_cond_expression328); 
					pushFollow(FOLLOW_arith_expression_in_cond_expression332);
					b=arith_expression();
					state._fsp--;


								if(b==Type.INT) TextCode.add("i2f");
								TextCode.add("fload 97");

								if((RelationOP9!=null?RelationOP9.getText():null).equals("<"))
								{
									TextCode.add("fcmpl");
									op = "<";
								}
								else if((RelationOP9!=null?RelationOP9.getText():null).equals(">")) // 1 is in stack
								{
									TextCode.add("fcmpl");
									op = ">";
									//TextCode.add("ineg");
								}
								else if((RelationOP9!=null?RelationOP9.getText():null).equals("=="))
								{
									 TextCode.add("fcmpl");
									 op = "==";
								}
								else if((RelationOP9!=null?RelationOP9.getText():null).equals("!="))
								{
									 TextCode.add("fcmpl");
									 op = "!=";
								}
								else if((RelationOP9!=null?RelationOP9.getText():null).equals("<="))
								{
									 TextCode.add("fcmpl");
									 op = "<=";
								}
								else if((RelationOP9!=null?RelationOP9.getText():null).equals(">="))
								{
									 TextCode.add("fcmpl");
									 op = ">=";
								}
								
							
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
		return op;
	}
	// $ANTLR end "cond_expression"



	// $ANTLR start "arith_expression"
	// myCompiler.g:371:1: arith_expression returns [Type attr_type] : a= multExpr ( '+' b= multExpr | '-' c= multExpr )* ;
	public final Type arith_expression() throws RecognitionException {
		Type attr_type = null;


		Type a =null;
		Type b =null;
		Type c =null;

		try {
			// myCompiler.g:372:25: (a= multExpr ( '+' b= multExpr | '-' c= multExpr )* )
			// myCompiler.g:373:2: a= multExpr ( '+' b= multExpr | '-' c= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_arith_expression356);
			a=multExpr();
			state._fsp--;

			 attr_type = a; 
			// myCompiler.g:373:46: ( '+' b= multExpr | '-' c= multExpr )*
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
					// myCompiler.g:374:3: '+' b= multExpr
					{
					match(input,24,FOLLOW_24_in_arith_expression364); 
					pushFollow(FOLLOW_multExpr_in_arith_expression370);
					b=multExpr();
					state._fsp--;


												if ((attr_type == Type.INT) &&(b == Type.INT))  TextCode.add("iadd");
												else TextCode.add("fadd");
											
					}
					break;
				case 2 :
					// myCompiler.g:378:5: '-' c= multExpr
					{
					match(input,26,FOLLOW_26_in_arith_expression378); 
					pushFollow(FOLLOW_multExpr_in_arith_expression384);
					c=multExpr();
					state._fsp--;


												if ((attr_type == Type.INT) &&(c == Type.INT))  TextCode.add("isub");
												else TextCode.add("fsub");
										
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
		return attr_type;
	}
	// $ANTLR end "arith_expression"



	// $ANTLR start "multExpr"
	// myCompiler.g:384:1: multExpr returns [Type attr_type] : a= signExpr ( '*' b= signExpr | '/' c= signExpr )* ;
	public final Type multExpr() throws RecognitionException {
		Type attr_type = null;


		Type a =null;
		Type b =null;
		Type c =null;

		try {
			// myCompiler.g:385:25: (a= signExpr ( '*' b= signExpr | '/' c= signExpr )* )
			// myCompiler.g:386:2: a= signExpr ( '*' b= signExpr | '/' c= signExpr )*
			{
			pushFollow(FOLLOW_signExpr_in_multExpr406);
			a=signExpr();
			state._fsp--;

			 attr_type =a; 
			// myCompiler.g:386:44: ( '*' b= signExpr | '/' c= signExpr )*
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
					// myCompiler.g:387:3: '*' b= signExpr
					{
					match(input,23,FOLLOW_23_in_multExpr414); 
					pushFollow(FOLLOW_signExpr_in_multExpr420);
					b=signExpr();
					state._fsp--;


												if ((attr_type == Type.INT) &&(b == Type.INT))  TextCode.add("imul");
												else TextCode.add("fmul");
											
					}
					break;
				case 2 :
					// myCompiler.g:391:5: '/' c= signExpr
					{
					match(input,27,FOLLOW_27_in_multExpr428); 
					pushFollow(FOLLOW_signExpr_in_multExpr434);
					c=signExpr();
					state._fsp--;


												if ((attr_type == Type.INT) &&(c == Type.INT))  TextCode.add("idiv");
												else TextCode.add("fdiv");
										
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
		return attr_type;
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "signExpr"
	// myCompiler.g:397:1: signExpr returns [Type attr_type] : (a= primaryExpr[1] | '-' b= primaryExpr[-1] );
	public final Type signExpr() throws RecognitionException {
		Type attr_type = null;


		Type a =null;
		Type b =null;

		try {
			// myCompiler.g:398:25: (a= primaryExpr[1] | '-' b= primaryExpr[-1] )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==Floating_point_constant||(LA11_0 >= Identifier && LA11_0 <= Integer_constant)||(LA11_0 >= 20 && LA11_0 <= 21)) ) {
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
					// myCompiler.g:399:2: a= primaryExpr[1]
					{
					pushFollow(FOLLOW_primaryExpr_in_signExpr456);
					a=primaryExpr(1);
					state._fsp--;

					 attr_type =a;
					}
					break;
				case 2 :
					// myCompiler.g:400:4: '-' b= primaryExpr[-1]
					{
					match(input,26,FOLLOW_26_in_signExpr464); 
					pushFollow(FOLLOW_primaryExpr_in_signExpr470);
					b=primaryExpr(-1);
					state._fsp--;

					 attr_type =b;
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
		return attr_type;
	}
	// $ANTLR end "signExpr"



	// $ANTLR start "primaryExpr"
	// myCompiler.g:402:1: primaryExpr[int posneg] returns [Type attr_type] : ( Integer_constant | Floating_point_constant | Identifier | '&' Identifier | '(' arith_expression ')' );
	public final Type primaryExpr(int posneg) throws RecognitionException {
		Type attr_type = null;


		Token Integer_constant10=null;
		Token Floating_point_constant11=null;
		Token Identifier12=null;

		try {
			// myCompiler.g:403:25: ( Integer_constant | Floating_point_constant | Identifier | '&' Identifier | '(' arith_expression ')' )
			int alt12=5;
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
			case 20:
				{
				alt12=4;
				}
				break;
			case 21:
				{
				alt12=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// myCompiler.g:404:2: Integer_constant
					{
					Integer_constant10=(Token)match(input,Integer_constant,FOLLOW_Integer_constant_in_primaryExpr486); 

								attr_type = Type.INT;

								if(TRACEON) System.out.println("posneg: "+posneg);
									
								// code generation.
								// push the integer into the operand stack.

								if(posneg>0) TextCode.add("ldc " + (Integer_constant10!=null?Integer_constant10.getText():null));
								else TextCode.add("ldc -" + (Integer_constant10!=null?Integer_constant10.getText():null));
								
					}
					break;
				case 2 :
					// myCompiler.g:415:4: Floating_point_constant
					{
					Floating_point_constant11=(Token)match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_primaryExpr493); 

								
								attr_type = Type.FLOAT;
									
								// code generation.
								// push the Float into the operand stack.

								if(posneg>0) TextCode.add("ldc " + (Floating_point_constant11!=null?Floating_point_constant11.getText():null));
								else TextCode.add("ldc -" + (Floating_point_constant11!=null?Floating_point_constant11.getText():null));
						
					}
					break;
				case 3 :
					// myCompiler.g:426:4: Identifier
					{
					Identifier12=(Token)match(input,Identifier,FOLLOW_Identifier_in_primaryExpr502); 

								// get type information from symtab.
								attr_type = (Type) symtab.get((Identifier12!=null?Identifier12.getText():null)).get(0);
									
								switch (attr_type) {
									case INT: 
											// load the variable into the operand stack.
											TextCode.add("iload " + symtab.get((Identifier12!=null?Identifier12.getText():null)).get(1));
											break;
									case FLOAT:
											TextCode.add("fload " + symtab.get((Identifier12!=null?Identifier12.getText():null)).get(1));
											break;
								}
						
					}
					break;
				case 4 :
					// myCompiler.g:441:4: '&' Identifier
					{
					match(input,20,FOLLOW_20_in_primaryExpr511); 
					match(input,Identifier,FOLLOW_Identifier_in_primaryExpr513); 
					}
					break;
				case 5 :
					// myCompiler.g:442:4: '(' arith_expression ')'
					{
					match(input,21,FOLLOW_21_in_primaryExpr518); 
					pushFollow(FOLLOW_arith_expression_in_primaryExpr520);
					arith_expression();
					state._fsp--;

					match(input,22,FOLLOW_22_in_primaryExpr522); 
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
		return attr_type;
	}
	// $ANTLR end "primaryExpr"

	// Delegated rules



	public static final BitSet FOLLOW_VOID_in_program35 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MAIN_in_program37 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_program39 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_program41 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_program45 = new BitSet(new long[]{0x0000000080003B00L});
	public static final BitSet FOLLOW_declarations_in_program47 = new BitSet(new long[]{0x0000000080002A00L});
	public static final BitSet FOLLOW_statements_in_program49 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_program51 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declarations61 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_declarations63 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_declarations65 = new BitSet(new long[]{0x0000000000001100L});
	public static final BitSet FOLLOW_declarations_in_declarations67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type90 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements106 = new BitSet(new long[]{0x0000000000002A00L});
	public static final BitSet FOLLOW_statements_in_statements108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_stmt_in_statement118 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_statement120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stmt_in_statement125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_no_return_stmt_in_statement130 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_statement132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_stmt_in_statement137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_for_stmt145 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_for_stmt147 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_assign_stmt_in_for_stmt149 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_for_stmt151 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_cond_expression_in_for_stmt153 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_for_stmt155 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_assign_stmt_in_for_stmt157 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_for_stmt159 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_block_stmt_in_for_stmt161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_then_stmt_in_if_stmt168 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_if_else_stmt_in_if_stmt170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_then_stmt188 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_if_then_stmt190 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_cond_expression_in_if_then_stmt192 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_if_then_stmt194 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_block_stmt_in_if_then_stmt201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_if_else_stmt212 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_block_stmt_in_if_else_stmt214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_block_stmt223 = new BitSet(new long[]{0x0000000080002A00L});
	public static final BitSet FOLLOW_statements_in_block_stmt225 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_block_stmt227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assign_stmt235 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_assign_stmt237 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_arith_expression_in_assign_stmt239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_func_no_return_stmt255 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_func_no_return_stmt257 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_func_no_return_stmt259 = new BitSet(new long[]{0x0000000002400000L});
	public static final BitSet FOLLOW_25_in_func_no_return_stmt267 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_arg_in_func_no_return_stmt269 = new BitSet(new long[]{0x0000000002400000L});
	public static final BitSet FOLLOW_22_in_func_no_return_stmt277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arg_in_argument286 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_argument289 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_arg_in_argument291 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_arith_expression_in_arg300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expression_in_cond_expression319 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_RelationOP_in_cond_expression328 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_arith_expression_in_cond_expression332 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression356 = new BitSet(new long[]{0x0000000005000002L});
	public static final BitSet FOLLOW_24_in_arith_expression364 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression370 = new BitSet(new long[]{0x0000000005000002L});
	public static final BitSet FOLLOW_26_in_arith_expression378 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression384 = new BitSet(new long[]{0x0000000005000002L});
	public static final BitSet FOLLOW_signExpr_in_multExpr406 = new BitSet(new long[]{0x0000000008800002L});
	public static final BitSet FOLLOW_23_in_multExpr414 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_signExpr_in_multExpr420 = new BitSet(new long[]{0x0000000008800002L});
	public static final BitSet FOLLOW_27_in_multExpr428 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_signExpr_in_multExpr434 = new BitSet(new long[]{0x0000000008800002L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_signExpr464 = new BitSet(new long[]{0x0000000000306400L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_primaryExpr486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Floating_point_constant_in_primaryExpr493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_primaryExpr511 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_primaryExpr518 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_arith_expression_in_primaryExpr520 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_primaryExpr522 = new BitSet(new long[]{0x0000000000000002L});
}
