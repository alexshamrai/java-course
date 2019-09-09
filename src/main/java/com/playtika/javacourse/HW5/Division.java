package com.playtika.javacourse.HW5;

/**
 * Операция деления (X  / Y)
 */
public class Division implements BinaryOperation {
    @Override
    public double resultFor(double left, double right){
        return left / right;
    }
}
