package com.playtika.javacourse;

public class HomeWork1Ex2 {

    public static void main(String[] args) {
        int variable = 98761;
        decompose(variable);
    }

    public static void decompose(int variable) {
        System.out.println("Variable is: " + variable);
        System.out.println("Decomposed:");
        System.out.println( variable/10000);
        System.out.println( (variable/1000) % 10 );
        System.out.println( (variable/100) % 10 );
        System.out.println( (variable/10) % 10 );
        System.out.println(variable % 10);

    }

}
