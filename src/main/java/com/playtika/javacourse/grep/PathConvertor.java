package com.playtika.javacourse.grep;

import java.io.IOException;
import java.nio.file.*;

public class PathConvertor {

    private String stringPath;

    public PathConvertor(String stringPath) {
        this.stringPath = stringPath;
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
        if (!Files.exists(Paths.get(stringPath))) {
            System.err.println("File " + convertLogic() + " does not exist");
            throw new NoSuchFileException(stringPath);
        }
        return true;
    }

    private boolean isReadable() throws IOException {
        if (!Files.isReadable(Paths.get(stringPath))) {
            System.err.println("Cannot read the file. Access Denied");
            throw new AccessDeniedException(stringPath);
        }
        return true;
    }

    private boolean isNotDirectory() throws IOException {
        if (Files.isDirectory(Paths.get(stringPath))) {
            System.err.println("You are adress to the directory");
            throw new IOException();
        }
        return true;
    }

    // method to convert given String to absolute path
    private Path convertLogic(){
        if (Paths.get(stringPath).isAbsolute()) {
            return Paths.get(stringPath);
        }
        return Paths.get(stringPath).toAbsolutePath();
    }

    public Path convertStringToPath() {
        return convertLogic();
    }

    public boolean isValid() {
        return validate();
    }
}
