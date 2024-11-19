lexer grammar LispLexer;

// Keywords
IF: 'if';
DEFUN: 'defun';
QUOTE: 'quote';
DEFPARAMETER: 'defparameter';
FORMAT: 'format';

// Identifiers
IDENTIFIER: LETTER (LETTER | DIGIT | '-' | '_')*;

// Strings with escape sequences
STRING
   : '"' (ESC | ~["\\])* '"'
   ;

fragment ESC
   : '\\' (["\\/bfnrt] | 'u' HEX HEX HEX HEX)
   ;

fragment HEX: [0-9a-fA-F];



// Whitespace (skip)
WS: [ \t\r\n]+ -> skip;


// Symbols
SYMBOL: [!@#$%^&*()_+={}[\]:;,.<>?/|~`-];

// Operators and Parentheses
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
LPAREN: '(';
RPAREN: ')';
COLON: ':';
EXCLAMATION: '!';
TILDE: '~';
BACKSLASH: '\\';
SPECIAL_CHAR: [~!%];
//ESCAPED_QUOTE: '\"';
ESCAPED_BACKSLASH: '\\\\';



// Comparison Operators
LESS_EQUAL: '<=';
GREATER_EQUAL: '>=';
LESS_THAN: '<';
GREATER_THAN: '>';

// Format specifiers for Lisp
FORMAT_SPEC: '~' [%a-zA-Z];

// Comments
COMMENT: ';' ~[\r\n]* -> skip;

fragment DIGIT: [0-9];
fragment LETTER: [a-zA-Z];






// lexer grammar LispLexer;



// IF: 'if';
// DEFUN: 'defun';
// QUOTE: 'quote';


// IDENTIFIER: LETTER (LETTER | DIGIT)*;


// NUMBER: '-'? DIGIT+;


// PLUS: '+';
// MINUS: '-';
// MULT: '*';
// DIV: '/';
// LPAREN: '(';
// RPAREN: ')';


// LESS_EQUAL: '<=';  
// GREATER_EQUAL: '>=';  
// LESS_THAN: '<';
// GREATER_THAN: '>';


// COMMENT: ';' ~[\r\n]* -> skip;


// WS: [ \r\n\t]+ -> skip;


// fragment LETTER: [a-zA-Z];
// fragment DIGIT: [0-9];








