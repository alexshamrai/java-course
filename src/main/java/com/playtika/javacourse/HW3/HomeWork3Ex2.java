package com.playtika.javacourse.HW3;
import java.util.Scanner;

public class HomeWork3Ex2 {
    public static void main(String[] args) {
        String str = getConsoleInput();
        String[] subStrings = str.split(" ");
        System.out.println(getModifiedString(subStrings));
    }

    // method for getting a string from console
    static String getConsoleInput(){
        Scanner console = new Scanner(System.in);
        console.useDelimiter("\n"); // set end line as Delimeter (to accept spaces in the entered string)

        System.out.println("Введите строку:");
        return console.next();
    }

    // get reversed single word using string builder
    static String getReversedWord(String word){
        StringBuilder stringBuilderWord = new StringBuilder(word).reverse();
        return stringBuilderWord.toString();
    }

    //get modified string with reversed words
    static String getModifiedString(String[] subStrings){
        StringBuilder concatString = new StringBuilder();

        for (int i = 0; i < subStrings.length; i++){
            concatString.append(getReversedWord(subStrings[i]));
            if (i != subStrings.length - 1){
                concatString.append(" ");
            }
        }
        return concatString.toString();
    }
}
