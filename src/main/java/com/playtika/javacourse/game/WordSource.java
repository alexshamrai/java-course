package com.playtika.javacourse.game;

import java.util.concurrent.ThreadLocalRandom;

public class WordSource {
    private static final String[] WORDS = {
            "love",
            "dog",
            "cat",
            "flower",
            "daughter",
            "family"
    };

    public String getWord() {
        int index = ThreadLocalRandom.current().nextInt(WORDS.length);
        return WORDS[index];
    }
}
