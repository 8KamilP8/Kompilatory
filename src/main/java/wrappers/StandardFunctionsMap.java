package wrappers;

import data.ComplexDouble;
import data.StandardFunctions;

import java.util.Set;

public class StandardFunctionsMap implements FunctionNamesMap{
    private Set<String> funcNames = Set.of("+","-","*","/","%","sin","cos","tan","Im","Re","abs");
    @Override
    public boolean contains(String name) {
        return funcNames.contains(name);
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



}
