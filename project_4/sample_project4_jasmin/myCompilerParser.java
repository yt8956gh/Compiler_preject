// $ANTLR 3.5.2 myCompiler.g 2019-06-20 01:05:34

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
		//    - type: the variable type   (please check "enum Type")
		//    - memory location: the location (locals in VM) the variable will be stored at.
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
	// myCompiler.g:84:1: program : VOID MAIN '(' ')' '{' declarations statements '}' ;
	public final void program() throws RecognitionException {
		try {
			// myCompiler.g:84:8: ( VOID MAIN '(' ')' '{' declarations statements '}' )
			// myCompiler.g:85:2: VOID MAIN '(' ')' '{' declarations statements '}'
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

					   if (TRACEON)
					      System.out.println("VOID MAIN () {declarations statements}");

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
	// myCompiler.g:96:1: declarations : ( type Identifier ';' declarations |);
	public final void declarations() throws RecognitionException {
		Token Identifier1=null;
		Type type2 =null;

		try {
			// myCompiler.g:96:13: ( type Identifier ';' declarations |)
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
					// myCompiler.g:97:2: type Identifier ';' declarations
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

					                 if (symtab.containsKey((Identifier1!=null?Identifier1.getText():null))) {
									    // variable re-declared.
					                    System.out.println("Type Error: " + 
					                                       Identifier1.getLine() + 
					                                       ": Redeclared identifier.");
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
					// myCompiler.g:116:4: 
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
	// myCompiler.g:121:1: type returns [Type attr_type] : ( INT | FLOAT );
	public final Type type() throws RecognitionException {
		Type attr_type = null;


		try {
			// myCompiler.g:122:25: ( INT | FLOAT )
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
					// myCompiler.g:123:2: INT
					{
					match(input,INT,FOLLOW_INT_in_type86); 
					 if (TRACEON) System.out.println("type: INT"); attr_type=Type.INT; 
					}
					break;
				case 2 :
					// myCompiler.g:124:4: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type93); 
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
	// myCompiler.g:126:1: statements : ( statement statements |);
	public final void statements() throws RecognitionException {
		try {
			// myCompiler.g:126:11: ( statement statements |)
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
					// myCompiler.g:126:13: statement statements
					{
					pushFollow(FOLLOW_statement_in_statements102);
					statement();
					state._fsp--;

					pushFollow(FOLLOW_statements_in_statements104);
					statements();
					state._fsp--;

					}
					break;
				case 2 :
					// myCompiler.g:126:35: 
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
	// myCompiler.g:128:1: statement : ( assign_stmt ';' | if_stmt | func_no_return_stmt ';' | for_stmt );
	public final void statement() throws RecognitionException {
		try {
			// myCompiler.g:128:10: ( assign_stmt ';' | if_stmt | func_no_return_stmt ';' | for_stmt )
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
					// myCompiler.g:129:2: assign_stmt ';'
					{
					pushFollow(FOLLOW_assign_stmt_in_statement114);
					assign_stmt();
					state._fsp--;

					match(input,28,FOLLOW_28_in_statement116); 
					}
					break;
				case 2 :
					// myCompiler.g:130:4: if_stmt
					{
					pushFollow(FOLLOW_if_stmt_in_statement121);
					if_stmt();
					state._fsp--;

					}
					break;
				case 3 :
					// myCompiler.g:131:4: func_no_return_stmt ';'
					{
					pushFollow(FOLLOW_func_no_return_stmt_in_statement126);
					func_no_return_stmt();
					state._fsp--;

					match(input,28,FOLLOW_28_in_statement128); 
					}
					break;
				case 4 :
					// myCompiler.g:132:4: for_stmt
					{
					pushFollow(FOLLOW_for_stmt_in_statement133);
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
	// myCompiler.g:134:1: for_stmt : FOR '(' assign_stmt ';' cond_expression ';' assign_stmt ')' block_stmt ;
	public final void for_stmt() throws RecognitionException {
		try {
			// myCompiler.g:134:9: ( FOR '(' assign_stmt ';' cond_expression ';' assign_stmt ')' block_stmt )
			// myCompiler.g:135:2: FOR '(' assign_stmt ';' cond_expression ';' assign_stmt ')' block_stmt
			{
			match(input,FOR,FOLLOW_FOR_in_for_stmt141); 
			match(input,21,FOLLOW_21_in_for_stmt143); 
			pushFollow(FOLLOW_assign_stmt_in_for_stmt145);
			assign_stmt();
			state._fsp--;

			match(input,28,FOLLOW_28_in_for_stmt147); 
			pushFollow(FOLLOW_cond_expression_in_for_stmt149);
			cond_expression();
			state._fsp--;

			match(input,28,FOLLOW_28_in_for_stmt151); 
			pushFollow(FOLLOW_assign_stmt_in_for_stmt153);
			assign_stmt();
			state._fsp--;

			match(input,22,FOLLOW_22_in_for_stmt155); 
			pushFollow(FOLLOW_block_stmt_in_for_stmt157);
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
	// myCompiler.g:137:1: if_stmt : if_then_stmt if_else_stmt ;
	public final void if_stmt() throws RecognitionException {
		try {
			// myCompiler.g:137:8: ( if_then_stmt if_else_stmt )
			// myCompiler.g:137:10: if_then_stmt if_else_stmt
			{
			pushFollow(FOLLOW_if_then_stmt_in_if_stmt164);
			if_then_stmt();
			state._fsp--;

			pushFollow(FOLLOW_if_else_stmt_in_if_stmt166);
			if_else_stmt();
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
	// myCompiler.g:139:1: if_then_stmt : IF '(' cond_expression ')' block_stmt ;
	public final void if_then_stmt() throws RecognitionException {
		try {
			// myCompiler.g:139:13: ( IF '(' cond_expression ')' block_stmt )
			// myCompiler.g:139:15: IF '(' cond_expression ')' block_stmt
			{
			match(input,IF,FOLLOW_IF_in_if_then_stmt173); 
			match(input,21,FOLLOW_21_in_if_then_stmt175); 
			pushFollow(FOLLOW_cond_expression_in_if_then_stmt177);
			cond_expression();
			state._fsp--;

			match(input,22,FOLLOW_22_in_if_then_stmt179); 
			pushFollow(FOLLOW_block_stmt_in_if_then_stmt181);
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
	// $ANTLR end "if_then_stmt"



	// $ANTLR start "if_else_stmt"
	// myCompiler.g:141:1: if_else_stmt : ( ELSE block_stmt |);
	public final void if_else_stmt() throws RecognitionException {
		try {
			// myCompiler.g:141:13: ( ELSE block_stmt |)
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
					// myCompiler.g:141:15: ELSE block_stmt
					{
					match(input,ELSE,FOLLOW_ELSE_in_if_else_stmt188); 
					pushFollow(FOLLOW_block_stmt_in_if_else_stmt190);
					block_stmt();
					state._fsp--;

					}
					break;
				case 2 :
					// myCompiler.g:141:32: 
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
	// myCompiler.g:143:1: block_stmt : '{' statements '}' ;
	public final void block_stmt() throws RecognitionException {
		try {
			// myCompiler.g:143:11: ( '{' statements '}' )
			// myCompiler.g:143:13: '{' statements '}'
			{
			match(input,30,FOLLOW_30_in_block_stmt199); 
			pushFollow(FOLLOW_statements_in_block_stmt201);
			statements();
			state._fsp--;

			match(input,31,FOLLOW_31_in_block_stmt203); 
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
	// myCompiler.g:145:1: assign_stmt : Identifier '=' arith_expression ;
	public final void assign_stmt() throws RecognitionException {
		Token Identifier3=null;
		Type arith_expression4 =null;

		try {
			// myCompiler.g:145:12: ( Identifier '=' arith_expression )
			// myCompiler.g:146:2: Identifier '=' arith_expression
			{
			Identifier3=(Token)match(input,Identifier,FOLLOW_Identifier_in_assign_stmt211); 
			match(input,29,FOLLOW_29_in_assign_stmt213); 
			pushFollow(FOLLOW_arith_expression_in_assign_stmt215);
			arith_expression4=arith_expression();
			state._fsp--;


						   Type the_type;
						   int the_mem;
						   
						   // get the ID's location and type from symtab.			   
						   the_type = (Type) symtab.get((Identifier3!=null?Identifier3.getText():null)).get(0);
						   the_mem = (int) symtab.get((Identifier3!=null?Identifier3.getText():null)).get(1);
						   
						   if (the_type != arith_expression4) {
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
	// myCompiler.g:171:1: func_no_return_stmt : Identifier '(' STRING_LITERAL ( ',' arg )* ')' ;
	public final void func_no_return_stmt() throws RecognitionException {
		Token Identifier5=null;
		Token STRING_LITERAL6=null;


			List<Float> args=new ArrayList<Float>(); 
			List<String> refs=new ArrayList<String>();
		   boolean isPrintf = false;
		   String tmp = null;

		try {
			// myCompiler.g:177:2: ( Identifier '(' STRING_LITERAL ( ',' arg )* ')' )
			// myCompiler.g:178:2: Identifier '(' STRING_LITERAL ( ',' arg )* ')'
			{
			Identifier5=(Token)match(input,Identifier,FOLLOW_Identifier_in_func_no_return_stmt231); 
			match(input,21,FOLLOW_21_in_func_no_return_stmt233); 
			STRING_LITERAL6=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_func_no_return_stmt235); 

				   if((Identifier5!=null?Identifier5.getText():null).equals("printf"))
					{
			            isPrintf = true;
							tmp = new String((STRING_LITERAL6!=null?STRING_LITERAL6.getText():null));
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

			// myCompiler.g:195:3: ( ',' arg )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==25) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// myCompiler.g:196:3: ',' arg
					{
					match(input,25,FOLLOW_25_in_func_no_return_stmt243); 
					pushFollow(FOLLOW_arg_in_func_no_return_stmt245);
					arg();
					state._fsp--;


					                  int retD=0, retF=0, retN=0;
											retD = tmp.indexOf("%d");
											retF = tmp.indexOf("%f");
					                  retN = tmp.indexOf("\\n");

					                  System.out.println("RETn: "+ retN);

											if(TRACEON)
											{
													System.out.println("retD: "+retD);
													System.out.println("retF: "+retF);
											}

					                  while(retN!=-1 && (retD==-1||retN<retD)&&(retF==-1||retN<retF)) //newline
					                  {
					                        TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
					                        TextCode.add("ldc \""+tmp.substring(0,retN)+"\"");
					                        TextCode.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");

					                        tmp = tmp.substring(retN+2, tmp.length());
					                        System.out.println("NewLINE REM: "+tmp);

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

					                           System.out.println("OUT: "+tmp.substring(0,retD));

					                           TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
					                           TextCode.add("iload 99");
					                           TextCode.add("invokevirtual java/io/PrintStream/print(I)V"); // for integer

					                           tmp = tmp.substring(retD+2, tmp.length());
					                           System.out.println("REM: "+tmp);
											}
											else	if(retF!=-1 && (retD==-1 || retF<retD)) //float
											{
					                           TextCode.add("fstore 99");

					                           TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
					                           TextCode.add("ldc \""+tmp.substring(0,retF)+"\"");
					                           TextCode.add("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");

					                           System.out.println("OUT: "+tmp.substring(0,retF));

					                           TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
					                           TextCode.add("fload 99");
					                           TextCode.add("invokevirtual java/io/PrintStream/print(F)V"); // for integer

					                           tmp = tmp.substring(retF+2, tmp.length());
					                           System.out.println("REM: "+tmp);
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

			match(input,22,FOLLOW_22_in_func_no_return_stmt253); 


			      int retN=0;
			      retN = tmp.indexOf("\\n");
			      while(retN!=-1) //newline
			      {
			               TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
			               TextCode.add("ldc \""+tmp.substring(0,retN)+"\"");
			               TextCode.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");

			               tmp = tmp.substring(retN+2, tmp.length());
			               System.out.println("NewLINE REM: "+tmp);
			               
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
	// myCompiler.g:279:1: argument : arg ( ',' arg )* ;
	public final void argument() throws RecognitionException {
		try {
			// myCompiler.g:279:9: ( arg ( ',' arg )* )
			// myCompiler.g:279:11: arg ( ',' arg )*
			{
			pushFollow(FOLLOW_arg_in_argument262);
			arg();
			state._fsp--;

			// myCompiler.g:279:15: ( ',' arg )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==25) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// myCompiler.g:279:16: ',' arg
					{
					match(input,25,FOLLOW_25_in_argument265); 
					pushFollow(FOLLOW_arg_in_argument267);
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
	// myCompiler.g:281:1: arg : arith_expression ;
	public final void arg() throws RecognitionException {
		try {
			// myCompiler.g:281:4: ( arith_expression )
			// myCompiler.g:281:6: arith_expression
			{
			pushFollow(FOLLOW_arith_expression_in_arg276);
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
	// myCompiler.g:283:1: cond_expression returns [boolean truth] : a= arith_expression ( RelationOP arith_expression )* ;
	public final boolean cond_expression() throws RecognitionException {
		boolean truth = false;


		Type a =null;

		try {
			// myCompiler.g:284:24: (a= arith_expression ( RelationOP arith_expression )* )
			// myCompiler.g:285:2: a= arith_expression ( RelationOP arith_expression )*
			{
			pushFollow(FOLLOW_arith_expression_in_cond_expression292);
			a=arith_expression();
			state._fsp--;


							    if (a.ordinal() != 0)
								   truth = true;
								else
								   truth = false;
							 
			// myCompiler.g:290:8: ( RelationOP arith_expression )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==RelationOP) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// myCompiler.g:290:9: RelationOP arith_expression
					{
					match(input,RelationOP,FOLLOW_RelationOP_in_cond_expression297); 
					pushFollow(FOLLOW_arith_expression_in_cond_expression299);
					arith_expression();
					state._fsp--;

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
		return truth;
	}
	// $ANTLR end "cond_expression"



	// $ANTLR start "arith_expression"
	// myCompiler.g:292:1: arith_expression returns [Type attr_type] : a= multExpr ( '+' b= multExpr | '-' c= multExpr )* ;
	public final Type arith_expression() throws RecognitionException {
		Type attr_type = null;


		Type a =null;
		Type b =null;
		Type c =null;

		try {
			// myCompiler.g:293:25: (a= multExpr ( '+' b= multExpr | '-' c= multExpr )* )
			// myCompiler.g:294:2: a= multExpr ( '+' b= multExpr | '-' c= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_arith_expression317);
			a=multExpr();
			state._fsp--;

			 attr_type = a; 
			// myCompiler.g:294:46: ( '+' b= multExpr | '-' c= multExpr )*
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
					// myCompiler.g:295:3: '+' b= multExpr
					{
					match(input,24,FOLLOW_24_in_arith_expression325); 
					pushFollow(FOLLOW_multExpr_in_arith_expression331);
					b=multExpr();
					state._fsp--;


					                              if ((attr_type == Type.INT) &&(b == Type.INT))  TextCode.add("iadd");
					                              else TextCode.add("fadd");
					                       
					}
					break;
				case 2 :
					// myCompiler.g:299:5: '-' c= multExpr
					{
					match(input,26,FOLLOW_26_in_arith_expression339); 
					pushFollow(FOLLOW_multExpr_in_arith_expression345);
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
	// myCompiler.g:305:1: multExpr returns [Type attr_type] : a= signExpr ( '*' b= signExpr | '/' c= signExpr )* ;
	public final Type multExpr() throws RecognitionException {
		Type attr_type = null;


		Type a =null;
		Type b =null;
		Type c =null;

		try {
			// myCompiler.g:306:25: (a= signExpr ( '*' b= signExpr | '/' c= signExpr )* )
			// myCompiler.g:307:2: a= signExpr ( '*' b= signExpr | '/' c= signExpr )*
			{
			pushFollow(FOLLOW_signExpr_in_multExpr367);
			a=signExpr();
			state._fsp--;

			 attr_type =a; 
			// myCompiler.g:307:44: ( '*' b= signExpr | '/' c= signExpr )*
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
					// myCompiler.g:308:3: '*' b= signExpr
					{
					match(input,23,FOLLOW_23_in_multExpr375); 
					pushFollow(FOLLOW_signExpr_in_multExpr381);
					b=signExpr();
					state._fsp--;


					                              if ((attr_type == Type.INT) &&(b == Type.INT))  TextCode.add("imul");
					                              else TextCode.add("fmul");
					                       
					}
					break;
				case 2 :
					// myCompiler.g:312:5: '/' c= signExpr
					{
					match(input,27,FOLLOW_27_in_multExpr389); 
					pushFollow(FOLLOW_signExpr_in_multExpr395);
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
	// myCompiler.g:318:1: signExpr returns [Type attr_type] : (a= primaryExpr[1] | '-' b= primaryExpr[-1] );
	public final Type signExpr() throws RecognitionException {
		Type attr_type = null;


		Type a =null;
		Type b =null;

		try {
			// myCompiler.g:319:25: (a= primaryExpr[1] | '-' b= primaryExpr[-1] )
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
					// myCompiler.g:320:2: a= primaryExpr[1]
					{
					pushFollow(FOLLOW_primaryExpr_in_signExpr417);
					a=primaryExpr(1);
					state._fsp--;

					 attr_type =a;
					}
					break;
				case 2 :
					// myCompiler.g:321:4: '-' b= primaryExpr[-1]
					{
					match(input,26,FOLLOW_26_in_signExpr425); 
					pushFollow(FOLLOW_primaryExpr_in_signExpr431);
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
	// myCompiler.g:323:1: primaryExpr[int posneg] returns [Type attr_type] : ( Integer_constant | Floating_point_constant | Identifier | '&' Identifier | '(' arith_expression ')' );
	public final Type primaryExpr(int posneg) throws RecognitionException {
		Type attr_type = null;


		Token Integer_constant7=null;
		Token Floating_point_constant8=null;
		Token Identifier9=null;

		try {
			// myCompiler.g:324:25: ( Integer_constant | Floating_point_constant | Identifier | '&' Identifier | '(' arith_expression ')' )
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
					// myCompiler.g:325:2: Integer_constant
					{
					Integer_constant7=(Token)match(input,Integer_constant,FOLLOW_Integer_constant_in_primaryExpr447); 

								    attr_type = Type.INT;

					             System.out.println("posneg: "+posneg);
									
									// code generation.
									// push the integer into the operand stack.

					            if(posneg>0) TextCode.add("ldc " + (Integer_constant7!=null?Integer_constant7.getText():null));
					            else TextCode.add("ldc -" + (Integer_constant7!=null?Integer_constant7.getText():null));
								 
					}
					break;
				case 2 :
					// myCompiler.g:336:4: Floating_point_constant
					{
					Floating_point_constant8=(Token)match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_primaryExpr454); 

					              
								    attr_type = Type.FLOAT;
									
									// code generation.
									// push the Float into the operand stack.

					            if(posneg>0) TextCode.add("ldc " + (Floating_point_constant8!=null?Floating_point_constant8.getText():null));
					            else TextCode.add("ldc -" + (Floating_point_constant8!=null?Floating_point_constant8.getText():null));
					           
					}
					break;
				case 3 :
					// myCompiler.g:346:4: Identifier
					{
					Identifier9=(Token)match(input,Identifier,FOLLOW_Identifier_in_primaryExpr461); 

								    // get type information from symtab.
								    attr_type = (Type) symtab.get((Identifier9!=null?Identifier9.getText():null)).get(0);
									
									switch (attr_type) {
									case INT: 
									          // load the variable into the operand stack.
									          TextCode.add("iload " + symtab.get((Identifier9!=null?Identifier9.getText():null)).get(1));
									          break;
									case FLOAT:
					                     TextCode.add("fload " + symtab.get((Identifier9!=null?Identifier9.getText():null)).get(1));
									          break;
									}
								 
					}
					break;
				case 4 :
					// myCompiler.g:360:4: '&' Identifier
					{
					match(input,20,FOLLOW_20_in_primaryExpr468); 
					match(input,Identifier,FOLLOW_Identifier_in_primaryExpr470); 
					}
					break;
				case 5 :
					// myCompiler.g:361:4: '(' arith_expression ')'
					{
					match(input,21,FOLLOW_21_in_primaryExpr475); 
					pushFollow(FOLLOW_arith_expression_in_primaryExpr477);
					arith_expression();
					state._fsp--;

					match(input,22,FOLLOW_22_in_primaryExpr479); 
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
	public static final BitSet FOLLOW_INT_in_type86 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements102 = new BitSet(new long[]{0x0000000000002A00L});
	public static final BitSet FOLLOW_statements_in_statements104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_stmt_in_statement114 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_statement116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stmt_in_statement121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_no_return_stmt_in_statement126 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_statement128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_stmt_in_statement133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_for_stmt141 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_for_stmt143 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_assign_stmt_in_for_stmt145 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_for_stmt147 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_cond_expression_in_for_stmt149 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_for_stmt151 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_assign_stmt_in_for_stmt153 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_for_stmt155 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_block_stmt_in_for_stmt157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_then_stmt_in_if_stmt164 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_if_else_stmt_in_if_stmt166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_then_stmt173 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_if_then_stmt175 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_cond_expression_in_if_then_stmt177 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_if_then_stmt179 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_block_stmt_in_if_then_stmt181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_if_else_stmt188 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_block_stmt_in_if_else_stmt190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_block_stmt199 = new BitSet(new long[]{0x0000000080002A00L});
	public static final BitSet FOLLOW_statements_in_block_stmt201 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_block_stmt203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assign_stmt211 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_assign_stmt213 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_arith_expression_in_assign_stmt215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_func_no_return_stmt231 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_func_no_return_stmt233 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_func_no_return_stmt235 = new BitSet(new long[]{0x0000000002400000L});
	public static final BitSet FOLLOW_25_in_func_no_return_stmt243 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_arg_in_func_no_return_stmt245 = new BitSet(new long[]{0x0000000002400000L});
	public static final BitSet FOLLOW_22_in_func_no_return_stmt253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arg_in_argument262 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_argument265 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_arg_in_argument267 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_arith_expression_in_arg276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expression_in_cond_expression292 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_RelationOP_in_cond_expression297 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_arith_expression_in_cond_expression299 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression317 = new BitSet(new long[]{0x0000000005000002L});
	public static final BitSet FOLLOW_24_in_arith_expression325 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression331 = new BitSet(new long[]{0x0000000005000002L});
	public static final BitSet FOLLOW_26_in_arith_expression339 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression345 = new BitSet(new long[]{0x0000000005000002L});
	public static final BitSet FOLLOW_signExpr_in_multExpr367 = new BitSet(new long[]{0x0000000008800002L});
	public static final BitSet FOLLOW_23_in_multExpr375 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_signExpr_in_multExpr381 = new BitSet(new long[]{0x0000000008800002L});
	public static final BitSet FOLLOW_27_in_multExpr389 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_signExpr_in_multExpr395 = new BitSet(new long[]{0x0000000008800002L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_signExpr425 = new BitSet(new long[]{0x0000000000306400L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_primaryExpr447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Floating_point_constant_in_primaryExpr454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_primaryExpr468 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_primaryExpr475 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_arith_expression_in_primaryExpr477 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_primaryExpr479 = new BitSet(new long[]{0x0000000000000002L});
}
