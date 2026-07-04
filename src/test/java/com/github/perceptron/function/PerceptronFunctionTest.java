package com.github.perceptron.function;

import com.github.perceptron.data.Bias;
import com.github.perceptron.data.Bit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerceptronFunctionTest {

    @Test
    public void shouldProduceNandGateTruthTableOutputsForAllInputCombinations() {
        final float ZERO = 0f;
        final float ONE = 1f;
        final float WEIGHT = -2f;
        final Bias BIAS = new Bias(3);
        final PerceptronFunction perceptron = new PerceptronFunction();

        assertEquals(Bit.ONE, perceptron.apply(
                new float[]{ZERO, ZERO},
                new float[]{WEIGHT, WEIGHT},
                BIAS));
        assertEquals(Bit.ONE, perceptron.apply(
                new float[]{ZERO, ONE},
                new float[]{WEIGHT, WEIGHT},
                BIAS));
        assertEquals(Bit.ONE, perceptron.apply(
                new float[]{ONE, ZERO},
                new float[]{WEIGHT, WEIGHT},
                BIAS));
        assertEquals(Bit.ZERO, perceptron.apply(
                new float[]{ONE, ONE},
                new float[]{WEIGHT, WEIGHT},
                BIAS));
    }

}