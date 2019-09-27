package com.playtika.javacourse.cmd;

public class ExitComand implements Command {
    @Override
    public void execute(Context context) {
        System.exit(0);
    }
}
