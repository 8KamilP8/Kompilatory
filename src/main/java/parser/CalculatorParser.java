// Generated from Calculator.g4 by ANTLR 4.9
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
		RULE_variables = 9, RULE_right_assignments = 10, RULE_func_arg = 11, RULE_func_args = 12, 
		RULE_function_call = 13, RULE_right_assignment = 14, RULE_assignment = 15, 
		RULE_instruction = 16, RULE_instructions = 17, RULE_function_body = 18, 
		RULE_function = 19, RULE_program_instructions = 20, RULE_program_instruction = 21, 
		RULE_program_elements = 22, RULE_program_element = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "pattern_matching", "logic_function_name", "pattern_matching_arg", 
			"real_number", "function_name", "signed_real_number", "complex_number", 
			"variable", "variables", "right_assignments", "func_arg", "func_args", 
			"function_call", "right_assignment", "assignment", "instruction", "instructions", 
			"function_body", "function", "program_instructions", "program_instruction", 
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(48);
				match(WHITESPACE);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			program_elements();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(55);
				match(WHITESPACE);
				}
				}
				setState(60);
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
			setState(73);
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
				setState(61);
				logic_function_name();
				setState(62);
				match(T__0);
				setState(63);
				pattern_matching_arg();
				setState(64);
				match(T__1);
				setState(65);
				pattern_matching_arg();
				setState(66);
				match(T__2);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(NOT);
				setState(69);
				match(T__0);
				setState(70);
				pattern_matching_arg();
				setState(71);
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
			setState(75);
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
			setState(79);
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
				setState(77);
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
				setState(78);
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
			setState(81);
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
			setState(83);
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
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case ZERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				real_number();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(SUB);
				setState(87);
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
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				signed_real_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				signed_real_number();
				setState(92);
				match(ADD);
				setState(93);
				real_number();
				setState(94);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				signed_real_number();
				setState(97);
				match(SUB);
				setState(98);
				real_number();
				setState(99);
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
			setState(103);
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
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				variable();
				setState(107);
				match(T__1);
				setState(108);
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
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				right_assignment();
				setState(113);
				match(T__1);
				setState(114);
				right_assignments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
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

	public static class Func_argContext extends ParserRuleContext {
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
		public Func_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterFunc_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitFunc_arg(this);
		}
	}

	public final Func_argContext func_arg() throws RecognitionException {
		Func_argContext _localctx = new Func_argContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_func_arg);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				complex_number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
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

	public static class Func_argsContext extends ParserRuleContext {
		public Func_argContext func_arg() {
			return getRuleContext(Func_argContext.class,0);
		}
		public Func_argsContext func_args() {
			return getRuleContext(Func_argsContext.class,0);
		}
		public Func_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterFunc_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitFunc_args(this);
		}
	}

	public final Func_argsContext func_args() throws RecognitionException {
		Func_argsContext _localctx = new Func_argsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_func_args);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				func_arg();
				setState(126);
				match(T__1);
				setState(127);
				func_args();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				func_arg();
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
		public Func_argsContext func_args() {
			return getRuleContext(Func_argsContext.class,0);
		}
		public TerminalNode ADD() { return getToken(CalculatorParser.ADD, 0); }
		public List<Func_argContext> func_arg() {
			return getRuleContexts(Func_argContext.class);
		}
		public Func_argContext func_arg(int i) {
			return getRuleContext(Func_argContext.class,i);
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
		enterRule(_localctx, 26, RULE_function_call);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(NAME);
				setState(133);
				match(T__0);
				setState(134);
				func_args();
				setState(135);
				match(T__2);
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(ADD);
				setState(138);
				match(T__0);
				setState(139);
				func_arg();
				setState(140);
				match(T__1);
				setState(141);
				func_arg();
				setState(142);
				match(T__2);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(MUL);
				setState(145);
				match(T__0);
				setState(146);
				func_arg();
				setState(147);
				match(T__1);
				setState(148);
				func_arg();
				setState(149);
				match(T__2);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				match(DIV);
				setState(152);
				match(T__0);
				setState(153);
				func_arg();
				setState(154);
				match(T__1);
				setState(155);
				func_arg();
				setState(156);
				match(T__2);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				match(SUB);
				setState(159);
				match(T__0);
				setState(160);
				func_arg();
				setState(161);
				match(T__1);
				setState(162);
				func_arg();
				setState(163);
				match(T__2);
				}
				break;
			case POW:
				enterOuterAlt(_localctx, 6);
				{
				setState(165);
				match(POW);
				setState(166);
				match(T__0);
				setState(167);
				func_arg();
				setState(168);
				match(T__1);
				setState(169);
				func_arg();
				setState(170);
				match(T__2);
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 7);
				{
				setState(172);
				match(MOD);
				setState(173);
				match(T__0);
				setState(174);
				func_arg();
				setState(175);
				match(T__1);
				setState(176);
				func_arg();
				setState(177);
				match(T__2);
				}
				break;
			case ABS:
				enterOuterAlt(_localctx, 8);
				{
				setState(179);
				match(ABS);
				setState(180);
				match(T__0);
				setState(181);
				func_arg();
				setState(182);
				match(T__2);
				}
				break;
			case SIN:
				enterOuterAlt(_localctx, 9);
				{
				setState(184);
				match(SIN);
				setState(185);
				match(T__0);
				setState(186);
				func_arg();
				setState(187);
				match(T__2);
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 10);
				{
				setState(189);
				match(COS);
				setState(190);
				match(T__0);
				setState(191);
				func_arg();
				setState(192);
				match(T__2);
				}
				break;
			case TAN:
				enterOuterAlt(_localctx, 11);
				{
				setState(194);
				match(TAN);
				setState(195);
				match(T__0);
				setState(196);
				func_arg();
				setState(197);
				match(T__2);
				}
				break;
			case RealPart:
				enterOuterAlt(_localctx, 12);
				{
				setState(199);
				match(RealPart);
				setState(200);
				match(T__0);
				setState(201);
				func_arg();
				setState(202);
				match(T__2);
				}
				break;
			case ImaginaryPart:
				enterOuterAlt(_localctx, 13);
				{
				setState(204);
				match(ImaginaryPart);
				setState(205);
				match(T__0);
				setState(206);
				func_arg();
				setState(207);
				match(T__2);
				}
				break;
			case Successor:
				enterOuterAlt(_localctx, 14);
				{
				setState(209);
				match(Successor);
				setState(210);
				match(T__0);
				setState(211);
				func_arg();
				setState(212);
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
		enterRule(_localctx, 28, RULE_right_assignment);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				complex_number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
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
		enterRule(_localctx, 30, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			variable();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(223);
				match(WHITESPACE);
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			match(T__4);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(230);
				match(WHITESPACE);
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
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
		enterRule(_localctx, 32, RULE_instruction);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				function_call();
				setState(239);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				assignment();
				setState(242);
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
		enterRule(_localctx, 34, RULE_instructions);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				instruction();
				setState(247);
				match(WHITESPACE);
				setState(248);
				instructions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
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
		enterRule(_localctx, 36, RULE_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(BEGIN);
			setState(254);
			match(WHITESPACE);
			setState(255);
			instructions();
			setState(256);
			match(WHITESPACE);
			setState(257);
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
		enterRule(_localctx, 38, RULE_function);
		int _la;
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(FUNCTION);
				setState(260);
				match(WHITESPACE);
				setState(261);
				match(NAME);
				setState(262);
				match(T__0);
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(263);
					variables();
					}
				}

				setState(266);
				match(T__2);
				setState(267);
				match(WHITESPACE);
				setState(268);
				match(WHERE);
				setState(269);
				match(T__0);
				setState(270);
				pattern_matching();
				setState(271);
				match(T__2);
				setState(272);
				match(WHITESPACE);
				setState(273);
				function_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(FUNCTION);
				setState(276);
				match(WHITESPACE);
				setState(277);
				match(NAME);
				setState(278);
				match(T__0);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(279);
					variables();
					}
				}

				setState(282);
				match(T__2);
				setState(283);
				match(WHITESPACE);
				setState(284);
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

	public static class Program_instructionsContext extends ParserRuleContext {
		public Program_instructionContext program_instruction() {
			return getRuleContext(Program_instructionContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(CalculatorParser.WHITESPACE, 0); }
		public Program_instructionsContext program_instructions() {
			return getRuleContext(Program_instructionsContext.class,0);
		}
		public Program_instructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterProgram_instructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitProgram_instructions(this);
		}
	}

	public final Program_instructionsContext program_instructions() throws RecognitionException {
		Program_instructionsContext _localctx = new Program_instructionsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_program_instructions);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				program_instruction();
				setState(288);
				match(WHITESPACE);
				setState(289);
				program_instructions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				program_instruction();
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

	public static class Program_instructionContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public Program_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterProgram_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitProgram_instruction(this);
		}
	}

	public final Program_instructionContext program_instruction() throws RecognitionException {
		Program_instructionContext _localctx = new Program_instructionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_program_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			instruction();
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
		enterRule(_localctx, 44, RULE_program_elements);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				program_element();
				setState(297);
				match(WHITESPACE);
				setState(298);
				program_elements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
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
		public Program_instructionsContext program_instructions() {
			return getRuleContext(Program_instructionsContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(CalculatorParser.COMMENT, 0); }
		public TerminalNode LINE_COMMENT() { return getToken(CalculatorParser.LINE_COMMENT, 0); }
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
		enterRule(_localctx, 46, RULE_program_element);
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
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
				setState(304);
				program_instructions();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				match(COMMENT);
				}
				break;
			case LINE_COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				match(LINE_COMMENT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0138\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3L\n\3\3\4\3\4\3\5\3\5\5"+
		"\5R\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\b[\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\th\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13q\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\5\fx\n\f\3\r\3\r\3\r\3\r\5\r~\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u0085\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00d9\n\17\3\20\3\20\3\20\3\20\5\20\u00df\n\20\3"+
		"\21\3\21\7\21\u00e3\n\21\f\21\16\21\u00e6\13\21\3\21\3\21\7\21\u00ea\n"+
		"\21\f\21\16\21\u00ed\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u00f7\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u00fe\n\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u010b\n\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u011b\n\25"+
		"\3\25\3\25\3\25\5\25\u0120\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u0127\n"+
		"\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u0130\n\30\3\31\3\31\3\31"+
		"\3\31\5\31\u0136\n\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\2\5\4\2\23\30#$\4\2\21\21\31\32\7\2\t\t\13\20\22\22\36"+
		"!&&\2\u0148\2\65\3\2\2\2\4K\3\2\2\2\6M\3\2\2\2\bQ\3\2\2\2\nS\3\2\2\2\f"+
		"U\3\2\2\2\16Z\3\2\2\2\20g\3\2\2\2\22i\3\2\2\2\24p\3\2\2\2\26w\3\2\2\2"+
		"\30}\3\2\2\2\32\u0084\3\2\2\2\34\u00d8\3\2\2\2\36\u00de\3\2\2\2 \u00e0"+
		"\3\2\2\2\"\u00f6\3\2\2\2$\u00fd\3\2\2\2&\u00ff\3\2\2\2(\u011f\3\2\2\2"+
		"*\u0126\3\2\2\2,\u0128\3\2\2\2.\u012f\3\2\2\2\60\u0135\3\2\2\2\62\64\7"+
		"\'\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2"+
		"\2\2\67\65\3\2\2\28<\5.\30\29;\7\'\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<"+
		"=\3\2\2\2=\3\3\2\2\2><\3\2\2\2?@\5\6\4\2@A\7\3\2\2AB\5\b\5\2BC\7\4\2\2"+
		"CD\5\b\5\2DE\7\5\2\2EL\3\2\2\2FG\7%\2\2GH\7\3\2\2HI\5\b\5\2IJ\7\5\2\2"+
		"JL\3\2\2\2K?\3\2\2\2KF\3\2\2\2L\5\3\2\2\2MN\t\2\2\2N\7\3\2\2\2OR\5\36"+
		"\20\2PR\5\4\3\2QO\3\2\2\2QP\3\2\2\2R\t\3\2\2\2ST\t\3\2\2T\13\3\2\2\2U"+
		"V\t\4\2\2V\r\3\2\2\2W[\5\n\6\2XY\7\r\2\2Y[\5\n\6\2ZW\3\2\2\2ZX\3\2\2\2"+
		"[\17\3\2\2\2\\h\5\16\b\2]^\5\16\b\2^_\7\f\2\2_`\5\n\6\2`a\7\6\2\2ah\3"+
		"\2\2\2bc\5\16\b\2cd\7\r\2\2de\5\n\6\2ef\7\6\2\2fh\3\2\2\2g\\\3\2\2\2g"+
		"]\3\2\2\2gb\3\2\2\2h\21\3\2\2\2ij\7&\2\2j\23\3\2\2\2kq\5\22\n\2lm\5\22"+
		"\n\2mn\7\4\2\2no\5\24\13\2oq\3\2\2\2pk\3\2\2\2pl\3\2\2\2q\25\3\2\2\2r"+
		"s\5\36\20\2st\7\4\2\2tu\5\26\f\2ux\3\2\2\2vx\5\36\20\2wr\3\2\2\2wv\3\2"+
		"\2\2x\27\3\2\2\2y~\5\34\17\2z~\5\22\n\2{~\5\20\t\2|~\5\f\7\2}y\3\2\2\2"+
		"}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\31\3\2\2\2\177\u0080\5\30\r\2\u0080\u0081"+
		"\7\4\2\2\u0081\u0082\5\32\16\2\u0082\u0085\3\2\2\2\u0083\u0085\5\30\r"+
		"\2\u0084\177\3\2\2\2\u0084\u0083\3\2\2\2\u0085\33\3\2\2\2\u0086\u0087"+
		"\7&\2\2\u0087\u0088\7\3\2\2\u0088\u0089\5\32\16\2\u0089\u008a\7\5\2\2"+
		"\u008a\u00d9\3\2\2\2\u008b\u008c\7\f\2\2\u008c\u008d\7\3\2\2\u008d\u008e"+
		"\5\30\r\2\u008e\u008f\7\4\2\2\u008f\u0090\5\30\r\2\u0090\u0091\7\5\2\2"+
		"\u0091\u00d9\3\2\2\2\u0092\u0093\7\n\2\2\u0093\u0094\7\3\2\2\u0094\u0095"+
		"\5\30\r\2\u0095\u0096\7\4\2\2\u0096\u0097\5\30\r\2\u0097\u0098\7\5\2\2"+
		"\u0098\u00d9\3\2\2\2\u0099\u009a\7\13\2\2\u009a\u009b\7\3\2\2\u009b\u009c"+
		"\5\30\r\2\u009c\u009d\7\4\2\2\u009d\u009e\5\30\r\2\u009e\u009f\7\5\2\2"+
		"\u009f\u00d9\3\2\2\2\u00a0\u00a1\7\r\2\2\u00a1\u00a2\7\3\2\2\u00a2\u00a3"+
		"\5\30\r\2\u00a3\u00a4\7\4\2\2\u00a4\u00a5\5\30\r\2\u00a5\u00a6\7\5\2\2"+
		"\u00a6\u00d9\3\2\2\2\u00a7\u00a8\7\t\2\2\u00a8\u00a9\7\3\2\2\u00a9\u00aa"+
		"\5\30\r\2\u00aa\u00ab\7\4\2\2\u00ab\u00ac\5\30\r\2\u00ac\u00ad\7\5\2\2"+
		"\u00ad\u00d9\3\2\2\2\u00ae\u00af\7\22\2\2\u00af\u00b0\7\3\2\2\u00b0\u00b1"+
		"\5\30\r\2\u00b1\u00b2\7\4\2\2\u00b2\u00b3\5\30\r\2\u00b3\u00b4\7\5\2\2"+
		"\u00b4\u00d9\3\2\2\2\u00b5\u00b6\7 \2\2\u00b6\u00b7\7\3\2\2\u00b7\u00b8"+
		"\5\30\r\2\u00b8\u00b9\7\5\2\2\u00b9\u00d9\3\2\2\2\u00ba\u00bb\7\36\2\2"+
		"\u00bb\u00bc\7\3\2\2\u00bc\u00bd\5\30\r\2\u00bd\u00be\7\5\2\2\u00be\u00d9"+
		"\3\2\2\2\u00bf\u00c0\7\37\2\2\u00c0\u00c1\7\3\2\2\u00c1\u00c2\5\30\r\2"+
		"\u00c2\u00c3\7\5\2\2\u00c3\u00d9\3\2\2\2\u00c4\u00c5\7!\2\2\u00c5\u00c6"+
		"\7\3\2\2\u00c6\u00c7\5\30\r\2\u00c7\u00c8\7\5\2\2\u00c8\u00d9\3\2\2\2"+
		"\u00c9\u00ca\7\16\2\2\u00ca\u00cb\7\3\2\2\u00cb\u00cc\5\30\r\2\u00cc\u00cd"+
		"\7\5\2\2\u00cd\u00d9\3\2\2\2\u00ce\u00cf\7\17\2\2\u00cf\u00d0\7\3\2\2"+
		"\u00d0\u00d1\5\30\r\2\u00d1\u00d2\7\5\2\2\u00d2\u00d9\3\2\2\2\u00d3\u00d4"+
		"\7\20\2\2\u00d4\u00d5\7\3\2\2\u00d5\u00d6\5\30\r\2\u00d6\u00d7\7\5\2\2"+
		"\u00d7\u00d9\3\2\2\2\u00d8\u0086\3\2\2\2\u00d8\u008b\3\2\2\2\u00d8\u0092"+
		"\3\2\2\2\u00d8\u0099\3\2\2\2\u00d8\u00a0\3\2\2\2\u00d8\u00a7\3\2\2\2\u00d8"+
		"\u00ae\3\2\2\2\u00d8\u00b5\3\2\2\2\u00d8\u00ba\3\2\2\2\u00d8\u00bf\3\2"+
		"\2\2\u00d8\u00c4\3\2\2\2\u00d8\u00c9\3\2\2\2\u00d8\u00ce\3\2\2\2\u00d8"+
		"\u00d3\3\2\2\2\u00d9\35\3\2\2\2\u00da\u00df\5\34\17\2\u00db\u00df\5\22"+
		"\n\2\u00dc\u00df\5\20\t\2\u00dd\u00df\5\f\7\2\u00de\u00da\3\2\2\2\u00de"+
		"\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\37\3\2\2"+
		"\2\u00e0\u00e4\5\22\n\2\u00e1\u00e3\7\'\2\2\u00e2\u00e1\3\2\2\2\u00e3"+
		"\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00eb\7\7\2\2\u00e8\u00ea\7\'\2\2\u00e9"+
		"\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\5\36\20\2\u00ef"+
		"!\3\2\2\2\u00f0\u00f1\5\34\17\2\u00f1\u00f2\7\b\2\2\u00f2\u00f7\3\2\2"+
		"\2\u00f3\u00f4\5 \21\2\u00f4\u00f5\7\b\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f0"+
		"\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7#\3\2\2\2\u00f8\u00f9\5\"\22\2\u00f9"+
		"\u00fa\7\'\2\2\u00fa\u00fb\5$\23\2\u00fb\u00fe\3\2\2\2\u00fc\u00fe\5\""+
		"\22\2\u00fd\u00f8\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe%\3\2\2\2\u00ff\u0100"+
		"\7\33\2\2\u0100\u0101\7\'\2\2\u0101\u0102\5$\23\2\u0102\u0103\7\'\2\2"+
		"\u0103\u0104\7\34\2\2\u0104\'\3\2\2\2\u0105\u0106\7\35\2\2\u0106\u0107"+
		"\7\'\2\2\u0107\u0108\7&\2\2\u0108\u010a\7\3\2\2\u0109\u010b\5\24\13\2"+
		"\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d"+
		"\7\5\2\2\u010d\u010e\7\'\2\2\u010e\u010f\7\"\2\2\u010f\u0110\7\3\2\2\u0110"+
		"\u0111\5\4\3\2\u0111\u0112\7\5\2\2\u0112\u0113\7\'\2\2\u0113\u0114\5&"+
		"\24\2\u0114\u0120\3\2\2\2\u0115\u0116\7\35\2\2\u0116\u0117\7\'\2\2\u0117"+
		"\u0118\7&\2\2\u0118\u011a\7\3\2\2\u0119\u011b\5\24\13\2\u011a\u0119\3"+
		"\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\7\5\2\2\u011d"+
		"\u011e\7\'\2\2\u011e\u0120\5&\24\2\u011f\u0105\3\2\2\2\u011f\u0115\3\2"+
		"\2\2\u0120)\3\2\2\2\u0121\u0122\5,\27\2\u0122\u0123\7\'\2\2\u0123\u0124"+
		"\5*\26\2\u0124\u0127\3\2\2\2\u0125\u0127\5,\27\2\u0126\u0121\3\2\2\2\u0126"+
		"\u0125\3\2\2\2\u0127+\3\2\2\2\u0128\u0129\5\"\22\2\u0129-\3\2\2\2\u012a"+
		"\u012b\5\60\31\2\u012b\u012c\7\'\2\2\u012c\u012d\5.\30\2\u012d\u0130\3"+
		"\2\2\2\u012e\u0130\5\60\31\2\u012f\u012a\3\2\2\2\u012f\u012e\3\2\2\2\u0130"+
		"/\3\2\2\2\u0131\u0136\5(\25\2\u0132\u0136\5*\26\2\u0133\u0136\7(\2\2\u0134"+
		"\u0136\7)\2\2\u0135\u0131\3\2\2\2\u0135\u0132\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0135\u0134\3\2\2\2\u0136\61\3\2\2\2\30\65<KQZgpw}\u0084\u00d8\u00de"+
		"\u00e4\u00eb\u00f6\u00fd\u010a\u011a\u011f\u0126\u012f\u0135";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}