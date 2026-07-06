package com.github.perceptron.function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class VectorSubtractionFunctionTest {

    @Test
    public void shouldThrowExceptionWhenArrayLengthsDoNotMatch() {
        final float[] vectorX = {1f, 2f};
        final float[] vectorY = {1f};

        assertThrows(IllegalArgumentException.class, () -> VectorOperations.VECTOR_SUBTRACTION.apply(vectorX, vectorY));
    }

    @Test
    public void shouldReturnEmptyArrayWhenArraysAreEmpty() {
        final float[] x = {};
        final float[] y = {};

        final float[] result = VectorOperations.VECTOR_SUBTRACTION.apply(x, y);

        assertArrayEquals(new float[]{}, result, 0f);
    }

    @Test
    public void shouldReturnSumForPositiveValues() {
        final float[] x = {1f, 2f, 3f};
        final float[] y = {4f, 5f, 6f};
        final float[] expected = {-3f, -3f, -3f};

        final float[] result = VectorOperations.VECTOR_SUBTRACTION.apply(x, y);

        assertArrayEquals(expected, result, 0f);
    }

    @Test
    public void shouldReturnSumForNegativeValues() {
        final float[] x = {1f, -2f, 3.5f};
        final float[] y = {-0.5f, 2f, -1f};
        final float[] expected = {1.5f, -4f, 4.5f};

        final float[] result = VectorOperations.VECTOR_SUBTRACTION.apply(x, y);

        assertArrayEquals(expected, result, 0f);
    }

}