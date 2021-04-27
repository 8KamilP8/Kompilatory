package data;

import java.util.HashMap;

public abstract class Instruction {
    public Register register;

    public Instruction(Register register) {
        this.register = register;
    }

    public abstract void Do();

    @Override
    public String toString() {
        return "Instruction{}";
    }
}
