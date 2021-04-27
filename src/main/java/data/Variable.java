package data;

public class Variable implements Argument {
    public String name;
    public Register register;
    public Variable(String name, Register register) {
        this.name = name;
        this.register = register;
    }

    @Override
    public ComplexDouble getValue() {
        ComplexDouble value = new ComplexDouble(0.0,0.0);
        if(register.localVariableRegister.containsKey(name)){
            value = register.localVariableRegister.get(name);
        }else if(register.globalVariableRegister.containsKey(name)){
            value = register.globalVariableRegister.get(name);
        }
        return value;
    }

    @Override
    public String toString() {
        return "Variable{" +
                 name +
                '}';
    }
}
