package com.playtika.javacourse.grep;
import java.io.IOException;
import java.util.regex.Pattern;

public class Main {
        public static void main(String[] args) {
            if (!isValid(args)) {
                return;
            }
            PathConvertor pathConvertor = new PathConvertor(args[0]);

            if (!pathConvertor.isValid()) {
                return;
            }
            Searcher searcher = new Searcher(pathConvertor.convertStringToPath());
            Pattern pattern = Pattern.compile(String.format("^.*(%s).*$", args[1])); // make a pattern with given expression
            try {
                searcher.Search(pattern);
            } catch (IOException e) {
                System.err.println(e.toString());
            }

        }

        private static boolean isValid(String[] args) {
            if (args.length != 2) {
                System.out.println("Run program with 2 arguments: path, expression");
                return false;
            }
            if (args[0].isEmpty()|| args[1].isEmpty()) {
                System.out.println("Arguments should not be empty");
                return false;
            }
            return true;
        }
}
