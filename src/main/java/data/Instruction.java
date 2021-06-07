package data;

import java.util.HashMap;

public abstract class Instruction {
    public VariableRegister register;
    public Instruction(VariableRegister register) {
        this.register = register;
    }

    public abstract ComplexDouble Do();

    @Override
    public String toString() {
        return "Instruction{}";
    }

    public abstract void setRegister(VariableRegister register);

    public abstract boolean check();
}
