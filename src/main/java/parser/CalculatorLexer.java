// Generated from Calculator.g4 by ANTLR 4.9
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, POW=7, MUL=8, DIV=9, ADD=10, 
		SUB=11, INT=12, DOUBLE=13, ZERO=14, BEGIN=15, END=16, FUNCTION=17, NAME=18, 
		WHITESPACE=19, COMMENT=20, LINE_COMMENT=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "POW", "MUL", "DIV", 
			"ADD", "SUB", "INT", "DOUBLE", "ZERO", "BEGIN", "END", "FUNCTION", "NAME", 
			"WHITESPACE", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'i'", "','", "'('", "')'", "'='", "';'", "'^'", "'*'", "'/'", 
			"'+'", "'-'", null, null, "'0'", "'begin'", "'end'", "'function'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "POW", "MUL", "DIV", "ADD", 
			"SUB", "INT", "DOUBLE", "ZERO", "BEGIN", "END", "FUNCTION", "NAME", "WHITESPACE", 
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0097\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\6\rE\n\r\r\r\16\rF\3\r\7\rJ\n\r\f\r\16\rM\13\r\3\16\6\16P\n\16\r\16\16"+
		"\16Q\3\16\3\16\6\16V\n\16\r\16\16\16W\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\6\23p\n\23\r\23\16\23q\3\23\7\23u\n\23\f\23\16\23x\13\23\3\24"+
		"\6\24{\n\24\r\24\16\24|\3\25\3\25\3\25\3\25\7\25\u0083\n\25\f\25\16\25"+
		"\u0086\13\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0091\n"+
		"\26\f\26\16\26\u0094\13\26\3\26\3\26\3\u0084\2\27\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27\3\2\b\3\2\63;\3\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\""+
		"\"\4\2\f\f\17\17\2\u009f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r\67"+
		"\3\2\2\2\179\3\2\2\2\21;\3\2\2\2\23=\3\2\2\2\25?\3\2\2\2\27A\3\2\2\2\31"+
		"D\3\2\2\2\33O\3\2\2\2\35Y\3\2\2\2\37[\3\2\2\2!a\3\2\2\2#e\3\2\2\2%o\3"+
		"\2\2\2\'z\3\2\2\2)~\3\2\2\2+\u008c\3\2\2\2-.\7k\2\2.\4\3\2\2\2/\60\7."+
		"\2\2\60\6\3\2\2\2\61\62\7*\2\2\62\b\3\2\2\2\63\64\7+\2\2\64\n\3\2\2\2"+
		"\65\66\7?\2\2\66\f\3\2\2\2\678\7=\2\28\16\3\2\2\29:\7`\2\2:\20\3\2\2\2"+
		";<\7,\2\2<\22\3\2\2\2=>\7\61\2\2>\24\3\2\2\2?@\7-\2\2@\26\3\2\2\2AB\7"+
		"/\2\2B\30\3\2\2\2CE\t\2\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GK"+
		"\3\2\2\2HJ\t\3\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\32\3\2\2\2"+
		"MK\3\2\2\2NP\t\3\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2"+
		"SU\7\60\2\2TV\t\3\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\34\3\2"+
		"\2\2YZ\7\62\2\2Z\36\3\2\2\2[\\\7d\2\2\\]\7g\2\2]^\7i\2\2^_\7k\2\2_`\7"+
		"p\2\2` \3\2\2\2ab\7g\2\2bc\7p\2\2cd\7f\2\2d\"\3\2\2\2ef\7h\2\2fg\7w\2"+
		"\2gh\7p\2\2hi\7e\2\2ij\7v\2\2jk\7k\2\2kl\7q\2\2lm\7p\2\2m$\3\2\2\2np\t"+
		"\4\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rv\3\2\2\2su\t\5\2\2ts\3"+
		"\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w&\3\2\2\2xv\3\2\2\2y{\t\6\2\2zy\3"+
		"\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}(\3\2\2\2~\177\7\61\2\2\177\u0080"+
		"\7,\2\2\u0080\u0084\3\2\2\2\u0081\u0083\13\2\2\2\u0082\u0081\3\2\2\2\u0083"+
		"\u0086\3\2\2\2\u0084\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7,\2\2\u0088\u0089\7\61\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008b\b\25\2\2\u008b*\3\2\2\2\u008c\u008d\7\61\2"+
		"\2\u008d\u008e\7\61\2\2\u008e\u0092\3\2\2\2\u008f\u0091\n\7\2\2\u0090"+
		"\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\b\26\2\2\u0096"+
		",\3\2\2\2\f\2FKQWqv|\u0084\u0092\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}