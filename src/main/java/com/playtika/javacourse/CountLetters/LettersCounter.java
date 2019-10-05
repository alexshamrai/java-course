package com.playtika.javacourse.CountLetters;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LettersCounter {

    public static void main(String[] args) {
        String line;
        String[] letters;
        Path path = Paths.get(args[0]);
        Dictionary dictionary = new Dictionary();

        try (BufferedReader reader = Files.newBufferedReader(path);) {
            while ((line = reader.readLine()) != null) {
                dictionary.append(line);
                }
            } catch (IOException e) {
            e.printStackTrace();
        }
        dictionary.printDictionary();
    }

}
