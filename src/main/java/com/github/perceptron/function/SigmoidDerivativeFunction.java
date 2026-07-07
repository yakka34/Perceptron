package com.github.perceptron.function;

import java.util.function.Function;

public class SigmoidDerivativeFunction implements Function<Float, Float> {

    @Override
    public Float apply(final Float activation) {
        return activation * (1f - activation);
    }

}
