package com.playtika.javacourse.grep;

import java.io.IOException;
import java.nio.file.*;

public class PathConvertor {

    private String path;

    public PathConvertor(String stringPath) {
        this.path = stringPath;
    }

    private boolean validate() {
        try {
            if (isExist() && isReadable() && isNotDirectory()) {
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    // check file existence. if file exist - do nothing. if not exist throw the exception
    private boolean isExist() throws IOException {
        if (!Files.exists(Paths.get(path))) {
            System.err.println("File " + convertStringToPath() + " does not exist");
            throw new NoSuchFileException(path);
        }
        return true;
    }

    private boolean isReadable() throws IOException {
        if (!Files.isReadable(Paths.get(path))) {
            System.err.println("Cannot read the file. Access Denied");
            throw new AccessDeniedException(path);
        }
        return true;
    }

    private boolean isNotDirectory() throws IOException {
        if (Files.isDirectory(Paths.get(path))) {
            System.err.println("It's a directory, not a file");
            throw new IOException();
        }
        return true;
    }

    // method to convert given String to absolute path
    public Path convertStringToPath() {
        return Paths.get(path).toAbsolutePath();
    }

    public boolean isValid() {
        return validate();
    }
}
