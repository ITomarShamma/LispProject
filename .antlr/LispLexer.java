// Generated from c:/antlr/LispProject/LispLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LispLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, DEFUN=2, QUOTE=3, DEFPARAMETER=4, FORMAT=5, IDENTIFIER=6, STRING=7, 
		WS=8, SYMBOL=9, PLUS=10, MINUS=11, MULT=12, DIV=13, LPAREN=14, RPAREN=15, 
		COLON=16, EXCLAMATION=17, TILDE=18, BACKSLASH=19, SPECIAL_CHAR=20, ESCAPED_BACKSLASH=21, 
		LESS_EQUAL=22, GREATER_EQUAL=23, LESS_THAN=24, GREATER_THAN=25, FORMAT_SPEC=26, 
		COMMENT=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "DEFUN", "QUOTE", "DEFPARAMETER", "FORMAT", "IDENTIFIER", "STRING", 
			"ESC", "HEX", "WS", "SYMBOL", "PLUS", "MINUS", "MULT", "DIV", "LPAREN", 
			"RPAREN", "COLON", "EXCLAMATION", "TILDE", "BACKSLASH", "SPECIAL_CHAR", 
			"ESCAPED_BACKSLASH", "LESS_EQUAL", "GREATER_EQUAL", "LESS_THAN", "GREATER_THAN", 
			"FORMAT_SPEC", "COMMENT", "DIGIT", "LETTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'defun'", "'quote'", "'defparameter'", "'format'", null, 
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'('", "')'", "':'", "'!'", 
			"'~'", "'\\'", null, "'\\\\'", "'<='", "'>='", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "DEFUN", "QUOTE", "DEFPARAMETER", "FORMAT", "IDENTIFIER", 
			"STRING", "WS", "SYMBOL", "PLUS", "MINUS", "MULT", "DIV", "LPAREN", "RPAREN", 
			"COLON", "EXCLAMATION", "TILDE", "BACKSLASH", "SPECIAL_CHAR", "ESCAPED_BACKSLASH", 
			"LESS_EQUAL", "GREATER_EQUAL", "LESS_THAN", "GREATER_THAN", "FORMAT_SPEC", 
			"COMMENT"
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


	public LispLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LispLexer.g4"; }

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
		"\u0004\u0000\u001b\u00bd\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"g\b\u0005\n\u0005\f\u0005j\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006o\b\u0006\n\u0006\f\u0006r\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007~\b\u0007\u0001\b\u0001\b\u0001\t"+
		"\u0004\t\u0083\b\t\u000b\t\f\t\u0084\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u00b3\b\u001c\n\u001c\f\u001c\u00b6"+
		"\t\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0000\u0000\u001f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\u0000\u0011\u0000\u0013\b\u0015\t\u0017"+
		"\n\u0019\u000b\u001b\f\u001d\r\u001f\u000e!\u000f#\u0010%\u0011\'\u0012"+
		")\u0013+\u0014-\u0015/\u00161\u00173\u00185\u00197\u001a9\u001b;\u0000"+
		"=\u0000\u0001\u0000\u000b\u0002\u0000--__\u0002\u0000\"\"\\\\\b\u0000"+
		"\"\"//\\\\bbffnnrrtt\u0003\u000009AFaf\u0003\u0000\t\n\r\r  \u0007\u0000"+
		"!!#&(/:@[[]`{~\u0003\u0000!!%%~~\u0003\u0000%%AZaz\u0002\u0000\n\n\r\r"+
		"\u0001\u000009\u0002\u0000AZaz\u00c0\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0001"+
		"?\u0001\u0000\u0000\u0000\u0003B\u0001\u0000\u0000\u0000\u0005H\u0001"+
		"\u0000\u0000\u0000\u0007N\u0001\u0000\u0000\u0000\t[\u0001\u0000\u0000"+
		"\u0000\u000bb\u0001\u0000\u0000\u0000\rk\u0001\u0000\u0000\u0000\u000f"+
		"u\u0001\u0000\u0000\u0000\u0011\u007f\u0001\u0000\u0000\u0000\u0013\u0082"+
		"\u0001\u0000\u0000\u0000\u0015\u0088\u0001\u0000\u0000\u0000\u0017\u008a"+
		"\u0001\u0000\u0000\u0000\u0019\u008c\u0001\u0000\u0000\u0000\u001b\u008e"+
		"\u0001\u0000\u0000\u0000\u001d\u0090\u0001\u0000\u0000\u0000\u001f\u0092"+
		"\u0001\u0000\u0000\u0000!\u0094\u0001\u0000\u0000\u0000#\u0096\u0001\u0000"+
		"\u0000\u0000%\u0098\u0001\u0000\u0000\u0000\'\u009a\u0001\u0000\u0000"+
		"\u0000)\u009c\u0001\u0000\u0000\u0000+\u009e\u0001\u0000\u0000\u0000-"+
		"\u00a0\u0001\u0000\u0000\u0000/\u00a3\u0001\u0000\u0000\u00001\u00a6\u0001"+
		"\u0000\u0000\u00003\u00a9\u0001\u0000\u0000\u00005\u00ab\u0001\u0000\u0000"+
		"\u00007\u00ad\u0001\u0000\u0000\u00009\u00b0\u0001\u0000\u0000\u0000;"+
		"\u00b9\u0001\u0000\u0000\u0000=\u00bb\u0001\u0000\u0000\u0000?@\u0005"+
		"i\u0000\u0000@A\u0005f\u0000\u0000A\u0002\u0001\u0000\u0000\u0000BC\u0005"+
		"d\u0000\u0000CD\u0005e\u0000\u0000DE\u0005f\u0000\u0000EF\u0005u\u0000"+
		"\u0000FG\u0005n\u0000\u0000G\u0004\u0001\u0000\u0000\u0000HI\u0005q\u0000"+
		"\u0000IJ\u0005u\u0000\u0000JK\u0005o\u0000\u0000KL\u0005t\u0000\u0000"+
		"LM\u0005e\u0000\u0000M\u0006\u0001\u0000\u0000\u0000NO\u0005d\u0000\u0000"+
		"OP\u0005e\u0000\u0000PQ\u0005f\u0000\u0000QR\u0005p\u0000\u0000RS\u0005"+
		"a\u0000\u0000ST\u0005r\u0000\u0000TU\u0005a\u0000\u0000UV\u0005m\u0000"+
		"\u0000VW\u0005e\u0000\u0000WX\u0005t\u0000\u0000XY\u0005e\u0000\u0000"+
		"YZ\u0005r\u0000\u0000Z\b\u0001\u0000\u0000\u0000[\\\u0005f\u0000\u0000"+
		"\\]\u0005o\u0000\u0000]^\u0005r\u0000\u0000^_\u0005m\u0000\u0000_`\u0005"+
		"a\u0000\u0000`a\u0005t\u0000\u0000a\n\u0001\u0000\u0000\u0000bh\u0003"+
		"=\u001e\u0000cg\u0003=\u001e\u0000dg\u0003;\u001d\u0000eg\u0007\u0000"+
		"\u0000\u0000fc\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fe\u0001"+
		"\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000i\f\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000kp\u0005\"\u0000\u0000lo\u0003\u000f\u0007\u0000mo\b\u0001\u0000"+
		"\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000or\u0001\u0000"+
		"\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001"+
		"\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000st\u0005\"\u0000\u0000t\u000e"+
		"\u0001\u0000\u0000\u0000u}\u0005\\\u0000\u0000v~\u0007\u0002\u0000\u0000"+
		"wx\u0005u\u0000\u0000xy\u0003\u0011\b\u0000yz\u0003\u0011\b\u0000z{\u0003"+
		"\u0011\b\u0000{|\u0003\u0011\b\u0000|~\u0001\u0000\u0000\u0000}v\u0001"+
		"\u0000\u0000\u0000}w\u0001\u0000\u0000\u0000~\u0010\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0007\u0003\u0000\u0000\u0080\u0012\u0001\u0000\u0000"+
		"\u0000\u0081\u0083\u0007\u0004\u0000\u0000\u0082\u0081\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0006\t\u0000\u0000\u0087\u0014\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0007\u0005\u0000\u0000\u0089\u0016\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0005+\u0000\u0000\u008b\u0018\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0005-\u0000\u0000\u008d\u001a\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0005*\u0000\u0000\u008f\u001c\u0001\u0000\u0000\u0000\u0090\u0091\u0005"+
		"/\u0000\u0000\u0091\u001e\u0001\u0000\u0000\u0000\u0092\u0093\u0005(\u0000"+
		"\u0000\u0093 \u0001\u0000\u0000\u0000\u0094\u0095\u0005)\u0000\u0000\u0095"+
		"\"\u0001\u0000\u0000\u0000\u0096\u0097\u0005:\u0000\u0000\u0097$\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0005!\u0000\u0000\u0099&\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0005~\u0000\u0000\u009b(\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005\\\u0000\u0000\u009d*\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0007\u0006\u0000\u0000\u009f,\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005"+
		"\\\u0000\u0000\u00a1\u00a2\u0005\\\u0000\u0000\u00a2.\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0005<\u0000\u0000\u00a4\u00a5\u0005=\u0000\u0000\u00a5"+
		"0\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005>\u0000\u0000\u00a7\u00a8\u0005"+
		"=\u0000\u0000\u00a82\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005<\u0000"+
		"\u0000\u00aa4\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005>\u0000\u0000\u00ac"+
		"6\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005~\u0000\u0000\u00ae\u00af\u0007"+
		"\u0007\u0000\u0000\u00af8\u0001\u0000\u0000\u0000\u00b0\u00b4\u0005;\u0000"+
		"\u0000\u00b1\u00b3\b\b\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0006\u001c\u0000\u0000"+
		"\u00b8:\u0001\u0000\u0000\u0000\u00b9\u00ba\u0007\t\u0000\u0000\u00ba"+
		"<\u0001\u0000\u0000\u0000\u00bb\u00bc\u0007\n\u0000\u0000\u00bc>\u0001"+
		"\u0000\u0000\u0000\b\u0000fhnp}\u0084\u00b4\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}