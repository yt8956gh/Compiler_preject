// Generated from /home/nian/git/Compiler_preject/project_3/myInterp/myInterp.g by ANTLR 4.7.1

    import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myInterpParser extends Parser {
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
		RULE_arg = 12, RULE_cond_expression = 13, RULE_arith_expression = 14, 
		RULE_multExpr = 15, RULE_signExpr = 16, RULE_primaryExpr = 17;
	public static final String[] ruleNames = {
		"program", "declarations", "type", "statements", "statement", "for_stmt", 
		"if_stmt", "if_then_stmt", "if_else_stmt", "block_stmt", "assign_stmt", 
		"func_no_return_stmt", "arg", "cond_expression", "arith_expression", "multExpr", 
		"signExpr", "primaryExpr"
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
	public String getGrammarFileName() { return "myInterp.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    boolean TRACEON = false;
	    HashMap memory = new HashMap();

	public myInterpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(myInterpParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(myInterpParser.MAIN, 0); }
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
			setState(36);
			match(VOID);
			setState(37);
			match(MAIN);
			setState(38);
			match(T__0);
			setState(39);
			match(T__1);
			setState(40);
			match(T__2);
			setState(41);
			declarations();
			setState(42);
			statements();
			setState(43);
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
		public TerminalNode Identifier() { return getToken(myInterpParser.Identifier, 0); }
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
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				type();
				setState(47);
				match(Identifier);
				setState(48);
				match(T__4);
				setState(49);
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
		public TerminalNode INT() { return getToken(myInterpParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(myInterpParser.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(myInterpParser.FLOAT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(INT);
				 if (TRACEON) System.out.println("type: INT"); 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(CHAR);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
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
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case FOR:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				statement();
				setState(63);
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
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				assign_stmt();
				setState(69);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				if_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				func_no_return_stmt();
				setState(73);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
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
		public TerminalNode FOR() { return getToken(myInterpParser.FOR, 0); }
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
			setState(78);
			match(FOR);
			setState(79);
			match(T__0);
			setState(80);
			assign_stmt();
			setState(81);
			match(T__4);
			setState(82);
			cond_expression();
			setState(83);
			match(T__4);
			setState(84);
			assign_stmt();
			setState(85);
			match(T__1);
			setState(86);
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
			setState(88);
			if_then_stmt();
			setState(89);
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
		public TerminalNode IF() { return getToken(myInterpParser.IF, 0); }
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
			setState(91);
			match(IF);
			setState(92);
			match(T__0);
			setState(93);
			cond_expression();
			setState(94);
			match(T__1);
			setState(95);
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
		public TerminalNode ELSE() { return getToken(myInterpParser.ELSE, 0); }
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
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(ELSE);
				setState(99);
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
			setState(105);
			match(T__2);
			setState(106);
			statements();
			setState(107);
			match(T__3);
			 if (TRACEON) System.out.println("block_stmt");
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
		public TerminalNode Identifier() { return getToken(myInterpParser.Identifier, 0); }
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
			setState(110);
			match(Identifier);
			setState(111);
			match(T__5);
			setState(112);
			arith_expression();
			memory.put((((Assign_stmtContext)_localctx).Identifier!=null?((Assign_stmtContext)_localctx).Identifier.getText():null), new Integer(((Assign_stmtContext)_localctx).arith_expression.result));
			        if (TRACEON)  System.out.println("assign_stmt:" + (((Assign_stmtContext)_localctx).Identifier!=null?((Assign_stmtContext)_localctx).Identifier.getText():null) +" <- " + ((Assign_stmtContext)_localctx).arith_expression.result); 
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
		public TerminalNode Identifier() { return getToken(myInterpParser.Identifier, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(myInterpParser.STRING_LITERAL, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(Identifier);
			setState(116);
			match(T__0);
			setState(117);
			match(STRING_LITERAL);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(118);
				match(T__6);
				setState(119);
				arg();
				 if (TRACEON) {System.out.println(((Func_no_return_stmtContext)_localctx).arg.value);}   args.add(((Func_no_return_stmtContext)_localctx).arg.value);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(T__1);

					if(TRACEON){
								System.out.println("Function NAME:" +(((Func_no_return_stmtContext)_localctx).Identifier!=null?((Func_no_return_stmtContext)_localctx).Identifier.getText():null));
					}
				
					if((((Func_no_return_stmtContext)_localctx).Identifier!=null?((Func_no_return_stmtContext)_localctx).Identifier.getText():null).equals("printf"))
					{
							String tmp = new String((((Func_no_return_stmtContext)_localctx).STRING_LITERAL!=null?((Func_no_return_stmtContext)_localctx).STRING_LITERAL.getText():null));
							tmp = tmp.substring(1,tmp.length()-1 ); //remove quotation mark
							int ret=1;
							int index=0;

							while(ret>0)
							{
									ret = tmp.indexOf("\%d");

									if(ret>0) tmp = tmp.replace("\%d",String.valueOf(Math.round(args.get(index++))));
								
									ret = tmp.indexOf("\%f");

									if(ret>0)	tmp=tmp.replaceFirst("\%f", String.valueOf(args.get(index) ) );
							}

							System.out.println(tmp);
					}
					else if ((((Func_no_return_stmtContext)_localctx).Identifier!=null?((Func_no_return_stmtContext)_localctx).Identifier.getText():null).equals("scanf"))
					{
					   	System.out.println("SCANF: ");
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
		public float value;
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
		enterRule(_localctx, 24, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			arith_expression();
			((ArgContext)_localctx).value = ((ArgContext)_localctx).arith_expression.result;
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
		public List<TerminalNode> RelationOP() { return getTokens(myInterpParser.RelationOP); }
		public TerminalNode RelationOP(int i) {
			return getToken(myInterpParser.RelationOP, i);
		}
		public Cond_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_expression; }
	}

	public final Cond_expressionContext cond_expression() throws RecognitionException {
		Cond_expressionContext _localctx = new Cond_expressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cond_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			((Cond_expressionContext)_localctx).a = arith_expression();
			 ((Cond_expressionContext)_localctx).result =  ((Cond_expressionContext)_localctx).a.result;
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RelationOP) {
				{
				{
				setState(135);
				match(RelationOP);
				setState(136);
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
				setState(143);
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
		public int result;
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
		enterRule(_localctx, 28, RULE_arith_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			((Arith_expressionContext)_localctx).a = multExpr();
			 ((Arith_expressionContext)_localctx).result = ((Arith_expressionContext)_localctx).a.result; 
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==T__8) {
				{
				setState(156);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__7:
					{
					setState(148);
					match(T__7);
					setState(149);
					((Arith_expressionContext)_localctx).b = multExpr();
					((Arith_expressionContext)_localctx).result =  _localctx.result+((Arith_expressionContext)_localctx).b.result;
					}
					break;
				case T__8:
					{
					setState(152);
					match(T__8);
					setState(153);
					((Arith_expressionContext)_localctx).c = multExpr();
					((Arith_expressionContext)_localctx).result =  _localctx.result-((Arith_expressionContext)_localctx).c.result;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(160);
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
		enterRule(_localctx, 30, RULE_multExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			((MultExprContext)_localctx).a = signExpr();
			 ((MultExprContext)_localctx).result = ((MultExprContext)_localctx).a.result; 
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9 || _la==T__10) {
				{
				setState(171);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(163);
					match(T__9);
					setState(164);
					((MultExprContext)_localctx).b = signExpr();
					((MultExprContext)_localctx).result =  _localctx.result*((MultExprContext)_localctx).b.result;
					}
					break;
				case T__10:
					{
					setState(167);
					match(T__10);
					setState(168);
					((MultExprContext)_localctx).c = signExpr();
					((MultExprContext)_localctx).result =  _localctx.result/((MultExprContext)_localctx).c.result;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(175);
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
		enterRule(_localctx, 32, RULE_signExpr);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__11:
			case Identifier:
			case Integer_constant:
			case Floating_point_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				((SignExprContext)_localctx).a = primaryExpr();
				 ((SignExprContext)_localctx).result = ((SignExprContext)_localctx).a.result; 
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(T__8);
				setState(180);
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
		public TerminalNode Integer_constant() { return getToken(myInterpParser.Integer_constant, 0); }
		public TerminalNode Floating_point_constant() { return getToken(myInterpParser.Floating_point_constant, 0); }
		public TerminalNode Identifier() { return getToken(myInterpParser.Identifier, 0); }
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
		enterRule(_localctx, 34, RULE_primaryExpr);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(Integer_constant);
				 ((PrimaryExprContext)_localctx).result = Integer.parseInt((((PrimaryExprContext)_localctx).Integer_constant!=null?((PrimaryExprContext)_localctx).Integer_constant.getText():null)); 
				}
				break;
			case Floating_point_constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(Floating_point_constant);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(Identifier);
				 ((PrimaryExprContext)_localctx).result =   (Integer)memory.get((((PrimaryExprContext)_localctx).Identifier!=null?((PrimaryExprContext)_localctx).Identifier.getText():null)); 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				match(T__11);
				setState(189);
				match(Identifier);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
				match(T__0);
				setState(191);
				arith_expression();
				setState(192);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00c8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\38\n\3\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\5\3\5\5\5E\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\5\nj\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\7\r}\n\r\f\r\16\r\u0080\13\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u008e\n\17\f\17\16\17\u0091\13"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u009f"+
		"\n\20\f\20\16\20\u00a2\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\7\21\u00ae\n\21\f\21\16\21\u00b1\13\21\3\22\3\22\3\22\3\22\3"+
		"\22\5\22\u00b8\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00c6\n\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$\2\2\2\u00c8\2&\3\2\2\2\4\67\3\2\2\2\6>\3\2\2\2\bD\3\2\2\2\n"+
		"N\3\2\2\2\fP\3\2\2\2\16Z\3\2\2\2\20]\3\2\2\2\22i\3\2\2\2\24k\3\2\2\2\26"+
		"p\3\2\2\2\30u\3\2\2\2\32\u0084\3\2\2\2\34\u0087\3\2\2\2\36\u0094\3\2\2"+
		"\2 \u00a3\3\2\2\2\"\u00b7\3\2\2\2$\u00c5\3\2\2\2&\'\7\23\2\2\'(\7\22\2"+
		"\2()\7\3\2\2)*\7\4\2\2*+\7\5\2\2+,\5\4\3\2,-\5\b\5\2-.\7\6\2\2./\b\2\1"+
		"\2/\3\3\2\2\2\60\61\5\6\4\2\61\62\7\30\2\2\62\63\7\7\2\2\63\64\5\4\3\2"+
		"\64\65\b\3\1\2\658\3\2\2\2\668\b\3\1\2\67\60\3\2\2\2\67\66\3\2\2\28\5"+
		"\3\2\2\29:\7\20\2\2:?\b\4\1\2;?\7\21\2\2<=\7\17\2\2=?\b\4\1\2>9\3\2\2"+
		"\2>;\3\2\2\2><\3\2\2\2?\7\3\2\2\2@A\5\n\6\2AB\5\b\5\2BE\3\2\2\2CE\3\2"+
		"\2\2D@\3\2\2\2DC\3\2\2\2E\t\3\2\2\2FG\5\26\f\2GH\7\7\2\2HO\3\2\2\2IO\5"+
		"\16\b\2JK\5\30\r\2KL\7\7\2\2LO\3\2\2\2MO\5\f\7\2NF\3\2\2\2NI\3\2\2\2N"+
		"J\3\2\2\2NM\3\2\2\2O\13\3\2\2\2PQ\7\26\2\2QR\7\3\2\2RS\5\26\f\2ST\7\7"+
		"\2\2TU\5\34\17\2UV\7\7\2\2VW\5\26\f\2WX\7\4\2\2XY\5\24\13\2Y\r\3\2\2\2"+
		"Z[\5\20\t\2[\\\5\22\n\2\\\17\3\2\2\2]^\7\24\2\2^_\7\3\2\2_`\5\34\17\2"+
		"`a\7\4\2\2ab\5\24\13\2bc\b\t\1\2c\21\3\2\2\2de\7\25\2\2ef\5\24\13\2fg"+
		"\b\n\1\2gj\3\2\2\2hj\3\2\2\2id\3\2\2\2ih\3\2\2\2j\23\3\2\2\2kl\7\5\2\2"+
		"lm\5\b\5\2mn\7\6\2\2no\b\13\1\2o\25\3\2\2\2pq\7\30\2\2qr\7\b\2\2rs\5\36"+
		"\20\2st\b\f\1\2t\27\3\2\2\2uv\7\30\2\2vw\7\3\2\2w~\7\33\2\2xy\7\t\2\2"+
		"yz\5\32\16\2z{\b\r\1\2{}\3\2\2\2|x\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177"+
		"\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\4\2\2\u0082\u0083"+
		"\b\r\1\2\u0083\31\3\2\2\2\u0084\u0085\5\36\20\2\u0085\u0086\b\16\1\2\u0086"+
		"\33\3\2\2\2\u0087\u0088\5\36\20\2\u0088\u008f\b\17\1\2\u0089\u008a\7\27"+
		"\2\2\u008a\u008b\5\36\20\2\u008b\u008c\b\17\1\2\u008c\u008e\3\2\2\2\u008d"+
		"\u0089\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\b\17\1\2\u0093"+
		"\35\3\2\2\2\u0094\u0095\5 \21\2\u0095\u00a0\b\20\1\2\u0096\u0097\7\n\2"+
		"\2\u0097\u0098\5 \21\2\u0098\u0099\b\20\1\2\u0099\u009f\3\2\2\2\u009a"+
		"\u009b\7\13\2\2\u009b\u009c\5 \21\2\u009c\u009d\b\20\1\2\u009d\u009f\3"+
		"\2\2\2\u009e\u0096\3\2\2\2\u009e\u009a\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\37\3\2\2\2\u00a2\u00a0\3\2\2"+
		"\2\u00a3\u00a4\5\"\22\2\u00a4\u00af\b\21\1\2\u00a5\u00a6\7\f\2\2\u00a6"+
		"\u00a7\5\"\22\2\u00a7\u00a8\b\21\1\2\u00a8\u00ae\3\2\2\2\u00a9\u00aa\7"+
		"\r\2\2\u00aa\u00ab\5\"\22\2\u00ab\u00ac\b\21\1\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u00a5\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0!\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3"+
		"\5$\23\2\u00b3\u00b4\b\22\1\2\u00b4\u00b8\3\2\2\2\u00b5\u00b6\7\13\2\2"+
		"\u00b6\u00b8\5$\23\2\u00b7\u00b2\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8#\3"+
		"\2\2\2\u00b9\u00ba\7\31\2\2\u00ba\u00c6\b\23\1\2\u00bb\u00c6\7\32\2\2"+
		"\u00bc\u00bd\7\30\2\2\u00bd\u00c6\b\23\1\2\u00be\u00bf\7\16\2\2\u00bf"+
		"\u00c6\7\30\2\2\u00c0\u00c1\7\3\2\2\u00c1\u00c2\5\36\20\2\u00c2\u00c3"+
		"\7\4\2\2\u00c3\u00c4\b\23\1\2\u00c4\u00c6\3\2\2\2\u00c5\u00b9\3\2\2\2"+
		"\u00c5\u00bb\3\2\2\2\u00c5\u00bc\3\2\2\2\u00c5\u00be\3\2\2\2\u00c5\u00c0"+
		"\3\2\2\2\u00c6%\3\2\2\2\17\67>DNi~\u008f\u009e\u00a0\u00ad\u00af\u00b7"+
		"\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}