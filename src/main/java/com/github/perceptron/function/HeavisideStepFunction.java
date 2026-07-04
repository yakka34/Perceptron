package com.github.perceptron.function;

import com.github.perceptron.data.Bit;

import java.util.function.Function;

public class HeavisideStepFunction implements Function<Float, Bit> {

    @Override
    public Bit apply(final Float realNumber) {
        if (realNumber <= 0) {
            return Bit.ZERO;
        }
        return Bit.ONE;
    }

}
