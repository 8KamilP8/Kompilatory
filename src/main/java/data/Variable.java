package data;

import java.util.HashMap;

public class Variable implements Argument {
    public String name;
    public Register globalRegister;
    public HashMap<String,ComplexDouble> localRegister = new HashMap<>();
    boolean global = false;
    public Variable(String name, Register register, boolean global) {
        this.name = name;
        this.globalRegister = register;
        this.global = global;
    }

    @Override
    public ComplexDouble getValue() {
        ComplexDouble value = ComplexDouble.zero();
        if(global){
            value = globalRegister.globalVariableRegister.get(name);
            return value;
        }
        if(localRegister.containsKey(name)){
            value = localRegister.get(name);
        }else if(globalRegister.globalVariableRegister.containsKey(name)){
            value = globalRegister.globalVariableRegister.get(name);
        }
        return value;
    }

    @Override
    public void setLocalRegister(HashMap<String, ComplexDouble> localVariableRegister) {
        localRegister = localVariableRegister;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public String toString() {
        return name;
    }
}
