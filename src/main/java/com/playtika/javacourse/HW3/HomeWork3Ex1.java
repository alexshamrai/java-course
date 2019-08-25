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
        String input = console.next();
        return input;
    }

    // check if string is Palindrome
    static boolean checkPalindrome(String str){
        boolean answer = false;
        StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();
        String strReversed = sb.toString();
        answer = str.equals(strReversed);
        return answer;
    }

    // check if string is Palindrome usig for loop
    static boolean checkPalindromeWithFor(String str) {
        boolean answer = false;
        int length = str.length();

        for(int i = 0; i < length / 2; i++) {
            if(str.charAt(i) == str.charAt((length-1) - i)) {
                answer = true;
            }
            else{
                answer = false;
                return answer;
            }
        }
        return answer;
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
