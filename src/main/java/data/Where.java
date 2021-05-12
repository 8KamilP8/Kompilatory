package data;

import java.lang.management.LockInfo;
import java.util.HashMap;

public class Where implements Argument {
    private LogicOperationType operationType;
    private Argument arg1;
    private Argument arg2;
    private HashMap<String,ComplexDouble> localVariableRegister = new HashMap<String,ComplexDouble>();
    public void setRegister(HashMap<String,ComplexDouble> register){
        localVariableRegister = register;
    }
    public Where(LogicOperationType operationType, Argument arg1, Argument arg2) {
        this.operationType = operationType;
        this.arg1 = arg1;
        this.arg2 = arg2;
    }


    public static Where empty(){
        return new Where(LogicOperationType.OR,ComplexDouble.one(),ComplexDouble.one());
    }

    public boolean evaluate(){
        arg1.setLocalRegister(localVariableRegister);
        arg2.setLocalRegister(localVariableRegister);
        return Logic.eval(operationType,arg1.getValue(),arg2.getValue());
    }

    @Override
    public String toString() {
        return "where" + '{' + operationType.toString() + '(' + arg1 + ',' + arg2 + ')' +  '}';
    }

    @Override
    public ComplexDouble getValue() {
        return evaluate() ? ComplexDouble.one() : ComplexDouble.zero();
    }

    @Override
    public void setLocalRegister(HashMap<String, ComplexDouble> localVariableRegister) {
        this.localVariableRegister = localVariableRegister;
    }

    @Override
    public boolean isValid() {
        return true;
    }
}
