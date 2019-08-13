package com.playtika.javacourse;

public class HomeWork1Ex3 {

    public static void main (String[] args){
        int x = 100000;
        int y = 1;
        int z = 1;

        // caluclating vector length
        double length = Math.sqrt(x*x + y*y + z*z);

        // calculating cordinates for unit vector
        double x1 = (double) x / length;
        double y1 = (double) y / length;
        double z1 = (double) z / length;

        System.out.printf("Единичный вектор для вектора (%d, %d, %d) => (%f, %f, %f) ", x ,y ,z ,x1, y1, z1);
    }

}
