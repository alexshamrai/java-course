package com.playtika.javacourse.HW5;

import java.util.Scanner;

public class Parser {
    private String string;
    private String operator;
    private double leftOperand;
    private double rightOperand;

    public Parser() {
        Scanner console = new Scanner(System.in);
        console.useDelimiter("\n");
        System.out.println("Enter expression:");
        this.string = console.next();;
    }

    public void parse() {
        String arrayExpression[] = string.split(" ");
        try {
            operator = arrayExpression[1];
            leftOperand = Double.parseDouble(arrayExpression[0]);
            rightOperand = Double.parseDouble(arrayExpression[2]);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println("Expression is incorrect. Exception: " + e.getMessage());
        }
    }

    public String getOperator(){
        return operator;
    }

    public double getLeftOperand() {
        return leftOperand;
    }

    public double getRightOperand() {
        return rightOperand;
    }

}
