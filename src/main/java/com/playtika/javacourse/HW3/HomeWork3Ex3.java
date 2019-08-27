package com.playtika.javacourse.HW3;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class HomeWork3Ex3 {
    public static void main(String[] args) {
        int length = getLength();
        int arr[] = fillArray(length);
        displayArray(arr);
        System.out.println(findMultipleOf3(arr));
    }

    // display the Array in console
    static void displayArray(int[] arr){
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            System.out.print(String.format("%d ", arr[i]));
        }
        System.out.println("");
    }

    // find each multiple of 3 element and return as a String
    static String findMultipleOf3 (int[] arr){
        int length = arr.length;
        StringBuilder multiplesOf3 = new StringBuilder();

        for (int i = 0; i < length; i++) {
            if ((arr[i] % 3) == 0) {
                multiplesOf3.append(arr[i]).append(" ");
            }
        }

        return multiplesOf3.toString().trim();
    }

    // get length via asking user to enter it from console
    static int getLength(){
        int length;
        Scanner console = new Scanner(System.in);

        do {
            System.out.println("Введите длину массива (положительное число от 10 до 100):");
            length = console.nextInt();
            if (length < 10 || length > 100) {
                System.out.println("Невенрный ввод. Число должно быть от 10 до 100.");
            }
        }
        while (length < 10 || length > 100);
        return length;
    }

    // fill the array with given length
    static int[] fillArray(int length) {
        int[] filledArray = new int[length];

        for (int i = 0; i < length; i++) {
            filledArray[i] = ThreadLocalRandom.current().nextInt(100);
        }
        return filledArray;
    }
}
