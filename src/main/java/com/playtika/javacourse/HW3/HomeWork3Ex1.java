package com.playtika.javacourse.HW3;

import java.util.Scanner;

public class HomeWork3Ex1{
    public static void main(String[] args) {
        String input = getConsoleInput();
        showOutput(checkPalindrome(input));
        showOutput(checkPalindromeWithFor(input));
    }

    // method for getting a string from console
    static String getConsoleInput(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите слово:");
        return console.next();
    }

    // check if string is Palindrome
    static boolean checkPalindrome(String str){
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    // check if string is Palindrome using for loop
    static boolean checkPalindromeWithFor(String str) {
        boolean answer = true;

        for(int i = 0; i < str.length() / 2; i++) {
            if(isStringForPalindrom(str, i)) {
                answer = false;
                break;
            }
        }
        return answer;
    }

    //check that that string is equal symmetrically on each iteration ( str[0] == str[str.length-1]... str[1] == str[str.length-2]... and so on...)
    static boolean isStringForPalindrom(String str, int i) {
        if (str.charAt(i) == str.charAt((str.length()-1) - i)){
            return false;
        }
        return true;
    }

    // method for console output
    static void showOutput(boolean result) {
        if (result == true) {
            System.out.println("ДА");
        }
        else {
            System.out.println("НЕТ");
        }

    }
}
