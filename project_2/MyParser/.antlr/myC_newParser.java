// Generated from /home/nian/git/Compiler_preject/project_2/MyParser/myC_new.g by ANTLR 4.7.1

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
public class myC_newParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, FLOAT=13, INT=14, CHAR=15, MAIN=16, VOID=17, 
		IF=18, ELSE=19, EQ_OP=20, LE_OP=21, GE_OP=22, NE_OP=23, L_OP=24, G_OP=25, 
		AND=26, OR=27, NOT=28, XOR=29, Identifier=30, Integer_constant=31, Floating_point_constant=32, 
		STRING=33, CHARACTER=34, WS=35, COMMENT=36;
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_type = 2, RULE_real = 3, 
		RULE_index = 4, RULE_statements = 5, RULE_arith_expression = 6, RULE_multExpr = 7, 
		RULE_signExpr = 8, RULE_primaryExpr = 9, RULE_compareSign = 10, RULE_compare_expression = 11, 
		RULE_mult_compare = 12, RULE_compare_atom = 13, RULE_statement = 14, RULE_if_then_statements = 15, 
		RULE_else_statement = 16;
	public static final String[] ruleNames = {
		"program", "declarations", "type", "real", "index", "statements", "arith_expression", 
		"multExpr", "signExpr", "primaryExpr", "compareSign", "compare_expression", 
		"mult_compare", "compare_atom", "statement", "if_then_statements", "else_statement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'}'", "';'", "'='", "'['", "']'", "'+'", "'-'", 
		"'*'", "'/'", "'float'", "'int'", "'char'", "'main'", "'void'", "'if'", 
		"'else'", "'=='", "'<='", "'>='", "'!='", "'<'", "'>'", "'&&'", "'||'", 
		"'!'", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "FLOAT", "INT", "CHAR", "MAIN", "VOID", "IF", "ELSE", "EQ_OP", "LE_OP", 
		"GE_OP", "NE_OP", "L_OP", "G_OP", "AND", "OR", "NOT", "XOR", "Identifier", 
		"Integer_constant", "Floating_point_constant", "STRING", "CHARACTER", 
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
	public String getGrammarFileName() { return "myC_new.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    boolean TRACEON = true;

	public myC_newParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(myC_newParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(myC_newParser.MAIN, 0); }
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
			setState(38);
			match(T__2);
			setState(39);
			declarations();
			setState(40);
			statements();
			setState(41);
			match(T__3);
			if (TRACEON) System.out.println("VOID MAIN () {declarations statements}");
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
		public TerminalNode Identifier() { return getToken(myC_newParser.Identifier, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(myC_newParser.CHAR, 0); }
		public TerminalNode CHARACTER() { return getToken(myC_newParser.CHARACTER, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public TerminalNode STRING() { return getToken(myC_newParser.STRING, 0); }
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				type();
				setState(45);
				match(Identifier);
				setState(46);
				match(T__4);
				setState(47);
				declarations();
				 if (TRACEON) System.out.println("declarations: type Identifier : declarations"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				type();
				setState(51);
				match(Identifier);
				setState(52);
				match(T__5);
				setState(53);
				real();
				setState(54);
				match(T__4);
				setState(55);
				declarations();
				 if (TRACEON) System.out.println("declarations: type Identifier = REAL: declarations"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				match(CHAR);
				setState(59);
				match(Identifier);
				setState(60);
				match(T__5);
				setState(61);
				match(CHARACTER);
				setState(62);
				match(T__4);
				setState(63);
				declarations();
				 if (TRACEON) System.out.println("declarations: CHAR Identifier = CHARACTER : declarations"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				match(CHAR);
				setState(67);
				match(Identifier);
				setState(68);
				match(T__6);
				setState(69);
				index();
				setState(70);
				match(T__7);
				setState(71);
				match(T__5);
				setState(72);
				match(STRING);
				setState(73);
				match(T__4);
				setState(74);
				declarations();
				 if (TRACEON) System.out.println("declarations: CHAR Identifier [index]=STRING  : declarations"); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				 if (TRACEON) System.out.println("declarations: ");
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(myC_newParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(myC_newParser.FLOAT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(INT);
				 if (TRACEON) System.out.println("type: INT"); 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
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

	public static class RealContext extends ParserRuleContext {
		public TerminalNode Integer_constant() { return getToken(myC_newParser.Integer_constant, 0); }
		public TerminalNode Floating_point_constant() { return getToken(myC_newParser.Floating_point_constant, 0); }
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_real);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==Integer_constant || _la==Floating_point_constant) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class IndexContext extends ParserRuleContext {
		public List<TerminalNode> Integer_constant() { return getTokens(myC_newParser.Integer_constant); }
		public TerminalNode Integer_constant(int i) {
			return getToken(myC_newParser.Integer_constant, i);
		}
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Integer_constant) {
				{
				{
				setState(88);
				match(Integer_constant);
				}
				}
				setState(93);
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
		enterRule(_localctx, 10, RULE_statements);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				statement();
				setState(95);
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

	public static class Arith_expressionContext extends ParserRuleContext {
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
		enterRule(_localctx, 12, RULE_arith_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			multExpr();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__9) {
				{
				setState(105);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(101);
					match(T__8);
					setState(102);
					multExpr();
					}
					break;
				case T__9:
					{
					setState(103);
					match(T__9);
					setState(104);
					multExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(109);
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
		enterRule(_localctx, 14, RULE_multExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			signExpr();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==T__11) {
				{
				setState(115);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(111);
					match(T__10);
					setState(112);
					signExpr();
					}
					break;
				case T__11:
					{
					setState(113);
					match(T__11);
					setState(114);
					signExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(119);
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
		enterRule(_localctx, 16, RULE_signExpr);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case Identifier:
			case Integer_constant:
			case Floating_point_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				primaryExpr();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(T__9);
				setState(122);
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
		public TerminalNode Integer_constant() { return getToken(myC_newParser.Integer_constant, 0); }
		public TerminalNode Floating_point_constant() { return getToken(myC_newParser.Floating_point_constant, 0); }
		public TerminalNode Identifier() { return getToken(myC_newParser.Identifier, 0); }
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
		enterRule(_localctx, 18, RULE_primaryExpr);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(Integer_constant);
				}
				break;
			case Floating_point_constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(Floating_point_constant);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				match(Identifier);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				match(T__0);
				setState(129);
				arith_expression();
				setState(130);
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

	public static class CompareSignContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(myC_newParser.AND, 0); }
		public TerminalNode OR() { return getToken(myC_newParser.OR, 0); }
		public TerminalNode XOR() { return getToken(myC_newParser.XOR, 0); }
		public TerminalNode EQ_OP() { return getToken(myC_newParser.EQ_OP, 0); }
		public TerminalNode LE_OP() { return getToken(myC_newParser.LE_OP, 0); }
		public TerminalNode GE_OP() { return getToken(myC_newParser.GE_OP, 0); }
		public TerminalNode NE_OP() { return getToken(myC_newParser.NE_OP, 0); }
		public TerminalNode L_OP() { return getToken(myC_newParser.L_OP, 0); }
		public TerminalNode G_OP() { return getToken(myC_newParser.G_OP, 0); }
		public CompareSignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareSign; }
	}

	public final CompareSignContext compareSign() throws RecognitionException {
		CompareSignContext _localctx = new CompareSignContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compareSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ_OP) | (1L << LE_OP) | (1L << GE_OP) | (1L << NE_OP) | (1L << L_OP) | (1L << G_OP) | (1L << AND) | (1L << OR) | (1L << XOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Compare_expressionContext extends ParserRuleContext {
		public List<Mult_compareContext> mult_compare() {
			return getRuleContexts(Mult_compareContext.class);
		}
		public Mult_compareContext mult_compare(int i) {
			return getRuleContext(Mult_compareContext.class,i);
		}
		public List<CompareSignContext> compareSign() {
			return getRuleContexts(CompareSignContext.class);
		}
		public CompareSignContext compareSign(int i) {
			return getRuleContext(CompareSignContext.class,i);
		}
		public Compare_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_expression; }
	}

	public final Compare_expressionContext compare_expression() throws RecognitionException {
		Compare_expressionContext _localctx = new Compare_expressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compare_expression);
		int _la;
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NOT:
			case Identifier:
			case Integer_constant:
			case Floating_point_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				mult_compare();
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ_OP) | (1L << LE_OP) | (1L << GE_OP) | (1L << NE_OP) | (1L << L_OP) | (1L << G_OP) | (1L << AND) | (1L << OR) | (1L << XOR))) != 0)) {
					{
					{
					setState(137);
					compareSign();
					setState(138);
					mult_compare();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 if (TRACEON) System.out.println("compare_expression: mult_compare ( compareSign mult_compare )* ");
				}
				break;
			case T__1:
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

	public static class Mult_compareContext extends ParserRuleContext {
		public Compare_atomContext compare_atom() {
			return getRuleContext(Compare_atomContext.class,0);
		}
		public TerminalNode NOT() { return getToken(myC_newParser.NOT, 0); }
		public Mult_compareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult_compare; }
	}

	public final Mult_compareContext mult_compare() throws RecognitionException {
		Mult_compareContext _localctx = new Mult_compareContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mult_compare);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case Identifier:
			case Integer_constant:
			case Floating_point_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				compare_atom();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(NOT);
				setState(152);
				compare_atom();
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

	public static class Compare_atomContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(myC_newParser.Identifier, 0); }
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public Compare_expressionContext compare_expression() {
			return getRuleContext(Compare_expressionContext.class,0);
		}
		public Compare_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_atom; }
	}

	public final Compare_atomContext compare_atom() throws RecognitionException {
		Compare_atomContext _localctx = new Compare_atomContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_compare_atom);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(Identifier);
				 if (TRACEON) System.out.println("compare_atom: ID");
				}
				break;
			case Integer_constant:
			case Floating_point_constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				real();
				 if (TRACEON) System.out.println("compare_atom: REAL");
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(T__0);
				setState(161);
				compare_expression();
				setState(162);
				match(T__1);
				 if (TRACEON) System.out.println("compare_atom: compare_expression");
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
		public TerminalNode Identifier() { return getToken(myC_newParser.Identifier, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode IF() { return getToken(myC_newParser.IF, 0); }
		public Compare_expressionContext compare_expression() {
			return getRuleContext(Compare_expressionContext.class,0);
		}
		public If_then_statementsContext if_then_statements() {
			return getRuleContext(If_then_statementsContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(Identifier);
				setState(168);
				match(T__5);
				setState(169);
				arith_expression();
				setState(170);
				match(T__4);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(IF);
				setState(173);
				match(T__0);
				setState(174);
				compare_expression();
				setState(175);
				match(T__1);
				setState(176);
				if_then_statements();
				 if (TRACEON) System.out.println("IF (compare_expression )");
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

	public static class If_then_statementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public If_then_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_then_statements; }
	}

	public final If_then_statementsContext if_then_statements() throws RecognitionException {
		If_then_statementsContext _localctx = new If_then_statementsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_then_statements);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				statement();
				 if (TRACEON) System.out.println("if_then_statements :statements");
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(T__2);
				setState(185);
				statements();
				setState(186);
				match(T__3);
				setState(187);
				else_statement();
				 if (TRACEON) System.out.println("if_then_statements :{statements } else_statement");
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

	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(myC_newParser.ELSE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_else_statement);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(ELSE);
				setState(193);
				match(T__2);
				setState(194);
				statements();
				setState(195);
				match(T__3);
				 if (TRACEON) System.out.println("else_statement :{statements } ");
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00cc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3Q\n\3\3\4\3\4\3\4\3\4\5\4W\n\4"+
		"\3\5\3\5\3\6\7\6\\\n\6\f\6\16\6_\13\6\3\7\3\7\3\7\3\7\5\7e\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\7\bl\n\b\f\b\16\bo\13\b\3\t\3\t\3\t\3\t\3\t\7\tv\n\t\f\t"+
		"\16\ty\13\t\3\n\3\n\3\n\5\n~\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u0087\n\13\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u008f\n\r\f\r\16\r\u0092\13"+
		"\r\3\r\3\r\3\r\5\r\u0097\n\r\3\16\3\16\3\16\5\16\u009c\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a8\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b6\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c1\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00ca\n\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"\2\4\3\2!\"\4\2\26\35\37\37\2\u00d1\2$\3\2\2\2\4P\3\2\2"+
		"\2\6V\3\2\2\2\bX\3\2\2\2\n]\3\2\2\2\fd\3\2\2\2\16f\3\2\2\2\20p\3\2\2\2"+
		"\22}\3\2\2\2\24\u0086\3\2\2\2\26\u0088\3\2\2\2\30\u0096\3\2\2\2\32\u009b"+
		"\3\2\2\2\34\u00a7\3\2\2\2\36\u00b5\3\2\2\2 \u00c0\3\2\2\2\"\u00c9\3\2"+
		"\2\2$%\7\23\2\2%&\7\22\2\2&\'\7\3\2\2\'(\7\4\2\2()\7\5\2\2)*\5\4\3\2*"+
		"+\5\f\7\2+,\7\6\2\2,-\b\2\1\2-\3\3\2\2\2./\5\6\4\2/\60\7 \2\2\60\61\7"+
		"\7\2\2\61\62\5\4\3\2\62\63\b\3\1\2\63Q\3\2\2\2\64\65\5\6\4\2\65\66\7 "+
		"\2\2\66\67\7\b\2\2\678\5\b\5\289\7\7\2\29:\5\4\3\2:;\b\3\1\2;Q\3\2\2\2"+
		"<=\7\21\2\2=>\7 \2\2>?\7\b\2\2?@\7$\2\2@A\7\7\2\2AB\5\4\3\2BC\b\3\1\2"+
		"CQ\3\2\2\2DE\7\21\2\2EF\7 \2\2FG\7\t\2\2GH\5\n\6\2HI\7\n\2\2IJ\7\b\2\2"+
		"JK\7#\2\2KL\7\7\2\2LM\5\4\3\2MN\b\3\1\2NQ\3\2\2\2OQ\b\3\1\2P.\3\2\2\2"+
		"P\64\3\2\2\2P<\3\2\2\2PD\3\2\2\2PO\3\2\2\2Q\5\3\2\2\2RS\7\20\2\2SW\b\4"+
		"\1\2TU\7\17\2\2UW\b\4\1\2VR\3\2\2\2VT\3\2\2\2W\7\3\2\2\2XY\t\2\2\2Y\t"+
		"\3\2\2\2Z\\\7!\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\13\3\2\2"+
		"\2_]\3\2\2\2`a\5\36\20\2ab\5\f\7\2be\3\2\2\2ce\3\2\2\2d`\3\2\2\2dc\3\2"+
		"\2\2e\r\3\2\2\2fm\5\20\t\2gh\7\13\2\2hl\5\20\t\2ij\7\f\2\2jl\5\20\t\2"+
		"kg\3\2\2\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\17\3\2\2\2om\3\2\2"+
		"\2pw\5\22\n\2qr\7\r\2\2rv\5\22\n\2st\7\16\2\2tv\5\22\n\2uq\3\2\2\2us\3"+
		"\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\21\3\2\2\2yw\3\2\2\2z~\5\24\13\2"+
		"{|\7\f\2\2|~\5\24\13\2}z\3\2\2\2}{\3\2\2\2~\23\3\2\2\2\177\u0087\7!\2"+
		"\2\u0080\u0087\7\"\2\2\u0081\u0087\7 \2\2\u0082\u0083\7\3\2\2\u0083\u0084"+
		"\5\16\b\2\u0084\u0085\7\4\2\2\u0085\u0087\3\2\2\2\u0086\177\3\2\2\2\u0086"+
		"\u0080\3\2\2\2\u0086\u0081\3\2\2\2\u0086\u0082\3\2\2\2\u0087\25\3\2\2"+
		"\2\u0088\u0089\t\3\2\2\u0089\27\3\2\2\2\u008a\u0090\5\32\16\2\u008b\u008c"+
		"\5\26\f\2\u008c\u008d\5\32\16\2\u008d\u008f\3\2\2\2\u008e\u008b\3\2\2"+
		"\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\b\r\1\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0097\3\2\2\2\u0096\u008a\3\2\2\2\u0096\u0095\3\2\2\2\u0097\31\3\2\2"+
		"\2\u0098\u009c\5\34\17\2\u0099\u009a\7\36\2\2\u009a\u009c\5\34\17\2\u009b"+
		"\u0098\3\2\2\2\u009b\u0099\3\2\2\2\u009c\33\3\2\2\2\u009d\u009e\7 \2\2"+
		"\u009e\u00a8\b\17\1\2\u009f\u00a0\5\b\5\2\u00a0\u00a1\b\17\1\2\u00a1\u00a8"+
		"\3\2\2\2\u00a2\u00a3\7\3\2\2\u00a3\u00a4\5\30\r\2\u00a4\u00a5\7\4\2\2"+
		"\u00a5\u00a6\b\17\1\2\u00a6\u00a8\3\2\2\2\u00a7\u009d\3\2\2\2\u00a7\u009f"+
		"\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a8\35\3\2\2\2\u00a9\u00aa\7 \2\2\u00aa"+
		"\u00ab\7\b\2\2\u00ab\u00ac\5\16\b\2\u00ac\u00ad\7\7\2\2\u00ad\u00b6\3"+
		"\2\2\2\u00ae\u00af\7\24\2\2\u00af\u00b0\7\3\2\2\u00b0\u00b1\5\30\r\2\u00b1"+
		"\u00b2\7\4\2\2\u00b2\u00b3\5 \21\2\u00b3\u00b4\b\20\1\2\u00b4\u00b6\3"+
		"\2\2\2\u00b5\u00a9\3\2\2\2\u00b5\u00ae\3\2\2\2\u00b6\37\3\2\2\2\u00b7"+
		"\u00b8\5\36\20\2\u00b8\u00b9\b\21\1\2\u00b9\u00c1\3\2\2\2\u00ba\u00bb"+
		"\7\5\2\2\u00bb\u00bc\5\f\7\2\u00bc\u00bd\7\6\2\2\u00bd\u00be\5\"\22\2"+
		"\u00be\u00bf\b\21\1\2\u00bf\u00c1\3\2\2\2\u00c0\u00b7\3\2\2\2\u00c0\u00ba"+
		"\3\2\2\2\u00c1!\3\2\2\2\u00c2\u00c3\7\25\2\2\u00c3\u00c4\7\5\2\2\u00c4"+
		"\u00c5\5\f\7\2\u00c5\u00c6\7\6\2\2\u00c6\u00c7\b\22\1\2\u00c7\u00ca\3"+
		"\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c2\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"#\3\2\2\2\23PV]dkmuw}\u0086\u0090\u0096\u009b\u00a7\u00b5\u00c0\u00c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}