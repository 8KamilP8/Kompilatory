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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, POW=8, MUL=9, 
		DIV=10, ADD=11, SUB=12, RealPart=13, ImaginaryPart=14, Successor=15, INT=16, 
		MOD=17, Equal=18, GreaterEqual=19, LowerEqual=20, Lower=21, Greater=22, 
		NotEqual=23, DOUBLE=24, ZERO=25, BEGIN=26, END=27, FUNCTION=28, SIN=29, 
		COS=30, ABS=31, TAN=32, WHERE=33, AND=34, OR=35, NOT=36, GLOBAL=37, WHILE=38, 
		RETURN=39, NAME=40, WHITESPACE=41, COMMENT=42, LINE_COMMENT=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "POW", "MUL", 
			"DIV", "ADD", "SUB", "RealPart", "ImaginaryPart", "Successor", "INT", 
			"MOD", "Equal", "GreaterEqual", "LowerEqual", "Lower", "Greater", "NotEqual", 
			"DOUBLE", "ZERO", "BEGIN", "END", "FUNCTION", "SIN", "COS", "ABS", "TAN", 
			"WHERE", "AND", "OR", "NOT", "GLOBAL", "WHILE", "RETURN", "NAME", "WHITESPACE", 
			"COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0104\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\6\21|\n\21\r\21\16\21}\3\21\7\21\u0081\n\21\f\21\16\21\u0084"+
		"\13\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\6\31\u0099\n\31\r\31\16\31\u009a\3\31\3"+
		"\31\6\31\u009f\n\31\r\31\16\31\u00a0\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3"+
		"$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3"+
		"(\3(\3)\6)\u00e3\n)\r)\16)\u00e4\3)\7)\u00e8\n)\f)\16)\u00eb\13)\3*\6"+
		"*\u00ee\n*\r*\16*\u00ef\3+\3+\3+\3+\7+\u00f6\n+\f+\16+\u00f9\13+\3+\3"+
		"+\3+\3,\3,\7,\u0100\n,\f,\16,\u0103\13,\3\u00f7\2-\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-\3\2\b\3\2\63;\3\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17"+
		"\"\"\4\2\f\f\17\17\2\u010c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5[\3\2\2\2\7]"+
		"\3\2\2\2\t_\3\2\2\2\13a\3\2\2\2\rd\3\2\2\2\17f\3\2\2\2\21h\3\2\2\2\23"+
		"j\3\2\2\2\25l\3\2\2\2\27n\3\2\2\2\31p\3\2\2\2\33r\3\2\2\2\35u\3\2\2\2"+
		"\37x\3\2\2\2!{\3\2\2\2#\u0085\3\2\2\2%\u0087\3\2\2\2\'\u008a\3\2\2\2)"+
		"\u008d\3\2\2\2+\u0090\3\2\2\2-\u0092\3\2\2\2/\u0094\3\2\2\2\61\u0098\3"+
		"\2\2\2\63\u00a2\3\2\2\2\65\u00a4\3\2\2\2\67\u00a6\3\2\2\29\u00a8\3\2\2"+
		"\2;\u00b1\3\2\2\2=\u00b5\3\2\2\2?\u00b9\3\2\2\2A\u00bd\3\2\2\2C\u00c1"+
		"\3\2\2\2E\u00c7\3\2\2\2G\u00c9\3\2\2\2I\u00cb\3\2\2\2K\u00cd\3\2\2\2M"+
		"\u00d4\3\2\2\2O\u00da\3\2\2\2Q\u00e2\3\2\2\2S\u00ed\3\2\2\2U\u00f1\3\2"+
		"\2\2W\u00fd\3\2\2\2YZ\7*\2\2Z\4\3\2\2\2[\\\7.\2\2\\\6\3\2\2\2]^\7+\2\2"+
		"^\b\3\2\2\2_`\7k\2\2`\n\3\2\2\2ab\7*\2\2bc\7+\2\2c\f\3\2\2\2de\7?\2\2"+
		"e\16\3\2\2\2fg\7=\2\2g\20\3\2\2\2hi\7`\2\2i\22\3\2\2\2jk\7,\2\2k\24\3"+
		"\2\2\2lm\7\61\2\2m\26\3\2\2\2no\7-\2\2o\30\3\2\2\2pq\7/\2\2q\32\3\2\2"+
		"\2rs\7T\2\2st\7g\2\2t\34\3\2\2\2uv\7K\2\2vw\7o\2\2w\36\3\2\2\2xy\7u\2"+
		"\2y \3\2\2\2z|\t\2\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0082"+
		"\3\2\2\2\177\u0081\t\3\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\"\3\2\2\2\u0084\u0082\3\2\2\2"+
		"\u0085\u0086\7\'\2\2\u0086$\3\2\2\2\u0087\u0088\7?\2\2\u0088\u0089\7?"+
		"\2\2\u0089&\3\2\2\2\u008a\u008b\7@\2\2\u008b\u008c\7?\2\2\u008c(\3\2\2"+
		"\2\u008d\u008e\7>\2\2\u008e\u008f\7?\2\2\u008f*\3\2\2\2\u0090\u0091\7"+
		">\2\2\u0091,\3\2\2\2\u0092\u0093\7@\2\2\u0093.\3\2\2\2\u0094\u0095\7#"+
		"\2\2\u0095\u0096\7?\2\2\u0096\60\3\2\2\2\u0097\u0099\t\3\2\2\u0098\u0097"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009e\7\60\2\2\u009d\u009f\t\3\2\2\u009e\u009d\3"+
		"\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\62\3\2\2\2\u00a2\u00a3\7\62\2\2\u00a3\64\3\2\2\2\u00a4\u00a5\7}\2\2\u00a5"+
		"\66\3\2\2\2\u00a6\u00a7\7\177\2\2\u00a78\3\2\2\2\u00a8\u00a9\7h\2\2\u00a9"+
		"\u00aa\7w\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7e\2\2\u00ac\u00ad\7v\2\2"+
		"\u00ad\u00ae\7k\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7p\2\2\u00b0:\3\2\2"+
		"\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7p\2\2\u00b4<\3\2"+
		"\2\2\u00b5\u00b6\7e\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7u\2\2\u00b8>\3"+
		"\2\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7d\2\2\u00bb\u00bc\7u\2\2\u00bc"+
		"@\3\2\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7p\2\2\u00c0"+
		"B\3\2\2\2\u00c1\u00c2\7y\2\2\u00c2\u00c3\7j\2\2\u00c3\u00c4\7g\2\2\u00c4"+
		"\u00c5\7t\2\2\u00c5\u00c6\7g\2\2\u00c6D\3\2\2\2\u00c7\u00c8\7(\2\2\u00c8"+
		"F\3\2\2\2\u00c9\u00ca\7~\2\2\u00caH\3\2\2\2\u00cb\u00cc\7#\2\2\u00ccJ"+
		"\3\2\2\2\u00cd\u00ce\7i\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7q\2\2\u00d0"+
		"\u00d1\7d\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7n\2\2\u00d3L\3\2\2\2\u00d4"+
		"\u00d5\7y\2\2\u00d5\u00d6\7j\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7n\2\2"+
		"\u00d8\u00d9\7g\2\2\u00d9N\3\2\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7g\2"+
		"\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7t\2\2\u00df\u00e0"+
		"\7p\2\2\u00e0P\3\2\2\2\u00e1\u00e3\t\4\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e9\3\2\2\2\u00e6"+
		"\u00e8\t\5\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00eaR\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ee"+
		"\t\6\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0T\3\2\2\2\u00f1\u00f2\7\61\2\2\u00f2\u00f3\7,\2\2"+
		"\u00f3\u00f7\3\2\2\2\u00f4\u00f6\13\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\u00fb\7,\2\2\u00fb\u00fc\7\61\2\2\u00fcV\3\2\2\2"+
		"\u00fd\u0101\7%\2\2\u00fe\u0100\n\7\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103"+
		"\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102X\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\f\2}\u0082\u009a\u00a0\u00e4\u00e9\u00ef\u00f7\u0101\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}