package com.playtika.javacourse.HW5;

/**
 * Операция возведения в степень (X  ^ Y)
 */
public class Exponent implements BinaryOperation {
    @Override
    public double resultFor(double left, double right) {
        return Math.pow(left, right);
    }
}
