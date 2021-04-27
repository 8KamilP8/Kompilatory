package data;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionBody {
    public ArrayList<Instruction> instructions;

    public FunctionBody() {
        this.instructions = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Body{");
        for (var inst: instructions) {
            builder.append(inst.toString());
        }
        builder.append('}');
        return builder.toString();
    }
}
