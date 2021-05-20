package data;

public class While extends Instruction{

    private FunctionBody fbody;
    private Where condition;

    public While(FunctionBody fbody,Where condition, Register register){
        super(register);
        this.fbody=fbody;
        this.condition =condition;
    }
    @Override
    public ComplexDouble Do(){
        var returnValue = ComplexDouble.zero();
        while (condition.evaluate()){
            for (var ins: fbody.instructions) {

                returnValue = ins.Do();
            }
        }
        return returnValue;
    }

    @Override
    public boolean check() {
        return true;
    }

    @Override
    public String getHeader() {
        return null;
    }

    public String toString(){
        return "while(" + condition.toString() + ")" +fbody.toString();
    }
}
