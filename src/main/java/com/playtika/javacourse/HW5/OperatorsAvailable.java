package com.playtika.javacourse.HW5;

public enum OperatorsAvailable {
    ADDITION("+"),
    SUBSTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/"),
    EXPONENT("^"),
    LOGARITHM("log"),
    ROOT("sqrt");

    private String Operator;

    private OperatorsAvailable(String operator) {
        this.Operator = operator;
    }

    public String getOperatorString(){
        return Operator;
    }
}


