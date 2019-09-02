package com.playtika.javacourse.HW4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {

    static final int AMOUNT_OF_GENERATED_TRIANGLES = 100000;

    public static void main(String[] args) {
        Triangle[] triangles = generateTriangles(AMOUNT_OF_GENERATED_TRIANGLES);
        int typeNumber = getConsoleInput();
        showOutput(triangles, typeNumber);
    }

    // generate given amount of triangles
    private static Triangle[] generateTriangles(int amount) {
        Triangle[] triangles = new Triangle[amount];
        System.out.println("Generating " + amount + " triangles...");
        for (int i = 0; i < amount; ) {
            Point a = new Point(new Random().nextInt(1000), new Random().nextInt(1000));
            Point b = new Point(new Random().nextInt(1000), new Random().nextInt(1000));
            Point c = new Point(new Random().nextInt(1000), new Random().nextInt(1000));
            Triangle triangle = new Triangle(a, b, c);
            if (triangle.isValid()) {
                triangles[i] = triangle;
                i++;
            }
        }
        return triangles;
    }

    private static int findGivenTriangle(Triangle[] triangles, int typeNumber) {
        String type = typeNumberToString(typeNumber);
        int i;

        for (i = 0; i < triangles.length; i++) {
            if (triangles[i].type() == type) {
                return i;
            }
        }
        return -1;
    }

    //show result in console
    static void showOutput(Triangle[] triangles, int typeNumber) {
        int triangleIndex = findGivenTriangle(triangles, typeNumber);
        if (triangleIndex == -1) {
            System.out.println(typeNumberToString(typeNumber) + " triangle is not found");
        }
        else {
            System.out.println(typeNumberToString(typeNumber) + " triangle is found");
            System.out.println("Index: " + triangleIndex);
            System.out.println(triangles[triangleIndex]);
            System.out.println("Perimeter: " + triangles[triangleIndex].perimeter());
            System.out.println("Square: " + triangles[triangleIndex].square());
        }
    }

    // convert nymber of type to string
    static String typeNumberToString(int typeNumber) {
        switch (typeNumber) {
            case 1:
                return "Isosceles";
            case 2:
                return "Equilateral";
            case 3:
                return "Rectangular";
            default:
                return "Random";
        }
    }

    // method for getting a string from console
    static int getConsoleInput(){
        int type;
        Scanner console = new Scanner(System.in);
        System.out.println("Choose the type of triangle:");
        System.out.println("1.Isosceles ");
        System.out.println("2.Equilateral ");
        System.out.println("3.Rectangular ");
        System.out.println("4.Random ");

        do {
            type = console.nextInt();
            if (type < 1 || type > 4) {
                System.out.println("Enter a number from 1 to 4");
            }
        }
        while (type < 1 || type > 4);

        return type;
    }

}
