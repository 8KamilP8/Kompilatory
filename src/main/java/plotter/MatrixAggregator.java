package plotter;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

class MatrixElement {
    public int v = 0; // wartosc pikesla (kolor)

    MatrixElement(int v) {
        this.v = v;
    }
}

// lista wierszy
public class MatrixAggregator implements Plotter {


    public ArrayList<ArrayList<MatrixElement>> matrix;
    public int size = 64;

    public MatrixAggregator() {
        matrix = new ArrayList<ArrayList<MatrixElement>>();
        for (int i = 0; i < size; i++) {
            matrix.add(new ArrayList<MatrixElement>());
            for (int j = 0; j < size; j++) {
                matrix.get(i).add(new MatrixElement(0));
            }
        }
    }

    MatrixElement getValue(int x, int y) {
        return matrix.get(y).get(x);
    }

    void setValue(int x, int y, MatrixElement value) {
        matrix.get(y).set(x, value);
    }

    void flush() {
        matrix = null;

        matrix = new ArrayList<ArrayList<MatrixElement>>();
        for (int i = 0; i < size; i++) {
            matrix.add(new ArrayList<MatrixElement>());
            for (int j = 0; j < size; j++) {
                matrix.get(i).add(new MatrixElement(0));
            }
        }
    }

    @Override
    public void plot(float x, float y, int v) {
        setValue((int) (x), (int) (y), new MatrixElement(v));
    }


    public void print() {
        for (var r : matrix) {
            for (var e : r) {
                System.out.print(e.v + " ");
            }
            System.out.println("");
        }
    }

    public void toFile(String name) {
        if (name == null)
            name = "res";

        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        try {
            fileWriter = new FileWriter(name);
            printWriter = new PrintWriter(fileWriter);
            for (var r : matrix) {
                for (var e : r) {
                    printWriter.print(e.v + " ");
                }
                printWriter.println("");
            }

        }
        catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        finally {
            printWriter.close();
        }

    }
}