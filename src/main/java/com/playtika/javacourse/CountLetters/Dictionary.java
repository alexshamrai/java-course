package com.playtika.javacourse.CountLetters;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Dictionary {

    private Map<Character, Double> lettersMap = new TreeMap<>();
    private long globalCounter;

    public void append(String string) {
        string = string.toLowerCase();
        for (int i = 0; i < string.length(); i++) {
            char letter = string.charAt(i);
            if ( letter >= 'а' && letter <= 'я') {
                globalCounter++;
                if (lettersMap.containsKey(letter)) {
                    lettersMap.put(letter, lettersMap.get(letter) + 1);
                } else {
                    lettersMap.put(letter, (double) 1);
                }
            }
        }
    }

    public void printDictionary() {
        for (Map.Entry<Character, Double> entry : lettersMap.entrySet()) {
            double n =  entry.getValue()/globalCounter;
            System.out.printf("%s: вероятность вхождения = %.3f \n",entry.getKey(), n);
        }
    }

}
