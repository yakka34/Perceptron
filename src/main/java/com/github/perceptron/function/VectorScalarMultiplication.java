package com.github.perceptron.function;

import java.util.function.BiFunction;

public class VectorScalarMultiplication implements BiFunction<float[], Float, float[]> {

    @Override
    public float[] apply(final float[] x, final Float realNumber) {
        final float[] result = new float[x.length];
        for (int i = 0; i < x.length; i++) {
            result[i] = x[i] * realNumber;
        }
        return result;
    }

}
