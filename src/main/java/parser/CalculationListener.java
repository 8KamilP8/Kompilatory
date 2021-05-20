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

    private HashMap<PredicateHeader, ArrayList<Pair<Where, FunctionBody>>> functionRegister = new HashMap<PredicateHeader, ArrayList<Pair<Where,FunctionBody>>>();

    private Stack<Instruction> instructionStack = new Stack<>();
    private MatrixAggregator aggregator;


    private FirstPhaseStack stack;
    private Register register;
    private int mainInstructionStackNum = 0;
    private String currentFunctionName = "";
    private Where lastWhere = Where.empty();

    public CalculationListener(MatrixAggregator aggregator) {
        this.aggregator = aggregator;
        register = new Register(functionRegister,new HashMap<String,ComplexDouble>(),new HashMap<String,ComplexDouble>());
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
        instructionStack.forEach(ins -> {
            System.out.println(ins.toString() +   " -> " + ins.Do());
        });
    }

    public void ListInstructionsStack(){
        System.out.println("Instrucion Stack: ");
        instructionStack.forEach(e-> System.out.println(e.toString()));
    }
    public void showRegister(){
        System.out.println(functionRegister);
    }
    public void showGlobalRegister(){
        System.out.println(register.globalVariableRegister);
    }


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
    @Override public void enterVariable(CalculatorParser.VariableContext ctx) {
        boolean b = ctx.GLOBAL() != null;
        Variable variable =  new Variable(ctx.NAME().getText(), register,b);
        stack.push(variable);
    }
    @Override
    public void exitFunction_call(CalculatorParser.Function_callContext ctx) {
        if(ctx.getParent().getRuleIndex() == CalculatorParser.RULE_func_arg || ctx.getParent().getRuleIndex() == CalculatorParser.RULE_right_assignment){
            //as argument
            String funName = ctx.getChild(0).getText();
            if(StandardFunctions.map.contains(funName)){
                int argsNum = StandardFunctions.map.argsNum(funName);
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
            if(StandardFunctions.map.contains(funName)){
                int argsNum = StandardFunctions.map.argsNum(funName);
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


    }

    @Override
    public void exitAssignment(CalculatorParser.AssignmentContext ctx) {
        String leftName = ctx.variable().NAME().getText();

        boolean b = ctx.parent.parent.getRuleIndex() == CalculatorParser.RULE_program_instruction || ctx.variable().GLOBAL() != null;
        System.out.println("ASS: " + ctx.variable().NAME().getText()+" "+ctx.variable().GLOBAL() + " " + b);
        Assignment assignment = new Assignment(register,leftName,stack.pop(),b);
        if(ctx.parent.parent.getRuleIndex() == CalculatorParser.RULE_program_instruction) mainInstructionStackNum++;
        instructionStack.push(assignment);
    }


    @Override
    public void exitFunction_body(CalculatorParser.Function_bodyContext ctx) {
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

        functionRegister.get(new PredicateHeader(currentFunctionName,names)).add(new Pair<>(lastWhere,funcBody));
    }

    @Override
    public void enterFunction(CalculatorParser.FunctionContext ctx) {
        lastWhere = Where.empty();
        currentFunctionName = ctx.getChild(2).getText();
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
        var header = new PredicateHeader(currentFunctionName,names);
        if(!functionRegister.containsKey(header)){
            functionRegister.put(new PredicateHeader(currentFunctionName,names),new ArrayList<Pair<Where,FunctionBody>>());
        }

    }
    private int getVariablesTreeHeight(ParseTree child){
        if(child == null) return 0;
        if(child.getChildCount()==3){
            return  getVariablesTreeHeight(child.getChild(2)) + 1;
        }  else if (child.getChildCount() >0){
            return 1;
        }else{
            return 0;
        }
    }


    @Override
    public void exitFunction(CalculatorParser.FunctionContext ctx) { }


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

    @Override public void enterPattern_matching(CalculatorParser.Pattern_matchingContext ctx) {

    }

    @Override public void exitPattern_matching(CalculatorParser.Pattern_matchingContext ctx) {
        String logicOperationName = ctx.getChild(0).getText();
        var arg2 = stack.pop();
        var arg1 = stack.pop();
        lastWhere = new Where(Logic.map.getType(logicOperationName), arg1,arg2);
        stack.push(lastWhere);
    }
}
