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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, POW=8, MUL=9, 
		DIV=10, ADD=11, SUB=12, RealPart=13, ImaginaryPart=14, Successor=15, INT=16, 
		MOD=17, Equal=18, GreaterEqual=19, LowerEqual=20, Lower=21, Greater=22, 
		NotEqual=23, DOUBLE=24, ZERO=25, BEGIN=26, END=27, FUNCTION=28, SIN=29, 
		COS=30, ABS=31, TAN=32, WHERE=33, AND=34, OR=35, NOT=36, GLOBAL=37, NAME=38, 
		WHITESPACE=39, COMMENT=40, LINE_COMMENT=41;
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
			null, "'('", "','", "')'", "'i'", "'()'", "'='", "';'", "'^'", "'*'", 
			"'/'", "'+'", "'-'", "'Re'", "'Im'", "'s'", null, "'%'", "'=='", "'>='", 
			"'<='", "'<'", "'>'", "'!='", null, "'0'", "'{'", "'}'", "'function'", 
			"'sin'", "'cos'", "'abs'", "'tan'", "'where'", "'&'", "'|'", "'!'", "'global'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "POW", "MUL", "DIV", 
			"ADD", "SUB", "RealPart", "ImaginaryPart", "Successor", "INT", "MOD", 
			"Equal", "GreaterEqual", "LowerEqual", "Lower", "Greater", "NotEqual", 
			"DOUBLE", "ZERO", "BEGIN", "END", "FUNCTION", "SIN", "COS", "ABS", "TAN", 
			"WHERE", "AND", "OR", "NOT", "GLOBAL", "NAME", "WHITESPACE", "COMMENT", 
			"LINE_COMMENT"
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
			case GLOBAL:
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
		public TerminalNode GLOBAL() { return getToken(CalculatorParser.GLOBAL, 0); }
		public TerminalNode WHITESPACE() { return getToken(CalculatorParser.WHITESPACE, 0); }
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
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(NAME);
				}
				break;
			case GLOBAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(GLOBAL);
				setState(105);
				match(WHITESPACE);
				setState(106);
				match(NAME);
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
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				variable();
				setState(111);
				match(T__1);
				setState(112);
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
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				right_assignment();
				setState(117);
				match(T__1);
				setState(118);
				right_assignments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
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
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				complex_number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
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
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				func_arg();
				setState(130);
				match(T__1);
				setState(131);
				func_args();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
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
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(NAME);
				setState(137);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(NAME);
				setState(139);
				match(T__0);
				setState(140);
				func_args();
				setState(141);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				match(ADD);
				setState(144);
				match(T__0);
				setState(145);
				func_arg();
				setState(146);
				match(T__1);
				setState(147);
				func_arg();
				setState(148);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				match(MUL);
				setState(151);
				match(T__0);
				setState(152);
				func_arg();
				setState(153);
				match(T__1);
				setState(154);
				func_arg();
				setState(155);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				match(DIV);
				setState(158);
				match(T__0);
				setState(159);
				func_arg();
				setState(160);
				match(T__1);
				setState(161);
				func_arg();
				setState(162);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(164);
				match(SUB);
				setState(165);
				match(T__0);
				setState(166);
				func_arg();
				setState(167);
				match(T__1);
				setState(168);
				func_arg();
				setState(169);
				match(T__2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(171);
				match(POW);
				setState(172);
				match(T__0);
				setState(173);
				func_arg();
				setState(174);
				match(T__1);
				setState(175);
				func_arg();
				setState(176);
				match(T__2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(178);
				match(MOD);
				setState(179);
				match(T__0);
				setState(180);
				func_arg();
				setState(181);
				match(T__1);
				setState(182);
				func_arg();
				setState(183);
				match(T__2);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(185);
				match(ABS);
				setState(186);
				match(T__0);
				setState(187);
				func_arg();
				setState(188);
				match(T__2);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(190);
				match(SIN);
				setState(191);
				match(T__0);
				setState(192);
				func_arg();
				setState(193);
				match(T__2);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(195);
				match(COS);
				setState(196);
				match(T__0);
				setState(197);
				func_arg();
				setState(198);
				match(T__2);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(200);
				match(TAN);
				setState(201);
				match(T__0);
				setState(202);
				func_arg();
				setState(203);
				match(T__2);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(205);
				match(RealPart);
				setState(206);
				match(T__0);
				setState(207);
				func_arg();
				setState(208);
				match(T__2);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(210);
				match(ImaginaryPart);
				setState(211);
				match(T__0);
				setState(212);
				func_arg();
				setState(213);
				match(T__2);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(215);
				match(Successor);
				setState(216);
				match(T__0);
				setState(217);
				func_arg();
				setState(218);
				match(T__2);
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
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				complex_number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
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
			setState(228);
			variable();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(229);
				match(WHITESPACE);
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			match(T__5);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(236);
				match(WHITESPACE);
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
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
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				function_call();
				setState(245);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				assignment();
				setState(248);
				match(T__6);
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
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				instruction();
				setState(253);
				match(WHITESPACE);
				setState(254);
				instructions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
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
			setState(259);
			match(BEGIN);
			setState(260);
			match(WHITESPACE);
			setState(261);
			instructions();
			setState(262);
			match(WHITESPACE);
			setState(263);
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
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(FUNCTION);
				setState(266);
				match(WHITESPACE);
				setState(267);
				match(NAME);
				setState(268);
				match(T__0);
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==NAME) {
					{
					setState(269);
					variables();
					}
				}

				setState(272);
				match(T__2);
				setState(273);
				match(WHITESPACE);
				setState(274);
				match(WHERE);
				setState(275);
				match(T__0);
				setState(276);
				pattern_matching();
				setState(277);
				match(T__2);
				setState(278);
				match(WHITESPACE);
				setState(279);
				function_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(FUNCTION);
				setState(282);
				match(WHITESPACE);
				setState(283);
				match(NAME);
				setState(284);
				match(T__0);
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==NAME) {
					{
					setState(285);
					variables();
					}
				}

				setState(288);
				match(T__2);
				setState(289);
				match(WHITESPACE);
				setState(290);
				function_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				match(FUNCTION);
				setState(292);
				match(WHITESPACE);
				setState(293);
				match(NAME);
				setState(294);
				match(T__4);
				setState(295);
				match(WHITESPACE);
				setState(296);
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
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				program_instruction();
				setState(300);
				match(WHITESPACE);
				setState(301);
				program_instructions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
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
			setState(306);
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
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				program_element();
				setState(309);
				match(WHITESPACE);
				setState(310);
				program_elements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
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
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
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
			case GLOBAL:
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				program_instructions();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				match(COMMENT);
				}
				break;
			case LINE_COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0144\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3L\n\3\3\4\3\4\3\5\3\5\5"+
		"\5R\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\b[\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\th\n\t\3\n\3\n\3\n\3\n\5\nn\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\5\13u\n\13\3\f\3\f\3\f\3\f\3\f\5\f|\n\f\3\r\3\r\3\r\3\r\5\r\u0082"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u0089\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00df\n\17\3\20\3\20"+
		"\3\20\3\20\5\20\u00e5\n\20\3\21\3\21\7\21\u00e9\n\21\f\21\16\21\u00ec"+
		"\13\21\3\21\3\21\7\21\u00f0\n\21\f\21\16\21\u00f3\13\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00fd\n\22\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0104\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u0111\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u0121\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u012c\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u0133\n\26\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\5\30\u013c\n\30\3\31\3\31\3\31\3\31\5\31\u0142"+
		"\n\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2"+
		"\5\4\2\24\31$%\4\2\22\22\32\33\7\2\n\n\f\21\23\23\37\"((\2\u0157\2\65"+
		"\3\2\2\2\4K\3\2\2\2\6M\3\2\2\2\bQ\3\2\2\2\nS\3\2\2\2\fU\3\2\2\2\16Z\3"+
		"\2\2\2\20g\3\2\2\2\22m\3\2\2\2\24t\3\2\2\2\26{\3\2\2\2\30\u0081\3\2\2"+
		"\2\32\u0088\3\2\2\2\34\u00de\3\2\2\2\36\u00e4\3\2\2\2 \u00e6\3\2\2\2\""+
		"\u00fc\3\2\2\2$\u0103\3\2\2\2&\u0105\3\2\2\2(\u012b\3\2\2\2*\u0132\3\2"+
		"\2\2,\u0134\3\2\2\2.\u013b\3\2\2\2\60\u0141\3\2\2\2\62\64\7)\2\2\63\62"+
		"\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3"+
		"\2\2\28<\5.\30\29;\7)\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\3\3"+
		"\2\2\2><\3\2\2\2?@\5\6\4\2@A\7\3\2\2AB\5\b\5\2BC\7\4\2\2CD\5\b\5\2DE\7"+
		"\5\2\2EL\3\2\2\2FG\7&\2\2GH\7\3\2\2HI\5\b\5\2IJ\7\5\2\2JL\3\2\2\2K?\3"+
		"\2\2\2KF\3\2\2\2L\5\3\2\2\2MN\t\2\2\2N\7\3\2\2\2OR\5\36\20\2PR\5\4\3\2"+
		"QO\3\2\2\2QP\3\2\2\2R\t\3\2\2\2ST\t\3\2\2T\13\3\2\2\2UV\t\4\2\2V\r\3\2"+
		"\2\2W[\5\n\6\2XY\7\16\2\2Y[\5\n\6\2ZW\3\2\2\2ZX\3\2\2\2[\17\3\2\2\2\\"+
		"h\5\16\b\2]^\5\16\b\2^_\7\r\2\2_`\5\n\6\2`a\7\6\2\2ah\3\2\2\2bc\5\16\b"+
		"\2cd\7\16\2\2de\5\n\6\2ef\7\6\2\2fh\3\2\2\2g\\\3\2\2\2g]\3\2\2\2gb\3\2"+
		"\2\2h\21\3\2\2\2in\7(\2\2jk\7\'\2\2kl\7)\2\2ln\7(\2\2mi\3\2\2\2mj\3\2"+
		"\2\2n\23\3\2\2\2ou\5\22\n\2pq\5\22\n\2qr\7\4\2\2rs\5\24\13\2su\3\2\2\2"+
		"to\3\2\2\2tp\3\2\2\2u\25\3\2\2\2vw\5\36\20\2wx\7\4\2\2xy\5\26\f\2y|\3"+
		"\2\2\2z|\5\36\20\2{v\3\2\2\2{z\3\2\2\2|\27\3\2\2\2}\u0082\5\34\17\2~\u0082"+
		"\5\22\n\2\177\u0082\5\20\t\2\u0080\u0082\5\f\7\2\u0081}\3\2\2\2\u0081"+
		"~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\31\3\2\2\2\u0083"+
		"\u0084\5\30\r\2\u0084\u0085\7\4\2\2\u0085\u0086\5\32\16\2\u0086\u0089"+
		"\3\2\2\2\u0087\u0089\5\30\r\2\u0088\u0083\3\2\2\2\u0088\u0087\3\2\2\2"+
		"\u0089\33\3\2\2\2\u008a\u008b\7(\2\2\u008b\u00df\7\7\2\2\u008c\u008d\7"+
		"(\2\2\u008d\u008e\7\3\2\2\u008e\u008f\5\32\16\2\u008f\u0090\7\5\2\2\u0090"+
		"\u00df\3\2\2\2\u0091\u0092\7\r\2\2\u0092\u0093\7\3\2\2\u0093\u0094\5\30"+
		"\r\2\u0094\u0095\7\4\2\2\u0095\u0096\5\30\r\2\u0096\u0097\7\5\2\2\u0097"+
		"\u00df\3\2\2\2\u0098\u0099\7\13\2\2\u0099\u009a\7\3\2\2\u009a\u009b\5"+
		"\30\r\2\u009b\u009c\7\4\2\2\u009c\u009d\5\30\r\2\u009d\u009e\7\5\2\2\u009e"+
		"\u00df\3\2\2\2\u009f\u00a0\7\f\2\2\u00a0\u00a1\7\3\2\2\u00a1\u00a2\5\30"+
		"\r\2\u00a2\u00a3\7\4\2\2\u00a3\u00a4\5\30\r\2\u00a4\u00a5\7\5\2\2\u00a5"+
		"\u00df\3\2\2\2\u00a6\u00a7\7\16\2\2\u00a7\u00a8\7\3\2\2\u00a8\u00a9\5"+
		"\30\r\2\u00a9\u00aa\7\4\2\2\u00aa\u00ab\5\30\r\2\u00ab\u00ac\7\5\2\2\u00ac"+
		"\u00df\3\2\2\2\u00ad\u00ae\7\n\2\2\u00ae\u00af\7\3\2\2\u00af\u00b0\5\30"+
		"\r\2\u00b0\u00b1\7\4\2\2\u00b1\u00b2\5\30\r\2\u00b2\u00b3\7\5\2\2\u00b3"+
		"\u00df\3\2\2\2\u00b4\u00b5\7\23\2\2\u00b5\u00b6\7\3\2\2\u00b6\u00b7\5"+
		"\30\r\2\u00b7\u00b8\7\4\2\2\u00b8\u00b9\5\30\r\2\u00b9\u00ba\7\5\2\2\u00ba"+
		"\u00df\3\2\2\2\u00bb\u00bc\7!\2\2\u00bc\u00bd\7\3\2\2\u00bd\u00be\5\30"+
		"\r\2\u00be\u00bf\7\5\2\2\u00bf\u00df\3\2\2\2\u00c0\u00c1\7\37\2\2\u00c1"+
		"\u00c2\7\3\2\2\u00c2\u00c3\5\30\r\2\u00c3\u00c4\7\5\2\2\u00c4\u00df\3"+
		"\2\2\2\u00c5\u00c6\7 \2\2\u00c6\u00c7\7\3\2\2\u00c7\u00c8\5\30\r\2\u00c8"+
		"\u00c9\7\5\2\2\u00c9\u00df\3\2\2\2\u00ca\u00cb\7\"\2\2\u00cb\u00cc\7\3"+
		"\2\2\u00cc\u00cd\5\30\r\2\u00cd\u00ce\7\5\2\2\u00ce\u00df\3\2\2\2\u00cf"+
		"\u00d0\7\17\2\2\u00d0\u00d1\7\3\2\2\u00d1\u00d2\5\30\r\2\u00d2\u00d3\7"+
		"\5\2\2\u00d3\u00df\3\2\2\2\u00d4\u00d5\7\20\2\2\u00d5\u00d6\7\3\2\2\u00d6"+
		"\u00d7\5\30\r\2\u00d7\u00d8\7\5\2\2\u00d8\u00df\3\2\2\2\u00d9\u00da\7"+
		"\21\2\2\u00da\u00db\7\3\2\2\u00db\u00dc\5\30\r\2\u00dc\u00dd\7\5\2\2\u00dd"+
		"\u00df\3\2\2\2\u00de\u008a\3\2\2\2\u00de\u008c\3\2\2\2\u00de\u0091\3\2"+
		"\2\2\u00de\u0098\3\2\2\2\u00de\u009f\3\2\2\2\u00de\u00a6\3\2\2\2\u00de"+
		"\u00ad\3\2\2\2\u00de\u00b4\3\2\2\2\u00de\u00bb\3\2\2\2\u00de\u00c0\3\2"+
		"\2\2\u00de\u00c5\3\2\2\2\u00de\u00ca\3\2\2\2\u00de\u00cf\3\2\2\2\u00de"+
		"\u00d4\3\2\2\2\u00de\u00d9\3\2\2\2\u00df\35\3\2\2\2\u00e0\u00e5\5\34\17"+
		"\2\u00e1\u00e5\5\22\n\2\u00e2\u00e5\5\20\t\2\u00e3\u00e5\5\f\7\2\u00e4"+
		"\u00e0\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2"+
		"\2\2\u00e5\37\3\2\2\2\u00e6\u00ea\5\22\n\2\u00e7\u00e9\7)\2\2\u00e8\u00e7"+
		"\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00f1\7\b\2\2\u00ee\u00f0\7)"+
		"\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\5\36"+
		"\20\2\u00f5!\3\2\2\2\u00f6\u00f7\5\34\17\2\u00f7\u00f8\7\t\2\2\u00f8\u00fd"+
		"\3\2\2\2\u00f9\u00fa\5 \21\2\u00fa\u00fb\7\t\2\2\u00fb\u00fd\3\2\2\2\u00fc"+
		"\u00f6\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fd#\3\2\2\2\u00fe\u00ff\5\"\22\2"+
		"\u00ff\u0100\7)\2\2\u0100\u0101\5$\23\2\u0101\u0104\3\2\2\2\u0102\u0104"+
		"\5\"\22\2\u0103\u00fe\3\2\2\2\u0103\u0102\3\2\2\2\u0104%\3\2\2\2\u0105"+
		"\u0106\7\34\2\2\u0106\u0107\7)\2\2\u0107\u0108\5$\23\2\u0108\u0109\7)"+
		"\2\2\u0109\u010a\7\35\2\2\u010a\'\3\2\2\2\u010b\u010c\7\36\2\2\u010c\u010d"+
		"\7)\2\2\u010d\u010e\7(\2\2\u010e\u0110\7\3\2\2\u010f\u0111\5\24\13\2\u0110"+
		"\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7\5"+
		"\2\2\u0113\u0114\7)\2\2\u0114\u0115\7#\2\2\u0115\u0116\7\3\2\2\u0116\u0117"+
		"\5\4\3\2\u0117\u0118\7\5\2\2\u0118\u0119\7)\2\2\u0119\u011a\5&\24\2\u011a"+
		"\u012c\3\2\2\2\u011b\u011c\7\36\2\2\u011c\u011d\7)\2\2\u011d\u011e\7("+
		"\2\2\u011e\u0120\7\3\2\2\u011f\u0121\5\24\13\2\u0120\u011f\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\7\5\2\2\u0123\u0124\7)"+
		"\2\2\u0124\u012c\5&\24\2\u0125\u0126\7\36\2\2\u0126\u0127\7)\2\2\u0127"+
		"\u0128\7(\2\2\u0128\u0129\7\7\2\2\u0129\u012a\7)\2\2\u012a\u012c\5&\24"+
		"\2\u012b\u010b\3\2\2\2\u012b\u011b\3\2\2\2\u012b\u0125\3\2\2\2\u012c)"+
		"\3\2\2\2\u012d\u012e\5,\27\2\u012e\u012f\7)\2\2\u012f\u0130\5*\26\2\u0130"+
		"\u0133\3\2\2\2\u0131\u0133\5,\27\2\u0132\u012d\3\2\2\2\u0132\u0131\3\2"+
		"\2\2\u0133+\3\2\2\2\u0134\u0135\5\"\22\2\u0135-\3\2\2\2\u0136\u0137\5"+
		"\60\31\2\u0137\u0138\7)\2\2\u0138\u0139\5.\30\2\u0139\u013c\3\2\2\2\u013a"+
		"\u013c\5\60\31\2\u013b\u0136\3\2\2\2\u013b\u013a\3\2\2\2\u013c/\3\2\2"+
		"\2\u013d\u0142\5(\25\2\u013e\u0142\5*\26\2\u013f\u0142\7*\2\2\u0140\u0142"+
		"\7+\2\2\u0141\u013d\3\2\2\2\u0141\u013e\3\2\2\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0140\3\2\2\2\u0142\61\3\2\2\2\31\65<KQZgmt{\u0081\u0088\u00de\u00e4"+
		"\u00ea\u00f1\u00fc\u0103\u0110\u0120\u012b\u0132\u013b\u0141";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}