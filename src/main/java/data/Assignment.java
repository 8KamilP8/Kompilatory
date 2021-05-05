package data;

import java.util.HashMap;

public class Assignment extends Instruction {

    private String varName;
    private Argument assignment;
    private boolean global;
    public Assignment(Register register, String varName, Argument assignment, boolean global) {
        super(register);
        this.varName = varName;
        this.assignment = assignment;
        this.global = global;
    }

    @Override
    public ComplexDouble Do() {


        if(global){
            assignment.setLocalRegister(register.globalVariableRegister);
            var ass = assignment.getValue();
            register.globalVariableRegister.put(varName,ass);
            return ass;
        }
        assignment.setLocalRegister(localVariableRegister);
        if(localVariableRegister.containsKey(varName)){
            localVariableRegister.put(varName,assignment.getValue());

            return assignment.getValue();
        }
        if(register.globalVariableRegister.containsKey(varName)){
            register.globalVariableRegister.put(varName,assignment.getValue());
            return assignment.getValue();
        }
        localVariableRegister.put(varName,assignment.getValue());

        return assignment.getValue();
    }

    @Override
    public String toString() {
        return  varName + " = " + assignment;
    }

    @Override
    public boolean check() {
        return assignment.isValid();
    }

    @Override
    public String getHeader() {
        return varName + "=" + assignment;
    }
}
