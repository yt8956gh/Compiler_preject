// Generated from /home/nian/git/Compiler_preject/project_3/myC_1.g by ANTLR 4.7.1

    // import packages here.

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myC_1Parser extends Parser {
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
	public String getGrammarFileName() { return "myC_1.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    boolean TRACEON = true;

	public myC_1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(myC_1Parser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(myC_1Parser.MAIN, 0); }
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
			setState(42);
			match(T__2);
			setState(43);
			declarations();
			setState(44);
			statements();
			setState(45);
			match(T__3);
			 if (TRACEON)
					      System.out.println("VOID MAIN () {declarations statements}");
			        
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
		public TerminalNode Identifier() { return getToken(myC_1Parser.Identifier, 0); }
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
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				type();
				setState(49);
				match(Identifier);
				setState(50);
				match(T__4);
				setState(51);
				declarations();
				 if (TRACEON)
					           System.out.println("declarations: type Identifier : declarations");
				              
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
		public TerminalNode INT() { return getToken(myC_1Parser.INT, 0); }
		public TerminalNode CHAR() { return getToken(myC_1Parser.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(myC_1Parser.FLOAT, 0); }
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
				setState(57);
				match(INT);
				 if (TRACEON) System.out.println("type: INT"); 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(CHAR);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(FLOAT);
				if (TRACEON) System.out.println("type: FLOAT"); 
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
		public TerminalNode FOR() { return getToken(myC_1Parser.FOR, 0); }
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
			if_else_stmt(((If_stmtContext)_localctx).if_then_stmt.exec_flag);
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
		public TerminalNode IF() { return getToken(myC_1Parser.IF, 0); }
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
			 
			                  ((If_then_stmtContext)_localctx).exec_flag =  ((If_then_stmtContext)_localctx).cond_expression.result;
			              
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
		public TerminalNode ELSE() { return getToken(myC_1Parser.ELSE, 0); }
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
		enterRule(_localctx, 16, RULE_if_else_stmt);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(ELSE);
				setState(101);
				block_stmt();

				                  if (flag > 0) { System.out.println("Here\n"); }
				                  System.out.println(flag);

				              
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
			setState(107);
			match(T__2);
			setState(108);
			statements();
			setState(109);
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
		public TerminalNode Identifier() { return getToken(myC_1Parser.Identifier, 0); }
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
			setState(111);
			match(Identifier);
			setState(112);
			match(T__5);
			setState(113);
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

	public static class Func_no_return_stmtContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(myC_1Parser.Identifier, 0); }
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public Func_no_return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_no_return_stmt; }
	}

	public final Func_no_return_stmtContext func_no_return_stmt() throws RecognitionException {
		Func_no_return_stmtContext _localctx = new Func_no_return_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_func_no_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(Identifier);
			setState(116);
			match(T__0);
			setState(117);
			argument();
			setState(118);
			match(T__1);
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
			setState(120);
			arg();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(121);
				match(T__6);
				setState(122);
				arg();
				}
				}
				setState(127);
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
		public TerminalNode STRING_LITERAL() { return getToken(myC_1Parser.STRING_LITERAL, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arg);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__8:
			case T__11:
			case Identifier:
			case Integer_constant:
			case Floating_point_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				arith_expression();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(STRING_LITERAL);
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
		public int result;
		public Arith_expressionContext a;
		public Arith_expressionContext b;
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public List<TerminalNode> RelationOP() { return getTokens(myC_1Parser.RelationOP); }
		public TerminalNode RelationOP(int i) {
			return getToken(myC_1Parser.RelationOP, i);
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
			setState(132);
			((Cond_expressionContext)_localctx).a = arith_expression();
			 ((Cond_expressionContext)_localctx).result =  ((Cond_expressionContext)_localctx).a.result; 
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RelationOP) {
				{
				{
				setState(134);
				match(RelationOP);
				setState(135);
				((Cond_expressionContext)_localctx).b = arith_expression();
				 ((Cond_expressionContext)_localctx).result = ((Cond_expressionContext)_localctx).b.result; 
				}
				}
				setState(142);
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
		public int result;
		public MultExprContext a;
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
			setState(143);
			((Arith_expressionContext)_localctx).a = multExpr();
			 ((Arith_expressionContext)_localctx).result = ((Arith_expressionContext)_localctx).a.result; 
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==T__8) {
				{
				setState(149);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__7:
					{
					setState(145);
					match(T__7);
					setState(146);
					multExpr();
					}
					break;
				case T__8:
					{
					setState(147);
					match(T__8);
					setState(148);
					multExpr();
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
		public int result;
		public SignExprContext a;
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
			setState(154);
			((MultExprContext)_localctx).a = signExpr();
			 ((MultExprContext)_localctx).result = ((MultExprContext)_localctx).a.result; 
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9 || _la==T__10) {
				{
				setState(160);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(156);
					match(T__9);
					setState(157);
					signExpr();
					}
					break;
				case T__10:
					{
					setState(158);
					match(T__10);
					setState(159);
					signExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(164);
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
		public int result;
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
		enterRule(_localctx, 34, RULE_signExpr);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__11:
			case Identifier:
			case Integer_constant:
			case Floating_point_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				((SignExprContext)_localctx).a = primaryExpr();
				 ((SignExprContext)_localctx).result = ((SignExprContext)_localctx).a.result; 
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(T__8);
				setState(169);
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
		public int result;
		public TerminalNode Integer_constant() { return getToken(myC_1Parser.Integer_constant, 0); }
		public TerminalNode Floating_point_constant() { return getToken(myC_1Parser.Floating_point_constant, 0); }
		public TerminalNode Identifier() { return getToken(myC_1Parser.Identifier, 0); }
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
		enterRule(_localctx, 36, RULE_primaryExpr);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(Integer_constant);
				 ((PrimaryExprContext)_localctx).result = Integer.parseInt((((PrimaryExprContext)_localctx).Integer_constant!=null?((PrimaryExprContext)_localctx).Integer_constant.getText():null)); 
				}
				break;
			case Floating_point_constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(Floating_point_constant);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(Identifier);
				 ((PrimaryExprContext)_localctx).result =  100; 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(T__11);
				setState(178);
				match(Identifier);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
				match(T__0);
				setState(180);
				arith_expression();
				setState(181);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00bc\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\3\5\3\5\3\5\3"+
		"\5\5\5G\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6Q\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\5\nl\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\7\16~\n\16\f\16\16\16\u0081\13\16\3\17\3\17\5"+
		"\17\u0085\n\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u008d\n\20\f\20\16\20"+
		"\u0090\13\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0098\n\21\f\21\16\21"+
		"\u009b\13\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00a3\n\22\f\22\16\22"+
		"\u00a6\13\22\3\23\3\23\3\23\3\23\3\23\5\23\u00ad\n\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00ba\n\24\3\24\2\2\25\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\2\2\u00bc\2(\3\2\2\2\49\3\2"+
		"\2\2\6@\3\2\2\2\bF\3\2\2\2\nP\3\2\2\2\fR\3\2\2\2\16\\\3\2\2\2\20_\3\2"+
		"\2\2\22k\3\2\2\2\24m\3\2\2\2\26q\3\2\2\2\30u\3\2\2\2\32z\3\2\2\2\34\u0084"+
		"\3\2\2\2\36\u0086\3\2\2\2 \u0091\3\2\2\2\"\u009c\3\2\2\2$\u00ac\3\2\2"+
		"\2&\u00b9\3\2\2\2()\7\23\2\2)*\7\22\2\2*+\7\3\2\2+,\7\4\2\2,-\7\5\2\2"+
		"-.\5\4\3\2./\5\b\5\2/\60\7\6\2\2\60\61\b\2\1\2\61\3\3\2\2\2\62\63\5\6"+
		"\4\2\63\64\7\30\2\2\64\65\7\7\2\2\65\66\5\4\3\2\66\67\b\3\1\2\67:\3\2"+
		"\2\28:\b\3\1\29\62\3\2\2\298\3\2\2\2:\5\3\2\2\2;<\7\20\2\2<A\b\4\1\2="+
		"A\7\21\2\2>?\7\17\2\2?A\b\4\1\2@;\3\2\2\2@=\3\2\2\2@>\3\2\2\2A\7\3\2\2"+
		"\2BC\5\n\6\2CD\5\b\5\2DG\3\2\2\2EG\3\2\2\2FB\3\2\2\2FE\3\2\2\2G\t\3\2"+
		"\2\2HI\5\26\f\2IJ\7\7\2\2JQ\3\2\2\2KQ\5\16\b\2LM\5\30\r\2MN\7\7\2\2NQ"+
		"\3\2\2\2OQ\5\f\7\2PH\3\2\2\2PK\3\2\2\2PL\3\2\2\2PO\3\2\2\2Q\13\3\2\2\2"+
		"RS\7\26\2\2ST\7\3\2\2TU\5\26\f\2UV\7\7\2\2VW\5\36\20\2WX\7\7\2\2XY\5\26"+
		"\f\2YZ\7\4\2\2Z[\5\24\13\2[\r\3\2\2\2\\]\5\20\t\2]^\5\22\n\2^\17\3\2\2"+
		"\2_`\7\24\2\2`a\7\3\2\2ab\5\36\20\2bc\7\4\2\2cd\5\24\13\2de\b\t\1\2e\21"+
		"\3\2\2\2fg\7\25\2\2gh\5\24\13\2hi\b\n\1\2il\3\2\2\2jl\3\2\2\2kf\3\2\2"+
		"\2kj\3\2\2\2l\23\3\2\2\2mn\7\5\2\2no\5\b\5\2op\7\6\2\2p\25\3\2\2\2qr\7"+
		"\30\2\2rs\7\b\2\2st\5 \21\2t\27\3\2\2\2uv\7\30\2\2vw\7\3\2\2wx\5\32\16"+
		"\2xy\7\4\2\2y\31\3\2\2\2z\177\5\34\17\2{|\7\t\2\2|~\5\34\17\2}{\3\2\2"+
		"\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\33\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0082\u0085\5 \21\2\u0083\u0085\7\33\2\2\u0084\u0082\3\2"+
		"\2\2\u0084\u0083\3\2\2\2\u0085\35\3\2\2\2\u0086\u0087\5 \21\2\u0087\u008e"+
		"\b\20\1\2\u0088\u0089\7\27\2\2\u0089\u008a\5 \21\2\u008a\u008b\b\20\1"+
		"\2\u008b\u008d\3\2\2\2\u008c\u0088\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\37\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0092\5\"\22\2\u0092\u0099\b\21\1\2\u0093\u0094\7\n\2\2\u0094\u0098\5"+
		"\"\22\2\u0095\u0096\7\13\2\2\u0096\u0098\5\"\22\2\u0097\u0093\3\2\2\2"+
		"\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a!\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\5$\23\2\u009d"+
		"\u00a4\b\22\1\2\u009e\u009f\7\f\2\2\u009f\u00a3\5$\23\2\u00a0\u00a1\7"+
		"\r\2\2\u00a1\u00a3\5$\23\2\u00a2\u009e\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5#\3\2\2\2"+
		"\u00a6\u00a4\3\2\2\2\u00a7\u00a8\5&\24\2\u00a8\u00a9\b\23\1\2\u00a9\u00ad"+
		"\3\2\2\2\u00aa\u00ab\7\13\2\2\u00ab\u00ad\5&\24\2\u00ac\u00a7\3\2\2\2"+
		"\u00ac\u00aa\3\2\2\2\u00ad%\3\2\2\2\u00ae\u00af\7\31\2\2\u00af\u00ba\b"+
		"\24\1\2\u00b0\u00ba\7\32\2\2\u00b1\u00b2\7\30\2\2\u00b2\u00ba\b\24\1\2"+
		"\u00b3\u00b4\7\16\2\2\u00b4\u00ba\7\30\2\2\u00b5\u00b6\7\3\2\2\u00b6\u00b7"+
		"\5 \21\2\u00b7\u00b8\7\4\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00ae\3\2\2\2\u00b9"+
		"\u00b0\3\2\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b5\3\2"+
		"\2\2\u00ba\'\3\2\2\2\209@FPk\177\u0084\u008e\u0097\u0099\u00a2\u00a4\u00ac"+
		"\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}