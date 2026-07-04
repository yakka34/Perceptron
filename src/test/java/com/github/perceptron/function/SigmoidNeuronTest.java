package com.github.perceptron.function;

import com.github.perceptron.data.Bias;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SigmoidNeuronTest {

    @Test
    public void shouldHandleZeroWeightsAndInputs() {
        final float[] inputs = {0.0f, 0.0f};
        final float[] weights = {0.0f, 0.0f};
        final Bias bias = new Bias(0.0f);

        final float result = Neurons.SIGMOID.apply(inputs, weights, bias);

        assertEquals(0.5f, result);
    }

    @Test
    public void shouldCalculateCorrectOutputForPositiveZ() {
        final float[] inputs = {1.0f};
        final float[] weights = {2.0f};
        final Bias bias =new Bias(3.0f);

        final float result = Neurons.SIGMOID.apply(inputs, weights, bias);

        assertEquals(0.9933072f, result);
    }

    @Test
    public void shouldCalculateCorrectOutputForNegativeZ() {
        final float[] inputs = {-2.0f};
        final float[] weights = {2.0f};
        final Bias bias = new Bias(-1.0f);

        float result = Neurons.SIGMOID.apply(inputs, weights, bias);

        assertEquals(0.006692851f, result);
    }

}