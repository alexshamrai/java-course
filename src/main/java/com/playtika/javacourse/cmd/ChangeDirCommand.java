package com.playtika.javacourse.cmd;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ChangeDirCommand implements Command {
    private String[] args;

    public ChangeDirCommand(String[] args) {
        this.args = args;
    }

    @Override
    public void execute(Context context) throws IOException {
        // check arguments
        if (args.length != 2) {
            System.out.println("1 argument expected");
            return;
        }

        Path newPath = Paths.get(args[1]);
        if (!newPath.isAbsolute()){
            newPath = context.getPath().resolve(newPath).toAbsolutePath();
        }

        if (Files.isDirectory(newPath)){
            context.setPath(newPath);
        } else {
            System.out.println("Path is not correct: " + newPath);
        }
    }
}
