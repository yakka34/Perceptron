package com.github.perceptron.function;

public class VectorOperations {

    private VectorOperations() {

    }

    public static final DotProductFunction DOT_PRODUCT = new DotProductFunction();
    public static final VectorAdditionFunction VECTOR_ADDITION = new VectorAdditionFunction();
    public static final VectorSubtractionFunction VECTOR_SUBTRACTION = new VectorSubtractionFunction();
    public static final SquaredMagnitudeFunction VECTOR_SQUARED_MAGNITUDE = new SquaredMagnitudeFunction();
    public static final VectorScalarMultiplication VECTOR_SCALAR_MULTIPLICATION = new VectorScalarMultiplication();
    public static final VectorNegateFunction VECTOR_NEGATE = new VectorNegateFunction();

}
