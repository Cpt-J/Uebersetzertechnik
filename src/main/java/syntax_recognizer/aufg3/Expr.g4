grammar Expr;
//Chomsky-Typ-2, Kontextfrei, Eindeutig

expr: INT                       //Priorität von Oben nach unten Absteigend
|'(' expr ')'                   //rekursiv
|<assoc=right>expr '^' expr     //rechtsassoziativ, links- und rechtsrekursiv
|  expr '*' expr                //linksassoziativ, links- und rechtsrekursiv
| expr '/' expr                 //linksassoziativ, links- und rechtsrekursiv
| expr '+' expr                 //linksassoziativ, links- und rechtsrekursiv
| expr '-' expr                 //linksassoziativ, links- und rechtsrekursiv
| expr '<' expr                 //linksassoziativ, links- und rechtsrekursiv
| expr '>' expr                 //linksassoziativ, links- und rechtsrekursiv
| <assoc=right>expr '=' expr    //rechtsassoziativ, links- und rechtsrekursiv
;

INT: [0-9]+
;

OTHER: . -> skip
;