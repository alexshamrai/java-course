package com.playtika.javacourse.grep;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

/*
*
* Searches and prints line in the text while which matches the expression
*
 */
public class Searcher {

    private Path path;

    public Searcher(Path path) {
        this.path = path;
    }

    // read and print string if found
    public void Search(Pattern expression) {
        try (BufferedReader reader = Files.newBufferedReader(path);) {
            String line;
            int i = 0;
            boolean isNotPrinted = true;

            // read the file
            while ((line = reader.readLine()) != null) {
                if (expression.matcher(line).matches()) {
                    System.out.println(i + " : " + line);
                    isNotPrinted = false;
                }
                i++;
            }

            if (isNotPrinted) {
                System.out.println("Expression is not found");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
