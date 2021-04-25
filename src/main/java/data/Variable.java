package data;

public class Variable implements CallableArg {
    public  ComplexDouble Value;
    @Override
    public ComplexDouble evaluateArg() {
        return Value;
    }
}
