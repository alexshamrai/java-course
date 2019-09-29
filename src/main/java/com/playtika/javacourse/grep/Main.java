package com.playtika.javacourse.grep;
import java.util.regex.Pattern;

public class Main {
        public static void main(String[] args) {
            if (isValid(args)) {
                PathConvertor pathConvertor = new PathConvertor(args[0]);
                Pattern pattern = Pattern.compile(String.format("^.*(%s).*$", args[1])); // make a pattern with given expression
                if (pathConvertor.isValid()) {
                    Searcher searcher = new Searcher(pathConvertor.convertStringToPath());
                    searcher.Search(pattern);
                }
            }
            return;
        }

        static boolean isValid(String[] args) {
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
