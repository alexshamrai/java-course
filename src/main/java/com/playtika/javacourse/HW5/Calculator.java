package com.playtika.javacourse.HW5;

/**
 *
 * @author Andrey
 */
public class Calculator {


    public double calculate(double val1, double val2, String operator) {
        BinaryOperation operation = getOperationFor(operator);

        if (operation == null) {
            System.out.println("Неизвестный оператор " + operator);
            return Double.NaN;
        }

        return operation.resultFor(val1, val2);
    }

    private BinaryOperation getOperationFor(String operator) {
        if ("*".equals(operator)) {
            return new Multiplication();
        } else if ("-".equals(operator)) {
            return new Substraction();
        }

        return null;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println( calculator.calculate(456.546, 545.5465, "*") );
        System.out.println( calculator.calculate(456.546, 545.5465, "-") );
    }
}