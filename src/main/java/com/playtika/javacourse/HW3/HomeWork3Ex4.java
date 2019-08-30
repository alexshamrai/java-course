package com.playtika.javacourse.HW3;

import java.util.Scanner;
import java.util.regex.Pattern;

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
        System.out.println("Please, enter your " + parameterString + ": ");
        return console.next();
    }

    static boolean isValidFullName(String fullName) {
        Pattern pattern = Pattern.compile("^[a-zA-Z\\s\\-]+");
        return pattern.matcher(fullName).matches();
    }

    static boolean isValidMobilePhone(String mobilePhone) {
        Pattern pattern = Pattern.compile("^\\+(380)(66|97|63)(\\d){7}$");
        return pattern.matcher(mobilePhone).matches();
    }

    static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile("^[A-Z0-9._-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        return pattern.matcher(email).matches();
    }

    static void checkFullName(String fullName) {
        if (!isValidFullName(fullName)) {
            System.out.println("Name is invalid. Only characters, hyphen and space are allowed");
        }
    }

    static void checkmobilePhone(String mobilePhone) {
        if (!isValidMobilePhone(mobilePhone)) {
            System.out.println("Mobile phone is invalid");
        }
    }

    static void checkEmail(String email) {
        if (!isValidEmail(email)) {
            System.out.println("Email is invalid");
        }
    }
}
