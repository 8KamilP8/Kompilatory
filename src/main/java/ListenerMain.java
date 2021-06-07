import data.StandardFunctions;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.*;
import plotter.MatrixAggregator;

import java.io.*;

public class ListenerMain {
    public static void main(String[] args) throws IOException {
        String fileName = "Brod.hl";
        // String fileName = "sin.hl";
        //String fileName = "circles.hl";
        String filePath = "src\\main\\java\\parser\\" + fileName;
        File file = new File(filePath);
        FileInputStream fis = null;
        MatrixAggregator aggregator = new MatrixAggregator();
        StandardFunctions.plotter = aggregator;
        try {
            // Open the input file stream
            fis = new FileInputStream(file);

            // Create a CharStream that reads from standard input
            ANTLRInputStream input = new ANTLRInputStream(fis);

            // Create a lexer that feeds off of input CharStream
            CalculatorLexer lexer = new CalculatorLexer(input);

            var errList = new ErrorListener();

            lexer.addErrorListener(errList);

            // Create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Create a parser that feeds off the tokens buffer
            CalculatorParser parser = new CalculatorParser(tokens);

            parser.addErrorListener(errList);

            // Begin parsing at rule prog
            ParseTree tree = parser.start();

            // Close the input file
            fis.close();

            // Create a generic parse tree walker that can trigger callbacks
            ParseTreeWalker walker = new ParseTreeWalker();
            // Walk the tree created during the parse, trigger callbacks
            var listener = new CalculationListener(aggregator);
            var checkListener = new CalculationCheckListener(aggregator);


            walker.walk(listener, tree);
            walker.walk(checkListener, tree);


            listener.ListInstructionsStack();
            System.out.println("RUNNING.....................");
            if(listener.CheckInstructionStack()){
                listener.RunStack();
                //aggregator.print();
                //aggregator.toFile("output");

                aggregator.toImage();
                System.out.println("Global Register:");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}