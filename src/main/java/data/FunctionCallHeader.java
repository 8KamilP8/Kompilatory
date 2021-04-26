package data;

public class FunctionCallHeader implements Argument {
    public String funcName;
    public Argument[] args;
    public Register register;

    public FunctionCallHeader(String funcName, Argument[] args, Register register) {
        this.funcName = funcName;
        this.args = args;
        this.register = register;
    }

    @Override
    public ComplexDouble getValue() {
        return new ComplexDouble(0.0,0.0);
    }
}
