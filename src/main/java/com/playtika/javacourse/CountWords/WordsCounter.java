package com.playtika.javacourse.CountWords;

import java.util.Map;
import java.util.TreeMap;

/*
* class to count unique words and save it to TreeMap
* TreeMap is used to have words sorted while print them out
* has method count(String string) - to count words in string given as an argument
* and method printCountedWords - to print the result in console
 */

public class WordsCounter {

    private Map<String, Integer> wordsMap = new TreeMap<>();
    private final String SPLITSYMBOLS = "[\\d{1} \t\n,.;:!?<>*\\[\\]'&@#$%\"()-]";

    // method to count words in given string line
    public void count(String string) {
        String[] words = string.toLowerCase().split(SPLITSYMBOLS);     // break the line to words[] array using split

        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals("")) {
                if (wordsMap.containsKey(words[i])) {
                    wordsMap.put(words[i], wordsMap.get(words[i]) + 1);
                } else {
                    wordsMap.put(words[i], 1);
                }
            }
        }
    }

    public void printCountedWords() {
        for (Map.Entry entry : wordsMap.entrySet()) {
            System.out.printf("%s - %d \n",entry.getKey(), entry.getValue());
        }
    }

}
