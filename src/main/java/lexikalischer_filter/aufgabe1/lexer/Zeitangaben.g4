

lexer grammar Zeitangaben;

T : Hour  Minute (Second?) ;

fragment Second : ':'[0-5][0-9] ;
fragment Minute : ':'[0-5][0-9] ;
fragment Hour : [0-9] | [0-1][0-9] | '2'[0-4] ;


OTHER : .-> skip ;


