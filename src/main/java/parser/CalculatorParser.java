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
		COS=30, ABS=31, TAN=32, WHERE=33, AND=34, OR=35, NOT=36, GLOBAL=37, WHILE=38, 
		RETURN=39, NAME=40, WHITESPACE=41, COMMENT=42, LINE_COMMENT=43;
	public static final int
		RULE_start = 0, RULE_pattern_matching = 1, RULE_logic_function_name = 2, 
		RULE_pattern_matching_arg = 3, RULE_real_number = 4, RULE_function_name = 5, 
		RULE_signed_real_number = 6, RULE_complex_number = 7, RULE_variable = 8, 
		RULE_variables = 9, RULE_right_assignments = 10, RULE_func_arg = 11, RULE_func_args = 12, 
		RULE_function_call = 13, RULE_right_assignment = 14, RULE_assignment = 15, 
		RULE_whileLoop = 16, RULE_instruction = 17, RULE_instructions = 18, RULE_function_body = 19, 
		RULE_function = 20, RULE_program_instructions = 21, RULE_program_instruction = 22, 
		RULE_program_elements = 23, RULE_program_element = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "pattern_matching", "logic_function_name", "pattern_matching_arg", 
			"real_number", "function_name", "signed_real_number", "complex_number", 
			"variable", "variables", "right_assignments", "func_arg", "func_args", 
			"function_call", "right_assignment", "assignment", "whileLoop", "instruction", 
			"instructions", "function_body", "function", "program_instructions", 
			"program_instruction", "program_elements", "program_element"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'i'", "'()'", "'='", "';'", "'^'", "'*'", 
			"'/'", "'+'", "'-'", "'Re'", "'Im'", "'s'", null, "'%'", "'=='", "'>='", 
			"'<='", "'<'", "'>'", "'!='", null, "'0'", "'{'", "'}'", "'function'", 
			"'sin'", "'cos'", "'abs'", "'tan'", "'where'", "'&'", "'|'", "'!'", "'global'", 
			"'while'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "POW", "MUL", "DIV", 
			"ADD", "SUB", "RealPart", "ImaginaryPart", "Successor", "INT", "MOD", 
			"Equal", "GreaterEqual", "LowerEqual", "Lower", "Greater", "NotEqual", 
			"DOUBLE", "ZERO", "BEGIN", "END", "FUNCTION", "SIN", "COS", "ABS", "TAN", 
			"WHERE", "AND", "OR", "NOT", "GLOBAL", "WHILE", "RETURN", "NAME", "WHITESPACE", 
			"COMMENT", "LINE_COMMENT"
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(50);
				match(WHITESPACE);
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			program_elements();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(57);
				match(WHITESPACE);
				}
				}
				setState(62);
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
			setState(75);
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
				setState(63);
				logic_function_name();
				setState(64);
				match(T__0);
				setState(65);
				pattern_matching_arg();
				setState(66);
				match(T__1);
				setState(67);
				pattern_matching_arg();
				setState(68);
				match(T__2);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(NOT);
				setState(71);
				match(T__0);
				setState(72);
				pattern_matching_arg();
				setState(73);
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
			setState(77);
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
			setState(81);
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
				setState(79);
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
				setState(80);
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
			setState(83);
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
			setState(85);
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
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case ZERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				real_number();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(SUB);
				setState(89);
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
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				signed_real_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				signed_real_number();
				setState(94);
				match(ADD);
				setState(95);
				real_number();
				setState(96);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				signed_real_number();
				setState(99);
				match(SUB);
				setState(100);
				real_number();
				setState(101);
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
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(NAME);
				}
				break;
			case GLOBAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(GLOBAL);
				setState(107);
				match(WHITESPACE);
				setState(108);
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
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				variable();
				setState(113);
				match(T__1);
				setState(114);
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
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				right_assignment();
				setState(119);
				match(T__1);
				setState(120);
				right_assignments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
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
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				complex_number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
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
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				func_arg();
				setState(132);
				match(T__1);
				setState(133);
				func_args();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
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
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(NAME);
				setState(139);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(NAME);
				setState(141);
				match(T__0);
				setState(142);
				func_args();
				setState(143);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				match(ADD);
				setState(146);
				match(T__0);
				setState(147);
				func_arg();
				setState(148);
				match(T__1);
				setState(149);
				func_arg();
				setState(150);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				match(MUL);
				setState(153);
				match(T__0);
				setState(154);
				func_arg();
				setState(155);
				match(T__1);
				setState(156);
				func_arg();
				setState(157);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				match(DIV);
				setState(160);
				match(T__0);
				setState(161);
				func_arg();
				setState(162);
				match(T__1);
				setState(163);
				func_arg();
				setState(164);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(166);
				match(SUB);
				setState(167);
				match(T__0);
				setState(168);
				func_arg();
				setState(169);
				match(T__1);
				setState(170);
				func_arg();
				setState(171);
				match(T__2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(173);
				match(POW);
				setState(174);
				match(T__0);
				setState(175);
				func_arg();
				setState(176);
				match(T__1);
				setState(177);
				func_arg();
				setState(178);
				match(T__2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(180);
				match(MOD);
				setState(181);
				match(T__0);
				setState(182);
				func_arg();
				setState(183);
				match(T__1);
				setState(184);
				func_arg();
				setState(185);
				match(T__2);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(187);
				match(ABS);
				setState(188);
				match(T__0);
				setState(189);
				func_arg();
				setState(190);
				match(T__2);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(192);
				match(SIN);
				setState(193);
				match(T__0);
				setState(194);
				func_arg();
				setState(195);
				match(T__2);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(197);
				match(COS);
				setState(198);
				match(T__0);
				setState(199);
				func_arg();
				setState(200);
				match(T__2);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(202);
				match(TAN);
				setState(203);
				match(T__0);
				setState(204);
				func_arg();
				setState(205);
				match(T__2);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(207);
				match(RealPart);
				setState(208);
				match(T__0);
				setState(209);
				func_arg();
				setState(210);
				match(T__2);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(212);
				match(ImaginaryPart);
				setState(213);
				match(T__0);
				setState(214);
				func_arg();
				setState(215);
				match(T__2);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(217);
				match(Successor);
				setState(218);
				match(T__0);
				setState(219);
				func_arg();
				setState(220);
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
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				complex_number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
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
			setState(230);
			variable();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(231);
				match(WHITESPACE);
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			match(T__5);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(238);
				match(WHITESPACE);
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
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

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CalculatorParser.WHILE, 0); }
		public Pattern_matchingContext pattern_matching() {
			return getRuleContext(Pattern_matchingContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(CalculatorParser.WHITESPACE, 0); }
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(WHILE);
			setState(247);
			match(T__0);
			setState(248);
			pattern_matching();
			setState(249);
			match(T__2);
			setState(250);
			match(WHITESPACE);
			setState(251);
			function_body();
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
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
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
		enterRule(_localctx, 34, RULE_instruction);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				function_call();
				setState(254);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				assignment();
				setState(257);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				whileLoop();
				setState(260);
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
		enterRule(_localctx, 36, RULE_instructions);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				instruction();
				setState(265);
				match(WHITESPACE);
				setState(266);
				instructions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
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
		enterRule(_localctx, 38, RULE_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(BEGIN);
			setState(272);
			match(WHITESPACE);
			setState(273);
			instructions();
			setState(274);
			match(WHITESPACE);
			setState(275);
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
		enterRule(_localctx, 40, RULE_function);
		int _la;
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(FUNCTION);
				setState(278);
				match(WHITESPACE);
				setState(279);
				match(NAME);
				setState(280);
				match(T__0);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==NAME) {
					{
					setState(281);
					variables();
					}
				}

				setState(284);
				match(T__2);
				setState(285);
				match(WHITESPACE);
				setState(286);
				match(WHERE);
				setState(287);
				match(T__0);
				setState(288);
				pattern_matching();
				setState(289);
				match(T__2);
				setState(290);
				match(WHITESPACE);
				setState(291);
				function_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(FUNCTION);
				setState(294);
				match(WHITESPACE);
				setState(295);
				match(NAME);
				setState(296);
				match(T__0);
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==NAME) {
					{
					setState(297);
					variables();
					}
				}

				setState(300);
				match(T__2);
				setState(301);
				match(WHITESPACE);
				setState(302);
				function_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				match(FUNCTION);
				setState(304);
				match(WHITESPACE);
				setState(305);
				match(NAME);
				setState(306);
				match(T__4);
				setState(307);
				match(WHITESPACE);
				setState(308);
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
		enterRule(_localctx, 42, RULE_program_instructions);
		try {
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				program_instruction();
				setState(312);
				match(WHITESPACE);
				setState(313);
				program_instructions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
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
		enterRule(_localctx, 44, RULE_program_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
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
		enterRule(_localctx, 46, RULE_program_elements);
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				program_element();
				setState(321);
				match(WHITESPACE);
				setState(322);
				program_elements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
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
		enterRule(_localctx, 48, RULE_program_element);
		try {
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
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
			case WHILE:
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				program_instructions();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				match(COMMENT);
				}
				break;
			case LINE_COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0150\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\3\2\7\2=\n\2\f\2\16\2@\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3N\n\3\3\4\3\4\3"+
		"\5\3\5\5\5T\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\b]\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tj\n\t\3\n\3\n\3\n\3\n\5\np\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\5\13w\n\13\3\f\3\f\3\f\3\f\3\f\5\f~\n\f\3\r\3\r\3\r\3"+
		"\r\5\r\u0084\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u008b\n\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e1"+
		"\n\17\3\20\3\20\3\20\3\20\5\20\u00e7\n\20\3\21\3\21\7\21\u00eb\n\21\f"+
		"\21\16\21\u00ee\13\21\3\21\3\21\7\21\u00f2\n\21\f\21\16\21\u00f5\13\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u0109\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u0110"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u011d"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u012d\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u0138\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u013f\n\27\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\5\31\u0148\n\31\3\32\3\32\3\32\3\32\5\32\u014e\n\32"+
		"\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\5"+
		"\4\2\24\31$%\4\2\22\22\32\33\7\2\n\n\f\21\23\23\37\"**\2\u0163\2\67\3"+
		"\2\2\2\4M\3\2\2\2\6O\3\2\2\2\bS\3\2\2\2\nU\3\2\2\2\fW\3\2\2\2\16\\\3\2"+
		"\2\2\20i\3\2\2\2\22o\3\2\2\2\24v\3\2\2\2\26}\3\2\2\2\30\u0083\3\2\2\2"+
		"\32\u008a\3\2\2\2\34\u00e0\3\2\2\2\36\u00e6\3\2\2\2 \u00e8\3\2\2\2\"\u00f8"+
		"\3\2\2\2$\u0108\3\2\2\2&\u010f\3\2\2\2(\u0111\3\2\2\2*\u0137\3\2\2\2,"+
		"\u013e\3\2\2\2.\u0140\3\2\2\2\60\u0147\3\2\2\2\62\u014d\3\2\2\2\64\66"+
		"\7+\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\2"+
		"9\67\3\2\2\2:>\5\60\31\2;=\7+\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2"+
		"\2\2?\3\3\2\2\2@>\3\2\2\2AB\5\6\4\2BC\7\3\2\2CD\5\b\5\2DE\7\4\2\2EF\5"+
		"\b\5\2FG\7\5\2\2GN\3\2\2\2HI\7&\2\2IJ\7\3\2\2JK\5\b\5\2KL\7\5\2\2LN\3"+
		"\2\2\2MA\3\2\2\2MH\3\2\2\2N\5\3\2\2\2OP\t\2\2\2P\7\3\2\2\2QT\5\36\20\2"+
		"RT\5\4\3\2SQ\3\2\2\2SR\3\2\2\2T\t\3\2\2\2UV\t\3\2\2V\13\3\2\2\2WX\t\4"+
		"\2\2X\r\3\2\2\2Y]\5\n\6\2Z[\7\16\2\2[]\5\n\6\2\\Y\3\2\2\2\\Z\3\2\2\2]"+
		"\17\3\2\2\2^j\5\16\b\2_`\5\16\b\2`a\7\r\2\2ab\5\n\6\2bc\7\6\2\2cj\3\2"+
		"\2\2de\5\16\b\2ef\7\16\2\2fg\5\n\6\2gh\7\6\2\2hj\3\2\2\2i^\3\2\2\2i_\3"+
		"\2\2\2id\3\2\2\2j\21\3\2\2\2kp\7*\2\2lm\7\'\2\2mn\7+\2\2np\7*\2\2ok\3"+
		"\2\2\2ol\3\2\2\2p\23\3\2\2\2qw\5\22\n\2rs\5\22\n\2st\7\4\2\2tu\5\24\13"+
		"\2uw\3\2\2\2vq\3\2\2\2vr\3\2\2\2w\25\3\2\2\2xy\5\36\20\2yz\7\4\2\2z{\5"+
		"\26\f\2{~\3\2\2\2|~\5\36\20\2}x\3\2\2\2}|\3\2\2\2~\27\3\2\2\2\177\u0084"+
		"\5\34\17\2\u0080\u0084\5\22\n\2\u0081\u0084\5\20\t\2\u0082\u0084\5\f\7"+
		"\2\u0083\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082"+
		"\3\2\2\2\u0084\31\3\2\2\2\u0085\u0086\5\30\r\2\u0086\u0087\7\4\2\2\u0087"+
		"\u0088\5\32\16\2\u0088\u008b\3\2\2\2\u0089\u008b\5\30\r\2\u008a\u0085"+
		"\3\2\2\2\u008a\u0089\3\2\2\2\u008b\33\3\2\2\2\u008c\u008d\7*\2\2\u008d"+
		"\u00e1\7\7\2\2\u008e\u008f\7*\2\2\u008f\u0090\7\3\2\2\u0090\u0091\5\32"+
		"\16\2\u0091\u0092\7\5\2\2\u0092\u00e1\3\2\2\2\u0093\u0094\7\r\2\2\u0094"+
		"\u0095\7\3\2\2\u0095\u0096\5\30\r\2\u0096\u0097\7\4\2\2\u0097\u0098\5"+
		"\30\r\2\u0098\u0099\7\5\2\2\u0099\u00e1\3\2\2\2\u009a\u009b\7\13\2\2\u009b"+
		"\u009c\7\3\2\2\u009c\u009d\5\30\r\2\u009d\u009e\7\4\2\2\u009e\u009f\5"+
		"\30\r\2\u009f\u00a0\7\5\2\2\u00a0\u00e1\3\2\2\2\u00a1\u00a2\7\f\2\2\u00a2"+
		"\u00a3\7\3\2\2\u00a3\u00a4\5\30\r\2\u00a4\u00a5\7\4\2\2\u00a5\u00a6\5"+
		"\30\r\2\u00a6\u00a7\7\5\2\2\u00a7\u00e1\3\2\2\2\u00a8\u00a9\7\16\2\2\u00a9"+
		"\u00aa\7\3\2\2\u00aa\u00ab\5\30\r\2\u00ab\u00ac\7\4\2\2\u00ac\u00ad\5"+
		"\30\r\2\u00ad\u00ae\7\5\2\2\u00ae\u00e1\3\2\2\2\u00af\u00b0\7\n\2\2\u00b0"+
		"\u00b1\7\3\2\2\u00b1\u00b2\5\30\r\2\u00b2\u00b3\7\4\2\2\u00b3\u00b4\5"+
		"\30\r\2\u00b4\u00b5\7\5\2\2\u00b5\u00e1\3\2\2\2\u00b6\u00b7\7\23\2\2\u00b7"+
		"\u00b8\7\3\2\2\u00b8\u00b9\5\30\r\2\u00b9\u00ba\7\4\2\2\u00ba\u00bb\5"+
		"\30\r\2\u00bb\u00bc\7\5\2\2\u00bc\u00e1\3\2\2\2\u00bd\u00be\7!\2\2\u00be"+
		"\u00bf\7\3\2\2\u00bf\u00c0\5\30\r\2\u00c0\u00c1\7\5\2\2\u00c1\u00e1\3"+
		"\2\2\2\u00c2\u00c3\7\37\2\2\u00c3\u00c4\7\3\2\2\u00c4\u00c5\5\30\r\2\u00c5"+
		"\u00c6\7\5\2\2\u00c6\u00e1\3\2\2\2\u00c7\u00c8\7 \2\2\u00c8\u00c9\7\3"+
		"\2\2\u00c9\u00ca\5\30\r\2\u00ca\u00cb\7\5\2\2\u00cb\u00e1\3\2\2\2\u00cc"+
		"\u00cd\7\"\2\2\u00cd\u00ce\7\3\2\2\u00ce\u00cf\5\30\r\2\u00cf\u00d0\7"+
		"\5\2\2\u00d0\u00e1\3\2\2\2\u00d1\u00d2\7\17\2\2\u00d2\u00d3\7\3\2\2\u00d3"+
		"\u00d4\5\30\r\2\u00d4\u00d5\7\5\2\2\u00d5\u00e1\3\2\2\2\u00d6\u00d7\7"+
		"\20\2\2\u00d7\u00d8\7\3\2\2\u00d8\u00d9\5\30\r\2\u00d9\u00da\7\5\2\2\u00da"+
		"\u00e1\3\2\2\2\u00db\u00dc\7\21\2\2\u00dc\u00dd\7\3\2\2\u00dd\u00de\5"+
		"\30\r\2\u00de\u00df\7\5\2\2\u00df\u00e1\3\2\2\2\u00e0\u008c\3\2\2\2\u00e0"+
		"\u008e\3\2\2\2\u00e0\u0093\3\2\2\2\u00e0\u009a\3\2\2\2\u00e0\u00a1\3\2"+
		"\2\2\u00e0\u00a8\3\2\2\2\u00e0\u00af\3\2\2\2\u00e0\u00b6\3\2\2\2\u00e0"+
		"\u00bd\3\2\2\2\u00e0\u00c2\3\2\2\2\u00e0\u00c7\3\2\2\2\u00e0\u00cc\3\2"+
		"\2\2\u00e0\u00d1\3\2\2\2\u00e0\u00d6\3\2\2\2\u00e0\u00db\3\2\2\2\u00e1"+
		"\35\3\2\2\2\u00e2\u00e7\5\34\17\2\u00e3\u00e7\5\22\n\2\u00e4\u00e7\5\20"+
		"\t\2\u00e5\u00e7\5\f\7\2\u00e6\u00e2\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\37\3\2\2\2\u00e8\u00ec\5\22\n"+
		"\2\u00e9\u00eb\7+\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00f3\7\b\2\2\u00f0\u00f2\7+\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f6\u00f7\5\36\20\2\u00f7!\3\2\2\2\u00f8\u00f9\7(\2\2"+
		"\u00f9\u00fa\7\3\2\2\u00fa\u00fb\5\4\3\2\u00fb\u00fc\7\5\2\2\u00fc\u00fd"+
		"\7+\2\2\u00fd\u00fe\5(\25\2\u00fe#\3\2\2\2\u00ff\u0100\5\34\17\2\u0100"+
		"\u0101\7\t\2\2\u0101\u0109\3\2\2\2\u0102\u0103\5 \21\2\u0103\u0104\7\t"+
		"\2\2\u0104\u0109\3\2\2\2\u0105\u0106\5\"\22\2\u0106\u0107\7\t\2\2\u0107"+
		"\u0109\3\2\2\2\u0108\u00ff\3\2\2\2\u0108\u0102\3\2\2\2\u0108\u0105\3\2"+
		"\2\2\u0109%\3\2\2\2\u010a\u010b\5$\23\2\u010b\u010c\7+\2\2\u010c\u010d"+
		"\5&\24\2\u010d\u0110\3\2\2\2\u010e\u0110\5$\23\2\u010f\u010a\3\2\2\2\u010f"+
		"\u010e\3\2\2\2\u0110\'\3\2\2\2\u0111\u0112\7\34\2\2\u0112\u0113\7+\2\2"+
		"\u0113\u0114\5&\24\2\u0114\u0115\7+\2\2\u0115\u0116\7\35\2\2\u0116)\3"+
		"\2\2\2\u0117\u0118\7\36\2\2\u0118\u0119\7+\2\2\u0119\u011a\7*\2\2\u011a"+
		"\u011c\7\3\2\2\u011b\u011d\5\24\13\2\u011c\u011b\3\2\2\2\u011c\u011d\3"+
		"\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\7\5\2\2\u011f\u0120\7+\2\2\u0120"+
		"\u0121\7#\2\2\u0121\u0122\7\3\2\2\u0122\u0123\5\4\3\2\u0123\u0124\7\5"+
		"\2\2\u0124\u0125\7+\2\2\u0125\u0126\5(\25\2\u0126\u0138\3\2\2\2\u0127"+
		"\u0128\7\36\2\2\u0128\u0129\7+\2\2\u0129\u012a\7*\2\2\u012a\u012c\7\3"+
		"\2\2\u012b\u012d\5\24\13\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u012f\7\5\2\2\u012f\u0130\7+\2\2\u0130\u0138\5(\25"+
		"\2\u0131\u0132\7\36\2\2\u0132\u0133\7+\2\2\u0133\u0134\7*\2\2\u0134\u0135"+
		"\7\7\2\2\u0135\u0136\7+\2\2\u0136\u0138\5(\25\2\u0137\u0117\3\2\2\2\u0137"+
		"\u0127\3\2\2\2\u0137\u0131\3\2\2\2\u0138+\3\2\2\2\u0139\u013a\5.\30\2"+
		"\u013a\u013b\7+\2\2\u013b\u013c\5,\27\2\u013c\u013f\3\2\2\2\u013d\u013f"+
		"\5.\30\2\u013e\u0139\3\2\2\2\u013e\u013d\3\2\2\2\u013f-\3\2\2\2\u0140"+
		"\u0141\5$\23\2\u0141/\3\2\2\2\u0142\u0143\5\62\32\2\u0143\u0144\7+\2\2"+
		"\u0144\u0145\5\60\31\2\u0145\u0148\3\2\2\2\u0146\u0148\5\62\32\2\u0147"+
		"\u0142\3\2\2\2\u0147\u0146\3\2\2\2\u0148\61\3\2\2\2\u0149\u014e\5*\26"+
		"\2\u014a\u014e\5,\27\2\u014b\u014e\7,\2\2\u014c\u014e\7-\2\2\u014d\u0149"+
		"\3\2\2\2\u014d\u014a\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014e"+
		"\63\3\2\2\2\31\67>MS\\iov}\u0083\u008a\u00e0\u00e6\u00ec\u00f3\u0108\u010f"+
		"\u011c\u012c\u0137\u013e\u0147\u014d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}