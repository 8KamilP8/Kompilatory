grammar Calculator;

/*
 * Tokens (terminal)
 */
POW: '^';
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';

RealPart: 'Re';
ImaginaryPart: 'Im';
Successor: 's';
INT    : [1-9]+[0-9]*;
MOD: '%';
Equal:'==';
GreaterEqual:'>=';
LowerEqual:'<=';
Lower: '<';
Greater: '>';
NotEqual:'!=';
DOUBLE : [0-9]+'.'[0-9]+;
ZERO:'0';
BEGIN:'{';
END:'}';
FUNCTION:'function';
SIN:'sin';
COS:'cos';
ABS:'abs';
TAN:'tan';
WHERE: 'where';
AND: '&';
OR: '|';
NOT: '!';
GLOBAL: 'global';
WHILE: 'while';
start : WHITESPACE* program_elements WHITESPACE*;
pattern_matching : logic_function_name '(' pattern_matching_arg ',' pattern_matching_arg ')' | NOT '(' pattern_matching_arg ')';

logic_function_name :  OR | AND | Equal | GreaterEqual | LowerEqual | Lower | Greater | NotEqual;
pattern_matching_arg: right_assignment | pattern_matching;
real_number
    : DOUBLE
    | INT
    | ZERO
    ;
function_name: NAME | POW | DIV | ADD | SUB | RealPart | ImaginaryPart | Successor | MOD | SIN | COS | ABS | TAN;
signed_real_number : real_number | '-'real_number;
complex_number : signed_real_number | signed_real_number '+' real_number 'i' | signed_real_number '-' real_number 'i';
NAME : [a-zA-Z]+[a-zA-Z0-9]*;
WHITESPACE: [ \r\n\t]+;
COMMENT
    : '/*' .*? '*/';
LINE_COMMENT
    : '#' ~( '\r' | '\n' )*;

variable: NAME | GLOBAL WHITESPACE NAME;

variables: variable | variable ',' variables;
right_assignments: right_assignment ',' right_assignments | right_assignment;
func_arg: function_call | variable | complex_number | function_name;
func_args: func_arg ',' func_args | func_arg;

function_call:      NAME '()'
                  | NAME '(' func_args ')'
                  | ADD '('func_arg ',' func_arg')'
                  | MUL '('func_arg ',' func_arg')'
                  | DIV '('func_arg ',' func_arg')'
                  | SUB '('func_arg ',' func_arg')'
                  | POW '('func_arg ',' func_arg')'
                  | MOD '('func_arg ',' func_arg')'
                  | ABS '('func_arg ')'
                  | SIN '('func_arg ')'
                  | COS '('func_arg ')'
                  | TAN '('func_arg ')'
                  | RealPart '('func_arg ')'
                  | ImaginaryPart '('func_arg ')'
                  | Successor'('func_arg ')';

right_assignment: function_call | variable | complex_number | function_name;
assignment: variable WHITESPACE* '=' WHITESPACE* right_assignment;
whileLoop: WHILE '(' pattern_matching ')' WHITESPACE function_body;
instruction: function_call ';' | assignment ';' |  whileLoop ;
instructions: instruction WHITESPACE instructions | instruction;
function_body : BEGIN WHITESPACE instructions WHITESPACE END;
function : FUNCTION WHITESPACE NAME '(' variables? ')' WHITESPACE WHERE'(' pattern_matching ')' WHITESPACE function_body
         | FUNCTION WHITESPACE NAME '(' variables? ')' WHITESPACE function_body
         | FUNCTION WHITESPACE NAME '()' WHITESPACE function_body;
program_instructions: program_instruction WHITESPACE program_instructions | program_instruction;
program_instruction: instruction;
program_elements: program_element WHITESPACE program_elements | program_element;
program_element : function | program_instructions | COMMENT | LINE_COMMENT;
