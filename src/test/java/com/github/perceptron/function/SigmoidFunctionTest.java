package com.github.perceptron.function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SigmoidFunctionTest {

    private static final double DELTA = 1e-15;


    @Test
    void shouldReturnOneHalfForZero() {
        final double sigmoid = ActivationFunctions.SIGMOID.applyAsDouble(0);

        assertEquals(0.5, sigmoid);
    }

    @Test
    void shouldHaveSymmetricalProperty() {
        final double sigmoid = ActivationFunctions.SIGMOID.applyAsDouble(2);
        final double expected = 1.0 - ActivationFunctions.SIGMOID.applyAsDouble(-2);

        assertEquals(expected, sigmoid, DELTA);
    }

}