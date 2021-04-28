package data;

import java.util.HashMap;

public class Assignment extends Instruction {

    private String varName;
    private Argument assignment;

    public Assignment(Register register, String varName, Argument assignment) {
        super(register);
        this.varName = varName;
        this.assignment = assignment;
    }

    @Override
    public ComplexDouble Do() {
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
        return "Assignment{" +
                "varName='" + varName + '\'' +
                ", assignment=" + assignment +
                '}';
    }
}
