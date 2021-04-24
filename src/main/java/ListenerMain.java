import data.ComplexDouble;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.Lexer;
import parser.CalculationListener;
import parser.CalculatorLexer;
import parser.CalculatorParser;

import java.io.*;
import java.util.Scanner;

public class ListenerMain {
    public static void main(String[] args) throws IOException {
        String fileName = "src\\main\\java\\parser\\example_prog.hl";
        File file = new File(fileName);
        FileInputStream fis = null;
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
            var listener = new CalculationListener();

            walker.walk(listener, tree);
            listener.showRegister();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}