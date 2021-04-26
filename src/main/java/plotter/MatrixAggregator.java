package plotter;

import java.util.ArrayList;

class MatrixElement {
    public int v = 0; // wartosc pikesla (kolor)

    MatrixElement(int v) {
        this.v = v;
    }
}

// lista wierszy
public class MatrixAggregator {


    public ArrayList<ArrayList<MatrixElement>> matrix;
    public int size = 10;

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

    public void plot(int x, int y, int color) {
        setValue(x, y, new MatrixElement(color));
    }

    public void print() {
        for (var r : matrix) {
            for (var e : r) {
                System.out.print(e.v + " ");
            }
            System.out.println("");
        }
    }
}