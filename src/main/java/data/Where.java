package data;

public class Where {
    private LogicOperationType operationType;
    private LogicOperationArg arg1;
    private LogicOperationArg arg2;

    public boolean evaluate(){
        if(operationType == LogicOperationType.AND){
            return and(arg1.getValue(), arg2.getValue());
        }   else {
            return true;
        }
    }
    private boolean and(ComplexDouble a, ComplexDouble b){
        return a.realPart > 0.0 && b.realPart > 0.0;
    }
}
