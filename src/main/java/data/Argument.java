package data;

import java.util.HashMap;

public interface Argument {
    ComplexDouble getValue();
    void setLocalRegister(HashMap<String,ComplexDouble> localVariableRegister);
}
