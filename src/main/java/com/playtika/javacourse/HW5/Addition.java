package com.playtika.javacourse.HW5;

/**
 * Операция сложения (X + Y)
 */
public class Addition implements BinaryOperation {
    @Override
    public double resultFor(double left, double right) {
        return left + right;
    }
}
