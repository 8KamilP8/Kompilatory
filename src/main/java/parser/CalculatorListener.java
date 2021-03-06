// Generated from Calculator.g4 by ANTLR 4.9
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CalculatorParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CalculatorParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#pattern_matching}.
	 * @param ctx the parse tree
	 */
	void enterPattern_matching(CalculatorParser.Pattern_matchingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#pattern_matching}.
	 * @param ctx the parse tree
	 */
	void exitPattern_matching(CalculatorParser.Pattern_matchingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#logic_function_name}.
	 * @param ctx the parse tree
	 */
	void enterLogic_function_name(CalculatorParser.Logic_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#logic_function_name}.
	 * @param ctx the parse tree
	 */
	void exitLogic_function_name(CalculatorParser.Logic_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#pattern_matching_arg}.
	 * @param ctx the parse tree
	 */
	void enterPattern_matching_arg(CalculatorParser.Pattern_matching_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#pattern_matching_arg}.
	 * @param ctx the parse tree
	 */
	void exitPattern_matching_arg(CalculatorParser.Pattern_matching_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#real_number}.
	 * @param ctx the parse tree
	 */
	void enterReal_number(CalculatorParser.Real_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#real_number}.
	 * @param ctx the parse tree
	 */
	void exitReal_number(CalculatorParser.Real_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(CalculatorParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(CalculatorParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#signed_real_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_real_number(CalculatorParser.Signed_real_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#signed_real_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_real_number(CalculatorParser.Signed_real_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#complex_number}.
	 * @param ctx the parse tree
	 */
	void enterComplex_number(CalculatorParser.Complex_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#complex_number}.
	 * @param ctx the parse tree
	 */
	void exitComplex_number(CalculatorParser.Complex_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CalculatorParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CalculatorParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(CalculatorParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(CalculatorParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#right_assignments}.
	 * @param ctx the parse tree
	 */
	void enterRight_assignments(CalculatorParser.Right_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#right_assignments}.
	 * @param ctx the parse tree
	 */
	void exitRight_assignments(CalculatorParser.Right_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#func_arg}.
	 * @param ctx the parse tree
	 */
	void enterFunc_arg(CalculatorParser.Func_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#func_arg}.
	 * @param ctx the parse tree
	 */
	void exitFunc_arg(CalculatorParser.Func_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#func_args}.
	 * @param ctx the parse tree
	 */
	void enterFunc_args(CalculatorParser.Func_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#func_args}.
	 * @param ctx the parse tree
	 */
	void exitFunc_args(CalculatorParser.Func_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(CalculatorParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(CalculatorParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#right_assignment}.
	 * @param ctx the parse tree
	 */
	void enterRight_assignment(CalculatorParser.Right_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#right_assignment}.
	 * @param ctx the parse tree
	 */
	void exitRight_assignment(CalculatorParser.Right_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CalculatorParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CalculatorParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(CalculatorParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(CalculatorParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(CalculatorParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(CalculatorParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(CalculatorParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(CalculatorParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(CalculatorParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(CalculatorParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CalculatorParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CalculatorParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#program_instructions}.
	 * @param ctx the parse tree
	 */
	void enterProgram_instructions(CalculatorParser.Program_instructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#program_instructions}.
	 * @param ctx the parse tree
	 */
	void exitProgram_instructions(CalculatorParser.Program_instructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#program_instruction}.
	 * @param ctx the parse tree
	 */
	void enterProgram_instruction(CalculatorParser.Program_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#program_instruction}.
	 * @param ctx the parse tree
	 */
	void exitProgram_instruction(CalculatorParser.Program_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#program_elements}.
	 * @param ctx the parse tree
	 */
	void enterProgram_elements(CalculatorParser.Program_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#program_elements}.
	 * @param ctx the parse tree
	 */
	void exitProgram_elements(CalculatorParser.Program_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#program_element}.
	 * @param ctx the parse tree
	 */
	void enterProgram_element(CalculatorParser.Program_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#program_element}.
	 * @param ctx the parse tree
	 */
	void exitProgram_element(CalculatorParser.Program_elementContext ctx);
}