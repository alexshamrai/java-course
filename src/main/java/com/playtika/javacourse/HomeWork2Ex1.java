package com.playtika.javacourse;

import java.util.Scanner;

public class HomeWork2Ex1 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        console.useDelimiter("\n");

        String str1 = "Курс: Java core"; // 1я строка
        String str2 = "Студент"; // 2я строка
        // 3я строка - ФИО
        System.out.println("Введите ваше ФИО:");
        String str3 = console.next();

        int strlength; // length of the max string
        if (str1.length() > str2.length()) {
            strlength = str1.length();
        }
        else {
            strlength = str2.length();
        }

        if (str3.length() > strlength) {
            strlength = str3.length();
        }

        // output
        asterisk(strlength);
        title(str1, strlength);
        title(str2, strlength);
        title(str3, strlength);
        asterisk(strlength);

    }

    // method for the frame of astrisks
    public static void asterisk(int maxlength){
        for (int i = 0; i < (maxlength +4); i++){
            System.out.print("*");
        }
        System.out.println();
    }

    // method for title typing
    public static void title(String str, int maxlength){
        System.out.print("* ");

        int x1 = (maxlength - str.length())/2;
        // spaces on the left
        for (int i = 0; i < x1; i++){
            System.out.print(" ");
        }

        System.out.print(str);

        int x2 = (maxlength - str.length()) - x1;
        // spaces on the right
        for (int i = 0; i < x2; i++){
            System.out.print(" ");
        }

        System.out.println(" *");
    }

}