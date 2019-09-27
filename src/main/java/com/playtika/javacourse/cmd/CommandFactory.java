package com.playtika.javacourse.cmd;

import java.nio.file.Paths;

public class CommandFactory {

    public Command getCommand(String command) {
        String[] strings = command.split(" ");
        switch (strings[0]){
            case "chdir":
                return new ChangeDirCommand(strings);
            case "ls":
                return new ListCommand();
            case "exit":
                return new ExitComand();
            case "echo":
                return new EchoCommand(strings);
            default:
                return new UnknownCommand();
        }
     //   return;
    }
}
