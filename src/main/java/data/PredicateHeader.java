package data;

public class PredicateHeader {
    private String name;
    private String[] inputs;

    public PredicateHeader(String name, String[] inputs) {
        this.name = name;
        this.inputs = inputs;
    }

    public String getName() {
        return name;
    }

    public String getInputsCount(int id) {
        return inputs[id];
    }

    @Override
    public String toString() {
        return name + '(' + String.join(",",inputs) + ')' + '/' + inputs.length;
    }
}
