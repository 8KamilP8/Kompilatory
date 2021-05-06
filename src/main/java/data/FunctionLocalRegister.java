package data;

import java.util.HashMap;

public class FunctionLocalRegister {

    private HashMap<String,ComplexDouble> localRegister = new HashMap<String,ComplexDouble>();
    private Register register;

    public void fillRegister(String funcName, Argument[] args){
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
                localRegister.put(inputNames[i], args[i].getValue());
            }
        }
        else{
            //standard function:
            StandardFunctions.map.mapAndEvaluate(funcName,args[0].getValue(),args[1].getValue());
        }
    }
}
