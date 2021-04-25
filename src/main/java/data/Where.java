package data;

public class Where {
    private LogicOperationType operationType;
    private LogicOperationArg arg1;
    private LogicOperationArg arg2;

    public boolean evaluate(){
        return Logic.eval(operationType,arg1.getValue(),arg2.getValue());
    }

}
