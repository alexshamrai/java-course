package com.playtika.javacourse.HW5;

/**
 * Операция вычитания
 */
public class Substraction implements BinaryOperation {

    @Override
    public double resultFor(double left, double right) {
        return left - right;
    }

}