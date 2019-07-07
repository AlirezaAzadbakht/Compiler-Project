grammar MiniCpp;

parse
 : block EOF
 ;

block
 : stat*
 ;

stat
 : assignment
 | declare
 | if_stat
 | while_stat
 | do_while_stat
 | for_stat
 | switch_stat
 | log
 | OTHER {System.err.println("unknown char: " + $OTHER.text);}
 ;

switch_stat
 :SWITCH OPAR ID CPAR OBRACE (case_stat)+ CBRACE
 ;

case_stat
 : CASE atom DDOT stat BREAK SCOL
 ;

for_stat
 :FOR OPAR declare SCOL expr SCOL for_ass CPAR stat_block
 ;

for_ass
 :ID ASSIGN expr
 |ID (PP | MM)
 |ID (ME | PE | DE | miE) atom
 ;


do_while_stat
 : DO stat_block WHILE expr 
 ;

assignment
 : ID ASSIGN expr SCOL
 | ID (MM | PP)  SCOL
 | ID (ME | PE | DE | miE) atom SCOL
 ;

declare
 : type ID (ASSIGN expr)? SCOL?
 ;

type
 :IntType
 |FloatType
 |BoolType
 |CharType
 ;

if_stat
 : IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?
 ;

condition_block
 : expr stat_block
 ;

stat_block
 : OBRACE block CBRACE
 | stat
 ;

while_stat
 : WHILE expr stat_block
 ;

log
 : LOG expr SCOL
 ;

expr
 : <assoc=right> expr POW expr           #powExpr
 | MINUS expr                           #unaryMinusExpr
 | NOT expr                             #notExpr
 | expr op=(MULT | DIV | MOD) expr      #multiplicationExpr
 | expr op=(PLUS | MINUS) expr          #additiveExpr
 | expr op=(LTEQ | GTEQ | LT | GT) expr #relationalExpr
 | expr op=(EQ | NEQ) expr              #equalityExpr
 | expr AND expr                        #andExpr
 | expr OR expr                         #orExpr
 | atom                                 #atomExpr
 ;


atom
 : OPAR expr CPAR #parExpr
 | (INT | FLOAT)  #numberAtom
 | (TRUE | FALSE) #booleanAtom
 | ID             #idAtom
 | STRING         #stringAtom
 | NIL            #nilAtom
 ;

OR : '||';
AND : '&&';
EQ : '==';
PE : '+=';
miE : '-=';
ME : '*=';
DE : '/=';
PP : '++';
MM : '--';
NEQ : '!=';
GT : '>';
LT : '<';
GTEQ : '>=';
LTEQ : '<=';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
POW : '^';
NOT : '!';

SCOL : ';';
DDOT : ':';
ASSIGN : '=';
OPAR : '(';
CPAR : ')';
OBRACE : '{';
CBRACE : '}';

IntType : 'int';
FloatType : 'float';
BoolType : 'bool';
CharType : 'char';

TRUE : 'true';
FALSE : 'false';
NIL : 'nil';
IF : 'if';
ELSE : 'else';
FOR : 'for';
WHILE : 'while';
DO : 'do';
LOG : 'log';
SWITCH : 'switch';
CASE : 'case';
BREAK : 'break';

ID
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

INT
 : [0-9]+
 ;

FLOAT
 : [0-9]+ '.' [0-9]* 
 | '.' [0-9]+
 ;

STRING
 : '"' (~["\r\n] | '""')* '"'
 ;

COMMENT
 : '#' ~[\r\n]* -> skip
 ;

SPACE
 : [ \t\r\n] -> skip
 ;

OTHER
 : . 
 ;