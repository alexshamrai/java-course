package com.playtika.javacourse.HW5;

import java.util.Scanner;

public class Parser {
    private String string;

    public void askStringFromConsole(){
        Scanner console = new Scanner(System.in);
        console.useDelimiter("\n");
        System.out.println("Please, enter your " + parameterString + ": ");
        return console.next();
    }



    public String defineOperator(String string){
        //TODO define operator from the string
        return "+";
    }

}
