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
    private HashMap<String,ComplexDouble> localVariableRegister = new HashMap<String,ComplexDouble>();
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
    public void setLocalRegister(HashMap<String, ComplexDouble> localRegister) {
        this.localVariableRegister = localRegister;
        for (var arg:
             args) {
            arg.setLocalRegister(localRegister);

        }
    }

    @Override
    public boolean isValid() {
        return check();
    }

    @Override
    public boolean check() {
        boolean correctName =  StandardFunctions.map.contains(funcName) ||
                funcName.equals("plot") || funcName.equals("print") || funcName.equals("plotFunction") || funcName.equals("plotReverseFunction") ||
                register.functionRegister.containsKey(new PredicateHeader(funcName,new String[args.length]));
        if(!correctName) {
            System.out.println("Cannot resolve: " + toString());
            return false;
        }
        for (var arg: args) {
            if(!arg.isValid()){
                return false;
            }
        }

        return  true;
    }

    @Override
    public String getHeader() {
        return toString();
    }

    @Override
    public ComplexDouble Do() {
        if(StandardFunctions.map.contains(funcName)) {
            args[0].setLocalRegister(localVariableRegister);
            if (args.length == 2) {
                args[1].setLocalRegister(localVariableRegister);
                putHeaderVariablesIntoRegister(localVariableRegister);
                var val = StandardFunctions.map.mapAndEvaluate(funcName, args[0].getValue(), args[1].getValue());
                return val;
            }
            putHeaderVariablesIntoRegister(localVariableRegister);
            var val = StandardFunctions.map.mapAndEvaluate(funcName, args[0].getValue());
            return val;
        }else if(funcName.equals("plotFunction")) {
            ComplexDouble x = args[1].getValue();

            var functionCallHeader = ((FunctionCallHeader) args[0]);
            var name = functionCallHeader.funcName;
            var color = args[4].getValue().realPart.intValue();
            System.out.println("Plotting: " + name);
            while (x.realPart < args[2].getValue().realPart) {
                if (StandardFunctions.map.contains(name)) {
                    var value = StandardFunctions.map.mapAndEvaluate(name, x);
                    plotter.plot(x.realPart.floatValue(), value.realPart.floatValue(), color);
                } else {

                    var fch = new FunctionCallHeader(name, new Argument[functionCallHeader.args.length], register, plotter);
                    fch.args[0] = x;
                    for (int i = 1; i < fch.args.length; i++) {
                        fch.args[i] = ((FunctionCallHeader) args[0]).args[i].getValue();
                    }
                    var value = fch.getValue();
                    plotter.plot(x.realPart.floatValue(), value.realPart.floatValue(), color);
                }
                x.realPart += args[3].getValue().realPart;

            }
            return ComplexDouble.zero();
            //plotReverseFunction
        }else if(funcName.equals("plotReverseFunction")){
            ComplexDouble x = args[1].getValue();

            var functionCallHeader = ((FunctionCallHeader) args[0]);
            var name = functionCallHeader.funcName;
            var color = args[4].getValue().realPart.intValue();
            System.out.println("Plotting: " + name);
            while (x.realPart < args[2].getValue().realPart) {
                if (StandardFunctions.map.contains(name)) {
                    var value = StandardFunctions.map.mapAndEvaluate(name, x);
                    plotter.plot(value.realPart.floatValue(), x.realPart.floatValue(), color);
                } else {

                    var fch = new FunctionCallHeader(name, new Argument[functionCallHeader.args.length], register, plotter);
                    fch.args[0] = x;
                    for (int i = 1; i < fch.args.length; i++) {
                        fch.args[i] = ((FunctionCallHeader) args[0]).args[i].getValue();
                    }
                    var value = fch.getValue();
                    plotter.plot(value.realPart.floatValue(), x.realPart.floatValue(), color);
                }
                x.realPart += args[3].getValue().realPart;

            }
            return ComplexDouble.zero();
        }else if(funcName.equals("plot")){
            plotter.plot(args[0].getValue().realPart.floatValue(),args[1].getValue().realPart.floatValue(), (args[2].getValue().realPart).intValue());
            return new ComplexDouble(args[0].getValue().realPart,args[1].getValue().realPart);
        }else if(funcName.equals("print")){
            System.out.println("Print: " + args[0].toString() + " = "+args[0].getValue());
            return ComplexDouble.zero();
        }
        else {

            AtomicReference<ComplexDouble> returnVal = new AtomicReference<>(new ComplexDouble(0.0, 0.0));
            putHeaderVariablesIntoRegister(localVariableRegister);
            FunctionBody body = getBody();
            body.instructions.forEach(ins -> {
                ins.setLocalRegister(localVariableRegister);
                var val = ins.Do();
                returnVal.set(val);
            });
            //localVariableRegister.clear();
            return returnVal.get();
        }
    }
    private FunctionBody getBody(){
        var bodiesCollection = register.functionRegister.get(new PredicateHeader(funcName,new String[args.length]));
        if(bodiesCollection == null){
            System.out.println("ERROR: cannot find body, bodiesCollection == null , Function: " + funcName + '/'+args.length);
            System.out.println("Function Reg: " + register.functionRegister);
            return null;
        }
        for(var pair : bodiesCollection){
            var where = pair.getKey();
            where.setRegister(localVariableRegister);
            if(where.evaluate()){
                return pair.getValue();
            }
        }
        System.out.println("ERROR: cannot find body in bodiesCollecion, all wheres false, Function: " + funcName);
        return null;
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
                var value = args[i].getValue();
                var key = inputNames[i];
                register.put(key, value);
            }
        }
        //System.out.println(funcName + " -> reg: " + localVariableRegister.toString());

    }
    @Override
    public String toString() {
        var str = new StringBuilder();
        str.append(funcName).append('(');
        for (var arg: args) {
            str.append(arg.toString());
            str.append(", ");
        }
        var last = str.lastIndexOf(", ");
        if(args.length >= 1){
            str.deleteCharAt(last+1);
            str.deleteCharAt(last);
        }
        str.append(')');
        str.append('/');
        str.append(args.length);
        return str.toString();
    }
}
