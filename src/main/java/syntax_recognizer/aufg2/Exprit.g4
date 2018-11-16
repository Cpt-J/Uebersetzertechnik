grammar Exprit;
//Chomsky-Typ-2, Kontextfrei, nicht eindeutig

prog: stat+
;

stat: expr NL | NL
;
                                    //Priorität von Oben nach unten Absteigend
expr: eq ('=' expr)*                //rechtsassoziativ, rechtsrekursiv
;

eq:comp ('<' comp | '>' comp)*      //linksassoziativ, nicht rekursiv
;

comp: term ('+' term | '-' term)*   //linksassoziativ, nicht rekursiv
;

term: pot ( '*' pot | '/' pot)*     //linksassoziativ, nicht rekursiv
;

pot: fact ('^' pot)*                //rechtsassoziativ, rechtsrekursiv
;

fact: '+' fact | '-' fact           //rechtsassoziativ, nicht rekursiv
| '(' expr')' |INT
;

NL: '\n'
;

INT: [0-9]+
;

OTHER: . -> skip
;