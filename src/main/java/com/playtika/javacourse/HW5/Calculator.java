package com.playtika.javacourse.HW5;

/**
 *
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


    //define operator via comparing with enum parameters (returns class of needed operation or null)
    private BinaryOperation getOperationFor(String operator) {
            for(OperatorsAvailable Available: OperatorsAvailable.values()){
                if (operator.equals(Available.getOperatorString())) {
                    return new OperatorFactory().getOperator(Available);
                }
            }
            return null;
        }

    public static void main(String[] args) {
        Parser expression = new Parser();
        Calculator calculator = new Calculator();
        expression.parse();

        System.out.println(calculator.calculate(expression.getLeftOperand(), expression.getRightOperand(), expression.getOperator()));

    }
}