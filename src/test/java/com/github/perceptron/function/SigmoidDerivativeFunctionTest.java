package com.github.perceptron.function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SigmoidDerivativeFunctionTest {

    @Test
    void shouldReturnZeroAtBounds() {
        final float lowerBound = DerivativeFunctions.SIGMOID_DERIVATIVE.apply(0f);
        final float upperBound = DerivativeFunctions.SIGMOID_DERIVATIVE.apply(1f);

        assertEquals(0f, lowerBound);
        assertEquals(0f, upperBound);
    }

    @Test
    void shouldPeekAtMidpoint() {
        final float peak = DerivativeFunctions.SIGMOID_DERIVATIVE.apply(0.5f);

        assertEquals(0.25f, peak);
    }

    @Test
    void shouldBeSymmetric() {
        final float x = DerivativeFunctions.SIGMOID_DERIVATIVE.apply(0.5f);
        final float y = DerivativeFunctions.SIGMOID_DERIVATIVE.apply(1f - 0.5f);

        assertEquals(x, y);
    }

}