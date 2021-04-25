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
		RULE_variables = 9, RULE_right_assignments = 10, RULE_function_call = 11, 
		RULE_right_assignment = 12, RULE_assignment = 13, RULE_instruction = 14, 
		RULE_instructions = 15, RULE_function_body = 16, RULE_function = 17, RULE_program_instructions = 18, 
		RULE_program_instruction = 19, RULE_program_elements = 20, RULE_program_element = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "pattern_matching", "logic_function_name", "pattern_matching_arg", 
			"real_number", "function_name", "signed_real_number", "complex_number", 
			"variable", "variables", "right_assignments", "function_call", "right_assignment", 
			"assignment", "instruction", "instructions", "function_body", "function", 
			"program_instructions", "program_instruction", "program_elements", "program_element"
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
			setState(44);
			program_elements();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(45);
				match(WHITESPACE);
				}
				}
				setState(50);
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
			setState(63);
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
				setState(51);
				logic_function_name();
				setState(52);
				match(T__0);
				setState(53);
				pattern_matching_arg();
				setState(54);
				match(T__1);
				setState(55);
				pattern_matching_arg();
				setState(56);
				match(T__2);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(NOT);
				setState(59);
				match(T__0);
				setState(60);
				pattern_matching_arg();
				setState(61);
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
			setState(65);
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
			setState(69);
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
				setState(67);
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
				setState(68);
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
			setState(71);
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
			setState(73);
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
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case ZERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				real_number();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(SUB);
				setState(77);
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
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				signed_real_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				signed_real_number();
				setState(82);
				match(ADD);
				setState(83);
				real_number();
				setState(84);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				signed_real_number();
				setState(87);
				match(SUB);
				setState(88);
				real_number();
				setState(89);
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
			setState(93);
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
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				variable();
				setState(97);
				match(T__1);
				setState(98);
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
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				right_assignment();
				setState(103);
				match(T__1);
				setState(104);
				right_assignments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
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
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(NAME);
				setState(110);
				match(T__0);
				setState(111);
				right_assignments();
				setState(112);
				match(T__2);
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(ADD);
				setState(115);
				match(T__0);
				setState(116);
				right_assignment();
				setState(117);
				match(T__1);
				setState(118);
				right_assignment();
				setState(119);
				match(T__2);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(MUL);
				setState(122);
				match(T__0);
				setState(123);
				right_assignment();
				setState(124);
				match(T__1);
				setState(125);
				right_assignment();
				setState(126);
				match(T__2);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				match(DIV);
				setState(129);
				match(T__0);
				setState(130);
				right_assignment();
				setState(131);
				match(T__1);
				setState(132);
				right_assignment();
				setState(133);
				match(T__2);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				match(SUB);
				setState(136);
				match(T__0);
				setState(137);
				right_assignment();
				setState(138);
				match(T__1);
				setState(139);
				right_assignment();
				setState(140);
				match(T__2);
				}
				break;
			case POW:
				enterOuterAlt(_localctx, 6);
				{
				setState(142);
				match(POW);
				setState(143);
				match(T__0);
				setState(144);
				right_assignment();
				setState(145);
				match(T__1);
				setState(146);
				right_assignment();
				setState(147);
				match(T__2);
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 7);
				{
				setState(149);
				match(MOD);
				setState(150);
				match(T__0);
				setState(151);
				right_assignment();
				setState(152);
				match(T__1);
				setState(153);
				right_assignment();
				setState(154);
				match(T__2);
				}
				break;
			case ABS:
				enterOuterAlt(_localctx, 8);
				{
				setState(156);
				match(ABS);
				setState(157);
				match(T__0);
				setState(158);
				right_assignment();
				setState(159);
				match(T__2);
				}
				break;
			case SIN:
				enterOuterAlt(_localctx, 9);
				{
				setState(161);
				match(SIN);
				setState(162);
				match(T__0);
				setState(163);
				right_assignment();
				setState(164);
				match(T__2);
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 10);
				{
				setState(166);
				match(COS);
				setState(167);
				match(T__0);
				setState(168);
				right_assignment();
				setState(169);
				match(T__2);
				}
				break;
			case TAN:
				enterOuterAlt(_localctx, 11);
				{
				setState(171);
				match(TAN);
				setState(172);
				match(T__0);
				setState(173);
				right_assignment();
				setState(174);
				match(T__2);
				}
				break;
			case RealPart:
				enterOuterAlt(_localctx, 12);
				{
				setState(176);
				match(RealPart);
				setState(177);
				match(T__0);
				setState(178);
				right_assignment();
				setState(179);
				match(T__2);
				}
				break;
			case ImaginaryPart:
				enterOuterAlt(_localctx, 13);
				{
				setState(181);
				match(ImaginaryPart);
				setState(182);
				match(T__0);
				setState(183);
				right_assignment();
				setState(184);
				match(T__2);
				}
				break;
			case Successor:
				enterOuterAlt(_localctx, 14);
				{
				setState(186);
				match(Successor);
				setState(187);
				match(T__0);
				setState(188);
				right_assignment();
				setState(189);
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
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				complex_number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
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
			setState(199);
			variable();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(200);
				match(WHITESPACE);
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			match(T__4);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(207);
				match(WHITESPACE);
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
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
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				function_call();
				setState(216);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				assignment();
				setState(219);
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
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				instruction();
				setState(224);
				match(WHITESPACE);
				setState(225);
				instructions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
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
			setState(230);
			match(BEGIN);
			setState(231);
			match(WHITESPACE);
			setState(232);
			instructions();
			setState(233);
			match(WHITESPACE);
			setState(234);
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
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(FUNCTION);
				setState(237);
				match(WHITESPACE);
				setState(238);
				match(NAME);
				setState(239);
				match(T__0);
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(240);
					variables();
					}
				}

				setState(243);
				match(T__2);
				setState(244);
				match(WHITESPACE);
				setState(245);
				match(WHERE);
				setState(246);
				match(T__0);
				setState(247);
				pattern_matching();
				setState(248);
				match(T__2);
				setState(249);
				match(WHITESPACE);
				setState(250);
				function_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(FUNCTION);
				setState(253);
				match(WHITESPACE);
				setState(254);
				match(NAME);
				setState(255);
				match(T__0);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(256);
					variables();
					}
				}

				setState(259);
				match(T__2);
				setState(260);
				match(WHITESPACE);
				setState(261);
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
		enterRule(_localctx, 36, RULE_program_instructions);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				program_instruction();
				setState(265);
				match(WHITESPACE);
				setState(266);
				program_instructions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
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
		enterRule(_localctx, 38, RULE_program_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
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
		enterRule(_localctx, 40, RULE_program_elements);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				program_element();
				setState(274);
				match(WHITESPACE);
				setState(275);
				program_elements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
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
		enterRule(_localctx, 42, RULE_program_element);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
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
				setState(281);
				program_instructions();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u011f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\7\2\61\n\2"+
		"\f\2\16\2\64\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"B\n\3\3\4\3\4\3\5\3\5\5\5H\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\bQ\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t^\n\t\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\5\13g\n\13\3\f\3\f\3\f\3\f\3\f\5\fn\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c2\n\r\3\16\3\16\3\16\3\16\5"+
		"\16\u00c8\n\16\3\17\3\17\7\17\u00cc\n\17\f\17\16\17\u00cf\13\17\3\17\3"+
		"\17\7\17\u00d3\n\17\f\17\16\17\u00d6\13\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u00e0\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u00e7\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00f4\n\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u0104\n\23\3\23\3\23\3\23\5\23\u0109\n\23\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u0110\n\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u0119\n\26"+
		"\3\27\3\27\5\27\u011d\n\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,\2\5\4\2\23\30#$\4\2\21\21\31\32\7\2\t\t\13\20\22\22\36"+
		"!&&\2\u012a\2.\3\2\2\2\4A\3\2\2\2\6C\3\2\2\2\bG\3\2\2\2\nI\3\2\2\2\fK"+
		"\3\2\2\2\16P\3\2\2\2\20]\3\2\2\2\22_\3\2\2\2\24f\3\2\2\2\26m\3\2\2\2\30"+
		"\u00c1\3\2\2\2\32\u00c7\3\2\2\2\34\u00c9\3\2\2\2\36\u00df\3\2\2\2 \u00e6"+
		"\3\2\2\2\"\u00e8\3\2\2\2$\u0108\3\2\2\2&\u010f\3\2\2\2(\u0111\3\2\2\2"+
		"*\u0118\3\2\2\2,\u011c\3\2\2\2.\62\5*\26\2/\61\7\'\2\2\60/\3\2\2\2\61"+
		"\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\3\3\2\2\2\64\62\3\2\2\2\65"+
		"\66\5\6\4\2\66\67\7\3\2\2\678\5\b\5\289\7\4\2\29:\5\b\5\2:;\7\5\2\2;B"+
		"\3\2\2\2<=\7%\2\2=>\7\3\2\2>?\5\b\5\2?@\7\5\2\2@B\3\2\2\2A\65\3\2\2\2"+
		"A<\3\2\2\2B\5\3\2\2\2CD\t\2\2\2D\7\3\2\2\2EH\5\32\16\2FH\5\4\3\2GE\3\2"+
		"\2\2GF\3\2\2\2H\t\3\2\2\2IJ\t\3\2\2J\13\3\2\2\2KL\t\4\2\2L\r\3\2\2\2M"+
		"Q\5\n\6\2NO\7\r\2\2OQ\5\n\6\2PM\3\2\2\2PN\3\2\2\2Q\17\3\2\2\2R^\5\16\b"+
		"\2ST\5\16\b\2TU\7\f\2\2UV\5\n\6\2VW\7\6\2\2W^\3\2\2\2XY\5\16\b\2YZ\7\r"+
		"\2\2Z[\5\n\6\2[\\\7\6\2\2\\^\3\2\2\2]R\3\2\2\2]S\3\2\2\2]X\3\2\2\2^\21"+
		"\3\2\2\2_`\7&\2\2`\23\3\2\2\2ag\5\22\n\2bc\5\22\n\2cd\7\4\2\2de\5\24\13"+
		"\2eg\3\2\2\2fa\3\2\2\2fb\3\2\2\2g\25\3\2\2\2hi\5\32\16\2ij\7\4\2\2jk\5"+
		"\26\f\2kn\3\2\2\2ln\5\32\16\2mh\3\2\2\2ml\3\2\2\2n\27\3\2\2\2op\7&\2\2"+
		"pq\7\3\2\2qr\5\26\f\2rs\7\5\2\2s\u00c2\3\2\2\2tu\7\f\2\2uv\7\3\2\2vw\5"+
		"\32\16\2wx\7\4\2\2xy\5\32\16\2yz\7\5\2\2z\u00c2\3\2\2\2{|\7\n\2\2|}\7"+
		"\3\2\2}~\5\32\16\2~\177\7\4\2\2\177\u0080\5\32\16\2\u0080\u0081\7\5\2"+
		"\2\u0081\u00c2\3\2\2\2\u0082\u0083\7\13\2\2\u0083\u0084\7\3\2\2\u0084"+
		"\u0085\5\32\16\2\u0085\u0086\7\4\2\2\u0086\u0087\5\32\16\2\u0087\u0088"+
		"\7\5\2\2\u0088\u00c2\3\2\2\2\u0089\u008a\7\r\2\2\u008a\u008b\7\3\2\2\u008b"+
		"\u008c\5\32\16\2\u008c\u008d\7\4\2\2\u008d\u008e\5\32\16\2\u008e\u008f"+
		"\7\5\2\2\u008f\u00c2\3\2\2\2\u0090\u0091\7\t\2\2\u0091\u0092\7\3\2\2\u0092"+
		"\u0093\5\32\16\2\u0093\u0094\7\4\2\2\u0094\u0095\5\32\16\2\u0095\u0096"+
		"\7\5\2\2\u0096\u00c2\3\2\2\2\u0097\u0098\7\22\2\2\u0098\u0099\7\3\2\2"+
		"\u0099\u009a\5\32\16\2\u009a\u009b\7\4\2\2\u009b\u009c\5\32\16\2\u009c"+
		"\u009d\7\5\2\2\u009d\u00c2\3\2\2\2\u009e\u009f\7 \2\2\u009f\u00a0\7\3"+
		"\2\2\u00a0\u00a1\5\32\16\2\u00a1\u00a2\7\5\2\2\u00a2\u00c2\3\2\2\2\u00a3"+
		"\u00a4\7\36\2\2\u00a4\u00a5\7\3\2\2\u00a5\u00a6\5\32\16\2\u00a6\u00a7"+
		"\7\5\2\2\u00a7\u00c2\3\2\2\2\u00a8\u00a9\7\37\2\2\u00a9\u00aa\7\3\2\2"+
		"\u00aa\u00ab\5\32\16\2\u00ab\u00ac\7\5\2\2\u00ac\u00c2\3\2\2\2\u00ad\u00ae"+
		"\7!\2\2\u00ae\u00af\7\3\2\2\u00af\u00b0\5\32\16\2\u00b0\u00b1\7\5\2\2"+
		"\u00b1\u00c2\3\2\2\2\u00b2\u00b3\7\16\2\2\u00b3\u00b4\7\3\2\2\u00b4\u00b5"+
		"\5\32\16\2\u00b5\u00b6\7\5\2\2\u00b6\u00c2\3\2\2\2\u00b7\u00b8\7\17\2"+
		"\2\u00b8\u00b9\7\3\2\2\u00b9\u00ba\5\32\16\2\u00ba\u00bb\7\5\2\2\u00bb"+
		"\u00c2\3\2\2\2\u00bc\u00bd\7\20\2\2\u00bd\u00be\7\3\2\2\u00be\u00bf\5"+
		"\32\16\2\u00bf\u00c0\7\5\2\2\u00c0\u00c2\3\2\2\2\u00c1o\3\2\2\2\u00c1"+
		"t\3\2\2\2\u00c1{\3\2\2\2\u00c1\u0082\3\2\2\2\u00c1\u0089\3\2\2\2\u00c1"+
		"\u0090\3\2\2\2\u00c1\u0097\3\2\2\2\u00c1\u009e\3\2\2\2\u00c1\u00a3\3\2"+
		"\2\2\u00c1\u00a8\3\2\2\2\u00c1\u00ad\3\2\2\2\u00c1\u00b2\3\2\2\2\u00c1"+
		"\u00b7\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c2\31\3\2\2\2\u00c3\u00c8\5\30\r"+
		"\2\u00c4\u00c8\5\22\n\2\u00c5\u00c8\5\20\t\2\u00c6\u00c8\5\f\7\2\u00c7"+
		"\u00c3\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2"+
		"\2\2\u00c8\33\3\2\2\2\u00c9\u00cd\5\22\n\2\u00ca\u00cc\7\'\2\2\u00cb\u00ca"+
		"\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d4\7\7\2\2\u00d1\u00d3\7\'"+
		"\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\5\32"+
		"\16\2\u00d8\35\3\2\2\2\u00d9\u00da\5\30\r\2\u00da\u00db\7\b\2\2\u00db"+
		"\u00e0\3\2\2\2\u00dc\u00dd\5\34\17\2\u00dd\u00de\7\b\2\2\u00de\u00e0\3"+
		"\2\2\2\u00df\u00d9\3\2\2\2\u00df\u00dc\3\2\2\2\u00e0\37\3\2\2\2\u00e1"+
		"\u00e2\5\36\20\2\u00e2\u00e3\7\'\2\2\u00e3\u00e4\5 \21\2\u00e4\u00e7\3"+
		"\2\2\2\u00e5\u00e7\5\36\20\2\u00e6\u00e1\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7"+
		"!\3\2\2\2\u00e8\u00e9\7\33\2\2\u00e9\u00ea\7\'\2\2\u00ea\u00eb\5 \21\2"+
		"\u00eb\u00ec\7\'\2\2\u00ec\u00ed\7\34\2\2\u00ed#\3\2\2\2\u00ee\u00ef\7"+
		"\35\2\2\u00ef\u00f0\7\'\2\2\u00f0\u00f1\7&\2\2\u00f1\u00f3\7\3\2\2\u00f2"+
		"\u00f4\5\24\13\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3"+
		"\2\2\2\u00f5\u00f6\7\5\2\2\u00f6\u00f7\7\'\2\2\u00f7\u00f8\7\"\2\2\u00f8"+
		"\u00f9\7\3\2\2\u00f9\u00fa\5\4\3\2\u00fa\u00fb\7\5\2\2\u00fb\u00fc\7\'"+
		"\2\2\u00fc\u00fd\5\"\22\2\u00fd\u0109\3\2\2\2\u00fe\u00ff\7\35\2\2\u00ff"+
		"\u0100\7\'\2\2\u0100\u0101\7&\2\2\u0101\u0103\7\3\2\2\u0102\u0104\5\24"+
		"\13\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\7\5\2\2\u0106\u0107\7\'\2\2\u0107\u0109\5\"\22\2\u0108\u00ee\3"+
		"\2\2\2\u0108\u00fe\3\2\2\2\u0109%\3\2\2\2\u010a\u010b\5(\25\2\u010b\u010c"+
		"\7\'\2\2\u010c\u010d\5&\24\2\u010d\u0110\3\2\2\2\u010e\u0110\5(\25\2\u010f"+
		"\u010a\3\2\2\2\u010f\u010e\3\2\2\2\u0110\'\3\2\2\2\u0111\u0112\5\36\20"+
		"\2\u0112)\3\2\2\2\u0113\u0114\5,\27\2\u0114\u0115\7\'\2\2\u0115\u0116"+
		"\5*\26\2\u0116\u0119\3\2\2\2\u0117\u0119\5,\27\2\u0118\u0113\3\2\2\2\u0118"+
		"\u0117\3\2\2\2\u0119+\3\2\2\2\u011a\u011d\5$\23\2\u011b\u011d\5&\24\2"+
		"\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d-\3\2\2\2\25\62AGP]fm\u00c1"+
		"\u00c7\u00cd\u00d4\u00df\u00e6\u00f3\u0103\u0108\u010f\u0118\u011c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}