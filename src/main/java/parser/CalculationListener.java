package parser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Stack;

public class CalculationListener extends CalculatorBaseListener {
    /**
     * A stack is used to track what numbers
     * we have seen last. This is our only
     * means of communicating values.
     *
     * The right number in
     * an operation is always the last one seen or
     * calculated for that operation. Because a stack
     * works via Last In First Out,
     * the right number should be "popped" off first.
     */
    private Stack<Double> stack = new Stack<>();




    /**
     * The last value on the stack is the result of all
     * applied calculations.
     *
     * @return Double
     */
    public Double getResult() {
        return this.stack.pop();
    }

    @Override
    public void enterReal_number(CalculatorParser.Real_numberContext ctx) {
        super.enterReal_number(ctx);
    }

    @Override
    public void exitReal_number(CalculatorParser.Real_numberContext ctx) {
        super.exitReal_number(ctx);
    }

    @Override
    public void enterSigned_real_number(CalculatorParser.Signed_real_numberContext ctx) {
        super.enterSigned_real_number(ctx);
    }

    @Override
    public void exitSigned_real_number(CalculatorParser.Signed_real_numberContext ctx) {
        super.exitSigned_real_number(ctx);
    }

    @Override
    public void enterComplex_number(CalculatorParser.Complex_numberContext ctx) {
        super.enterComplex_number(ctx);
    }

    @Override
    public void exitComplex_number(CalculatorParser.Complex_numberContext ctx) {
        super.exitComplex_number(ctx);
    }

    @Override
    public void enterVariable(CalculatorParser.VariableContext ctx) {
        super.enterVariable(ctx);
    }

    @Override
    public void exitVariable(CalculatorParser.VariableContext ctx) {
        super.exitVariable(ctx);
    }

    @Override
    public void enterVariables(CalculatorParser.VariablesContext ctx) {
        super.enterVariables(ctx);
    }

    @Override
    public void exitVariables(CalculatorParser.VariablesContext ctx) {
        super.exitVariables(ctx);
    }

    @Override
    public void enterRight_assignments(CalculatorParser.Right_assignmentsContext ctx) {
        super.enterRight_assignments(ctx);
    }

    @Override
    public void exitRight_assignments(CalculatorParser.Right_assignmentsContext ctx) {
        super.exitRight_assignments(ctx);
    }

    @Override
    public void enterFunction_call(CalculatorParser.Function_callContext ctx) {
        super.enterFunction_call(ctx);
    }

    @Override
    public void exitFunction_call(CalculatorParser.Function_callContext ctx) {
        super.exitFunction_call(ctx);
    }

    @Override
    public void enterRight_assignment(CalculatorParser.Right_assignmentContext ctx) {
        super.enterRight_assignment(ctx);
    }

    @Override
    public void exitRight_assignment(CalculatorParser.Right_assignmentContext ctx) {
        super.exitRight_assignment(ctx);
    }

    @Override
    public void enterAssignment(CalculatorParser.AssignmentContext ctx) {
        super.enterAssignment(ctx);
    }

    @Override
    public void exitAssignment(CalculatorParser.AssignmentContext ctx) {
        super.exitAssignment(ctx);
    }

    @Override
    public void enterInstruction(CalculatorParser.InstructionContext ctx) {
        super.enterInstruction(ctx);
    }

    @Override
    public void exitInstruction(CalculatorParser.InstructionContext ctx) {
        super.exitInstruction(ctx);
    }

    @Override
    public void enterInstructions(CalculatorParser.InstructionsContext ctx) {
        super.enterInstructions(ctx);
    }

    @Override
    public void exitInstructions(CalculatorParser.InstructionsContext ctx) {
        super.exitInstructions(ctx);
    }

    @Override
    public void enterFunction_body(CalculatorParser.Function_bodyContext ctx) {
        super.enterFunction_body(ctx);
    }

    @Override
    public void exitFunction_body(CalculatorParser.Function_bodyContext ctx) {
        super.exitFunction_body(ctx);
    }

    @Override
    public void enterFunction(CalculatorParser.FunctionContext ctx) {
        super.enterFunction(ctx);
    }

    @Override
    public void exitFunction(CalculatorParser.FunctionContext ctx) {
        super.exitFunction(ctx);
    }

    @Override
    public void enterStart(CalculatorParser.StartContext ctx) {
        super.enterStart(ctx);
    }

    @Override
    public void exitStart(CalculatorParser.StartContext ctx) {
        super.exitStart(ctx);
    }

    @Override
    public void enterProgram_elements(CalculatorParser.Program_elementsContext ctx) {
        super.enterProgram_elements(ctx);
    }

    @Override
    public void exitProgram_elements(CalculatorParser.Program_elementsContext ctx) {
        super.exitProgram_elements(ctx);
    }

    @Override
    public void enterProgram_element(CalculatorParser.Program_elementContext ctx) {
        super.enterProgram_element(ctx);
    }

    @Override
    public void exitProgram_element(CalculatorParser.Program_elementContext ctx) {
        super.exitProgram_element(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }
}
