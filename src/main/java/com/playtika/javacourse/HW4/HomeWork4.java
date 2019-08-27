package com.playtika.javacourse.HW4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeWork4 {

    public static void main(String[] args) {
        Triangle[] triangles = generateTriangles();
        //TODO read console for triangle type
        // search and print triangle (first in a list)
    }

    private static Triangle[] generateTriangles() {
        Triangle[] triangles = new Triangle[10];
        for (int i = 0; i < 10; ) {
            Point a = new Point(new Random().nextInt(10), new Random().nextInt(10));
            Point b = new Point(new Random().nextInt(10), new Random().nextInt(10));
            Point c = new Point(new Random().nextInt(10), new Random().nextInt(10));
            Triangle triangle = new Triangle(a, b, c);
            if (isValid(triangle)) {
                triangles[i] = triangle;
                i++;
            }
        }
        return triangles;
    }

    private static boolean isValid(Triangle triangle) {
        //TODO implement logic
        return true;
    }
}
