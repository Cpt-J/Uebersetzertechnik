grammar Expr;



stat returns [double v]
: expr N   {$v = $expr.v;}
| N        {$v = 0;}
;

expr returns [double v]
:INT            {$v = $INT.int;}
|'(' expr ')'   {$v = $expr.v;}
| a=expr '*' b=expr {$v = $a.v * $b.v;}
| a=expr '/' b=expr {$v = (double)$a.v / $b.v;}
| a=expr '+' b=expr {$v = $a.v + $b.v;}
| a=expr '-' b=expr {$v = $a.v - $b.v;}
;

INT: [0-9]+
;

N: '\r'?'\n'
;

OTHER: . -> skip
;