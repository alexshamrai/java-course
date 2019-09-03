package com.playtika.javacourse.HW4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {

    static final int AMOUNT_OF_GENERATED_TRIANGLES = 100000;

    public static void main(String[] args) {
        Triangle[] triangles = generateTriangles(AMOUNT_OF_GENERATED_TRIANGLES);
        int typeNumber = getConsoleInput();
        findGivenTriangle(triangles, typeNumber);
    }

    // generate given amount of triangles
    private static Triangle[] generateTriangles(int amount) {
        Triangle[] triangles = new Triangle[amount];
        System.out.println("Generating " + amount + " triangles...");
        for (int i = 0; i < amount; ) {
            Triangle triangle = new Triangle(generatePoint(), generatePoint(), generatePoint());
            if (triangle.isValid()) {
                triangles[i] = triangle;
                i++;
            }
        }
        return triangles;
    }

    private static Point generatePoint() {
        return new Point (new Random().nextInt(1000), new Random().nextInt(1000));
    }

    private static void findGivenTriangle(Triangle[] triangles, int typeNumber) {
        String type = TrianglesTypes.values()[typeNumber-1].getTypeName();
        for (int i = 0; i < triangles.length; i++) {
            if (triangles[i].getType().equals(type)) {
                System.out.printf("%s triangle is found.%nIndex: %d%n%s ", type, i, triangles[i].toString());
                break;
            } else {
                if (i == triangles.length - 1) {
                    System.out.printf( "%s triangle is not found!", type);
                }
            }
        }
    }

    // method for getting a string from console
    static int getConsoleInput(){
        int type;
        Scanner console = new Scanner(System.in);
        // output types of triangles using enum
        System.out.println("Choose the type of triangle:" );
        for (int i = 0; i < 4; i++) {
            System.out.println(TrianglesTypes.values()[i]);
        }

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
