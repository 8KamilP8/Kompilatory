package data;

import plotter.MatrixAggregator;
import plotter.Plotter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public class FunctionCallHeader extends Instruction implements Argument {
    public String funcName;
    public Argument[] args;
    public Register register;
    public HashMap<String,ComplexDouble> localVariableRegister = new HashMap<String,ComplexDouble>();
    public Plotter plotter;
    public FunctionCallHeader(String funcName, Argument[] args, Register register, Plotter plotter) {
        super(register);
        this.funcName = funcName;
        this.args = args;
        this.register = register;
        this.plotter = plotter;
    }

    @Override
    public ComplexDouble getValue() {
        return Do();
    }

    @Override
    public void setLocalRegister(HashMap<String, ComplexDouble> localVariableRegister) {
        this.localVariableRegister = localVariableRegister;
    }

    @Override
    public ComplexDouble Do() {

        if(StandardFunctions.funcNames.contains(funcName)){
            args[0].setLocalRegister(localVariableRegister);
            args[1].setLocalRegister(localVariableRegister);
            putHeaderVariablesIntoRegister(localVariableRegister);
            return StandardFunctions.map(funcName,args[0].getValue(), args[1].getValue());
        }else if(funcName.equals("plot")){
            plotter.plot(args[0].getValue().realPart.floatValue(),args[1].getValue().realPart.floatValue(), (args[2].getValue().realPart).intValue());
            return new ComplexDouble(args[0].getValue().realPart,args[1].getValue().realPart);
        }
        else{
            FunctionBody body = register.functionRegister.get(new PredicateHeader(funcName,new String[args.length])).get(0).getValue();
            AtomicReference<ComplexDouble> returnVal = new AtomicReference<>(new ComplexDouble(0.0, 0.0));
            putHeaderVariablesIntoRegister(localVariableRegister);
            body.instructions.forEach(ins -> {
                ins.setLocalRegister(localVariableRegister);
                returnVal.set(ins.Do());
            });
            localVariableRegister.clear();
            return returnVal.get();
        }

    }
    private void putHeaderVariablesIntoRegister(HashMap<String,ComplexDouble> register){
        var keySet = this.register.functionRegister.keySet();
        PredicateHeader ph = new PredicateHeader("",null);

        for(var key : keySet){
            if(key.equals(new PredicateHeader(funcName,new String[args.length]))){
                ph = key;
            }
        }
        if(ph.getInputs() != null){
            String[] inputNames = ph.getInputs();
            for (int i =0; i< inputNames.length; i++) {
                register.put(inputNames[i], args[i].getValue());
            }
        }
        else{
            //standard function:
            StandardFunctions.map(funcName,args[0].getValue(),args[1].getValue());
        }

    }
    @Override
    public String toString() {
        return "FunctionCallHeader{" +
                "funcName='" + funcName + '\'' +
                ", args=" + Arrays.toString(args) +
                '}';
    }
}
