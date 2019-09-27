package com.playtika.javacourse.grep;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {


        static String stringPath = "C:\\Users\\oshamrai\\Documents\\ForJava\\Daily Activity.txt";
        static String expression = "***** \t27.07.19\t*****";

        public static void main(String[] args) throws IOException {
            try (BufferedReader reader = Files.newBufferedReader(Paths.get(stringPath));) {
                String line;
                int i = 0;
                // read the file
                while ((line = reader.readLine()) != null) {
                    if (line.equals(expression)) {
                        System.out.println(i + " : " + line);
                    }
                    i++;
                }
            }

        }



}
