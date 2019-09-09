package com.playtika.javacourse.HW5;

/**
 * Операция логарифм по основанию (X log Y) - логарифм от X c основанием Y
 * Логарифм от left с основанием right
 */
public class Logarithm implements BinaryOperation {
    @Override
    public double resultFor(double left, double right) {
        return Math.log(left)/Math.log(right);
    }
}
