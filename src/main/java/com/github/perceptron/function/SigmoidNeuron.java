package com.github.perceptron.function;

import com.github.perceptron.data.Bias;

public class SigmoidNeuron implements TriFunction<float[], float[], Bias, Float> {

    @Override
    public Float apply(final float[] inputs, final float[] weights, final Bias bias) {
        return VectorOperations.DOT_PRODUCT
                .andThen(dotProduct -> dotProduct + bias.value())
                .andThen(ActivationFunctions.SIGMOID::applyAsDouble)
                .andThen(Double::floatValue)
                .apply(inputs, weights);
    }

}
