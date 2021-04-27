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
    public void Do() {
        if(register.localVariableRegister.containsKey(varName)){
            register.localVariableRegister.put(varName,assignment.getValue());
            return;
        }
        if(register.globalVariableRegister.containsKey(varName)){
            register.globalVariableRegister.put(varName,assignment.getValue());
            return;
        }
        register.localVariableRegister.put(varName,assignment.getValue());
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "varName='" + varName + '\'' +
                ", assignment=" + assignment +
                '}';
    }
}
