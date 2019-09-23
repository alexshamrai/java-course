package com.playtika.javacourse.HW5;

/**
 *
 */
public class Calculator {

    public double calculate(double val1, double val2, String operator) throws NullPointerException, IllegalArgumentException{
        BinaryOperation operation = getOperationFor(operator);

        if (operation == null) {
            System.out.print("Неизвестный оператор: " + operator + " - ");
            return Double.NaN;
        }

        return operation.resultFor(val1, val2);
    }


    //define operator via comparing with enum parameters (returns class of needed operation or null)
    private BinaryOperation getOperationFor(String operator) throws NullPointerException, IllegalArgumentException {
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
        try {
            expression.parse();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println("Expression is incorrect. Exception: " + e.getMessage());
        }
        try {
            System.out.println(calculator.calculate(expression.getLeftOperand(), expression.getRightOperand(), expression.getOperator()));
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Operator or operand is incorrect. Error: " + e.getMessage());
        }


    }
}