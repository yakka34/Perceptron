package com.github.perceptron.function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquaredMagnitudeFunctionTest {

    @Test
    void shouldReturnZeroForEmptyVector() {
        final float[] x = {};

        final float result = VectorOperations.VECTOR_SQUARED_MAGNITUDE.apply(x);

        assertEquals(0f, result);
    }

    @Test
    void shouldReturnZeroForZeroVector() {
        final float[] x = {0f, 0f, 0f};

        final float result = VectorOperations.VECTOR_SQUARED_MAGNITUDE.apply(x);

        assertEquals(0f, result);
    }

    @Test
    void shouldReturnVectorLengthForPositiveValues() {
        final float[] x = {3f, 4f, 0f, 1};

        final float result = VectorOperations.VECTOR_SQUARED_MAGNITUDE.apply(x);

        assertEquals(26f, result);
    }

    @Test
    void shouldReturnVectorLengthForNegativeValues() {
        final float[] x = {-3f, -4f, -0f, -1};

        final float result = VectorOperations.VECTOR_SQUARED_MAGNITUDE.apply(x);

        assertEquals(26f, result);
    }

}