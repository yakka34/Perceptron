package com.github.perceptron.data;

public record TrainingResult(FloatArray weights, Bias bias, int epochs, int mistakes) {

}
