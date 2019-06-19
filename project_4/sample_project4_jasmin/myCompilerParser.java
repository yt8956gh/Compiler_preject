// $ANTLR 3.5.2 myCompiler.g 2019-06-19 21:28:20

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
			// myCompiler.g:84:10: VOID MAIN '(' ')' '{' declarations statements '}'
			{
			match(input,VOID,FOLLOW_VOID_in_program36); 
			match(input,MAIN,FOLLOW_MAIN_in_program38); 
			match(input,21,FOLLOW_21_in_program40); 
			match(input,22,FOLLOW_22_in_program42); 

			           /* Output function prologue */
			           prologue();
			        
			match(input,30,FOLLOW_30_in_program63); 
			pushFollow(FOLLOW_declarations_in_program77);
			declarations();
			state._fsp--;

			pushFollow(FOLLOW_statements_in_program90);
			statements();
			state._fsp--;

			match(input,31,FOLLOW_31_in_program100); 

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
	// myCompiler.g:104:1: declarations : ( type Identifier ';' declarations |);
	public final void declarations() throws RecognitionException {
		Token Identifier1=null;
		Type type2 =null;

		try {
			// myCompiler.g:104:13: ( type Identifier ';' declarations |)
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
					// myCompiler.g:104:15: type Identifier ';' declarations
					{
					pushFollow(FOLLOW_type_in_declarations127);
					type2=type();
					state._fsp--;

					Identifier1=(Token)match(input,Identifier,FOLLOW_Identifier_in_declarations129); 
					match(input,28,FOLLOW_28_in_declarations131); 
					pushFollow(FOLLOW_declarations_in_declarations133);
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
					// myCompiler.g:125:3: 
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
	// myCompiler.g:131:1: type returns [Type attr_type] : ( INT | FLOAT );
	public final Type type() throws RecognitionException {
		Type attr_type = null;


		try {
			// myCompiler.g:133:5: ( INT | FLOAT )
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
					// myCompiler.g:133:7: INT
					{
					match(input,INT,FOLLOW_INT_in_type171); 
					 if (TRACEON) System.out.println("type: INT"); attr_type=Type.INT; 
					}
					break;
				case 2 :
					// myCompiler.g:134:7: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type181); 
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
	// myCompiler.g:137:1: statements : ( statement statements |);
	public final void statements() throws RecognitionException {
		try {
			// myCompiler.g:137:11: ( statement statements |)
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
					// myCompiler.g:137:12: statement statements
					{
					pushFollow(FOLLOW_statement_in_statements191);
					statement();
					state._fsp--;

					pushFollow(FOLLOW_statements_in_statements193);
					statements();
					state._fsp--;

					}
					break;
				case 2 :
					// myCompiler.g:139:11: 
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
	// myCompiler.g:141:1: statement : ( assign_stmt ';' | if_stmt | func_no_return_stmt ';' | for_stmt );
	public final void statement() throws RecognitionException {
		try {
			// myCompiler.g:141:10: ( assign_stmt ';' | if_stmt | func_no_return_stmt ';' | for_stmt )
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
					// myCompiler.g:141:12: assign_stmt ';'
					{
					pushFollow(FOLLOW_assign_stmt_in_statement223);
					assign_stmt();
					state._fsp--;

					match(input,28,FOLLOW_28_in_statement225); 
					}
					break;
				case 2 :
					// myCompiler.g:142:12: if_stmt
					{
					pushFollow(FOLLOW_if_stmt_in_statement238);
					if_stmt();
					state._fsp--;

					}
					break;
				case 3 :
					// myCompiler.g:143:12: func_no_return_stmt ';'
					{
					pushFollow(FOLLOW_func_no_return_stmt_in_statement251);
					func_no_return_stmt();
					state._fsp--;

					match(input,28,FOLLOW_28_in_statement253); 
					}
					break;
				case 4 :
					// myCompiler.g:144:12: for_stmt
					{
					pushFollow(FOLLOW_for_stmt_in_statement266);
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
	// myCompiler.g:147:1: for_stmt : FOR '(' assign_stmt ';' cond_expression ';' assign_stmt ')' block_stmt ;
	public final void for_stmt() throws RecognitionException {
		try {
			// myCompiler.g:147:9: ( FOR '(' assign_stmt ';' cond_expression ';' assign_stmt ')' block_stmt )
			// myCompiler.g:147:11: FOR '(' assign_stmt ';' cond_expression ';' assign_stmt ')' block_stmt
			{
			match(input,FOR,FOLLOW_FOR_in_for_stmt283); 
			match(input,21,FOLLOW_21_in_for_stmt285); 
			pushFollow(FOLLOW_assign_stmt_in_for_stmt287);
			assign_stmt();
			state._fsp--;

			match(input,28,FOLLOW_28_in_for_stmt289); 
			pushFollow(FOLLOW_cond_expression_in_for_stmt309);
			cond_expression();
			state._fsp--;

			match(input,28,FOLLOW_28_in_for_stmt311); 
			pushFollow(FOLLOW_assign_stmt_in_for_stmt319);
			assign_stmt();
			state._fsp--;

			match(input,22,FOLLOW_22_in_for_stmt327); 
			pushFollow(FOLLOW_block_stmt_in_for_stmt338);
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
	// myCompiler.g:155:1: if_stmt : if_then_stmt if_else_stmt ;
	public final void if_stmt() throws RecognitionException {
		try {
			// myCompiler.g:156:13: ( if_then_stmt if_else_stmt )
			// myCompiler.g:156:15: if_then_stmt if_else_stmt
			{
			pushFollow(FOLLOW_if_then_stmt_in_if_stmt374);
			if_then_stmt();
			state._fsp--;

			pushFollow(FOLLOW_if_else_stmt_in_if_stmt376);
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
	// myCompiler.g:160:1: if_then_stmt : IF '(' cond_expression ')' block_stmt ;
	public final void if_then_stmt() throws RecognitionException {
		try {
			// myCompiler.g:161:13: ( IF '(' cond_expression ')' block_stmt )
			// myCompiler.g:161:15: IF '(' cond_expression ')' block_stmt
			{
			match(input,IF,FOLLOW_IF_in_if_then_stmt414); 
			match(input,21,FOLLOW_21_in_if_then_stmt416); 
			pushFollow(FOLLOW_cond_expression_in_if_then_stmt418);
			cond_expression();
			state._fsp--;

			match(input,22,FOLLOW_22_in_if_then_stmt420); 
			pushFollow(FOLLOW_block_stmt_in_if_then_stmt422);
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
	// myCompiler.g:165:1: if_else_stmt : ( ELSE block_stmt |);
	public final void if_else_stmt() throws RecognitionException {
		try {
			// myCompiler.g:166:13: ( ELSE block_stmt |)
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
					// myCompiler.g:166:15: ELSE block_stmt
					{
					match(input,ELSE,FOLLOW_ELSE_in_if_else_stmt456); 
					pushFollow(FOLLOW_block_stmt_in_if_else_stmt458);
					block_stmt();
					state._fsp--;

					}
					break;
				case 2 :
					// myCompiler.g:168:13: 
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
	// myCompiler.g:171:1: block_stmt : '{' statements '}' ;
	public final void block_stmt() throws RecognitionException {
		try {
			// myCompiler.g:171:11: ( '{' statements '}' )
			// myCompiler.g:171:13: '{' statements '}'
			{
			match(input,30,FOLLOW_30_in_block_stmt499); 
			pushFollow(FOLLOW_statements_in_block_stmt501);
			statements();
			state._fsp--;

			match(input,31,FOLLOW_31_in_block_stmt503); 
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
	// myCompiler.g:175:1: assign_stmt : Identifier '=' arith_expression ;
	public final void assign_stmt() throws RecognitionException {
		Token Identifier3=null;
		Type arith_expression4 =null;

		try {
			// myCompiler.g:175:12: ( Identifier '=' arith_expression )
			// myCompiler.g:175:14: Identifier '=' arith_expression
			{
			Identifier3=(Token)match(input,Identifier,FOLLOW_Identifier_in_assign_stmt515); 
			match(input,29,FOLLOW_29_in_assign_stmt517); 
			pushFollow(FOLLOW_arith_expression_in_assign_stmt519);
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
	// myCompiler.g:203:1: func_no_return_stmt : Identifier '(' argument ')' ;
	public final void func_no_return_stmt() throws RecognitionException {
		try {
			// myCompiler.g:203:20: ( Identifier '(' argument ')' )
			// myCompiler.g:203:22: Identifier '(' argument ')'
			{
			match(input,Identifier,FOLLOW_Identifier_in_func_no_return_stmt559); 
			match(input,21,FOLLOW_21_in_func_no_return_stmt561); 
			pushFollow(FOLLOW_argument_in_func_no_return_stmt563);
			argument();
			state._fsp--;

			match(input,22,FOLLOW_22_in_func_no_return_stmt565); 
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
	// myCompiler.g:207:1: argument : arg ( ',' arg )* ;
	public final void argument() throws RecognitionException {
		try {
			// myCompiler.g:207:9: ( arg ( ',' arg )* )
			// myCompiler.g:207:11: arg ( ',' arg )*
			{
			pushFollow(FOLLOW_arg_in_argument593);
			arg();
			state._fsp--;

			// myCompiler.g:207:15: ( ',' arg )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==25) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// myCompiler.g:207:16: ',' arg
					{
					match(input,25,FOLLOW_25_in_argument596); 
					pushFollow(FOLLOW_arg_in_argument598);
					arg();
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
	// $ANTLR end "argument"



	// $ANTLR start "arg"
	// myCompiler.g:210:1: arg : ( arith_expression | STRING_LITERAL );
	public final void arg() throws RecognitionException {
		try {
			// myCompiler.g:210:4: ( arith_expression | STRING_LITERAL )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==Floating_point_constant||(LA7_0 >= Identifier && LA7_0 <= Integer_constant)||(LA7_0 >= 20 && LA7_0 <= 21)||LA7_0==26) ) {
				alt7=1;
			}
			else if ( (LA7_0==STRING_LITERAL) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// myCompiler.g:210:6: arith_expression
					{
					pushFollow(FOLLOW_arith_expression_in_arg616);
					arith_expression();
					state._fsp--;

					}
					break;
				case 2 :
					// myCompiler.g:211:6: STRING_LITERAL
					{
					match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_arg623); 
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
	// $ANTLR end "arg"



	// $ANTLR start "cond_expression"
	// myCompiler.g:214:1: cond_expression returns [boolean truth] : a= arith_expression ( RelationOP arith_expression )* ;
	public final boolean cond_expression() throws RecognitionException {
		boolean truth = false;


		Type a =null;

		try {
			// myCompiler.g:216:16: (a= arith_expression ( RelationOP arith_expression )* )
			// myCompiler.g:216:18: a= arith_expression ( RelationOP arith_expression )*
			{
			pushFollow(FOLLOW_arith_expression_in_cond_expression661);
			a=arith_expression();
			state._fsp--;


							    if (a.ordinal() != 0)
								   truth = true;
								else
								   truth = false;
							 
			// myCompiler.g:223:18: ( RelationOP arith_expression )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==RelationOP) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// myCompiler.g:223:19: RelationOP arith_expression
					{
					match(input,RelationOP,FOLLOW_RelationOP_in_cond_expression691); 
					pushFollow(FOLLOW_arith_expression_in_cond_expression693);
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
	// myCompiler.g:227:1: arith_expression returns [Type attr_type] : a= multExpr ( '+' b= multExpr | '-' c= multExpr )* ;
	public final Type arith_expression() throws RecognitionException {
		Type attr_type = null;


		Type a =null;
		Type b =null;
		Type c =null;

		try {
			// myCompiler.g:229:17: (a= multExpr ( '+' b= multExpr | '-' c= multExpr )* )
			// myCompiler.g:229:19: a= multExpr ( '+' b= multExpr | '-' c= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_arith_expression748);
			a=multExpr();
			state._fsp--;

			 attr_type = a; 
			// myCompiler.g:230:18: ( '+' b= multExpr | '-' c= multExpr )*
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
					// myCompiler.g:230:20: '+' b= multExpr
					{
					match(input,24,FOLLOW_24_in_arith_expression771); 
					pushFollow(FOLLOW_multExpr_in_arith_expression775);
					b=multExpr();
					state._fsp--;


					                              if ((attr_type == Type.INT) &&(b == Type.INT))  TextCode.add("iadd");
					                              else TextCode.add("fadd");
					                       
					}
					break;
				case 2 :
					// myCompiler.g:235:20: '-' c= multExpr
					{
					match(input,26,FOLLOW_26_in_arith_expression821); 
					pushFollow(FOLLOW_multExpr_in_arith_expression825);
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
	// myCompiler.g:243:1: multExpr returns [Type attr_type] : a= signExpr ( '*' b= signExpr | '/' c= signExpr )* ;
	public final Type multExpr() throws RecognitionException {
		Type attr_type = null;


		Type a =null;
		Type b =null;
		Type c =null;

		try {
			// myCompiler.g:245:11: (a= signExpr ( '*' b= signExpr | '/' c= signExpr )* )
			// myCompiler.g:245:13: a= signExpr ( '*' b= signExpr | '/' c= signExpr )*
			{
			pushFollow(FOLLOW_signExpr_in_multExpr911);
			a=signExpr();
			state._fsp--;

			 attr_type =a; 
			// myCompiler.g:246:11: ( '*' b= signExpr | '/' c= signExpr )*
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
					// myCompiler.g:246:13: '*' b= signExpr
					{
					match(input,23,FOLLOW_23_in_multExpr927); 
					pushFollow(FOLLOW_signExpr_in_multExpr931);
					b=signExpr();
					state._fsp--;


					                              if ((attr_type == Type.INT) &&(b == Type.INT))  TextCode.add("imul");
					                              else TextCode.add("fmul");
					                       
					}
					break;
				case 2 :
					// myCompiler.g:251:13: '/' c= signExpr
					{
					match(input,27,FOLLOW_27_in_multExpr970); 
					pushFollow(FOLLOW_signExpr_in_multExpr974);
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
	// myCompiler.g:259:1: signExpr returns [Type attr_type] : (a= primaryExpr[1] | '-' b= primaryExpr[-1] );
	public final Type signExpr() throws RecognitionException {
		Type attr_type = null;


		Type a =null;
		Type b =null;

		try {
			// myCompiler.g:261:9: (a= primaryExpr[1] | '-' b= primaryExpr[-1] )
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
					// myCompiler.g:261:11: a= primaryExpr[1]
					{
					pushFollow(FOLLOW_primaryExpr_in_signExpr1030);
					a=primaryExpr(1);
					state._fsp--;

					 attr_type =a;
					}
					break;
				case 2 :
					// myCompiler.g:262:11: '-' b= primaryExpr[-1]
					{
					match(input,26,FOLLOW_26_in_signExpr1046); 
					pushFollow(FOLLOW_primaryExpr_in_signExpr1050);
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
	// myCompiler.g:265:1: primaryExpr[int posneg] returns [Type attr_type] : ( Integer_constant | Floating_point_constant | Identifier | '&' Identifier | '(' arith_expression ')' );
	public final Type primaryExpr(int posneg) throws RecognitionException {
		Type attr_type = null;


		Token Integer_constant5=null;
		Token Floating_point_constant6=null;
		Token Identifier7=null;

		try {
			// myCompiler.g:267:12: ( Integer_constant | Floating_point_constant | Identifier | '&' Identifier | '(' arith_expression ')' )
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
					// myCompiler.g:267:14: Integer_constant
					{
					Integer_constant5=(Token)match(input,Integer_constant,FOLLOW_Integer_constant_in_primaryExpr1084); 

								    attr_type = Type.INT;

					             System.out.println("posneg: "+posneg);
									
									// code generation.
									// push the integer into the operand stack.

					            if(posneg>0) TextCode.add("ldc " + (Integer_constant5!=null?Integer_constant5.getText():null));
					            else TextCode.add("ldc -" + (Integer_constant5!=null?Integer_constant5.getText():null));
								 
					}
					break;
				case 2 :
					// myCompiler.g:279:14: Floating_point_constant
					{
					Floating_point_constant6=(Token)match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_primaryExpr1108); 

					              
								    attr_type = Type.FLOAT;
									
									// code generation.
									// push the Float into the operand stack.

					            if(posneg>0) TextCode.add("ldc " + (Floating_point_constant6!=null?Floating_point_constant6.getText():null));
					            else TextCode.add("ldc -" + (Floating_point_constant6!=null?Floating_point_constant6.getText():null));
					           
					}
					break;
				case 3 :
					// myCompiler.g:290:14: Identifier
					{
					Identifier7=(Token)match(input,Identifier,FOLLOW_Identifier_in_primaryExpr1136); 

								    // get type information from symtab.
								    attr_type = (Type) symtab.get((Identifier7!=null?Identifier7.getText():null)).get(0);
									
									switch (attr_type) {
									case INT: 
									          // load the variable into the operand stack.
									          TextCode.add("iload " + symtab.get((Identifier7!=null?Identifier7.getText():null)).get(1));
									          break;
									case FLOAT:
					                     TextCode.add("fload " + symtab.get((Identifier7!=null?Identifier7.getText():null)).get(1));
									          break;
									}
								 
					}
					break;
				case 4 :
					// myCompiler.g:305:7: '&' Identifier
					{
					match(input,20,FOLLOW_20_in_primaryExpr1153); 
					match(input,Identifier,FOLLOW_Identifier_in_primaryExpr1155); 
					}
					break;
				case 5 :
					// myCompiler.g:306:7: '(' arith_expression ')'
					{
					match(input,21,FOLLOW_21_in_primaryExpr1163); 
					pushFollow(FOLLOW_arith_expression_in_primaryExpr1165);
					arith_expression();
					state._fsp--;

					match(input,22,FOLLOW_22_in_primaryExpr1167); 
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



	public static final BitSet FOLLOW_VOID_in_program36 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MAIN_in_program38 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_program40 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_program42 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_program63 = new BitSet(new long[]{0x0000000080003B00L});
	public static final BitSet FOLLOW_declarations_in_program77 = new BitSet(new long[]{0x0000000080002A00L});
	public static final BitSet FOLLOW_statements_in_program90 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_program100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declarations127 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_declarations129 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_declarations131 = new BitSet(new long[]{0x0000000000001100L});
	public static final BitSet FOLLOW_declarations_in_declarations133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements191 = new BitSet(new long[]{0x0000000000002A00L});
	public static final BitSet FOLLOW_statements_in_statements193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_stmt_in_statement223 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_statement225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stmt_in_statement238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_no_return_stmt_in_statement251 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_statement253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_stmt_in_statement266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_for_stmt283 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_for_stmt285 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_assign_stmt_in_for_stmt287 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_for_stmt289 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_cond_expression_in_for_stmt309 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_for_stmt311 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_assign_stmt_in_for_stmt319 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_for_stmt327 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_block_stmt_in_for_stmt338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_then_stmt_in_if_stmt374 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_if_else_stmt_in_if_stmt376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_then_stmt414 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_if_then_stmt416 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_cond_expression_in_if_then_stmt418 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_if_then_stmt420 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_block_stmt_in_if_then_stmt422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_if_else_stmt456 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_block_stmt_in_if_else_stmt458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_block_stmt499 = new BitSet(new long[]{0x0000000080002A00L});
	public static final BitSet FOLLOW_statements_in_block_stmt501 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_block_stmt503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assign_stmt515 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_assign_stmt517 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_arith_expression_in_assign_stmt519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_func_no_return_stmt559 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_func_no_return_stmt561 = new BitSet(new long[]{0x0000000004326400L});
	public static final BitSet FOLLOW_argument_in_func_no_return_stmt563 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_func_no_return_stmt565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arg_in_argument593 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_argument596 = new BitSet(new long[]{0x0000000004326400L});
	public static final BitSet FOLLOW_arg_in_argument598 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_arith_expression_in_arg616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_arg623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expression_in_cond_expression661 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_RelationOP_in_cond_expression691 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_arith_expression_in_cond_expression693 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression748 = new BitSet(new long[]{0x0000000005000002L});
	public static final BitSet FOLLOW_24_in_arith_expression771 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression775 = new BitSet(new long[]{0x0000000005000002L});
	public static final BitSet FOLLOW_26_in_arith_expression821 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression825 = new BitSet(new long[]{0x0000000005000002L});
	public static final BitSet FOLLOW_signExpr_in_multExpr911 = new BitSet(new long[]{0x0000000008800002L});
	public static final BitSet FOLLOW_23_in_multExpr927 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_signExpr_in_multExpr931 = new BitSet(new long[]{0x0000000008800002L});
	public static final BitSet FOLLOW_27_in_multExpr970 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_signExpr_in_multExpr974 = new BitSet(new long[]{0x0000000008800002L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr1030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_signExpr1046 = new BitSet(new long[]{0x0000000000306400L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr1050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_primaryExpr1084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Floating_point_constant_in_primaryExpr1108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr1136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_primaryExpr1153 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr1155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_primaryExpr1163 = new BitSet(new long[]{0x0000000004306400L});
	public static final BitSet FOLLOW_arith_expression_in_primaryExpr1165 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_primaryExpr1167 = new BitSet(new long[]{0x0000000000000002L});
}
