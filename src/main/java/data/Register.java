package data;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;

public class Register {

    public HashMap<PredicateHeader, ArrayList<Pair<Where,FunctionBody>>> functionRegister = new HashMap<PredicateHeader, ArrayList<Pair<Where,FunctionBody>>>();
    public HashMap<String,ComplexDouble> globalVariableRegister = new HashMap<String,ComplexDouble>();
    public HashMap<String,ComplexDouble> localVariableRegister = new HashMap<String,ComplexDouble>();


    public Register(HashMap<PredicateHeader, ArrayList<Pair<Where, FunctionBody>>> functionRegister, HashMap<String, ComplexDouble> globalVariableRegister, HashMap<String, ComplexDouble> localVariableRegister) {
        this.functionRegister = functionRegister;
        this.globalVariableRegister = globalVariableRegister;
        this.localVariableRegister = localVariableRegister;
    }
}
