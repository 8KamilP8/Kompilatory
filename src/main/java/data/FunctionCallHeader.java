package data;

import java.util.Arrays;

public class FunctionCallHeader extends Instruction implements Argument {
    public String funcName;
    public Argument[] args;
    public Register register;

    public FunctionCallHeader(String funcName, Argument[] args, Register register) {
        super(register);
        this.funcName = funcName;
        this.args = args;
        this.register = register;
    }

    @Override
    public ComplexDouble getValue() {
        return new ComplexDouble(0.0,0.0);
    }

    @Override
    public void Do() {

    }

    @Override
    public String toString() {
        return "FunctionCallHeader{" +
                "funcName='" + funcName + '\'' +
                ", args=" + Arrays.toString(args) +
                '}';
    }
}
