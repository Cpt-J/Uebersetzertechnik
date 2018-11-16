lexer grammar Ips;

Ip : Block Delimiter Block Delimiter Block Delimiter Block ;
fragment Block :   | Digits | [1-9] Digits | '1' Digits Digits | '2' [0-4] Digits | '25'[0-5];
fragment Delimiter : '.';
fragment Digits : [0-9] ;
OTHER : . -> skip;