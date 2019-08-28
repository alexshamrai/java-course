package com.playtika.javacourse.HW3;

import java.util.Scanner;

public class HomeWork3Ex4 {

  //  static final String[] PARAMETERS = {"Full Name", "Mobile phone" , "Email"};

    public static void main(String[] args) {
        String fullName = askInputForParameter("Full Name");
        String mobilePhone = askInputForParameter("Mobile phone");
        String email = askInputForParameter("Email");
        checkFullName(fullName);
        checkmobilePhone(mobilePhone);
        checkEmail(email);
    }

    // getting a string from console
    static String askInputForParameter(String parameterString){
        Scanner console = new Scanner(System.in);
        console.useDelimiter("\n");
        System.out.println("Please, enter your " + parameterString);
        return console.next();
    }

    static boolean isValidFullName(String fullName) {
        return true;
    }

    static boolean isValidMobilePhone(String mobilePhone) {
        return false;
    }

    static boolean isValidEmail(String email) {
        return false;
    }

    static void checkFullName(String fullName) {
        if (!isValidFullName(fullName)) {
            System.out.println("Name is invalid. Only characters, hyphen and space are allowed");
        }
    }

    static void checkmobilePhone(String mobilePhone) {
        if (!isValidMobilePhone(mobilePhone)) {
            System.out.println("Mobile phone is invalid. Only digits are allowed in the following form: +380(XX)(XXXXXXX)");
        }
    }

    static void checkEmail(String email) {
        if (!isValidEmail(email)) {
            System.out.println("Email is invalid");
        }
    }
}
