package com.playtika.javacourse.HW5;


/**
 * Операция корень по основанию (X sqrt Y) - корень из числа X в степени Y
 * корень из числа left в степени right
 */
public class Root implements BinaryOperation {
    @Override
    public double resultFor(double left, double right) {
        return Math.pow(left, (1/right));
    }
}
