package data;

import java.util.HashMap;

public interface Argument {
    ComplexDouble getValue();
    void setArgRegister(VariableRegister register);
    boolean isValid();
}
