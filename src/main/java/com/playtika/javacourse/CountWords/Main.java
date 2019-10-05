package com.playtika.javacourse.CountWords;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        if (!isValid(args)) {
            return;
        }
        String line;
        Path path = Paths.get(args[0]);
        WordsCounter wordsCounter = new WordsCounter();

        try (BufferedReader reader = Files.newBufferedReader(path);) {
            while ((line = reader.readLine()) != null) {
                wordsCounter.count(line);
            }
        } catch (IOException e) {
            System.out.println("Somethin went wrong: " + e.getMessage());
        }

        wordsCounter.printCountedWords();
    }

    private static boolean isValid(String[] args) {
        if (args.length != 1) {
            System.out.println("Run program the only argument: path to text file");
            return false;
        }
        return true;
    }
}
