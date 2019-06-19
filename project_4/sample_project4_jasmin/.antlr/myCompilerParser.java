// Generated from /home/nian/git/Compiler_preject/project_4/sample_project4_jasmin/myCompiler.g by ANTLR 4.7.1

    // import packages here.
    import java.util.HashMap;
    import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myCompilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, FLOAT=13, INT=14, CHAR=15, MAIN=16, VOID=17, 
		IF=18, ELSE=19, FOR=20, RelationOP=21, Identifier=22, Integer_constant=23, 
		Floating_point_constant=24, STRING_LITERAL=25, WS=26, COMMENT=27;
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_type = 2, RULE_statements = 3, 
		RULE_statement = 4, RULE_for_stmt = 5, RULE_if_stmt = 6, RULE_if_then_stmt = 7, 
		RULE_if_else_stmt = 8, RULE_block_stmt = 9, RULE_assign_stmt = 10, RULE_func_no_return_stmt = 11, 
		RULE_argument = 12, RULE_arg = 13, RULE_cond_expression = 14, RULE_arith_expression = 15, 
		RULE_multExpr = 16, RULE_signExpr = 17, RULE_primaryExpr = 18;
	public static final String[] ruleNames = {
		"program", "declarations", "type", "statements", "statement", "for_stmt", 
		"if_stmt", "if_then_stmt", "if_else_stmt", "block_stmt", "assign_stmt", 
		"func_no_return_stmt", "argument", "arg", "cond_expression", "arith_expression", 
		"multExpr", "signExpr", "primaryExpr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'}'", "';'", "'='", "','", "'+'", "'-'", "'*'", 
		"'/'", "'&'", "'float'", "'int'", "'char'", "'main'", "'void'", "'if'", 
		"'else'", "'for'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "FLOAT", "INT", "CHAR", "MAIN", "VOID", "IF", "ELSE", "FOR", "RelationOP", 
		"Identifier", "Integer_constant", "Floating_point_constant", "STRING_LITERAL", 
		"WS", "COMMENT"
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

	@Override
	public String getGrammarFileName() { return "myCompiler.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public myCompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(myCompilerParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(myCompilerParser.MAIN, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(VOID);
			setState(39);
			match(MAIN);
			setState(40);
			match(T__0);
			setState(41);
			match(T__1);

			           /* Output function prologue */
			           prologue();
			        
			setState(43);
			match(T__2);
			setState(44);
			declarations();
			setState(45);
			statements();
			setState(46);
			match(T__3);

					   if (TRACEON)
					      System.out.println("VOID MAIN () {declarations statements}");

			           /* output function epilogue */	  
			           epilogue();
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(myCompilerParser.Identifier, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				type();
				setState(50);
				match(Identifier);
				setState(51);
				match(T__4);
				setState(52);
				declarations();

							     if (TRACEON)
					                System.out.println("declarations: type Identifier : declarations");

				                 if (symtab.containsKey((((DeclarationsContext)_localctx).Identifier!=null?((DeclarationsContext)_localctx).Identifier.getText():null))) {
								    // variable re-declared.
				                    System.out.println("Type Error: " + 
				                                       ((DeclarationsContext)_localctx).Identifier.getLine() + 
				                                       ": Redeclared identifier.");
				                    System.exit(0);
				                 }
				                 
								 /* Add ID and its attr_type into the symbol table. */
								 ArrayList the_list = new ArrayList();
								 the_list.add(((DeclarationsContext)_localctx).type.attr_type);
								 the_list.add(storageIndex);
								 storageIndex = storageIndex + 1;
				             symtab.put((((DeclarationsContext)_localctx).Identifier!=null?((DeclarationsContext)_localctx).Identifier.getText():null), the_list);
				      
				}
				break;
			case T__3:
			case IF:
			case FOR:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{

							     if (TRACEON)
				                    System.out.println("declarations: ");
						
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type attr_type;
		public TerminalNode INT() { return getToken(myCompilerParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(myCompilerParser.FLOAT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(INT);
				 if (TRACEON) System.out.println("type: INT"); attr_type=Type.INT; 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(FLOAT);
				if (TRACEON) System.out.println("type: FLOAT"); attr_type=Type.FLOAT; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statements);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case FOR:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				statement();
				setState(65);
				statements();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Func_no_return_stmtContext func_no_return_stmt() {
			return getRuleContext(Func_no_return_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				assign_stmt();
				setState(71);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				if_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				func_no_return_stmt();
				setState(75);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				for_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(myCompilerParser.FOR, 0); }
		public List<Assign_stmtContext> assign_stmt() {
			return getRuleContexts(Assign_stmtContext.class);
		}
		public Assign_stmtContext assign_stmt(int i) {
			return getRuleContext(Assign_stmtContext.class,i);
		}
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public Block_stmtContext block_stmt() {
			return getRuleContext(Block_stmtContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(FOR);
			setState(81);
			match(T__0);
			setState(82);
			assign_stmt();
			setState(83);
			match(T__4);
			setState(84);
			cond_expression();
			setState(85);
			match(T__4);
			setState(86);
			assign_stmt();
			setState(87);
			match(T__1);
			setState(88);
			block_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public If_then_stmtContext if_then_stmt() {
			return getRuleContext(If_then_stmtContext.class,0);
		}
		public If_else_stmtContext if_else_stmt() {
			return getRuleContext(If_else_stmtContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			if_then_stmt();
			setState(91);
			if_else_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_then_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(myCompilerParser.IF, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public Block_stmtContext block_stmt() {
			return getRuleContext(Block_stmtContext.class,0);
		}
		public If_then_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_then_stmt; }
	}

	public final If_then_stmtContext if_then_stmt() throws RecognitionException {
		If_then_stmtContext _localctx = new If_then_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_then_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(IF);
			setState(94);
			match(T__0);
			setState(95);
			cond_expression();
			setState(96);
			match(T__1);
			setState(97);
			block_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_else_stmtContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(myCompilerParser.ELSE, 0); }
		public Block_stmtContext block_stmt() {
			return getRuleContext(Block_stmtContext.class,0);
		}
		public If_else_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else_stmt; }
	}

	public final If_else_stmtContext if_else_stmt() throws RecognitionException {
		If_else_stmtContext _localctx = new If_else_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_if_else_stmt);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(ELSE);
				setState(100);
				block_stmt();
				}
				break;
			case T__3:
			case IF:
			case FOR:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_stmtContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_stmt; }
	}

	public final Block_stmtContext block_stmt() throws RecognitionException {
		Block_stmtContext _localctx = new Block_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__2);
			setState(105);
			statements();
			setState(106);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_stmtContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(myCompilerParser.Identifier, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(Identifier);
			setState(109);
			match(T__5);
			setState(110);
			arith_expression();

						   Type the_type;
						   int the_mem;
						   
						   // get the ID's location and type from symtab.			   
						   the_type = (Type) symtab.get((((Assign_stmtContext)_localctx).Identifier!=null?((Assign_stmtContext)_localctx).Identifier.getText():null)).get(0);
						   the_mem = (int) symtab.get((((Assign_stmtContext)_localctx).Identifier!=null?((Assign_stmtContext)_localctx).Identifier.getText():null)).get(1);
						   
						   if (the_type != ((Assign_stmtContext)_localctx).arith_expression.attr_type) {
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
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_no_return_stmtContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(myCompilerParser.Identifier, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(myCompilerParser.STRING_LITERAL, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public Func_no_return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_no_return_stmt; }
	}

	public final Func_no_return_stmtContext func_no_return_stmt() throws RecognitionException {
		Func_no_return_stmtContext _localctx = new Func_no_return_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_func_no_return_stmt);

			List<Float> args=new ArrayList<Float>(); 
			List<String> refs=new ArrayList<String>();
		   boolean isPrintf = false;
		   String tmp = null;

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(Identifier);
			setState(114);
			match(T__0);
			setState(115);
			match(STRING_LITERAL);

				   if((((Func_no_return_stmtContext)_localctx).Identifier!=null?((Func_no_return_stmtContext)_localctx).Identifier.getText():null).equals("printf"))
					{
			            isPrintf = true;
							tmp = new String((((Func_no_return_stmtContext)_localctx).STRING_LITERAL!=null?((Func_no_return_stmtContext)_localctx).STRING_LITERAL.getText():null));
							tmp = tmp.substring(1,tmp.length()-1 ); //remove quotation mark

			            int retD = tmp.indexOf("\%d");
							int retF = tmp.indexOf("\%f");
			            int retN = tmp.indexOf("\\n");

			            if(retN==-1 && retD==-1 && retF==-1){
			                  TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
			                  TextCode.add("ldc \""+tmp+"\"");
			                  TextCode.add("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
			            }
					}

			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(117);
				match(T__6);
				setState(118);
				arg();

				                  int retD=0, retF=0, retN=0;
										retD = tmp.indexOf("\%d");
										retF = tmp.indexOf("\%f");
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

				                        retD = tmp.indexOf("\%d");
										      retF = tmp.indexOf("\%f");
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
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(T__1);


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
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			arg();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(130);
				match(T__6);
				setState(131);
				arg();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			arith_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cond_expressionContext extends ParserRuleContext {
		public boolean truth;
		public Arith_expressionContext a;
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public List<TerminalNode> RelationOP() { return getTokens(myCompilerParser.RelationOP); }
		public TerminalNode RelationOP(int i) {
			return getToken(myCompilerParser.RelationOP, i);
		}
		public Cond_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_expression; }
	}

	public final Cond_expressionContext cond_expression() throws RecognitionException {
		Cond_expressionContext _localctx = new Cond_expressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cond_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			((Cond_expressionContext)_localctx).a = arith_expression();

							    if (((Cond_expressionContext)_localctx).a.attr_type.ordinal() != 0)
								   truth = true;
								else
								   truth = false;
							 
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RelationOP) {
				{
				{
				setState(141);
				match(RelationOP);
				setState(142);
				arith_expression();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arith_expressionContext extends ParserRuleContext {
		public Type attr_type;
		public MultExprContext a;
		public MultExprContext b;
		public MultExprContext c;
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
		}
		public Arith_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expression; }
	}

	public final Arith_expressionContext arith_expression() throws RecognitionException {
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arith_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			((Arith_expressionContext)_localctx).a = multExpr();
			 ((Arith_expressionContext)_localctx).attr_type =  ((Arith_expressionContext)_localctx).a.attr_type; 
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==T__8) {
				{
				setState(158);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__7:
					{
					setState(150);
					match(T__7);
					setState(151);
					((Arith_expressionContext)_localctx).b = multExpr();

					                              if ((_localctx.attr_type == Type.INT) &&(((Arith_expressionContext)_localctx).b.attr_type == Type.INT))  TextCode.add("iadd");
					                              else TextCode.add("fadd");
					                       
					}
					break;
				case T__8:
					{
					setState(154);
					match(T__8);
					setState(155);
					((Arith_expressionContext)_localctx).c = multExpr();

					                              if ((_localctx.attr_type == Type.INT) &&(((Arith_expressionContext)_localctx).c.attr_type == Type.INT))  TextCode.add("isub");
					                              else TextCode.add("fsub");
					                      
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultExprContext extends ParserRuleContext {
		public Type attr_type;
		public SignExprContext a;
		public SignExprContext b;
		public SignExprContext c;
		public List<SignExprContext> signExpr() {
			return getRuleContexts(SignExprContext.class);
		}
		public SignExprContext signExpr(int i) {
			return getRuleContext(SignExprContext.class,i);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_multExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			((MultExprContext)_localctx).a = signExpr();
			 ((MultExprContext)_localctx).attr_type = ((MultExprContext)_localctx).a.attr_type; 
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9 || _la==T__10) {
				{
				setState(173);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(165);
					match(T__9);
					setState(166);
					((MultExprContext)_localctx).b = signExpr();

					                              if ((_localctx.attr_type == Type.INT) &&(((MultExprContext)_localctx).b.attr_type == Type.INT))  TextCode.add("imul");
					                              else TextCode.add("fmul");
					                       
					}
					break;
				case T__10:
					{
					setState(169);
					match(T__10);
					setState(170);
					((MultExprContext)_localctx).c = signExpr();

					                              if ((_localctx.attr_type == Type.INT) &&(((MultExprContext)_localctx).c.attr_type == Type.INT))  TextCode.add("idiv");
					                              else TextCode.add("fdiv");
					                      
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignExprContext extends ParserRuleContext {
		public Type attr_type;
		public PrimaryExprContext a;
		public PrimaryExprContext b;
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public SignExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signExpr; }
	}

	public final SignExprContext signExpr() throws RecognitionException {
		SignExprContext _localctx = new SignExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_signExpr);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__11:
			case Identifier:
			case Integer_constant:
			case Floating_point_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				((SignExprContext)_localctx).a = primaryExpr(1);
				 ((SignExprContext)_localctx).attr_type = ((SignExprContext)_localctx).a.attr_type;
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(T__8);
				setState(182);
				((SignExprContext)_localctx).b = primaryExpr(-1);
				 ((SignExprContext)_localctx).attr_type = ((SignExprContext)_localctx).b.attr_type;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExprContext extends ParserRuleContext {
		public int posneg;
		public Type attr_type;
		public TerminalNode Integer_constant() { return getToken(myCompilerParser.Integer_constant, 0); }
		public TerminalNode Floating_point_constant() { return getToken(myCompilerParser.Floating_point_constant, 0); }
		public TerminalNode Identifier() { return getToken(myCompilerParser.Identifier, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PrimaryExprContext(ParserRuleContext parent, int invokingState, int posneg) {
			super(parent, invokingState);
			this.posneg = posneg;
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
	}

	public final PrimaryExprContext primaryExpr(int posneg) throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState(), posneg);
		enterRule(_localctx, 36, RULE_primaryExpr);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(Integer_constant);

							    ((PrimaryExprContext)_localctx).attr_type =  Type.INT;

				             System.out.println("posneg: "+posneg);
								
								// code generation.
								// push the integer into the operand stack.

				            if(_localctx.posneg>0) TextCode.add("ldc " + (((PrimaryExprContext)_localctx).Integer_constant!=null?((PrimaryExprContext)_localctx).Integer_constant.getText():null));
				            else TextCode.add("ldc -" + (((PrimaryExprContext)_localctx).Integer_constant!=null?((PrimaryExprContext)_localctx).Integer_constant.getText():null));
							 
				}
				break;
			case Floating_point_constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(Floating_point_constant);

				              
							    ((PrimaryExprContext)_localctx).attr_type =  Type.FLOAT;
								
								// code generation.
								// push the Float into the operand stack.

				            if(_localctx.posneg>0) TextCode.add("ldc " + (((PrimaryExprContext)_localctx).Floating_point_constant!=null?((PrimaryExprContext)_localctx).Floating_point_constant.getText():null));
				            else TextCode.add("ldc -" + (((PrimaryExprContext)_localctx).Floating_point_constant!=null?((PrimaryExprContext)_localctx).Floating_point_constant.getText():null));
				           
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(Identifier);

							    // get type information from symtab.
							    ((PrimaryExprContext)_localctx).attr_type =  (Type) symtab.get((((PrimaryExprContext)_localctx).Identifier!=null?((PrimaryExprContext)_localctx).Identifier.getText():null)).get(0);
								
								switch (_localctx.attr_type) {
								case INT: 
								          // load the variable into the operand stack.
								          TextCode.add("iload " + symtab.get((((PrimaryExprContext)_localctx).Identifier!=null?((PrimaryExprContext)_localctx).Identifier.getText():null)).get(1));
								          break;
								case FLOAT:
				                     TextCode.add("fload " + symtab.get((((PrimaryExprContext)_localctx).Identifier!=null?((PrimaryExprContext)_localctx).Identifier.getText():null)).get(1));
								          break;
								}
							 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				match(T__11);
				setState(194);
				match(Identifier);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				match(T__0);
				setState(196);
				arith_expression();
				setState(197);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00cc\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\3\4\5\4A\n\4\3\5\3\5\3\5\3"+
		"\5\5\5G\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6Q\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\5\ni\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\7\r|\n\r\f\r\16\r\177\13\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16"+
		"\u0087\n\16\f\16\16\16\u008a\13\16\3\17\3\17\3\20\3\20\3\20\3\20\7\20"+
		"\u0092\n\20\f\20\16\20\u0095\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\7\21\u00a1\n\21\f\21\16\21\u00a4\13\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00b0\n\22\f\22\16\22\u00b3\13"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00bc\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00ca\n\24\3\24\2\2"+
		"\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\2\2\u00cb\2(\3\2\2\2"+
		"\4:\3\2\2\2\6@\3\2\2\2\bF\3\2\2\2\nP\3\2\2\2\fR\3\2\2\2\16\\\3\2\2\2\20"+
		"_\3\2\2\2\22h\3\2\2\2\24j\3\2\2\2\26n\3\2\2\2\30s\3\2\2\2\32\u0083\3\2"+
		"\2\2\34\u008b\3\2\2\2\36\u008d\3\2\2\2 \u0096\3\2\2\2\"\u00a5\3\2\2\2"+
		"$\u00bb\3\2\2\2&\u00c9\3\2\2\2()\7\23\2\2)*\7\22\2\2*+\7\3\2\2+,\7\4\2"+
		"\2,-\b\2\1\2-.\7\5\2\2./\5\4\3\2/\60\5\b\5\2\60\61\7\6\2\2\61\62\b\2\1"+
		"\2\62\3\3\2\2\2\63\64\5\6\4\2\64\65\7\30\2\2\65\66\7\7\2\2\66\67\5\4\3"+
		"\2\678\b\3\1\28;\3\2\2\29;\b\3\1\2:\63\3\2\2\2:9\3\2\2\2;\5\3\2\2\2<="+
		"\7\20\2\2=A\b\4\1\2>?\7\17\2\2?A\b\4\1\2@<\3\2\2\2@>\3\2\2\2A\7\3\2\2"+
		"\2BC\5\n\6\2CD\5\b\5\2DG\3\2\2\2EG\3\2\2\2FB\3\2\2\2FE\3\2\2\2G\t\3\2"+
		"\2\2HI\5\26\f\2IJ\7\7\2\2JQ\3\2\2\2KQ\5\16\b\2LM\5\30\r\2MN\7\7\2\2NQ"+
		"\3\2\2\2OQ\5\f\7\2PH\3\2\2\2PK\3\2\2\2PL\3\2\2\2PO\3\2\2\2Q\13\3\2\2\2"+
		"RS\7\26\2\2ST\7\3\2\2TU\5\26\f\2UV\7\7\2\2VW\5\36\20\2WX\7\7\2\2XY\5\26"+
		"\f\2YZ\7\4\2\2Z[\5\24\13\2[\r\3\2\2\2\\]\5\20\t\2]^\5\22\n\2^\17\3\2\2"+
		"\2_`\7\24\2\2`a\7\3\2\2ab\5\36\20\2bc\7\4\2\2cd\5\24\13\2d\21\3\2\2\2"+
		"ef\7\25\2\2fi\5\24\13\2gi\3\2\2\2he\3\2\2\2hg\3\2\2\2i\23\3\2\2\2jk\7"+
		"\5\2\2kl\5\b\5\2lm\7\6\2\2m\25\3\2\2\2no\7\30\2\2op\7\b\2\2pq\5 \21\2"+
		"qr\b\f\1\2r\27\3\2\2\2st\7\30\2\2tu\7\3\2\2uv\7\33\2\2v}\b\r\1\2wx\7\t"+
		"\2\2xy\5\34\17\2yz\b\r\1\2z|\3\2\2\2{w\3\2\2\2|\177\3\2\2\2}{\3\2\2\2"+
		"}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\4\2\2\u0081\u0082"+
		"\b\r\1\2\u0082\31\3\2\2\2\u0083\u0088\5\34\17\2\u0084\u0085\7\t\2\2\u0085"+
		"\u0087\5\34\17\2\u0086\u0084\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\33\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008c\5 \21\2\u008c\35\3\2\2\2\u008d\u008e\5 \21\2\u008e\u0093\b\20\1"+
		"\2\u008f\u0090\7\27\2\2\u0090\u0092\5 \21\2\u0091\u008f\3\2\2\2\u0092"+
		"\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\37\3\2\2"+
		"\2\u0095\u0093\3\2\2\2\u0096\u0097\5\"\22\2\u0097\u00a2\b\21\1\2\u0098"+
		"\u0099\7\n\2\2\u0099\u009a\5\"\22\2\u009a\u009b\b\21\1\2\u009b\u00a1\3"+
		"\2\2\2\u009c\u009d\7\13\2\2\u009d\u009e\5\"\22\2\u009e\u009f\b\21\1\2"+
		"\u009f\u00a1\3\2\2\2\u00a0\u0098\3\2\2\2\u00a0\u009c\3\2\2\2\u00a1\u00a4"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3!\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u00a6\5$\23\2\u00a6\u00b1\b\22\1\2\u00a7\u00a8\7"+
		"\f\2\2\u00a8\u00a9\5$\23\2\u00a9\u00aa\b\22\1\2\u00aa\u00b0\3\2\2\2\u00ab"+
		"\u00ac\7\r\2\2\u00ac\u00ad\5$\23\2\u00ad\u00ae\b\22\1\2\u00ae\u00b0\3"+
		"\2\2\2\u00af\u00a7\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2#\3\2\2\2\u00b3\u00b1\3\2\2\2"+
		"\u00b4\u00b5\5&\24\2\u00b5\u00b6\b\23\1\2\u00b6\u00bc\3\2\2\2\u00b7\u00b8"+
		"\7\13\2\2\u00b8\u00b9\5&\24\2\u00b9\u00ba\b\23\1\2\u00ba\u00bc\3\2\2\2"+
		"\u00bb\u00b4\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bc%\3\2\2\2\u00bd\u00be\7"+
		"\31\2\2\u00be\u00ca\b\24\1\2\u00bf\u00c0\7\32\2\2\u00c0\u00ca\b\24\1\2"+
		"\u00c1\u00c2\7\30\2\2\u00c2\u00ca\b\24\1\2\u00c3\u00c4\7\16\2\2\u00c4"+
		"\u00ca\7\30\2\2\u00c5\u00c6\7\3\2\2\u00c6\u00c7\5 \21\2\u00c7\u00c8\7"+
		"\4\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00bd\3\2\2\2\u00c9\u00bf\3\2\2\2\u00c9"+
		"\u00c1\3\2\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00c5\3\2\2\2\u00ca\'\3\2\2\2"+
		"\20:@FPh}\u0088\u0093\u00a0\u00a2\u00af\u00b1\u00bb\u00c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}