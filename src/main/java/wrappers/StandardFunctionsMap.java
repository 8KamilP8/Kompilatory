package wrappers;

import data.Argument;
import data.ComplexDouble;
import data.StandardFunctions;

import java.util.Set;

public class StandardFunctionsMap implements FunctionNamesMap{
    private Set<String> funcNames2 = Set.of("+","-","*","/","%");
    private Set<String> funcNames1 = Set.of("sin","cos","tan","Im","Re","abs","sqrt");
    @Override
    public boolean contains(String name) {
        return funcNames2.contains(name) || funcNames1.contains(name);
    }
    public int argsNum(String name){
        return funcNames2.contains(name) ? 2: (funcNames1.contains(name) ? 1: -1 );
    }
    @Override
    public ComplexDouble mapAndEvaluate(String funcName, ComplexDouble a) {
        switch (funcName){
            case "sin":
                return StandardFunctions.sin(a);
            case "cos":
                return StandardFunctions.cos(a);
            case "tan":
                return StandardFunctions.tan(a);
            case "Re":
                return StandardFunctions.Re(a);
            case "Im":
                return StandardFunctions.Im(a);
            case "abs":
                return StandardFunctions.abs(a);
            case "sqrt":
                return StandardFunctions.sqrt(a);
        }
        return ComplexDouble.i();
    }

    @Override
    public ComplexDouble mapAndEvaluate(String funcName, ComplexDouble a, ComplexDouble b) {
        switch (funcName){
            case "+":
                return StandardFunctions.add(a,b);
            case "-":
                return StandardFunctions.sub(a,b);
            case "*":
                return StandardFunctions.mul(a,b);
            case "/":
                return StandardFunctions.div(a,b);
            case "%":
                return StandardFunctions.mod(a,b);
        }
        return ComplexDouble.i();
    }

    public ComplexDouble mapAndEvaluate(String funcName, Argument[] args){
        switch (funcName){
            case "sin":
                return StandardFunctions.sin(args[0].getValue());
            case "cos":
                return StandardFunctions.cos(args[0].getValue());
            case "tan":
                return StandardFunctions.tan(args[0].getValue());
            case "Re":
                return StandardFunctions.Re(args[0].getValue());
            case "Im":
                return StandardFunctions.Im(args[0].getValue());
            case "abs":
                return StandardFunctions.abs(args[0].getValue());
            case "sqrt":
                return StandardFunctions.sqrt(args[0].getValue());
            case "plot":
                return StandardFunctions.plot(args[0].getValue(), args[1].getValue(), args[2].getValue());
            case "print":
                return StandardFunctions.print(args[0].toString(), args[0].getValue());
        }
        return ComplexDouble.i();
    }

}
