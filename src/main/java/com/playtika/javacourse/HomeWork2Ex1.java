package com.playtika.javacourse;

import java.util.Scanner;

public class HomeWork2Ex1 {

    static final int SIDE_ASTERISK = 4; // +4 additional asterisks aсcording to frame format "* <string> *"

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        console.useDelimiter("\n"); // set end line as Delimeter (to accept spaces in the entered string)

        final String str1 = "Курс: Java core"; // 1я строка
        final String str2 = "Студент"; // 2я строка
        // 3я строка - ФИО
        System.out.println("Введите ваше ФИО:");
        String str3 = console.next();

        int maxStringLength = getMaxStringLength(str1, str2, str3); // length of the max string

        asterisk(maxStringLength);
        title(str1, maxStringLength);
        title(str2, maxStringLength);
        title(str3, maxStringLength);
        asterisk(maxStringLength);

    }

    // method for the frame of asterisks
    public static void asterisk(int maxLength){
        for (int i = 0; i < (maxLength + SIDE_ASTERISK); i++){
            System.out.print("*");
        }
        System.out.println();
    }

    // method for title typing
    public static void title(String str, int maxLength){
        System.out.print("* ");

        //int x1 = (maxLength - str.length())/2;
        int leftIndent = getLeftIndent(maxLength, str);
        // spaces on the left
        for (int i = 0; i < leftIndent; i++){
            System.out.print(" ");
        }

        System.out.print(str);

        int rightIndent = getRightIndent(maxLength, str);
        // spaces on the right
        for (int i = 0; i < rightIndent; i++){
            System.out.print(" ");
        }

        System.out.println(" *");
    }

    // Define amount of spaces on the left
    public static int getLeftIndent(int maxLength, String str){
        int x = (maxLength - str.length())/2;
        return x;
    }

    // Define amount of spaces on the right
    public static int getRightIndent(int maxLength, String str){
        int x = (maxLength - str.length()) - getLeftIndent(maxLength, str);
        return x;
    }

    public static int getMaxStringLength(String str1, String str2, String str3)
    {
        int maxStringLength;
        if (str1.length() > str2.length()) {
            maxStringLength = str1.length();
        }
        else {
            maxStringLength = str2.length();
        }

        if (str3.length() > maxStringLength) {
            maxStringLength = str3.length();

        }
        return maxStringLength;
    }

}