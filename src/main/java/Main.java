import org.antlr.runtime.*;
import parser.CalculatorLexer;
import parser.CalculatorParser;

public class Main {
    public static void main(String[] args) throws Exception {
        ANTLRStringStream in = new ANTLRStringStream(args[0]);
        CalculatorLexer lexer = new CalculatorLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokens);
        parser.prog();
    }
}
