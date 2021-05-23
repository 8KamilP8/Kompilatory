package plotter;

import data.ComplexDouble;

public interface Plotter {
    void plot(float x, float y, int v);
    ComplexDouble getStep();
}
