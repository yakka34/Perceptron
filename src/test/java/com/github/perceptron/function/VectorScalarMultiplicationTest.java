package com.github.perceptron.function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class VectorScalarMultiplicationTest {

    @Test
    public void shouldReturnEmptyArrayWhenArraysAreEmpty() {
        final float[] x = {};

        final float[] result = VectorOperations.VECTOR_SCALAR_MULTIPLICATION.apply(x, 30f);

        assertArrayEquals(new float[]{}, result, 0f);
    }

    @Test
    public void shouldReturnMultiplicationForPositiveScalar() {
        final float[] x = {1f, 2f, 3.5f};
        final float[] expected = {2f, 4f, 7f};

        final float[] result = VectorOperations.VECTOR_SCALAR_MULTIPLICATION.apply(x, 2f);

        assertArrayEquals(expected, result, 0f);
    }

    @Test
    public void shouldReturnMultiplicationForNegativeScalar() {
        final float[] x = {1f, 2f, 3.5f};
        final float[] expected = {-0.5f, -1f, -1.75f};

        final float[] result = VectorOperations.VECTOR_SCALAR_MULTIPLICATION.apply(x, -0.5f);

        assertArrayEquals(expected, result, 0f);
    }

}