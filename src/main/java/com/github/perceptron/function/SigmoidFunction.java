package com.github.perceptron.function;

import java.util.function.DoubleUnaryOperator;

public class SigmoidFunction implements DoubleUnaryOperator {

    @Override
    public double applyAsDouble(final double x) {
        return 1.0 / (1.0 + Math.exp(-x));
    }

}
