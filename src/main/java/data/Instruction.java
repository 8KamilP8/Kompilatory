package data;

import java.util.HashMap;

public abstract class Instruction {
    public Register register;
    public HashMap<String,ComplexDouble> localVariableRegister = new HashMap<String,ComplexDouble>();
    public Instruction(Register register) {
        this.register = register;
    }

    public abstract ComplexDouble Do();

    @Override
    public String toString() {
        return "Instruction{}";
    }

    public void setLocalRegister(HashMap<String, ComplexDouble> localVariableRegister) {
        this.localVariableRegister = localVariableRegister;
    }

    public abstract boolean check();
    public abstract String getHeader();
}
