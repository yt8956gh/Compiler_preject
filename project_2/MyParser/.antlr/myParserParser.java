// Generated from /home/nian/git/Compiler_preject/project_2/MyParser/myParser.g by ANTLR 4.7.1

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
public class myParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		FLOAT=18, INT=19, CHAR=20, MAIN=21, VOID=22, IF=23, ELSE=24, FOR=25, WHILE=26, 
		SWITCH=27, DO=28, EQ_OP=29, LE_OP=30, GE_OP=31, NE_OP=32, L_OP=33, G_OP=34, 
		AND=35, OR=36, NOT=37, XOR=38, PLUS_PLUS=39, MINUS_MINUS=40, PRINTF=41, 
		Identifier=42, Integer_constant=43, Floating_point_constant=44, STRING=45, 
		CHARACTER=46, WS=47, COMMENT=48;
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_type = 2, RULE_real = 3, 
		RULE_index = 4, RULE_statements = 5, RULE_arith_expression = 6, RULE_multExpr = 7, 
		RULE_signExpr = 8, RULE_primaryExpr = 9, RULE_doubleOperator = 10, RULE_compareSign = 11, 
		RULE_compareExpr = 12, RULE_mult_compare = 13, RULE_compare_atom = 14, 
		RULE_statement = 15, RULE_statement_in_for = 16, RULE_if_then_statements = 17, 
		RULE_else_statement = 18, RULE_for_statement = 19, RULE_while_statement = 20, 
		RULE_printf_function = 21, RULE_switch_statement = 22, RULE_my_case = 23, 
		RULE_my_cases = 24;
	public static final String[] ruleNames = {
		"program", "declarations", "type", "real", "index", "statements", "arith_expression", 
		"multExpr", "signExpr", "primaryExpr", "doubleOperator", "compareSign", 
		"compareExpr", "mult_compare", "compare_atom", "statement", "statement_in_for", 
		"if_then_statements", "else_statement", "for_statement", "while_statement", 
		"printf_function", "switch_statement", "my_case", "my_cases"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'}'", "';'", "'='", "'['", "']'", "'+'", "'-'", 
		"'*'", "'/'", "','", "'case'", "':'", "'break;'", "'default: '", "'float'", 
		"'int'", "'char'", "'main'", "'void'", "'if'", "'else'", "'for'", "'while'", 
		"'switch'", "'do'", "'=='", "'<='", "'>='", "'!='", "'<'", "'>'", "'&&'", 
		"'||'", "'!'", "'^'", "'++'", "'--'", "'printf'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "FLOAT", "INT", "CHAR", "MAIN", "VOID", 
		"IF", "ELSE", "FOR", "WHILE", "SWITCH", "DO", "EQ_OP", "LE_OP", "GE_OP", 
		"NE_OP", "L_OP", "G_OP", "AND", "OR", "NOT", "XOR", "PLUS_PLUS", "MINUS_MINUS", 
		"PRINTF", "Identifier", "Integer_constant", "Floating_point_constant", 
		"STRING", "CHARACTER", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "myParser.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    boolean TRACEON = true;

	public myParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(myParserParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(myParserParser.MAIN, 0); }
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
			setState(50);
			match(VOID);
			setState(51);
			match(MAIN);
			setState(52);
			match(T__0);
			setState(53);
			match(T__1);
			setState(54);
			match(T__2);
			setState(55);
			declarations();
			setState(56);
			statements();
			setState(57);
			match(T__3);
			if (TRACEON) System.out.println("VOID MAIN () {declarations statements}\n");
					
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
		public TerminalNode Identifier() { return getToken(myParserParser.Identifier, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(myParserParser.CHAR, 0); }
		public TerminalNode CHARACTER() { return getToken(myParserParser.CHARACTER, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public TerminalNode STRING() { return getToken(myParserParser.STRING, 0); }
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				type();
				setState(61);
				match(Identifier);
				setState(62);
				match(T__4);
				setState(63);
				declarations();
				 if (TRACEON) System.out.println("declarations: type Identifier : declarations\n"); 
						
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				type();
				setState(67);
				match(Identifier);
				setState(68);
				match(T__5);
				setState(69);
				real();
				setState(70);
				match(T__4);
				setState(71);
				declarations();
				 if (TRACEON) System.out.println("declarations: type Identifier = REAL: declarations\n"); 
						
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(CHAR);
				setState(75);
				match(Identifier);
				setState(76);
				match(T__5);
				setState(77);
				match(CHARACTER);
				setState(78);
				match(T__4);
				setState(79);
				declarations();
				 if (TRACEON) System.out.println("declarations: CHAR Identifier = CHARACTER : declarations\n"); 
						
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				match(CHAR);
				setState(83);
				match(Identifier);
				setState(84);
				match(T__6);
				setState(85);
				index();
				setState(86);
				match(T__7);
				setState(87);
				match(T__5);
				setState(88);
				match(STRING);
				setState(89);
				match(T__4);
				setState(90);
				declarations();
				 if (TRACEON) System.out.println("declarations: CHAR Identifier [index]=STRING  : declarations\n"); 
						
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				 if (TRACEON) System.out.println("declarations: \n");
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
		public TerminalNode INT() { return getToken(myParserParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(myParserParser.FLOAT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(INT);
				 if (TRACEON) System.out.println("type: INT\n"); 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(FLOAT);
				if (TRACEON) System.out.println("type: FLOAT\n"); 
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
		public TerminalNode Integer_constant() { return getToken(myParserParser.Integer_constant, 0); }
		public TerminalNode Floating_point_constant() { return getToken(myParserParser.Floating_point_constant, 0); }
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
			setState(102);
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
		public List<TerminalNode> Integer_constant() { return getTokens(myParserParser.Integer_constant); }
		public TerminalNode Integer_constant(int i) {
			return getToken(myParserParser.Integer_constant, i);
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
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Integer_constant) {
				{
				{
				setState(104);
				match(Integer_constant);
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
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case FOR:
			case WHILE:
			case SWITCH:
			case DO:
			case PRINTF:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				statement();
				setState(111);
				statements();
				}
				break;
			case T__3:
			case T__13:
			case T__15:
			case T__16:
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
			setState(116);
			multExpr();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__9) {
				{
				setState(121);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(117);
					match(T__8);
					setState(118);
					multExpr();
					}
					break;
				case T__9:
					{
					setState(119);
					match(T__9);
					setState(120);
					multExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(125);
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
			setState(126);
			signExpr();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==T__11) {
				{
				setState(131);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(127);
					match(T__10);
					setState(128);
					signExpr();
					}
					break;
				case T__11:
					{
					setState(129);
					match(T__11);
					setState(130);
					signExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(135);
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
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case Identifier:
			case Integer_constant:
			case Floating_point_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				primaryExpr();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(T__9);
				setState(138);
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
		public TerminalNode Integer_constant() { return getToken(myParserParser.Integer_constant, 0); }
		public TerminalNode Floating_point_constant() { return getToken(myParserParser.Floating_point_constant, 0); }
		public TerminalNode Identifier() { return getToken(myParserParser.Identifier, 0); }
		public DoubleOperatorContext doubleOperator() {
			return getRuleContext(DoubleOperatorContext.class,0);
		}
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
		int _la;
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(Integer_constant);
				}
				break;
			case Floating_point_constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(Floating_point_constant);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				match(Identifier);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS_PLUS || _la==MINUS_MINUS) {
					{
					setState(144);
					doubleOperator();
					}
				}

				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				match(T__0);
				setState(148);
				arith_expression();
				setState(149);
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

	public static class DoubleOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS_PLUS() { return getToken(myParserParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(myParserParser.MINUS_MINUS, 0); }
		public DoubleOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleOperator; }
	}

	public final DoubleOperatorContext doubleOperator() throws RecognitionException {
		DoubleOperatorContext _localctx = new DoubleOperatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_doubleOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !(_la==PLUS_PLUS || _la==MINUS_MINUS) ) {
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

	public static class CompareSignContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(myParserParser.AND, 0); }
		public TerminalNode OR() { return getToken(myParserParser.OR, 0); }
		public TerminalNode XOR() { return getToken(myParserParser.XOR, 0); }
		public TerminalNode EQ_OP() { return getToken(myParserParser.EQ_OP, 0); }
		public TerminalNode LE_OP() { return getToken(myParserParser.LE_OP, 0); }
		public TerminalNode GE_OP() { return getToken(myParserParser.GE_OP, 0); }
		public TerminalNode NE_OP() { return getToken(myParserParser.NE_OP, 0); }
		public TerminalNode L_OP() { return getToken(myParserParser.L_OP, 0); }
		public TerminalNode G_OP() { return getToken(myParserParser.G_OP, 0); }
		public CompareSignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareSign; }
	}

	public final CompareSignContext compareSign() throws RecognitionException {
		CompareSignContext _localctx = new CompareSignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compareSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
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

	public static class CompareExprContext extends ParserRuleContext {
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
		public CompareExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareExpr; }
	}

	public final CompareExprContext compareExpr() throws RecognitionException {
		CompareExprContext _localctx = new CompareExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_compareExpr);
		int _la;
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NOT:
			case Identifier:
			case Integer_constant:
			case Floating_point_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				mult_compare();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ_OP) | (1L << LE_OP) | (1L << GE_OP) | (1L << NE_OP) | (1L << L_OP) | (1L << G_OP) | (1L << AND) | (1L << OR) | (1L << XOR))) != 0)) {
					{
					{
					setState(158);
					compareSign();
					setState(159);
					mult_compare();
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 if (TRACEON) System.out.println("compareExpr: mult_compare ( compareSign mult_compare )* \n");
						
				}
				break;
			case T__1:
			case T__4:
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
		public TerminalNode NOT() { return getToken(myParserParser.NOT, 0); }
		public Mult_compareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult_compare; }
	}

	public final Mult_compareContext mult_compare() throws RecognitionException {
		Mult_compareContext _localctx = new Mult_compareContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mult_compare);
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
				setState(171);
				compare_atom();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(NOT);
				setState(173);
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
		public TerminalNode Identifier() { return getToken(myParserParser.Identifier, 0); }
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public CompareExprContext compareExpr() {
			return getRuleContext(CompareExprContext.class,0);
		}
		public Compare_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_atom; }
	}

	public final Compare_atomContext compare_atom() throws RecognitionException {
		Compare_atomContext _localctx = new Compare_atomContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_compare_atom);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(Identifier);
				 if (TRACEON) System.out.println("compare_atom: ID\n");
				}
				break;
			case Integer_constant:
			case Floating_point_constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				real();
				 if (TRACEON) System.out.println("compare_atom: REAL\n");
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(T__0);
				setState(182);
				compareExpr();
				setState(183);
				match(T__1);
				 if (TRACEON) System.out.println("compare_atom:  compareExpr\n");
						
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
		public TerminalNode Identifier() { return getToken(myParserParser.Identifier, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public DoubleOperatorContext doubleOperator() {
			return getRuleContext(DoubleOperatorContext.class,0);
		}
		public TerminalNode IF() { return getToken(myParserParser.IF, 0); }
		public CompareExprContext compareExpr() {
			return getRuleContext(CompareExprContext.class,0);
		}
		public If_then_statementsContext if_then_statements() {
			return getRuleContext(If_then_statementsContext.class,0);
		}
		public TerminalNode FOR() { return getToken(myParserParser.FOR, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public Statement_in_forContext statement_in_for() {
			return getRuleContext(Statement_in_forContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(myParserParser.WHILE, 0); }
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Printf_functionContext printf_function() {
			return getRuleContext(Printf_functionContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(myParserParser.SWITCH, 0); }
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public TerminalNode DO() { return getToken(myParserParser.DO, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(Identifier);
				setState(189);
				match(T__5);
				setState(190);
				arith_expression();
				setState(191);
				match(T__4);
				 if (TRACEON) System.out.println("statement: Identifier = arith_expression;\n");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(Identifier);
				setState(195);
				doubleOperator();
				setState(196);
				match(T__4);
				 if (TRACEON) System.out.println("statement:  Identifier doubleOperator;\n");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				match(IF);
				setState(200);
				match(T__0);
				setState(201);
				compareExpr();
				setState(202);
				match(T__1);
				setState(203);
				if_then_statements();
				 if (TRACEON) System.out.println("statement: IF ( compareExpr ) if_then_statements\n");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				match(FOR);
				setState(207);
				match(T__0);
				setState(208);
				declarations();
				setState(209);
				compareExpr();
				setState(210);
				match(T__4);
				setState(211);
				statement_in_for();
				setState(212);
				match(T__1);
				setState(213);
				for_statement();
				 if (TRACEON) System.out.println("statement: FOR (declarations; compareExpr;statement) for_statement\n");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(216);
				match(WHILE);
				setState(217);
				match(T__0);
				setState(218);
				compareExpr();
				setState(219);
				match(T__1);
				setState(220);
				while_statement();
				 if (TRACEON) System.out.println("statement: WHILE ( compareExpr) while_statement\n");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(223);
				printf_function();
				setState(224);
				match(T__4);
				 if (TRACEON) System.out.println("statement: printf_function\n");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(227);
				match(SWITCH);
				setState(228);
				match(T__0);
				setState(229);
				match(Identifier);
				setState(230);
				match(T__1);
				setState(231);
				switch_statement();
				 if (TRACEON) System.out.println("statement: SWITCH (Identifier) switch_statement\n");
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(234);
				match(DO);
				setState(235);
				match(T__2);
				setState(236);
				statements();
				setState(237);
				match(T__3);
				setState(238);
				match(WHILE);
				setState(239);
				match(T__0);
				setState(240);
				compareExpr();
				setState(241);
				match(T__1);
				setState(242);
				match(T__4);
				 if (TRACEON) System.out.println("statement: DO {statement} WHILE( compareExpr)\n");
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

	public static class Statement_in_forContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(myParserParser.Identifier, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public DoubleOperatorContext doubleOperator() {
			return getRuleContext(DoubleOperatorContext.class,0);
		}
		public Statement_in_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_in_for; }
	}

	public final Statement_in_forContext statement_in_for() throws RecognitionException {
		Statement_in_forContext _localctx = new Statement_in_forContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement_in_for);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(Identifier);
				setState(248);
				match(T__5);
				setState(249);
				arith_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(Identifier);
				setState(251);
				doubleOperator();
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
		enterRule(_localctx, 34, RULE_if_then_statements);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case FOR:
			case WHILE:
			case SWITCH:
			case DO:
			case PRINTF:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				statement();
				 if (TRACEON) System.out.println("if_then_statements:  statements\n");
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(T__2);
				setState(258);
				statements();
				setState(259);
				match(T__3);
				setState(260);
				else_statement();
				 if (TRACEON) System.out.println("if_then_statements :  {statements } else_statement\n");
						
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
		public TerminalNode ELSE() { return getToken(myParserParser.ELSE, 0); }
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
		enterRule(_localctx, 36, RULE_else_statement);
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(ELSE);
				setState(266);
				match(T__2);
				setState(267);
				statements();
				setState(268);
				match(T__3);
				 if (TRACEON) System.out.println("else_statement : {statements } \n");
				}
				break;
			case T__3:
			case T__13:
			case T__15:
			case T__16:
			case IF:
			case FOR:
			case WHILE:
			case SWITCH:
			case DO:
			case PRINTF:
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

	public static class For_statementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_for_statement);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case FOR:
			case WHILE:
			case SWITCH:
			case DO:
			case PRINTF:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				statement();
				 if (TRACEON) System.out.println("for_statements : statements\n");
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(T__2);
				setState(278);
				statements();
				setState(279);
				match(T__3);
				 if (TRACEON) System.out.println("for_statements : {statements } else_statement\n");
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

	public static class While_statementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_while_statement);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case FOR:
			case WHILE:
			case SWITCH:
			case DO:
			case PRINTF:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				statement();
				 if (TRACEON) System.out.println("while_statements : statements\n");
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				match(T__2);
				setState(288);
				statements();
				setState(289);
				match(T__3);
				 if (TRACEON) System.out.println("while_statements : {statements } else_statement\n");
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

	public static class Printf_functionContext extends ParserRuleContext {
		public TerminalNode PRINTF() { return getToken(myParserParser.PRINTF, 0); }
		public TerminalNode STRING() { return getToken(myParserParser.STRING, 0); }
		public List<TerminalNode> Identifier() { return getTokens(myParserParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(myParserParser.Identifier, i);
		}
		public Printf_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printf_function; }
	}

	public final Printf_functionContext printf_function() throws RecognitionException {
		Printf_functionContext _localctx = new Printf_functionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_printf_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(PRINTF);
			setState(295);
			match(T__0);
			setState(296);
			match(STRING);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(297);
				match(T__12);
				setState(298);
				match(Identifier);
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
			match(T__1);
			 if (TRACEON) System.out.println("printf_function:  PRINTF (STRING (,Identifier)* )\n");
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

	public static class Switch_statementContext extends ParserRuleContext {
		public My_casesContext my_cases() {
			return getRuleContext(My_casesContext.class,0);
		}
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_switch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__2);
			setState(308);
			my_cases();
			setState(309);
			match(T__3);
			 if (TRACEON) System.out.println("switch_statement : {my_cases }\n");
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

	public static class My_caseContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode CHARACTER() { return getToken(myParserParser.CHARACTER, 0); }
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public My_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_my_case; }
	}

	public final My_caseContext my_case() throws RecognitionException {
		My_caseContext _localctx = new My_caseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_my_case);
		int _la;
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(T__13);
				setState(315);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHARACTER:
					{
					setState(313);
					match(CHARACTER);
					}
					break;
				case Integer_constant:
				case Floating_point_constant:
					{
					setState(314);
					real();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(317);
				match(T__14);
				setState(318);
				statements();
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(319);
					match(T__15);
					}
				}

				 if (TRACEON) System.out.println("my_case: case (CHARACTER|real) : statements break;?\n");
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				match(T__16);
				setState(325);
				statements();
				 if (TRACEON) System.out.println("my_case: default: statements \n");
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

	public static class My_casesContext extends ParserRuleContext {
		public My_caseContext my_case() {
			return getRuleContext(My_caseContext.class,0);
		}
		public My_casesContext my_cases() {
			return getRuleContext(My_casesContext.class,0);
		}
		public My_casesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_my_cases; }
	}

	public final My_casesContext my_cases() throws RecognitionException {
		My_casesContext _localctx = new My_casesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_my_cases);
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				my_case();
				setState(331);
				my_cases();
				 if (TRACEON) System.out.println("my_cases: my_case my_cases\n");
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0154\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3a\n\3\3\4\3\4\3\4\3"+
		"\4\5\4g\n\4\3\5\3\5\3\6\7\6l\n\6\f\6\16\6o\13\6\3\7\3\7\3\7\3\7\5\7u\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\7\b|\n\b\f\b\16\b\177\13\b\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u0086\n\t\f\t\16\t\u0089\13\t\3\n\3\n\3\n\5\n\u008e\n\n\3\13\3\13"+
		"\3\13\3\13\5\13\u0094\n\13\3\13\3\13\3\13\3\13\5\13\u009a\n\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u00a4\n\16\f\16\16\16\u00a7\13\16\3"+
		"\16\3\16\3\16\5\16\u00ac\n\16\3\17\3\17\3\17\5\17\u00b1\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00bd\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00f8"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u00ff\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u010a\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u0113\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u011d\n"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0127\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\7\27\u012e\n\27\f\27\16\27\u0131\13\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\5\31\u013e\n\31\3\31\3\31\3\31"+
		"\5\31\u0143\n\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u014b\n\31\3\32\3"+
		"\32\3\32\3\32\3\32\5\32\u0152\n\32\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\2\5\3\2-.\3\2)*\4\2\37&((\2\u0160\2\64"+
		"\3\2\2\2\4`\3\2\2\2\6f\3\2\2\2\bh\3\2\2\2\nm\3\2\2\2\ft\3\2\2\2\16v\3"+
		"\2\2\2\20\u0080\3\2\2\2\22\u008d\3\2\2\2\24\u0099\3\2\2\2\26\u009b\3\2"+
		"\2\2\30\u009d\3\2\2\2\32\u00ab\3\2\2\2\34\u00b0\3\2\2\2\36\u00bc\3\2\2"+
		"\2 \u00f7\3\2\2\2\"\u00fe\3\2\2\2$\u0109\3\2\2\2&\u0112\3\2\2\2(\u011c"+
		"\3\2\2\2*\u0126\3\2\2\2,\u0128\3\2\2\2.\u0135\3\2\2\2\60\u014a\3\2\2\2"+
		"\62\u0151\3\2\2\2\64\65\7\30\2\2\65\66\7\27\2\2\66\67\7\3\2\2\678\7\4"+
		"\2\289\7\5\2\29:\5\4\3\2:;\5\f\7\2;<\7\6\2\2<=\b\2\1\2=\3\3\2\2\2>?\5"+
		"\6\4\2?@\7,\2\2@A\7\7\2\2AB\5\4\3\2BC\b\3\1\2Ca\3\2\2\2DE\5\6\4\2EF\7"+
		",\2\2FG\7\b\2\2GH\5\b\5\2HI\7\7\2\2IJ\5\4\3\2JK\b\3\1\2Ka\3\2\2\2LM\7"+
		"\26\2\2MN\7,\2\2NO\7\b\2\2OP\7\60\2\2PQ\7\7\2\2QR\5\4\3\2RS\b\3\1\2Sa"+
		"\3\2\2\2TU\7\26\2\2UV\7,\2\2VW\7\t\2\2WX\5\n\6\2XY\7\n\2\2YZ\7\b\2\2Z"+
		"[\7/\2\2[\\\7\7\2\2\\]\5\4\3\2]^\b\3\1\2^a\3\2\2\2_a\b\3\1\2`>\3\2\2\2"+
		"`D\3\2\2\2`L\3\2\2\2`T\3\2\2\2`_\3\2\2\2a\5\3\2\2\2bc\7\25\2\2cg\b\4\1"+
		"\2de\7\24\2\2eg\b\4\1\2fb\3\2\2\2fd\3\2\2\2g\7\3\2\2\2hi\t\2\2\2i\t\3"+
		"\2\2\2jl\7-\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\13\3\2\2\2om"+
		"\3\2\2\2pq\5 \21\2qr\5\f\7\2ru\3\2\2\2su\3\2\2\2tp\3\2\2\2ts\3\2\2\2u"+
		"\r\3\2\2\2v}\5\20\t\2wx\7\13\2\2x|\5\20\t\2yz\7\f\2\2z|\5\20\t\2{w\3\2"+
		"\2\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\17\3\2\2\2\177}\3\2\2"+
		"\2\u0080\u0087\5\22\n\2\u0081\u0082\7\r\2\2\u0082\u0086\5\22\n\2\u0083"+
		"\u0084\7\16\2\2\u0084\u0086\5\22\n\2\u0085\u0081\3\2\2\2\u0085\u0083\3"+
		"\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\21\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008e\5\24\13\2\u008b\u008c\7\f"+
		"\2\2\u008c\u008e\5\24\13\2\u008d\u008a\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\23\3\2\2\2\u008f\u009a\7-\2\2\u0090\u009a\7.\2\2\u0091\u0093\7,\2\2\u0092"+
		"\u0094\5\26\f\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u009a\3"+
		"\2\2\2\u0095\u0096\7\3\2\2\u0096\u0097\5\16\b\2\u0097\u0098\7\4\2\2\u0098"+
		"\u009a\3\2\2\2\u0099\u008f\3\2\2\2\u0099\u0090\3\2\2\2\u0099\u0091\3\2"+
		"\2\2\u0099\u0095\3\2\2\2\u009a\25\3\2\2\2\u009b\u009c\t\3\2\2\u009c\27"+
		"\3\2\2\2\u009d\u009e\t\4\2\2\u009e\31\3\2\2\2\u009f\u00a5\5\34\17\2\u00a0"+
		"\u00a1\5\30\r\2\u00a1\u00a2\5\34\17\2\u00a2\u00a4\3\2\2\2\u00a3\u00a0"+
		"\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\b\16\1\2\u00a9\u00ac\3"+
		"\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u009f\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\33\3\2\2\2\u00ad\u00b1\5\36\20\2\u00ae\u00af\7\'\2\2\u00af\u00b1\5\36"+
		"\20\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\35\3\2\2\2\u00b2\u00b3"+
		"\7,\2\2\u00b3\u00bd\b\20\1\2\u00b4\u00b5\5\b\5\2\u00b5\u00b6\b\20\1\2"+
		"\u00b6\u00bd\3\2\2\2\u00b7\u00b8\7\3\2\2\u00b8\u00b9\5\32\16\2\u00b9\u00ba"+
		"\7\4\2\2\u00ba\u00bb\b\20\1\2\u00bb\u00bd\3\2\2\2\u00bc\u00b2\3\2\2\2"+
		"\u00bc\u00b4\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bd\37\3\2\2\2\u00be\u00bf"+
		"\7,\2\2\u00bf\u00c0\7\b\2\2\u00c0\u00c1\5\16\b\2\u00c1\u00c2\7\7\2\2\u00c2"+
		"\u00c3\b\21\1\2\u00c3\u00f8\3\2\2\2\u00c4\u00c5\7,\2\2\u00c5\u00c6\5\26"+
		"\f\2\u00c6\u00c7\7\7\2\2\u00c7\u00c8\b\21\1\2\u00c8\u00f8\3\2\2\2\u00c9"+
		"\u00ca\7\31\2\2\u00ca\u00cb\7\3\2\2\u00cb\u00cc\5\32\16\2\u00cc\u00cd"+
		"\7\4\2\2\u00cd\u00ce\5$\23\2\u00ce\u00cf\b\21\1\2\u00cf\u00f8\3\2\2\2"+
		"\u00d0\u00d1\7\33\2\2\u00d1\u00d2\7\3\2\2\u00d2\u00d3\5\4\3\2\u00d3\u00d4"+
		"\5\32\16\2\u00d4\u00d5\7\7\2\2\u00d5\u00d6\5\"\22\2\u00d6\u00d7\7\4\2"+
		"\2\u00d7\u00d8\5(\25\2\u00d8\u00d9\b\21\1\2\u00d9\u00f8\3\2\2\2\u00da"+
		"\u00db\7\34\2\2\u00db\u00dc\7\3\2\2\u00dc\u00dd\5\32\16\2\u00dd\u00de"+
		"\7\4\2\2\u00de\u00df\5*\26\2\u00df\u00e0\b\21\1\2\u00e0\u00f8\3\2\2\2"+
		"\u00e1\u00e2\5,\27\2\u00e2\u00e3\7\7\2\2\u00e3\u00e4\b\21\1\2\u00e4\u00f8"+
		"\3\2\2\2\u00e5\u00e6\7\35\2\2\u00e6\u00e7\7\3\2\2\u00e7\u00e8\7,\2\2\u00e8"+
		"\u00e9\7\4\2\2\u00e9\u00ea\5.\30\2\u00ea\u00eb\b\21\1\2\u00eb\u00f8\3"+
		"\2\2\2\u00ec\u00ed\7\36\2\2\u00ed\u00ee\7\5\2\2\u00ee\u00ef\5\f\7\2\u00ef"+
		"\u00f0\7\6\2\2\u00f0\u00f1\7\34\2\2\u00f1\u00f2\7\3\2\2\u00f2\u00f3\5"+
		"\32\16\2\u00f3\u00f4\7\4\2\2\u00f4\u00f5\7\7\2\2\u00f5\u00f6\b\21\1\2"+
		"\u00f6\u00f8\3\2\2\2\u00f7\u00be\3\2\2\2\u00f7\u00c4\3\2\2\2\u00f7\u00c9"+
		"\3\2\2\2\u00f7\u00d0\3\2\2\2\u00f7\u00da\3\2\2\2\u00f7\u00e1\3\2\2\2\u00f7"+
		"\u00e5\3\2\2\2\u00f7\u00ec\3\2\2\2\u00f8!\3\2\2\2\u00f9\u00fa\7,\2\2\u00fa"+
		"\u00fb\7\b\2\2\u00fb\u00ff\5\16\b\2\u00fc\u00fd\7,\2\2\u00fd\u00ff\5\26"+
		"\f\2\u00fe\u00f9\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff#\3\2\2\2\u0100\u0101"+
		"\5 \21\2\u0101\u0102\b\23\1\2\u0102\u010a\3\2\2\2\u0103\u0104\7\5\2\2"+
		"\u0104\u0105\5\f\7\2\u0105\u0106\7\6\2\2\u0106\u0107\5&\24\2\u0107\u0108"+
		"\b\23\1\2\u0108\u010a\3\2\2\2\u0109\u0100\3\2\2\2\u0109\u0103\3\2\2\2"+
		"\u010a%\3\2\2\2\u010b\u010c\7\32\2\2\u010c\u010d\7\5\2\2\u010d\u010e\5"+
		"\f\7\2\u010e\u010f\7\6\2\2\u010f\u0110\b\24\1\2\u0110\u0113\3\2\2\2\u0111"+
		"\u0113\3\2\2\2\u0112\u010b\3\2\2\2\u0112\u0111\3\2\2\2\u0113\'\3\2\2\2"+
		"\u0114\u0115\5 \21\2\u0115\u0116\b\25\1\2\u0116\u011d\3\2\2\2\u0117\u0118"+
		"\7\5\2\2\u0118\u0119\5\f\7\2\u0119\u011a\7\6\2\2\u011a\u011b\b\25\1\2"+
		"\u011b\u011d\3\2\2\2\u011c\u0114\3\2\2\2\u011c\u0117\3\2\2\2\u011d)\3"+
		"\2\2\2\u011e\u011f\5 \21\2\u011f\u0120\b\26\1\2\u0120\u0127\3\2\2\2\u0121"+
		"\u0122\7\5\2\2\u0122\u0123\5\f\7\2\u0123\u0124\7\6\2\2\u0124\u0125\b\26"+
		"\1\2\u0125\u0127\3\2\2\2\u0126\u011e\3\2\2\2\u0126\u0121\3\2\2\2\u0127"+
		"+\3\2\2\2\u0128\u0129\7+\2\2\u0129\u012a\7\3\2\2\u012a\u012f\7/\2\2\u012b"+
		"\u012c\7\17\2\2\u012c\u012e\7,\2\2\u012d\u012b\3\2\2\2\u012e\u0131\3\2"+
		"\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0132\u0133\7\4\2\2\u0133\u0134\b\27\1\2\u0134-\3\2\2\2"+
		"\u0135\u0136\7\5\2\2\u0136\u0137\5\62\32\2\u0137\u0138\7\6\2\2\u0138\u0139"+
		"\b\30\1\2\u0139/\3\2\2\2\u013a\u013d\7\20\2\2\u013b\u013e\7\60\2\2\u013c"+
		"\u013e\5\b\5\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0140\7\21\2\2\u0140\u0142\5\f\7\2\u0141\u0143\7\22\2\2\u0142"+
		"\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\b\31"+
		"\1\2\u0145\u014b\3\2\2\2\u0146\u0147\7\23\2\2\u0147\u0148\5\f\7\2\u0148"+
		"\u0149\b\31\1\2\u0149\u014b\3\2\2\2\u014a\u013a\3\2\2\2\u014a\u0146\3"+
		"\2\2\2\u014b\61\3\2\2\2\u014c\u014d\5\60\31\2\u014d\u014e\5\62\32\2\u014e"+
		"\u014f\b\32\1\2\u014f\u0152\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014c\3"+
		"\2\2\2\u0151\u0150\3\2\2\2\u0152\63\3\2\2\2\34`fmt{}\u0085\u0087\u008d"+
		"\u0093\u0099\u00a5\u00ab\u00b0\u00bc\u00f7\u00fe\u0109\u0112\u011c\u0126"+
		"\u012f\u013d\u0142\u014a\u0151";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}