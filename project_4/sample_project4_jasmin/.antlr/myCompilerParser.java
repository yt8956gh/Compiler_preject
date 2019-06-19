// Generated from /home/nian/git/Compiler_preject/project_4/sample_project4_jasmin/myCompiler.g by ANTLR 4.7.1

    import java.util.HashMap;
		import java.util.Scanner;
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
		RULE_statement = 4, RULE_if_stmt = 5, RULE_if_then_stmt = 6, RULE_if_else_stmt = 7, 
		RULE_block_stmt = 8, RULE_assign_stmt = 9, RULE_func_no_return_stmt = 10, 
		RULE_arg = 11, RULE_cond_expression = 12, RULE_arith_expression = 13, 
		RULE_multExpr = 14, RULE_signExpr = 15, RULE_primaryExpr = 16;
	public static final String[] ruleNames = {
		"program", "declarations", "type", "statements", "statement", "if_stmt", 
		"if_then_stmt", "if_else_stmt", "block_stmt", "assign_stmt", "func_no_return_stmt", 
		"arg", "cond_expression", "arith_expression", "multExpr", "signExpr", 
		"primaryExpr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'}'", "';'", "'='", "','", "'&'", "'+'", "'-'", 
		"'*'", "'/'", "'float'", "'int'", "'char'", "'main'", "'void'", "'if'", 
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
			setState(34);
			match(VOID);
			setState(35);
			match(MAIN);
			setState(36);
			match(T__0);
			setState(37);
			match(T__1);

			           prologue();
			        
			setState(39);
			match(T__2);
			setState(40);
			declarations();
			setState(41);
			statements(1);
			setState(42);
			match(T__3);
			 if (TRACEON)
					      System.out.println("VOID MAIN () {declarations statements}");
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
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				type();
				setState(46);
				match(Identifier);
				setState(47);
				match(T__4);
				setState(48);
				declarations();

						 if (TRACEON) 
						 {System.out.println("declarations: type Identifier : declarations");}

						  //dataType.put((((DeclarationsContext)_localctx).Identifier!=null?((DeclarationsContext)_localctx).Identifier.getText():null), new String((((DeclarationsContext)_localctx).type!=null?_input.getText(((DeclarationsContext)_localctx).type.start,((DeclarationsContext)_localctx).type.stop):null)));

							 if (symtab.containsKey((((DeclarationsContext)_localctx).Identifier!=null?((DeclarationsContext)_localctx).Identifier.getText():null))) 
							 {
								    // variable re-declared.
				                    System.out.println("Type Error: " +  ((DeclarationsContext)_localctx).Identifier.getLine() + ": Redeclared identifier.");
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
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(INT);
				 if (TRACEON) System.out.println("type: INT"); ((TypeContext)_localctx).attr_type = Type.INT; 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(FLOAT);
				if (TRACEON) System.out.println("type: FLOAT"); ((TypeContext)_localctx).attr_type = Type.FLOAT; 
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
		public int flag;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementsContext(ParserRuleContext parent, int invokingState, int flag) {
			super(parent, invokingState);
			this.flag = flag;
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements(int flag) throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState(), flag);
		enterRule(_localctx, 6, RULE_statements);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				statement(flag);
				setState(61);
				statements(flag);
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
		public int flag;
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Func_no_return_stmtContext func_no_return_stmt() {
			return getRuleContext(Func_no_return_stmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementContext(ParserRuleContext parent, int invokingState, int flag) {
			super(parent, invokingState);
			this.flag = flag;
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement(int flag) throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState(), flag);
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				assign_stmt(flag);
				setState(67);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				if_stmt(flag);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				func_no_return_stmt(flag);
				setState(71);
				match(T__4);
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

	public static class If_stmtContext extends ParserRuleContext {
		public int flag;
		public If_then_stmtContext if_then_stmt() {
			return getRuleContext(If_then_stmtContext.class,0);
		}
		public If_else_stmtContext if_else_stmt() {
			return getRuleContext(If_else_stmtContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public If_stmtContext(ParserRuleContext parent, int invokingState, int flag) {
			super(parent, invokingState);
			this.flag = flag;
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
	}

	public final If_stmtContext if_stmt(int flag) throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState(), flag);
		enterRule(_localctx, 10, RULE_if_stmt);
		int if_else_stmt_flag=0; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			if_then_stmt();
			 if(((If_stmtContext)_localctx).if_then_stmt.exec_flag==0){if_else_stmt_flag=1; } 
			setState(77);
			if_else_stmt(if_else_stmt_flag);
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
		public int exec_flag;
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
		enterRule(_localctx, 12, RULE_if_then_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(IF);
			setState(80);
			match(T__0);
			setState(81);
			cond_expression();
			setState(82);
			match(T__1);
			 ((If_then_stmtContext)_localctx).exec_flag =  (int)((If_then_stmtContext)_localctx).cond_expression.result; 
			setState(84);
			block_stmt(_localctx.exec_flag);
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
		public int flag;
		public TerminalNode ELSE() { return getToken(myCompilerParser.ELSE, 0); }
		public Block_stmtContext block_stmt() {
			return getRuleContext(Block_stmtContext.class,0);
		}
		public If_else_stmtContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public If_else_stmtContext(ParserRuleContext parent, int invokingState, int flag) {
			super(parent, invokingState);
			this.flag = flag;
		}
		@Override public int getRuleIndex() { return RULE_if_else_stmt; }
	}

	public final If_else_stmtContext if_else_stmt(int flag) throws RecognitionException {
		If_else_stmtContext _localctx = new If_else_stmtContext(_ctx, getState(), flag);
		enterRule(_localctx, 14, RULE_if_else_stmt);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(ELSE);
				setState(87);
				block_stmt(flag);


								if(TRACEON)
								{
										 if (flag > 0) { System.out.println("Here\n"); }
				             System.out.println(flag);
								}

				}
				break;
			case T__3:
			case IF:
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
		public int flag;
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Block_stmtContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Block_stmtContext(ParserRuleContext parent, int invokingState, int flag) {
			super(parent, invokingState);
			this.flag = flag;
		}
		@Override public int getRuleIndex() { return RULE_block_stmt; }
	}

	public final Block_stmtContext block_stmt(int flag) throws RecognitionException {
		Block_stmtContext _localctx = new Block_stmtContext(_ctx, getState(), flag);
		enterRule(_localctx, 16, RULE_block_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__2);
			setState(94);
			statements(flag);
			setState(95);
			match(T__3);
			 if (TRACEON) System.out.println("Flag["+flag+"] block_stmt");
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
		public int flag;
		public TerminalNode Identifier() { return getToken(myCompilerParser.Identifier, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Assign_stmtContext(ParserRuleContext parent, int invokingState, int flag) {
			super(parent, invokingState);
			this.flag = flag;
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
	}

	public final Assign_stmtContext assign_stmt(int flag) throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState(), flag);
		enterRule(_localctx, 18, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(Identifier);
			setState(99);
			match(T__5);
			setState(100);
			arith_expression();

							if (flag!=0) {memory.put((((Assign_stmtContext)_localctx).Identifier!=null?((Assign_stmtContext)_localctx).Identifier.getText():null), new Float(((Assign_stmtContext)_localctx).arith_expression.result));}
			        if (TRACEON)  {System.out.println("Flag["+flag+"]assign_stmt:" + (((Assign_stmtContext)_localctx).Identifier!=null?((Assign_stmtContext)_localctx).Identifier.getText():null) +" <- " + ((Assign_stmtContext)_localctx).arith_expression.result); }
					
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
		public int flag;
		public TerminalNode Identifier() { return getToken(myCompilerParser.Identifier, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(myCompilerParser.STRING_LITERAL, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public Func_no_return_stmtContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Func_no_return_stmtContext(ParserRuleContext parent, int invokingState, int flag) {
			super(parent, invokingState);
			this.flag = flag;
		}
		@Override public int getRuleIndex() { return RULE_func_no_return_stmt; }
	}

	public final Func_no_return_stmtContext func_no_return_stmt(int flag) throws RecognitionException {
		Func_no_return_stmtContext _localctx = new Func_no_return_stmtContext(_ctx, getState(), flag);
		enterRule(_localctx, 20, RULE_func_no_return_stmt);

			
			List<Float> args=new ArrayList<Float>(); 
			List<String> refs=new ArrayList<String>(); 

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(Identifier);
			setState(104);
			match(T__0);
			setState(105);
			match(STRING_LITERAL);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(106);
				match(T__6);
				setState(107);
				arg();

							if(((Func_no_return_stmtContext)_localctx).arg.mode==1){
							 	if(TRACEON)	{System.out.println(((Func_no_return_stmtContext)_localctx).arg.argName);}  
								refs.add(((Func_no_return_stmtContext)_localctx).arg.argName);
							}
							else{
								if(TRACEON)	{System.out.println(((Func_no_return_stmtContext)_localctx).arg.value);}  
								args.add(((Func_no_return_stmtContext)_localctx).arg.value); 
							}
				 
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(T__1);

					if(TRACEON){
								System.out.println("Flag["+flag+"]Function NAME:" +(((Func_no_return_stmtContext)_localctx).Identifier!=null?((Func_no_return_stmtContext)_localctx).Identifier.getText():null));
					}

					if(flag==0)
					{
						System.out.println((((Func_no_return_stmtContext)_localctx).Identifier!=null?((Func_no_return_stmtContext)_localctx).Identifier.getText():null)+": not work.");
					}
					else if((((Func_no_return_stmtContext)_localctx).Identifier!=null?((Func_no_return_stmtContext)_localctx).Identifier.getText():null).equals("printf"))
					{
							String tmp = new String((((Func_no_return_stmtContext)_localctx).STRING_LITERAL!=null?((Func_no_return_stmtContext)_localctx).STRING_LITERAL.getText():null));
							tmp = tmp.substring(1,tmp.length()-1 ); //remove quotation mark
							int retD=1,retF=1;
							int index=0;

							while(retD!=-1 || retF!=-1)
							{
									retD = tmp.indexOf("\%d");
									retF = tmp.indexOf("\%f");

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
												tmp = tmp.replaceFirst("\%d",String.valueOf((int)Math.floor(args.get(index++))));
									}
									else	if(retF!=-1 && (retD==-1 || retF<retD))
									{
												tmp = tmp.replaceFirst("\%f", String.valueOf(args.get(index++) ) );
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
					else if ((((Func_no_return_stmtContext)_localctx).Identifier!=null?((Func_no_return_stmtContext)_localctx).Identifier.getText():null).equals("scanf"))
					{
					   	if(TRACEON)	System.out.println("SCANF: ");
							String str = new String((((Func_no_return_stmtContext)_localctx).STRING_LITERAL!=null?((Func_no_return_stmtContext)_localctx).STRING_LITERAL.getText():null)), argType=null;				
							str = str.substring(1,str.length()-1 ); //remove quotation mark
							int retD=1,retF=1,index=0,tmpInt=0;
							float tmpFloat=0.0f;
							Scanner scanner = new Scanner(System.in);

							while(retD!=-1 || retF!=-1)
							{
									retD = str.indexOf("\%d");
									retF = str.indexOf("\%f");


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
		public float value;
		public String argName;
		public int mode;
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(myCompilerParser.Identifier, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arg);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__9:
			case Identifier:
			case Integer_constant:
			case Floating_point_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				arith_expression();
				((ArgContext)_localctx).value = ((ArgContext)_localctx).arith_expression.result; ((ArgContext)_localctx).mode = 0;
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(T__7);
				setState(122);
				match(Identifier);
				((ArgContext)_localctx).argName = (((ArgContext)_localctx).Identifier!=null?((ArgContext)_localctx).Identifier.getText():null); ((ArgContext)_localctx).mode = 1;
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

	public static class Cond_expressionContext extends ParserRuleContext {
		public float result;
		public Arith_expressionContext a;
		public Arith_expressionContext b;
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
		enterRule(_localctx, 24, RULE_cond_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			((Cond_expressionContext)_localctx).a = arith_expression();
			 ((Cond_expressionContext)_localctx).result =  ((Cond_expressionContext)_localctx).a.result;
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RelationOP) {
				{
				{
				setState(128);
				match(RelationOP);
				setState(129);
				((Cond_expressionContext)_localctx).b = arith_expression();
				 
					
														if((((Cond_expressionContext)_localctx).RelationOP!=null?((Cond_expressionContext)_localctx).RelationOP.getText():null).equals(">"))
														{
																if(_localctx.result > ((Cond_expressionContext)_localctx).b.result) ((Cond_expressionContext)_localctx).result =  1;
				                        else ((Cond_expressionContext)_localctx).result =  0;
														}
														else	if((((Cond_expressionContext)_localctx).RelationOP!=null?((Cond_expressionContext)_localctx).RelationOP.getText():null).equals(">="))
														{
																if(_localctx.result >= ((Cond_expressionContext)_localctx).b.result) ((Cond_expressionContext)_localctx).result =  1;
				                        else ((Cond_expressionContext)_localctx).result =  0;
														}
														else	if((((Cond_expressionContext)_localctx).RelationOP!=null?((Cond_expressionContext)_localctx).RelationOP.getText():null).equals("<"))
														{
																if(_localctx.result < ((Cond_expressionContext)_localctx).b.result) ((Cond_expressionContext)_localctx).result =  1;
				                        else ((Cond_expressionContext)_localctx).result =  0;
														}
															else	if((((Cond_expressionContext)_localctx).RelationOP!=null?((Cond_expressionContext)_localctx).RelationOP.getText():null).equals("<="))
														{
																if(_localctx.result <= ((Cond_expressionContext)_localctx).b.result) ((Cond_expressionContext)_localctx).result =  1;
				                        else ((Cond_expressionContext)_localctx).result =  0;
														}
														else	if((((Cond_expressionContext)_localctx).RelationOP!=null?((Cond_expressionContext)_localctx).RelationOP.getText():null).equals("=="))
														{
																if(_localctx.result == ((Cond_expressionContext)_localctx).b.result) ((Cond_expressionContext)_localctx).result =  1;
				                        else ((Cond_expressionContext)_localctx).result =  0;
														}
														else	if((((Cond_expressionContext)_localctx).RelationOP!=null?((Cond_expressionContext)_localctx).RelationOP.getText():null).equals("!="))
														{
																if(_localctx.result != ((Cond_expressionContext)_localctx).b.result) ((Cond_expressionContext)_localctx).result =  1;
				                        else ((Cond_expressionContext)_localctx).result =  0;
														}
				                 
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			if(TRACEON){System.out.println("result:"+_localctx.result);} 
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
		public Float result;
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
		enterRule(_localctx, 26, RULE_arith_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			((Arith_expressionContext)_localctx).a = multExpr();
			 ((Arith_expressionContext)_localctx).result = ((Arith_expressionContext)_localctx).a.result; 
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__9) {
				{
				setState(149);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(141);
					match(T__8);
					setState(142);
					((Arith_expressionContext)_localctx).b = multExpr();
					((Arith_expressionContext)_localctx).result =  _localctx.result+((Arith_expressionContext)_localctx).b.result;
					}
					break;
				case T__9:
					{
					setState(145);
					match(T__9);
					setState(146);
					((Arith_expressionContext)_localctx).c = multExpr();
					((Arith_expressionContext)_localctx).result =  _localctx.result-((Arith_expressionContext)_localctx).c.result;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(153);
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
		public Float result;
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
		enterRule(_localctx, 28, RULE_multExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			((MultExprContext)_localctx).a = signExpr();
			 ((MultExprContext)_localctx).result = ((MultExprContext)_localctx).a.result; 
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==T__11) {
				{
				setState(164);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(156);
					match(T__10);
					setState(157);
					((MultExprContext)_localctx).b = signExpr();
					((MultExprContext)_localctx).result =  _localctx.result*((MultExprContext)_localctx).b.result;
					}
					break;
				case T__11:
					{
					setState(160);
					match(T__11);
					setState(161);
					((MultExprContext)_localctx).c = signExpr();
					((MultExprContext)_localctx).result =  _localctx.result/((MultExprContext)_localctx).c.result;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(168);
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
		public Float result;
		public PrimaryExprContext a;
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
		enterRule(_localctx, 30, RULE_signExpr);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case Identifier:
			case Integer_constant:
			case Floating_point_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				((SignExprContext)_localctx).a = primaryExpr();
				 ((SignExprContext)_localctx).result = ((SignExprContext)_localctx).a.result; 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(T__9);
				setState(173);
				primaryExpr();
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
		public Float result;
		public TerminalNode Integer_constant() { return getToken(myCompilerParser.Integer_constant, 0); }
		public TerminalNode Floating_point_constant() { return getToken(myCompilerParser.Floating_point_constant, 0); }
		public TerminalNode Identifier() { return getToken(myCompilerParser.Identifier, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_primaryExpr);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(Integer_constant);
				 ((PrimaryExprContext)_localctx).result = Float.parseFloat((((PrimaryExprContext)_localctx).Integer_constant!=null?((PrimaryExprContext)_localctx).Integer_constant.getText():null)); 
				}
				break;
			case Floating_point_constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(Floating_point_constant);
				 ((PrimaryExprContext)_localctx).result =  Float.parseFloat((((PrimaryExprContext)_localctx).Floating_point_constant!=null?((PrimaryExprContext)_localctx).Floating_point_constant.getText():null)); 
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(Identifier);
				 ((PrimaryExprContext)_localctx).result =   (Float)memory.get((((PrimaryExprContext)_localctx).Identifier!=null?((PrimaryExprContext)_localctx).Identifier.getText():null)); 
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				match(T__0);
				setState(183);
				arith_expression();
				setState(184);
				match(T__1);
				((PrimaryExprContext)_localctx).result = ((PrimaryExprContext)_localctx).arith_expression.result;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00c0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3\67\n\3\3\4\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\3\5\5\5C\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6L\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t^\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\fq\n\f\f\f\16\ft\13\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\177\n\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u0087\n\16\f\16\16\16\u008a\13\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0098\n\17\f\17\16\17\u009b\13\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00a7\n\20\f\20"+
		"\16\20\u00aa\13\20\3\21\3\21\3\21\3\21\3\21\5\21\u00b1\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00be\n\22\3\22\2\2"+
		"\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\2\2\u00bf\2$\3\2\2\2\4"+
		"\66\3\2\2\2\6<\3\2\2\2\bB\3\2\2\2\nK\3\2\2\2\fM\3\2\2\2\16Q\3\2\2\2\20"+
		"]\3\2\2\2\22_\3\2\2\2\24d\3\2\2\2\26i\3\2\2\2\30~\3\2\2\2\32\u0080\3\2"+
		"\2\2\34\u008d\3\2\2\2\36\u009c\3\2\2\2 \u00b0\3\2\2\2\"\u00bd\3\2\2\2"+
		"$%\7\23\2\2%&\7\22\2\2&\'\7\3\2\2\'(\7\4\2\2()\b\2\1\2)*\7\5\2\2*+\5\4"+
		"\3\2+,\5\b\5\2,-\7\6\2\2-.\b\2\1\2.\3\3\2\2\2/\60\5\6\4\2\60\61\7\30\2"+
		"\2\61\62\7\7\2\2\62\63\5\4\3\2\63\64\b\3\1\2\64\67\3\2\2\2\65\67\b\3\1"+
		"\2\66/\3\2\2\2\66\65\3\2\2\2\67\5\3\2\2\289\7\20\2\29=\b\4\1\2:;\7\17"+
		"\2\2;=\b\4\1\2<8\3\2\2\2<:\3\2\2\2=\7\3\2\2\2>?\5\n\6\2?@\5\b\5\2@C\3"+
		"\2\2\2AC\3\2\2\2B>\3\2\2\2BA\3\2\2\2C\t\3\2\2\2DE\5\24\13\2EF\7\7\2\2"+
		"FL\3\2\2\2GL\5\f\7\2HI\5\26\f\2IJ\7\7\2\2JL\3\2\2\2KD\3\2\2\2KG\3\2\2"+
		"\2KH\3\2\2\2L\13\3\2\2\2MN\5\16\b\2NO\b\7\1\2OP\5\20\t\2P\r\3\2\2\2QR"+
		"\7\24\2\2RS\7\3\2\2ST\5\32\16\2TU\7\4\2\2UV\b\b\1\2VW\5\22\n\2W\17\3\2"+
		"\2\2XY\7\25\2\2YZ\5\22\n\2Z[\b\t\1\2[^\3\2\2\2\\^\3\2\2\2]X\3\2\2\2]\\"+
		"\3\2\2\2^\21\3\2\2\2_`\7\5\2\2`a\5\b\5\2ab\7\6\2\2bc\b\n\1\2c\23\3\2\2"+
		"\2de\7\30\2\2ef\7\b\2\2fg\5\34\17\2gh\b\13\1\2h\25\3\2\2\2ij\7\30\2\2"+
		"jk\7\3\2\2kr\7\33\2\2lm\7\t\2\2mn\5\30\r\2no\b\f\1\2oq\3\2\2\2pl\3\2\2"+
		"\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7\4\2\2vw\b\f\1"+
		"\2w\27\3\2\2\2xy\5\34\17\2yz\b\r\1\2z\177\3\2\2\2{|\7\n\2\2|}\7\30\2\2"+
		"}\177\b\r\1\2~x\3\2\2\2~{\3\2\2\2\177\31\3\2\2\2\u0080\u0081\5\34\17\2"+
		"\u0081\u0088\b\16\1\2\u0082\u0083\7\27\2\2\u0083\u0084\5\34\17\2\u0084"+
		"\u0085\b\16\1\2\u0085\u0087\3\2\2\2\u0086\u0082\3\2\2\2\u0087\u008a\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008c\b\16\1\2\u008c\33\3\2\2\2\u008d\u008e\5\36"+
		"\20\2\u008e\u0099\b\17\1\2\u008f\u0090\7\13\2\2\u0090\u0091\5\36\20\2"+
		"\u0091\u0092\b\17\1\2\u0092\u0098\3\2\2\2\u0093\u0094\7\f\2\2\u0094\u0095"+
		"\5\36\20\2\u0095\u0096\b\17\1\2\u0096\u0098\3\2\2\2\u0097\u008f\3\2\2"+
		"\2\u0097\u0093\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\35\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\5 \21\2\u009d"+
		"\u00a8\b\20\1\2\u009e\u009f\7\r\2\2\u009f\u00a0\5 \21\2\u00a0\u00a1\b"+
		"\20\1\2\u00a1\u00a7\3\2\2\2\u00a2\u00a3\7\16\2\2\u00a3\u00a4\5 \21\2\u00a4"+
		"\u00a5\b\20\1\2\u00a5\u00a7\3\2\2\2\u00a6\u009e\3\2\2\2\u00a6\u00a2\3"+
		"\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\37\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\5\"\22\2\u00ac\u00ad\b\21"+
		"\1\2\u00ad\u00b1\3\2\2\2\u00ae\u00af\7\f\2\2\u00af\u00b1\5\"\22\2\u00b0"+
		"\u00ab\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1!\3\2\2\2\u00b2\u00b3\7\31\2\2"+
		"\u00b3\u00be\b\22\1\2\u00b4\u00b5\7\32\2\2\u00b5\u00be\b\22\1\2\u00b6"+
		"\u00b7\7\30\2\2\u00b7\u00be\b\22\1\2\u00b8\u00b9\7\3\2\2\u00b9\u00ba\5"+
		"\34\17\2\u00ba\u00bb\7\4\2\2\u00bb\u00bc\b\22\1\2\u00bc\u00be\3\2\2\2"+
		"\u00bd\u00b2\3\2\2\2\u00bd\u00b4\3\2\2\2\u00bd\u00b6\3\2\2\2\u00bd\u00b8"+
		"\3\2\2\2\u00be#\3\2\2\2\20\66<BK]r~\u0088\u0097\u0099\u00a6\u00a8\u00b0"+
		"\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}