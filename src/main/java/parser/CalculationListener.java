package parser;

import data.*;
import javafx.util.Pair;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import plotter.MatrixAggregator;

import java.util.ArrayList;
import java.util.HashMap;
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

    private HashMap<PredicateHeader, ArrayList<Pair<Where, FunctionBody>>> functionRegister = new HashMap<PredicateHeader, ArrayList<Pair<Where,FunctionBody>>>();

    private HashMap<String,ComplexDouble> globalVariableRegister = new HashMap<String,ComplexDouble>();
    private HashMap<String,ComplexDouble> localVariableRegister = new HashMap<String,ComplexDouble>();

    private Stack<ComplexDouble> numberStack = new Stack<>();
    private Stack<FunctionCallHeader> functionStack = new Stack<>();
    private Stack<Instruction> instructionStack = new Stack<>();
    private MatrixAggregator aggregator;

    private boolean isInBody = false;
    private boolean isInInstruction = false;
    private boolean isInFunctionCall = false;
    private boolean isFunctionOnStack = false;
    private boolean isNumberOnStack = false;

    private FirstPhaseStack stack;
    private Register register;
    public CalculationListener(MatrixAggregator aggregator) {
        this.aggregator = aggregator;
        register = new Register(functionRegister,globalVariableRegister,localVariableRegister);
        stack = new FirstPhaseStack();
    }

    public boolean CheckInstructionStack(){
        var result = true;
        for (var ins : instructionStack) {
            if(!ins.check()){
                result = false;
            }
        }
        return result;
    }

    public void RunStack(){
        instructionStack.forEach(ins -> System.out.println(ins.toString() + "   ->  " + ins.Do()));
    }
    private ComplexDouble functionCall(String funName, ComplexDouble[] args){
        var functions = functionRegister.get(new PredicateHeader(funName,new String[args.length]));
        for (var p: functions) {
            if(p.getKey().evaluate()){
                //p.getValue().Call(args);
                break;
            }
        }
        return new ComplexDouble(0.0,0.0);
    }
    public void ListInstrucionStack(){
        System.out.println("Instrucion Stack: ");
        instructionStack.forEach(e-> System.out.println(e.toString()));
    }
    public void showRegister(){
        System.out.println(functionRegister);
    }
    public void showGlobalRegister(){
        System.out.println(register.globalVariableRegister);
    }
    /**
     * The last value on the stack is the result of all
     * applied calculations.
     *
     * @return Double
     */

    @Override
    public void enterComplex_number(CalculatorParser.Complex_numberContext ctx) {
        int count = ctx.getChildCount();
        if(count == 1){
            Double realPart = Double.parseDouble(ctx.getChild(0).getText());
            stack.push(new ComplexDouble(realPart,0.0));
        }
        else if(count == 4){
            Double realPart = Double.parseDouble(ctx.getChild(0).getText());
            Double imaginaryPart;
            imaginaryPart = Double.parseDouble(ctx.getChild(2).getText());
            if(ctx.getChild(1).getText().equals("+")){
                stack.push(new ComplexDouble(realPart,imaginaryPart));
            }else{
                stack.push(new ComplexDouble(realPart,-imaginaryPart));
            }
        }
    }
    @Override
    public void enterRight_assignments(CalculatorParser.Right_assignmentsContext ctx) {

    }
    @Override public void enterVariable(CalculatorParser.VariableContext ctx) {
        Variable variable =  new Variable(ctx.getText(), register);
        stack.push(variable);
    }

    @Override public void exitVariable(CalculatorParser.VariableContext ctx) { }
    @Override
    public void exitRight_assignments(CalculatorParser.Right_assignmentsContext ctx) {
        super.exitRight_assignments(ctx);
    }

    @Override
    public void enterFunction_call(CalculatorParser.Function_callContext ctx) {

        if(isInInstruction){
            isInFunctionCall = true;
        }
        /*String functionName = ctx.getChild(0).getText();
        int length = 2;
        PredicateHeader header = new PredicateHeader(functionName, new String[length]);
        var patternMatchingList = functionRegister.get(header);
        if(functionName.equals("plot")){
            int x,y,z;
            x = Integer.parseInt(ctx.getChild(2).getChild(0).getText());
            y = Integer.parseInt(ctx.getChild(2).getChild(2).getChild(0).getText());
            z = Integer.parseInt(ctx.getChild(2).getChild(2).getChild(2).getChild(0).getText());
            aggregator.plot(x,y,z);
        }
        if(patternMatchingList == null) return;
        for (var p:patternMatchingList) {
            if(p.getKey().evaluate()){
                //p.getValue().Call();
                break;
            }
        }*/
        //check if functionName is in standard functions
        //if not:

    }

    @Override
    public void exitFunction_call(CalculatorParser.Function_callContext ctx) {
        if(ctx.getParent().getRuleIndex() == CalculatorParser.RULE_func_arg || ctx.getParent().getRuleIndex() == CalculatorParser.RULE_right_assignment){
            //as argument
            String funName = ctx.getChild(0).getText();
            if(StandardFunctions.funcNames.contains(funName)){
                int argsNum = 2;
                Argument[] args = new Argument[argsNum];
                for(int i =argsNum-1; i>=0;i--){

                    args[i] = stack.pop();
                }
                var fun = new FunctionCallHeader(funName,args,register,aggregator);
                stack.push(fun);
            }
            else{
                int argsNum=getVariablesTreeHeight(ctx.getChild(2));
                Argument[] args = new Argument[argsNum];
                for(int i =argsNum-1; i>=0;i--){

                    args[i] = stack.pop();
                }
                var fun = new FunctionCallHeader(funName,args,register,aggregator);
                stack.push(fun);
            }

        }else if (ctx.getParent().getRuleIndex() == CalculatorParser.RULE_instruction){
            String funName = ctx.getChild(0).getText();
            if(StandardFunctions.funcNames.contains(funName)){
                int argsNum = 2;
                Argument[] args = new Argument[argsNum];
                for(int i =argsNum-1; i>=0;i--){

                    args[i] = stack.pop();
                }
                var fun = new FunctionCallHeader(funName,args,register,aggregator);
                instructionStack.push(fun);
                if(ctx.getParent().getParent().getRuleIndex() == CalculatorParser.RULE_program_instruction){
                    mainInstructionStackNum++;
                }

            }else{
                int argsNum = getVariablesTreeHeight(ctx.getChild(2));
                Argument[] args = new Argument[argsNum];
                for(int i =argsNum-1; i>=0;i--){

                    args[i] = stack.pop();
                }
                var fun = new FunctionCallHeader(ctx.getChild(0).getText(),args,register,aggregator);
                instructionStack.push(fun);
                if(ctx.getParent().getParent().getRuleIndex() == CalculatorParser.RULE_program_instruction){
                    mainInstructionStackNum++;
                }
            }

        }

        /*ComplexDouble b = stack.pop();
        ComplexDouble a = stack.pop();
        switch (ctx.getChild(0).getText()) {
            case "+":
                stack.push(ComplexDouble.add(a, b));
                break;
            case "-":
                stack.push(ComplexDouble.sub(a, b));
                break;
            case "*":
                stack.push(ComplexDouble.mul(a, b));
                break;
            case "/":
                stack.push(ComplexDouble.div(a, b));
                break;
        }*/

    }
    @Override public void enterFunc_arg(CalculatorParser.Func_argContext ctx) {

    }
    @Override
    public void enterRight_assignment(CalculatorParser.Right_assignmentContext ctx) {

    }

    @Override
    public void exitRight_assignment(CalculatorParser.Right_assignmentContext ctx) {
        super.exitRight_assignment(ctx);
    }

    @Override
    public void enterAssignment(CalculatorParser.AssignmentContext ctx) {

    }

    @Override
    public void exitAssignment(CalculatorParser.AssignmentContext ctx) {
        String leftName = ctx.variable().getText();
        boolean b = ctx.parent.parent.getRuleIndex() == CalculatorParser.RULE_program_instruction;
        Assignment assignment = new Assignment(register,leftName,stack.pop(),b);
        if(b) mainInstructionStackNum++;
        instructionStack.push(assignment);
        //put on instruction stack
    }

    @Override
    public void enterInstruction(CalculatorParser.InstructionContext ctx) {
        isInInstruction = true;
    }

    @Override
    public void exitInstruction(CalculatorParser.InstructionContext ctx) {
        isInInstruction = false;
    }

    @Override
    public void enterInstructions(CalculatorParser.InstructionsContext ctx) {

    }

    @Override
    public void exitInstructions(CalculatorParser.InstructionsContext ctx) {
        super.exitInstructions(ctx);
    }

    private int mainInstructionStackNum = 0;
    @Override
    public void enterFunction_body(CalculatorParser.Function_bodyContext ctx) {
        isInBody = true;

    }

    @Override
    public void exitFunction_body(CalculatorParser.Function_bodyContext ctx) {
        isInBody = false;
        var funcBody = new FunctionBody();
        while(instructionStack.size() > mainInstructionStackNum){
            funcBody.instructions.add(0,instructionStack.pop());
        }
        int height = getVariablesTreeHeight(ctx.parent.getChild(4));
        String[] names = new String[height];
        if(height > 0 ){
            ParseTree tree = ctx.parent.getChild(4);
            for(int i=0; i<height-1;i++){
                names[i]= tree.getChild(0).getText();
                tree = tree.getChild(2);
            }
            names[height-1] = tree.getChild(0).getText();
        }

        //functionRegister.put(new PredicateHeader(ctx.parent.getChild(1).getText(), names),);
        //functionRegister.put();
        functionRegister.get(new PredicateHeader(ctx.parent.getChild(2).getText(),names)).add(new Pair<>(new Where(),funcBody));
    }

    @Override
    public void enterFunction(CalculatorParser.FunctionContext ctx) {
        int height = getVariablesTreeHeight(ctx.getChild(4));
        String[] names = new String[height];
        if(height > 0 ){
            ParseTree tree = ctx.getChild(4);
            for(int i=0; i<height-1;i++){
                names[i]= tree.getChild(0).getText();
                tree = tree.getChild(2);
            }
            names[height-1] = tree.getChild(0).getText();
        }
        functionRegister.put(new PredicateHeader(ctx.getChild(2).getText(),names),new ArrayList<Pair<Where,FunctionBody>>());

    }
    private int getVariablesTreeHeight(ParseTree child){
        if(child.getChildCount()==3){
            return  getVariablesTreeHeight(child.getChild(2)) + 1;
        }  else if (child.getChildCount() >0){
            return 1;
        }else{
            return 0;
        }
    }


    @Override
    public void exitFunction(CalculatorParser.FunctionContext ctx) {
        //register.put(ctx.getChild(2).getText(),stack.pop().realPart.intValue());
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
