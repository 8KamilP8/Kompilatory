package data;

import java.util.HashMap;

public class Variable implements Argument {
    public String name;
    public Register globalRegister;
    public HashMap<String,ComplexDouble> localRegister = new HashMap<>();
    public Variable(String name, Register register) {
        this.name = name;
        this.globalRegister = register;
    }

    @Override
    public ComplexDouble getValue() {
        ComplexDouble value = new ComplexDouble(0.0,0.0);
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
