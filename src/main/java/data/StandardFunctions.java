package data;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

public class StandardFunctions {
    public static Set<String> funcNames = Set.of("+","-","*","/");
    public static ComplexDouble map(String name, ComplexDouble a, ComplexDouble b){
        switch (name){
            case "+":
                return add(a,b);
            case "-":
                return sub(a,b);
            case "*":
                return mul(a,b);
            case "/":
                return div(a,b);
        }
        return new ComplexDouble(0.0,0.0);
    }


    public static ComplexDouble add(ComplexDouble a, ComplexDouble b){
        return new ComplexDouble(a.realPart+b.realPart, a.imaginaryPart+b.imaginaryPart);
    }
    public static ComplexDouble sub(ComplexDouble a, ComplexDouble b){
        b.imaginaryPart *= -1;
        b.realPart *= -1;
        return  add(a, b);
    }
    public static ComplexDouble mul(ComplexDouble a, ComplexDouble b){
        ComplexDouble result;
        result = new ComplexDouble(a.realPart, a.imaginaryPart);
        result.realPart = a.realPart * b.realPart - a.imaginaryPart * b.imaginaryPart;
        result.imaginaryPart = a.realPart * b.imaginaryPart + a.imaginaryPart * b.realPart;
        return result;
    }
    public static ComplexDouble div(ComplexDouble a, ComplexDouble b){
        ComplexDouble result;
        result = new ComplexDouble(a.realPart, a.imaginaryPart);
        Double denominator = b.realPart * b.realPart + b.imaginaryPart * b.imaginaryPart;
        result.realPart = (a.realPart*b.realPart+a.imaginaryPart*b.imaginaryPart) / denominator;
        result.imaginaryPart = (a.imaginaryPart*b.realPart-a.realPart*b.imaginaryPart) /denominator;

        return result;
    }
    public static ComplexDouble mod(ComplexDouble a, ComplexDouble b){
        return new ComplexDouble(a.realPart % b.realPart, 0.0);
    }
    public static ComplexDouble sin(ComplexDouble a){
        return new ComplexDouble(Math.sin(a.realPart),0.0);
    }
    public static  ComplexDouble cos(ComplexDouble a){
        return new ComplexDouble(Math.cos(a.realPart),0.0);
    }
    public static ComplexDouble tan(ComplexDouble a){
        return new ComplexDouble(Math.tan(a.realPart),0.0);
    }
    public static ComplexDouble Re(ComplexDouble a){
        return new ComplexDouble(a.realPart,0.0);
    }
    public static ComplexDouble Im(ComplexDouble a){
        return new ComplexDouble(a.imaginaryPart,0.0);
    }

}
