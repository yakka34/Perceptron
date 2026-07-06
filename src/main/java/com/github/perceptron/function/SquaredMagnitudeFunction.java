package com.github.perceptron.function;

import java.util.function.Function;

public class SquaredMagnitudeFunction implements Function<float[], Float> {

    @Override
    public Float apply(final float[] vector) {
        double sum = 0.0;
        for (final float v : vector) {
            sum += (double) v * v;
        }
        return (float) sum;
    }

}
