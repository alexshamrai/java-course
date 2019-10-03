package com.playtika.javacourse.CountWords;

import sun.misc.Regexp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

/*
* Class to read the file
* which has method readFile which returns Map of not sorted elements
 */

public class TextFileReader {

    private Path path;
    private Map<String, Integer> wordsMap = new TreeMap<>(); // TreeMap is used to get Map sorted by key for output
    private final String SPLITSYMBOLS = "[\\d{1} \t\n,.;:!?<>*\\[\\]'&@#$%\"()-]";

    public Map<String, Integer> readFile(Path path) throws FileNotFoundException, IOException {
        String line;
        String[] words;

        try (BufferedReader reader = Files.newBufferedReader(path);) {
            while ((line = reader.readLine()) != null) {
                words = line.split(SPLITSYMBOLS);            // break the line to words in using split
                for (int i = 0; i < words.length; i++) {
                    if (!words[i].equals("")) {
                        if (wordsMap.containsKey(words[i])) {
                            wordsMap.put(words[i].trim().toLowerCase(), wordsMap.get(words[i]) + 1);
                        } else {
                            wordsMap.put(words[i].trim().toLowerCase(), 1);
                        }
                    }
                }

            }
        }
        return wordsMap;
    }
}
