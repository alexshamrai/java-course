package com.playtika.javacourse.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Andrey
 */
public class CopyChars {

    static void copyByChar(String fileFrom, String fileTo) throws IOException {
        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader(fileFrom);
            outputStream = new FileWriter(fileTo);

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    static void copyByLine(String fileFrom, String fileTo) throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;



        try {
            inputStream = new BufferedReader(new FileReader(fileFrom));
            outputStream = new PrintWriter(new FileWriter(fileTo));


            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    public static void main(String[] args) throws IOException {

        copyByLine("C:\\Users\\oshamrai\\Documents\\V3 машины\\49 Dragons.txt", "C:\\Users\\oshamrai\\Documents\\V3 машины\\49 DragonsDDDDDD.txt");
    }
}
