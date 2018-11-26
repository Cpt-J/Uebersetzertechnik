grammar Expr;


stat : expr N   # calc
| N             # newline
;

expr:
INT             # number
|'(' expr ')'   # parens
| expr '*' expr # MUL
| expr '/' expr # DIV
| expr '+' expr # ADD
| expr '-' expr # SUB
;


MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';

INT: [0-9]+
;

N: '\n'
;

OTHER: . -> skip
;