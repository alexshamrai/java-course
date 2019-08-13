package com.playtika.javacourse;

public class HomeWork1Ex1 {

    public static void main(String args[]){
        //System.out.println("test");
        System.out.print("Long: ");
        System.out.println(equation1()); // long equation method calling

        System.out.print("Int: ");
        System.out.println(equation2()); // int equation method calling

        System.out.print("Float: ");
        System.out.println(equation3()); // float equation method calling

        System.out.print("Double: ");
        System.out.println(equation4()); // double equation method calling
    }

    // long equation method
    public static long equation1(){
        long x = 1;
        long y = 2;
        long z = 3;
        long n = 4;
        long res = x - (y+123) / z * n;
        return res;
    }
    // int equation method
    public static int equation2(){
        int x = 1;
        int y = 2;
        int z = 3;
        int n = 4;
        int res  = ( x + (50 - y*z)/n ) - x;
        return res;
    }
    // float equation method
    public static float equation3(){
        float x = 1;
        float y = 2;
        float z = 3;
        float n = 4;
        float res  = x / (y*(z-1) - 564) + n;
        return res;
    }
    // double equation method
    public static double equation4(){
        double x = 1;
        double y = 2;
        double z = 3;
        double n = 4;
        double res  = -x / -y + z / (n + 15);
        return res;
    }

}
