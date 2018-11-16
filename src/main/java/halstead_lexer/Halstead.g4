lexer grammar Halstead;

IGNORE: COMMENT | CLOSING_BRACKET | ':' | 'do' | INCLUDE_LINE
;

OPERATOR: SCSPEC | TYPE_QUAL | RESERVED | OPERATORS
;

OPERAND:  TYPESPEC | CONSTANT | IDENTIFIER
;

OTHER: . -> skip
;

fragment Digit : [0-9]
;
fragment Alphabetlical : [a-zA-Z]
;
fragment NEWLINE : [\r\n]
;
//OPERATOR
fragment SCSPEC : 'auto'| 'extern'| 'inline'| 'register'| 'static'| 'typedef'| 'virtual'|'mutable'
;
fragment TYPE_QUAL : 'const' | 'friend' | 'volatile'
;
fragment RESERVED : 'asm' | 'break' | 'case' | 'class' | 'continue' |'default' | 'delete' | 'while'WS'(' |
    'else' | 'enum' | 'for'WS'(' | 'goto' | 'if'WS'(' | 'new' | 'operator' |'private' | 'protected' | 'public' |
    'return' | 'sizeof' | 'struct' | 'switch'WS'(' | 'this' | 'union' |'namespace' | 'using' | 'try' | 'catch' |
    'throw' | 'const_cast' | 'static_cast' | 'dynamic_cast'|'reinterpret_cast' | 'typeid' | 'template' | 'explicit' |
    'true' | 'false' | 'typname'
;
fragment OPERATORS : '!'|'!='|'%'|'%='|'&'|'&&'|'&='|'('|'*'|'*='|'+'|'++'|'+='|','|'-'|'--'|
    '-='|'->'|'...'|'/'|'/='|'::'|'<'|'<<'|'<<='|'<='|'=='|'>'|'>='|'>>'|'>>='|'?'|'['|'^'|
    '^='|'{'|'||'|'='|'~'|';'
;


fragment WS : [ \t\r\n]*
;
//OPERAND
fragment IDENTIFIER : Alphabetlical (Alphabetlical|Digit)*
;
fragment TYPESPEC: 'bool' | 'char' | 'double' | 'float' | 'int' | 'long' | 'short' | 'signed' | 'unsigned' | 'void'
;
fragment CONSTANT: Digit+ | Digit+ '.' Digit+ | '"' .*? '"' | '\'\\'.'\'' | '\''.'\''
;


fragment COMMENT : '//' .*? NEWLINE | '/*' .*? '*/'
;
fragment CLOSING_BRACKET : ')' | ']' | '}'
;
fragment INCLUDE_LINE :'#' .*? NEWLINE
;

