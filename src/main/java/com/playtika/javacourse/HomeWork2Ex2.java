package com.playtika.javacourse;

import java.util.Scanner;

public class HomeWork2Ex2 {

    static final int DEFAULT_MAX = 0; // Default max value
    static final int DEFAULT_MIN = 9; // Default min value

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите число:");
        long variable = console.nextLong();

        int lengthOfVar = getLengthOfLong(variable);

        System.out.printf("Наименьшее число: %d \n", getMin(variable, lengthOfVar));
        System.out.printf("Наибольшее число: %d", getMax(variable, lengthOfVar));
    }

    public static int getMax(long variable, int lengthOfVar) {
        int max = DEFAULT_MAX;

        for (int i=0; i < lengthOfVar; i++){
            long divider = (long) Math.pow(10, i); // divide variavle to 10^i on each iteration
            long number = (variable/divider) % 10; // define the number on each iteration

            if ((int)number > max){
                max = (int)number;
            }

        }
        return max;
    }

    public static int getMin(long variable, int lengthOfVar) {
        int min = DEFAULT_MIN;

        for (int i=0; i < lengthOfVar; i++){
            long divider = (long) Math.pow(10, i); // divide variavle to 10^i on each iteration
            long number = (variable/divider) % 10; // define the number on each iteration

            if ((int)number < min){
                min = (int)number;
            }

        }
        return min;
    }

    public static int getLengthOfLong(long variable) {
        String stringVar = Long.toString(variable);
        int length = stringVar.length();
        return length;
    }

}





