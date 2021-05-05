import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.CalculationListener;
import parser.CalculatorLexer;
import parser.CalculatorParser;
import plotter.MatrixAggregator;

import java.io.*;

public class ListenerMain {
    public static void main(String[] args) throws IOException {
        String fileName = "src\\main\\java\\parser\\Brod.hl";
        File file = new File(fileName);
        FileInputStream fis = null;
        MatrixAggregator aggregator = new MatrixAggregator();
        try {
            // Open the input file stream
            fis = new FileInputStream(file);

            // Create a CharStream that reads from standard input
            ANTLRInputStream input = new ANTLRInputStream(fis);

            // Create a lexer that feeds off of input CharStream
            CalculatorLexer lexer = new CalculatorLexer(input);

            // Create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Create a parser that feeds off the tokens buffer
            CalculatorParser parser = new CalculatorParser(tokens);

            // Begin parsing at rule prog
            ParseTree tree = parser.start();

            // Close the input file
            fis.close();

            // Create a generic parse tree walker that can trigger callbacks
            ParseTreeWalker walker = new ParseTreeWalker();
            // Walk the tree created during the parse, trigger callbacks
            var listener = new CalculationListener(aggregator);

            walker.walk(listener, tree);

            listener.showRegister();
            listener.ListInstrucionStack();
            System.out.println("RUNNING.....................");
            if(listener.CheckInstructionStack()){
                listener.RunStack();
                //aggregator.print();
                aggregator.toFile("output");

                listener.showGlobalRegister();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}