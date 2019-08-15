package com.playtika.javacourse;

import java.util.Scanner;

public class HomeWork2Ex2 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите число:");
        long variable = console.nextLong();

        maxmin(variable);
    }

    public static void maxmin(long variable) {

        String StringVar = Long.toString(variable);
        int n = StringVar.length();

        long min = 9;
        long max = 0;

        for (int i=0; i < n; i++){
            long divider = (long) Math.pow(10, i); // divide variavle to 10^i on each iteration
            long number = (variable/divider) % 10; // define the number on each iteration
            System.out.println(number);

            if (number < min){
                min = number;
            }

            if (number > max){
                max = number;
            }

        }

        System.out.printf("Наименьшее число: %d \n" , min);
        System.out.printf("Наибольшее число: %d", max);

    }

}
