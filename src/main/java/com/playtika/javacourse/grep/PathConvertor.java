package com.playtika.javacourse.grep;

import java.nio.file.*;

public class PathConvertor {

    private String path;
    public PathConvertor(String stringPath) {
        this.path = stringPath;
    }

    // check file existence. if file does not exist print an error
    private boolean isExist() {
        if (!Files.exists(Paths.get(path))) {
            System.err.println("File " + convertStringToPath() + " does not exists");
            return false;
        }
        return true;
    }

    // check if file is readable. if file does not exist print an error
    private boolean isReadable() {
        if (!Files.isReadable(Paths.get(path))) {
            System.err.println("Cannot read file: "+ convertStringToPath()+ ". Access Denied");
            return false;
        }
        return true;
    }

    // check if file is not a directory. if file does not exist print an error
    private boolean isNotDirectory() {
        if (Files.isDirectory(Paths.get(path))) {
            System.err.println(convertStringToPath() + " is a directory, not a file");
            return false;
        }
        return true;
    }

    // method to convert given String to absolute path
    public Path convertStringToPath() {
        return Paths.get(path).toAbsolutePath();
    }

    // validate path
    public boolean isValid() {
        if (isExist() && isReadable() && isNotDirectory()) {
            return true;
        }
        return false;
    }

}
