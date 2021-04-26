package parser;

import data.Argument;
import data.ComplexDouble;
import data.FunctionCallHeader;
import data.Instruction;

import java.util.Stack;

public class FirstPhaseStack {

    private Stack<ComplexDouble> numberStack = new Stack<>();
    private Stack<String> variableStack = new Stack<>();
    private Stack<FunctionCallHeader> functionStack = new Stack<>();
    private Stack<Instruction> instructionStack = new Stack<>();

    private Stack<Argument> argumentStack = new Stack<>();

    public Argument pop(){
        return argumentStack.pop();
    }
    public void push(Argument argument){
        argumentStack.push(argument);
    }
}

