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
        Scanner in = new Scanner(System.in);
        System.out.println(0.2%0.1);
        boolean fileMode = true;
            /*//Enter terminal
            while (true) {

                System.out.print(">> ");

                String line = in.nextLine();
                if (line.toLowerCase().equals("exit") || line.isEmpty()) {
                    break;
                }
                CharStream lineStream = CharStreams.fromString(line);

                Lexer lexer = new CalculatorLexer(lineStream);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                CalculatorParser parser = new CalculatorParser(tokens);
                ParseTree tree = parser.start();

                CalculationListener calculator = new CalculationListener();
                ParseTreeWalker walker = new ParseTreeWalker();
                walker.walk(calculator, tree);
                calculator.showRegister();
            }*/
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