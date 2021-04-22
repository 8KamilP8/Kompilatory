grammar Calculator;

/*
 * Tokens (terminal)
 */
POW: '^';
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
INT    : [1-9]+[0-9]*;
DOUBLE : [0-9]+'.'[0-9]+;
ZERO:'0';
BEGIN:'begin';
END:'end';
FUNCTION:'function';
real_number
    : DOUBLE
    | INT
    | ZERO
    ;

signed_real_number : real_number | '-'real_number;
complex_number : signed_real_number | signed_real_number '+' real_number 'i' | signed_real_number '-' real_number 'i';
NAME : [a-zA-Z]+[a-zA-Z0-9]*;
WHITESPACE: [ \r\n\t]+;
COMMENT
    : '/*' .*? '*/' -> skip
;
LINE_COMMENT
    : '//' ~[\r\n]* -> skip
;
variable: NAME;
variables: variable | variable ',' variables;
right_assignments: right_assignment ',' right_assignments | right_assignment;
function_call: NAME '(' right_assignments ')'
                  | ADD '('right_assignment ',' right_assignment')'
                  | MUL '('right_assignment ',' right_assignment')'
                  | DIV '('right_assignment ',' right_assignment')'
                  | SUB '('right_assignment ',' right_assignment')'
                  | POW '('right_assignment ',' right_assignment')';
right_assignment: function_call | variable | complex_number;
assignment: variable '=' right_assignment;
instruction: function_call ';' | assignment ';';
instructions: instruction WHITESPACE instructions | instruction;
function_body : BEGIN WHITESPACE instructions WHITESPACE END;
function : FUNCTION WHITESPACE NAME '(' variables ')' WHITESPACE function_body;


start : program_elements;
program_elements: program_element program_elements | program_element;
program_element : function | instructions;
