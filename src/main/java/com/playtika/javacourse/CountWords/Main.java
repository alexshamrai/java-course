package com.playtika.javacourse.CountWords;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        if (!isValid(args)) {
            return;
        }

        Path path = Paths.get(args[0]);
        TextFileReader textFileReader = new TextFileReader();
        Map<String, Integer> wordsMap = null;
        try {
            wordsMap = textFileReader.readFile(path);
            for (Map.Entry entry : wordsMap.entrySet()) {
                System.out.println(entry);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong - " + e);
        }

    }

    private static boolean isValid(String[] args) {
        if (args.length != 1) {
            System.out.println("Run program the only argument: path to text file");
            return false;
        }
        return true;
    }
}
