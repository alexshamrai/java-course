package com.playtika.javacourse;

import java.util.Scanner;

public class HomeWork2Ex3 {
    public static void main(String[] args){
        // read programmers amount from console
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число программистов:");
        int numberOfProgrammers = console.nextInt();

        System.out.printf("Общее число собеседований: %d", getInterviewValue(numberOfProgrammers));
    }

    public static int getInterviewValue(int numberOfProgrammers){
         if (numberOfProgrammers == 1) {
            return 0;
        }
        int interviewValue = getInterviewValue(numberOfProgrammers - 1) + (numberOfProgrammers - 1);
        return interviewValue;
    }
}
