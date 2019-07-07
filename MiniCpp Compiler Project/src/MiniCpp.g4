grammar MiniCpp;

parse
 : (function_declare | function_body)*  main_stat (function_body)* EOF
 ;

function_body
 : type ID OPAR (input_param)* CPAR OBRACE block endof_body
 | voidType ID OPAR (input_param)* CPAR OBRACE block endof_body
 ;

endof_body
 : CBRACE
 ;


function_declare
 : type ID OPAR (input_param)* CPAR SCOL
 | voidType ID OPAR (input_param)* CPAR SCOL
 ;

input_param
 : type ID
 | type ID VIR
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
 | cout_stat
 | cin_stat
 | plusplus_stat
 | minusminus_stat
 | function_call
 | return_stat
 | OTHER {System.err.println("unknown char: " + $OTHER.text);}
 ;


function_call
: ID OPAR (atom VIR)* atom CPAR SCOL
| ID OPAR (atom VIR)* atom CPAR 
;


return_stat
 : RETURN (atom)? SCOL
 ;


cout_stat
 : COUT COUTS expr SCOL
 ;

cin_stat
 : CIN CINS ID SCOL 
 ;

main_stat
 : type MAIN OPAR CPAR OBRACE block endof_body
 ;

switch_stat
 :SWITCH OPAR ID CPAR OBRACE (case_stat)+ default_stat? CBRACE
 ;

default_stat
 : DEFAULT DDOT block (BREAK SCOL)?
 ;

case_stat
 : CASE atom DDOT block (BREAK SCOL)?
 ;

for_stat
 :FOR OPAR inDeclare SCOL expr SCOL for_ass CPAR stat_block
 ;

for_ass
 :ID ASSIGN? expr                                    
 ;


do_while_stat
 : DO stat_block WHILE expr SCOL
 ;

assignment
 : ID ASSIGN expr SCOL
 ;

plusplus_stat
 : ID PP SCOL
 ;

minusminus_stat
 : ID MM SCOL
 ;


declare
 : type ID (ASSIGN expr)? SCOL
 ;

inDeclare
 :type ID ASSIGN expr 
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
 | PP                                   #plusplus
 | MM                                   #minusminus
 | atom                                 #atomExpr
 | function_call                        #function_callExpr
 ;


atom
 : OPAR expr CPAR #parExpr
 //| (INT | FLOAT)  #numberAtom
 | (TRUE | FALSE) #booleanAtom
 | ID             #idAtom
 | STRING         #stringAtom
 | NIL            #nilAtom
 | CHAR           #charAtom
 | FLOAT          #floatAtom
 | INT            #intAtom
 ;

OR : '||';
AND : '&&';
EQ : '==';
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
VIR : ',';

CINS : '>>';
COUTS : '<<';

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
voidType : 'void';

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
MAIN : 'main';
DEFAULT : 'default';
RETURN : 'return';

COUT : 'cout';
CIN : 'cin';

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

CHAR
 : '\'' (~["\r\n] | '""') '\''
 ;

COMMENT
 : '//' ~[\r\n]* -> skip
 ;

BlockComment
   : '/*' .*? '*/' -> skip
   ;

SPACE
 : [ \t\r\n] -> skip
 ;

OTHER
 : . 
 ;
