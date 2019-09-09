package com.playtika.javacourse.HW5;

public class OperatorFactory {

    public BinaryOperation getOperator(OperatorsAvailable operator){
        switch (operator) {
            case ADDITION:
                return new Addition();
            case SUBSTRACTION:
                return new Substraction();
            case MULTIPLICATION:
                return new Multiplication();
            case DIVISION:
                return new Division();
            case EXPONENT:
                return new Exponent();
            case LOGARITHM:
                return new Logarithm();
            case ROOT:
                return new Root();
            default:
                return null;
        }
    }
}
