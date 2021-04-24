// Generated from .\Calculator.g4 by ANTLR 4.9
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, POW=7, MUL=8, DIV=9, ADD=10, 
		SUB=11, RealPart=12, ImaginaryPart=13, Successor=14, INT=15, MOD=16, Equal=17, 
		GreaterEqual=18, LowerEqual=19, Lower=20, Greater=21, NotEqual=22, DOUBLE=23, 
		ZERO=24, BEGIN=25, END=26, FUNCTION=27, SIN=28, COS=29, ABS=30, TAN=31, 
		WHERE=32, AND=33, OR=34, NOT=35, NAME=36, WHITESPACE=37, COMMENT=38, LINE_COMMENT=39;
	public static final int
		RULE_start = 0, RULE_pattern_matching = 1, RULE_logic_function_name = 2, 
		RULE_pattern_matching_arg = 3, RULE_real_number = 4, RULE_function_name = 5, 
		RULE_signed_real_number = 6, RULE_complex_number = 7, RULE_variable = 8, 
		RULE_variables = 9, RULE_right_assignments = 10, RULE_function_call = 11, 
		RULE_right_assignment = 12, RULE_assignment = 13, RULE_instruction = 14, 
		RULE_instructions = 15, RULE_function_body = 16, RULE_function = 17, RULE_program_elements = 18, 
		RULE_program_element = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "pattern_matching", "logic_function_name", "pattern_matching_arg", 
			"real_number", "function_name", "signed_real_number", "complex_number", 
			"variable", "variables", "right_assignments", "function_call", "right_assignment", 
			"assignment", "instruction", "instructions", "function_body", "function", 
			"program_elements", "program_element"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'i'", "'='", "';'", "'^'", "'*'", "'/'", 
			"'+'", "'-'", "'Re'", "'Im'", "'s'", null, "'%'", "'=='", "'>='", "'<='", 
			"'<'", "'>'", "'!='", null, "'0'", "'{'", "'}'", "'function'", "'sin'", 
			"'cos'", "'abs'", "'tan'", "'where'", "'&'", "'|'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "POW", "MUL", "DIV", "ADD", 
			"SUB", "RealPart", "ImaginaryPart", "Successor", "INT", "MOD", "Equal", 
			"GreaterEqual", "LowerEqual", "Lower", "Greater", "NotEqual", "DOUBLE", 
			"ZERO", "BEGIN", "END", "FUNCTION", "SIN", "COS", "ABS", "TAN", "WHERE", 
			"AND", "OR", "NOT", "NAME", "WHITESPACE", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public Program_elementsContext program_elements() {
			return getRuleContext(Program_elementsContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(CalculatorParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(CalculatorParser.WHITESPACE, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			program_elements();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(41);
				match(WHITESPACE);
				}
				}
				setState(46);
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

	public static class Pattern_matchingContext extends ParserRuleContext {
		public Logic_function_nameContext logic_function_name() {
			return getRuleContext(Logic_function_nameContext.class,0);
		}
		public List<Pattern_matching_argContext> pattern_matching_arg() {
			return getRuleContexts(Pattern_matching_argContext.class);
		}
		public Pattern_matching_argContext pattern_matching_arg(int i) {
			return getRuleContext(Pattern_matching_argContext.class,i);
		}
		public TerminalNode NOT() { return getToken(CalculatorParser.NOT, 0); }
		public Pattern_matchingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_matching; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterPattern_matching(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitPattern_matching(this);
		}
	}

	public final Pattern_matchingContext pattern_matching() throws RecognitionException {
		Pattern_matchingContext _localctx = new Pattern_matchingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pattern_matching);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Equal:
			case GreaterEqual:
			case LowerEqual:
			case Lower:
			case Greater:
			case NotEqual:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				logic_function_name();
				setState(48);
				match(T__0);
				setState(49);
				pattern_matching_arg();
				setState(50);
				match(T__1);
				setState(51);
				pattern_matching_arg();
				setState(52);
				match(T__2);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(NOT);
				setState(55);
				match(T__0);
				setState(56);
				pattern_matching_arg();
				setState(57);
				match(T__2);
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

	public static class Logic_function_nameContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(CalculatorParser.OR, 0); }
		public TerminalNode AND() { return getToken(CalculatorParser.AND, 0); }
		public TerminalNode Equal() { return getToken(CalculatorParser.Equal, 0); }
		public TerminalNode GreaterEqual() { return getToken(CalculatorParser.GreaterEqual, 0); }
		public TerminalNode LowerEqual() { return getToken(CalculatorParser.LowerEqual, 0); }
		public TerminalNode Lower() { return getToken(CalculatorParser.Lower, 0); }
		public TerminalNode Greater() { return getToken(CalculatorParser.Greater, 0); }
		public TerminalNode NotEqual() { return getToken(CalculatorParser.NotEqual, 0); }
		public Logic_function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterLogic_function_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitLogic_function_name(this);
		}
	}

	public final Logic_function_nameContext logic_function_name() throws RecognitionException {
		Logic_function_nameContext _localctx = new Logic_function_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_logic_function_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << GreaterEqual) | (1L << LowerEqual) | (1L << Lower) | (1L << Greater) | (1L << NotEqual) | (1L << AND) | (1L << OR))) != 0)) ) {
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

	public static class Pattern_matching_argContext extends ParserRuleContext {
		public Right_assignmentContext right_assignment() {
			return getRuleContext(Right_assignmentContext.class,0);
		}
		public Pattern_matchingContext pattern_matching() {
			return getRuleContext(Pattern_matchingContext.class,0);
		}
		public Pattern_matching_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_matching_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterPattern_matching_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitPattern_matching_arg(this);
		}
	}

	public final Pattern_matching_argContext pattern_matching_arg() throws RecognitionException {
		Pattern_matching_argContext _localctx = new Pattern_matching_argContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pattern_matching_arg);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POW:
			case MUL:
			case DIV:
			case ADD:
			case SUB:
			case RealPart:
			case ImaginaryPart:
			case Successor:
			case INT:
			case MOD:
			case DOUBLE:
			case ZERO:
			case SIN:
			case COS:
			case ABS:
			case TAN:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				right_assignment();
				}
				break;
			case Equal:
			case GreaterEqual:
			case LowerEqual:
			case Lower:
			case Greater:
			case NotEqual:
			case AND:
			case OR:
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				pattern_matching();
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

	public static class Real_numberContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(CalculatorParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(CalculatorParser.INT, 0); }
		public TerminalNode ZERO() { return getToken(CalculatorParser.ZERO, 0); }
		public Real_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterReal_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitReal_number(this);
		}
	}

	public final Real_numberContext real_number() throws RecognitionException {
		Real_numberContext _localctx = new Real_numberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_real_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << ZERO))) != 0)) ) {
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

	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(CalculatorParser.NAME, 0); }
		public TerminalNode POW() { return getToken(CalculatorParser.POW, 0); }
		public TerminalNode DIV() { return getToken(CalculatorParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(CalculatorParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CalculatorParser.SUB, 0); }
		public TerminalNode RealPart() { return getToken(CalculatorParser.RealPart, 0); }
		public TerminalNode ImaginaryPart() { return getToken(CalculatorParser.ImaginaryPart, 0); }
		public TerminalNode Successor() { return getToken(CalculatorParser.Successor, 0); }
		public TerminalNode MOD() { return getToken(CalculatorParser.MOD, 0); }
		public TerminalNode SIN() { return getToken(CalculatorParser.SIN, 0); }
		public TerminalNode COS() { return getToken(CalculatorParser.COS, 0); }
		public TerminalNode ABS() { return getToken(CalculatorParser.ABS, 0); }
		public TerminalNode TAN() { return getToken(CalculatorParser.TAN, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitFunction_name(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POW) | (1L << DIV) | (1L << ADD) | (1L << SUB) | (1L << RealPart) | (1L << ImaginaryPart) | (1L << Successor) | (1L << MOD) | (1L << SIN) | (1L << COS) | (1L << ABS) | (1L << TAN) | (1L << NAME))) != 0)) ) {
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

	public static class Signed_real_numberContext extends ParserRuleContext {
		public Real_numberContext real_number() {
			return getRuleContext(Real_numberContext.class,0);
		}
		public TerminalNode SUB() { return getToken(CalculatorParser.SUB, 0); }
		public Signed_real_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_real_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterSigned_real_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitSigned_real_number(this);
		}
	}

	public final Signed_real_numberContext signed_real_number() throws RecognitionException {
		Signed_real_numberContext _localctx = new Signed_real_numberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_signed_real_number);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case ZERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				real_number();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(SUB);
				setState(73);
				real_number();
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

	public static class Complex_numberContext extends ParserRuleContext {
		public Signed_real_numberContext signed_real_number() {
			return getRuleContext(Signed_real_numberContext.class,0);
		}
		public TerminalNode ADD() { return getToken(CalculatorParser.ADD, 0); }
		public Real_numberContext real_number() {
			return getRuleContext(Real_numberContext.class,0);
		}
		public TerminalNode SUB() { return getToken(CalculatorParser.SUB, 0); }
		public Complex_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterComplex_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitComplex_number(this);
		}
	}

	public final Complex_numberContext complex_number() throws RecognitionException {
		Complex_numberContext _localctx = new Complex_numberContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_complex_number);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				signed_real_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				signed_real_number();
				setState(78);
				match(ADD);
				setState(79);
				real_number();
				setState(80);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				signed_real_number();
				setState(83);
				match(SUB);
				setState(84);
				real_number();
				setState(85);
				match(T__3);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(CalculatorParser.NAME, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(NAME);
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

	public static class VariablesContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitVariables(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variables);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				variable();
				setState(93);
				match(T__1);
				setState(94);
				variables();
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

	public static class Right_assignmentsContext extends ParserRuleContext {
		public Right_assignmentContext right_assignment() {
			return getRuleContext(Right_assignmentContext.class,0);
		}
		public Right_assignmentsContext right_assignments() {
			return getRuleContext(Right_assignmentsContext.class,0);
		}
		public Right_assignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_assignments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterRight_assignments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitRight_assignments(this);
		}
	}

	public final Right_assignmentsContext right_assignments() throws RecognitionException {
		Right_assignmentsContext _localctx = new Right_assignmentsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_right_assignments);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				right_assignment();
				setState(99);
				match(T__1);
				setState(100);
				right_assignments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				right_assignment();
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(CalculatorParser.NAME, 0); }
		public Right_assignmentsContext right_assignments() {
			return getRuleContext(Right_assignmentsContext.class,0);
		}
		public TerminalNode ADD() { return getToken(CalculatorParser.ADD, 0); }
		public List<Right_assignmentContext> right_assignment() {
			return getRuleContexts(Right_assignmentContext.class);
		}
		public Right_assignmentContext right_assignment(int i) {
			return getRuleContext(Right_assignmentContext.class,i);
		}
		public TerminalNode MUL() { return getToken(CalculatorParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CalculatorParser.DIV, 0); }
		public TerminalNode SUB() { return getToken(CalculatorParser.SUB, 0); }
		public TerminalNode POW() { return getToken(CalculatorParser.POW, 0); }
		public TerminalNode MOD() { return getToken(CalculatorParser.MOD, 0); }
		public TerminalNode ABS() { return getToken(CalculatorParser.ABS, 0); }
		public TerminalNode SIN() { return getToken(CalculatorParser.SIN, 0); }
		public TerminalNode COS() { return getToken(CalculatorParser.COS, 0); }
		public TerminalNode TAN() { return getToken(CalculatorParser.TAN, 0); }
		public TerminalNode RealPart() { return getToken(CalculatorParser.RealPart, 0); }
		public TerminalNode ImaginaryPart() { return getToken(CalculatorParser.ImaginaryPart, 0); }
		public TerminalNode Successor() { return getToken(CalculatorParser.Successor, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_call);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(NAME);
				setState(106);
				match(T__0);
				setState(107);
				right_assignments();
				setState(108);
				match(T__2);
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(ADD);
				setState(111);
				match(T__0);
				setState(112);
				right_assignment();
				setState(113);
				match(T__1);
				setState(114);
				right_assignment();
				setState(115);
				match(T__2);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(MUL);
				setState(118);
				match(T__0);
				setState(119);
				right_assignment();
				setState(120);
				match(T__1);
				setState(121);
				right_assignment();
				setState(122);
				match(T__2);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				match(DIV);
				setState(125);
				match(T__0);
				setState(126);
				right_assignment();
				setState(127);
				match(T__1);
				setState(128);
				right_assignment();
				setState(129);
				match(T__2);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				match(SUB);
				setState(132);
				match(T__0);
				setState(133);
				right_assignment();
				setState(134);
				match(T__1);
				setState(135);
				right_assignment();
				setState(136);
				match(T__2);
				}
				break;
			case POW:
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				match(POW);
				setState(139);
				match(T__0);
				setState(140);
				right_assignment();
				setState(141);
				match(T__1);
				setState(142);
				right_assignment();
				setState(143);
				match(T__2);
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 7);
				{
				setState(145);
				match(MOD);
				setState(146);
				match(T__0);
				setState(147);
				right_assignment();
				setState(148);
				match(T__1);
				setState(149);
				right_assignment();
				setState(150);
				match(T__2);
				}
				break;
			case ABS:
				enterOuterAlt(_localctx, 8);
				{
				setState(152);
				match(ABS);
				setState(153);
				match(T__0);
				setState(154);
				right_assignment();
				setState(155);
				match(T__2);
				}
				break;
			case SIN:
				enterOuterAlt(_localctx, 9);
				{
				setState(157);
				match(SIN);
				setState(158);
				match(T__0);
				setState(159);
				right_assignment();
				setState(160);
				match(T__2);
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 10);
				{
				setState(162);
				match(COS);
				setState(163);
				match(T__0);
				setState(164);
				right_assignment();
				setState(165);
				match(T__2);
				}
				break;
			case TAN:
				enterOuterAlt(_localctx, 11);
				{
				setState(167);
				match(TAN);
				setState(168);
				match(T__0);
				setState(169);
				right_assignment();
				setState(170);
				match(T__2);
				}
				break;
			case RealPart:
				enterOuterAlt(_localctx, 12);
				{
				setState(172);
				match(RealPart);
				setState(173);
				match(T__0);
				setState(174);
				right_assignment();
				setState(175);
				match(T__2);
				}
				break;
			case ImaginaryPart:
				enterOuterAlt(_localctx, 13);
				{
				setState(177);
				match(ImaginaryPart);
				setState(178);
				match(T__0);
				setState(179);
				right_assignment();
				setState(180);
				match(T__2);
				}
				break;
			case Successor:
				enterOuterAlt(_localctx, 14);
				{
				setState(182);
				match(Successor);
				setState(183);
				match(T__0);
				setState(184);
				right_assignment();
				setState(185);
				match(T__2);
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

	public static class Right_assignmentContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Complex_numberContext complex_number() {
			return getRuleContext(Complex_numberContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Right_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterRight_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitRight_assignment(this);
		}
	}

	public final Right_assignmentContext right_assignment() throws RecognitionException {
		Right_assignmentContext _localctx = new Right_assignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_right_assignment);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				complex_number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				function_name();
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

	public static class AssignmentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Right_assignmentContext right_assignment() {
			return getRuleContext(Right_assignmentContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(CalculatorParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(CalculatorParser.WHITESPACE, i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			variable();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(196);
				match(WHITESPACE);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(T__4);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(203);
				match(WHITESPACE);
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			right_assignment();
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

	public static class InstructionContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_instruction);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				function_call();
				setState(212);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				assignment();
				setState(215);
				match(T__5);
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

	public static class InstructionsContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(CalculatorParser.WHITESPACE, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitInstructions(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_instructions);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				instruction();
				setState(220);
				match(WHITESPACE);
				setState(221);
				instructions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				instruction();
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

	public static class Function_bodyContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(CalculatorParser.BEGIN, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(CalculatorParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(CalculatorParser.WHITESPACE, i);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode END() { return getToken(CalculatorParser.END, 0); }
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitFunction_body(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(BEGIN);
			setState(227);
			match(WHITESPACE);
			setState(228);
			instructions();
			setState(229);
			match(WHITESPACE);
			setState(230);
			match(END);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(CalculatorParser.FUNCTION, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(CalculatorParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(CalculatorParser.WHITESPACE, i);
		}
		public TerminalNode NAME() { return getToken(CalculatorParser.NAME, 0); }
		public TerminalNode WHERE() { return getToken(CalculatorParser.WHERE, 0); }
		public Pattern_matchingContext pattern_matching() {
			return getRuleContext(Pattern_matchingContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function);
		int _la;
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(FUNCTION);
				setState(233);
				match(WHITESPACE);
				setState(234);
				match(NAME);
				setState(235);
				match(T__0);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(236);
					variables();
					}
				}

				setState(239);
				match(T__2);
				setState(240);
				match(WHITESPACE);
				setState(241);
				match(WHERE);
				setState(242);
				match(T__0);
				setState(243);
				pattern_matching();
				setState(244);
				match(T__2);
				setState(245);
				match(WHITESPACE);
				setState(246);
				function_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(FUNCTION);
				setState(249);
				match(WHITESPACE);
				setState(250);
				match(NAME);
				setState(251);
				match(T__0);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(252);
					variables();
					}
				}

				setState(255);
				match(T__2);
				setState(256);
				match(WHITESPACE);
				setState(257);
				function_body();
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

	public static class Program_elementsContext extends ParserRuleContext {
		public Program_elementContext program_element() {
			return getRuleContext(Program_elementContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(CalculatorParser.WHITESPACE, 0); }
		public Program_elementsContext program_elements() {
			return getRuleContext(Program_elementsContext.class,0);
		}
		public Program_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterProgram_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitProgram_elements(this);
		}
	}

	public final Program_elementsContext program_elements() throws RecognitionException {
		Program_elementsContext _localctx = new Program_elementsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_program_elements);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				program_element();
				setState(261);
				match(WHITESPACE);
				setState(262);
				program_elements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				program_element();
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

	public static class Program_elementContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public Program_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterProgram_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitProgram_element(this);
		}
	}

	public final Program_elementContext program_element() throws RecognitionException {
		Program_elementContext _localctx = new Program_elementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_program_element);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				function();
				}
				break;
			case POW:
			case MUL:
			case DIV:
			case ADD:
			case SUB:
			case RealPart:
			case ImaginaryPart:
			case Successor:
			case MOD:
			case SIN:
			case COS:
			case ABS:
			case TAN:
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				instructions();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0112\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\4\3\4\3\5\3\5\5"+
		"\5D\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\bM\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\tZ\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13c\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\5\fj\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u00be\n\r\3\16\3\16\3\16\3\16\5\16\u00c4\n\16\3\17\3\17\7"+
		"\17\u00c8\n\17\f\17\16\17\u00cb\13\17\3\17\3\17\7\17\u00cf\n\17\f\17\16"+
		"\17\u00d2\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00dc\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00e3\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00f0\n\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0100\n\23\3\23\3\23\3\23"+
		"\5\23\u0105\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u010c\n\24\3\25\3\25\5"+
		"\25\u0110\n\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(\2\5\4\2\23\30#$\4\2\21\21\31\32\7\2\t\t\13\20\22\22\36!&&\2\u011e\2"+
		"*\3\2\2\2\4=\3\2\2\2\6?\3\2\2\2\bC\3\2\2\2\nE\3\2\2\2\fG\3\2\2\2\16L\3"+
		"\2\2\2\20Y\3\2\2\2\22[\3\2\2\2\24b\3\2\2\2\26i\3\2\2\2\30\u00bd\3\2\2"+
		"\2\32\u00c3\3\2\2\2\34\u00c5\3\2\2\2\36\u00db\3\2\2\2 \u00e2\3\2\2\2\""+
		"\u00e4\3\2\2\2$\u0104\3\2\2\2&\u010b\3\2\2\2(\u010f\3\2\2\2*.\5&\24\2"+
		"+-\7\'\2\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\3\3\2\2\2\60.\3"+
		"\2\2\2\61\62\5\6\4\2\62\63\7\3\2\2\63\64\5\b\5\2\64\65\7\4\2\2\65\66\5"+
		"\b\5\2\66\67\7\5\2\2\67>\3\2\2\289\7%\2\29:\7\3\2\2:;\5\b\5\2;<\7\5\2"+
		"\2<>\3\2\2\2=\61\3\2\2\2=8\3\2\2\2>\5\3\2\2\2?@\t\2\2\2@\7\3\2\2\2AD\5"+
		"\32\16\2BD\5\4\3\2CA\3\2\2\2CB\3\2\2\2D\t\3\2\2\2EF\t\3\2\2F\13\3\2\2"+
		"\2GH\t\4\2\2H\r\3\2\2\2IM\5\n\6\2JK\7\r\2\2KM\5\n\6\2LI\3\2\2\2LJ\3\2"+
		"\2\2M\17\3\2\2\2NZ\5\16\b\2OP\5\16\b\2PQ\7\f\2\2QR\5\n\6\2RS\7\6\2\2S"+
		"Z\3\2\2\2TU\5\16\b\2UV\7\r\2\2VW\5\n\6\2WX\7\6\2\2XZ\3\2\2\2YN\3\2\2\2"+
		"YO\3\2\2\2YT\3\2\2\2Z\21\3\2\2\2[\\\7&\2\2\\\23\3\2\2\2]c\5\22\n\2^_\5"+
		"\22\n\2_`\7\4\2\2`a\5\24\13\2ac\3\2\2\2b]\3\2\2\2b^\3\2\2\2c\25\3\2\2"+
		"\2de\5\32\16\2ef\7\4\2\2fg\5\26\f\2gj\3\2\2\2hj\5\32\16\2id\3\2\2\2ih"+
		"\3\2\2\2j\27\3\2\2\2kl\7&\2\2lm\7\3\2\2mn\5\26\f\2no\7\5\2\2o\u00be\3"+
		"\2\2\2pq\7\f\2\2qr\7\3\2\2rs\5\32\16\2st\7\4\2\2tu\5\32\16\2uv\7\5\2\2"+
		"v\u00be\3\2\2\2wx\7\n\2\2xy\7\3\2\2yz\5\32\16\2z{\7\4\2\2{|\5\32\16\2"+
		"|}\7\5\2\2}\u00be\3\2\2\2~\177\7\13\2\2\177\u0080\7\3\2\2\u0080\u0081"+
		"\5\32\16\2\u0081\u0082\7\4\2\2\u0082\u0083\5\32\16\2\u0083\u0084\7\5\2"+
		"\2\u0084\u00be\3\2\2\2\u0085\u0086\7\r\2\2\u0086\u0087\7\3\2\2\u0087\u0088"+
		"\5\32\16\2\u0088\u0089\7\4\2\2\u0089\u008a\5\32\16\2\u008a\u008b\7\5\2"+
		"\2\u008b\u00be\3\2\2\2\u008c\u008d\7\t\2\2\u008d\u008e\7\3\2\2\u008e\u008f"+
		"\5\32\16\2\u008f\u0090\7\4\2\2\u0090\u0091\5\32\16\2\u0091\u0092\7\5\2"+
		"\2\u0092\u00be\3\2\2\2\u0093\u0094\7\22\2\2\u0094\u0095\7\3\2\2\u0095"+
		"\u0096\5\32\16\2\u0096\u0097\7\4\2\2\u0097\u0098\5\32\16\2\u0098\u0099"+
		"\7\5\2\2\u0099\u00be\3\2\2\2\u009a\u009b\7 \2\2\u009b\u009c\7\3\2\2\u009c"+
		"\u009d\5\32\16\2\u009d\u009e\7\5\2\2\u009e\u00be\3\2\2\2\u009f\u00a0\7"+
		"\36\2\2\u00a0\u00a1\7\3\2\2\u00a1\u00a2\5\32\16\2\u00a2\u00a3\7\5\2\2"+
		"\u00a3\u00be\3\2\2\2\u00a4\u00a5\7\37\2\2\u00a5\u00a6\7\3\2\2\u00a6\u00a7"+
		"\5\32\16\2\u00a7\u00a8\7\5\2\2\u00a8\u00be\3\2\2\2\u00a9\u00aa\7!\2\2"+
		"\u00aa\u00ab\7\3\2\2\u00ab\u00ac\5\32\16\2\u00ac\u00ad\7\5\2\2\u00ad\u00be"+
		"\3\2\2\2\u00ae\u00af\7\16\2\2\u00af\u00b0\7\3\2\2\u00b0\u00b1\5\32\16"+
		"\2\u00b1\u00b2\7\5\2\2\u00b2\u00be\3\2\2\2\u00b3\u00b4\7\17\2\2\u00b4"+
		"\u00b5\7\3\2\2\u00b5\u00b6\5\32\16\2\u00b6\u00b7\7\5\2\2\u00b7\u00be\3"+
		"\2\2\2\u00b8\u00b9\7\20\2\2\u00b9\u00ba\7\3\2\2\u00ba\u00bb\5\32\16\2"+
		"\u00bb\u00bc\7\5\2\2\u00bc\u00be\3\2\2\2\u00bdk\3\2\2\2\u00bdp\3\2\2\2"+
		"\u00bdw\3\2\2\2\u00bd~\3\2\2\2\u00bd\u0085\3\2\2\2\u00bd\u008c\3\2\2\2"+
		"\u00bd\u0093\3\2\2\2\u00bd\u009a\3\2\2\2\u00bd\u009f\3\2\2\2\u00bd\u00a4"+
		"\3\2\2\2\u00bd\u00a9\3\2\2\2\u00bd\u00ae\3\2\2\2\u00bd\u00b3\3\2\2\2\u00bd"+
		"\u00b8\3\2\2\2\u00be\31\3\2\2\2\u00bf\u00c4\5\30\r\2\u00c0\u00c4\5\22"+
		"\n\2\u00c1\u00c4\5\20\t\2\u00c2\u00c4\5\f\7\2\u00c3\u00bf\3\2\2\2\u00c3"+
		"\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\33\3\2\2"+
		"\2\u00c5\u00c9\5\22\n\2\u00c6\u00c8\7\'\2\2\u00c7\u00c6\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00d0\7\7\2\2\u00cd\u00cf\7\'\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\5\32\16\2\u00d4"+
		"\35\3\2\2\2\u00d5\u00d6\5\30\r\2\u00d6\u00d7\7\b\2\2\u00d7\u00dc\3\2\2"+
		"\2\u00d8\u00d9\5\34\17\2\u00d9\u00da\7\b\2\2\u00da\u00dc\3\2\2\2\u00db"+
		"\u00d5\3\2\2\2\u00db\u00d8\3\2\2\2\u00dc\37\3\2\2\2\u00dd\u00de\5\36\20"+
		"\2\u00de\u00df\7\'\2\2\u00df\u00e0\5 \21\2\u00e0\u00e3\3\2\2\2\u00e1\u00e3"+
		"\5\36\20\2\u00e2\u00dd\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3!\3\2\2\2\u00e4"+
		"\u00e5\7\33\2\2\u00e5\u00e6\7\'\2\2\u00e6\u00e7\5 \21\2\u00e7\u00e8\7"+
		"\'\2\2\u00e8\u00e9\7\34\2\2\u00e9#\3\2\2\2\u00ea\u00eb\7\35\2\2\u00eb"+
		"\u00ec\7\'\2\2\u00ec\u00ed\7&\2\2\u00ed\u00ef\7\3\2\2\u00ee\u00f0\5\24"+
		"\13\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\7\5\2\2\u00f2\u00f3\7\'\2\2\u00f3\u00f4\7\"\2\2\u00f4\u00f5\7\3"+
		"\2\2\u00f5\u00f6\5\4\3\2\u00f6\u00f7\7\5\2\2\u00f7\u00f8\7\'\2\2\u00f8"+
		"\u00f9\5\"\22\2\u00f9\u0105\3\2\2\2\u00fa\u00fb\7\35\2\2\u00fb\u00fc\7"+
		"\'\2\2\u00fc\u00fd\7&\2\2\u00fd\u00ff\7\3\2\2\u00fe\u0100\5\24\13\2\u00ff"+
		"\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7\5"+
		"\2\2\u0102\u0103\7\'\2\2\u0103\u0105\5\"\22\2\u0104\u00ea\3\2\2\2\u0104"+
		"\u00fa\3\2\2\2\u0105%\3\2\2\2\u0106\u0107\5(\25\2\u0107\u0108\7\'\2\2"+
		"\u0108\u0109\5&\24\2\u0109\u010c\3\2\2\2\u010a\u010c\5(\25\2\u010b\u0106"+
		"\3\2\2\2\u010b\u010a\3\2\2\2\u010c\'\3\2\2\2\u010d\u0110\5$\23\2\u010e"+
		"\u0110\5 \21\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110)\3\2\2\2"+
		"\24.=CLYbi\u00bd\u00c3\u00c9\u00d0\u00db\u00e2\u00ef\u00ff\u0104\u010b"+
		"\u010f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}