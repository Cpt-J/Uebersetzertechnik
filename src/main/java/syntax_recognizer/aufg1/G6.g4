grammar G6;
//Chomsky-Typ-2, Kontextfrei, Eindeutig

                    //priorität von oben nach unten absteigend
expr: eq | eq '=' expr                  //rechtsassoziativ, rechtsrekursiv
;

eq: comp | eq '<' comp | eq '>' comp    //linksassoziativ, rechtsrekursiv
;

comp: term |comp '+' term | comp '-' term //linksasoziativ, rechtsrekursiv
;

term: pot | term '*' pot | term '/' pot //linksassoziativ, rechtsrekursiv
;

pot: fact | fact '^' pot            //rechtsassoziativ, rechtsrekursiv
;

fact: INT | '('expr')'
;

INT: [0-9]+
;

OTHER: [ \n\t\r]+ -> skip
;


