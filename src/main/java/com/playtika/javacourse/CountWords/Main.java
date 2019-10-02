package com.playtika.javacourse.CountWords;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\oshamrai\\Documents\\ForJava\\Sherlok.txt");
        TextFileReader textFileReader = new TextFileReader();
        Map<String, Integer> wordsMap = textFileReader.readFile(path);

        for (Map.Entry entry : wordsMap.entrySet()) {
            System.out.println(entry);
        }

    }
}
