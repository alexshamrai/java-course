package com.playtika.javacourse.cmd;

import java.io.IOException;
import java.sql.SQLOutput;

public class EchoCommand implements Command{

    private String [] args;

    public EchoCommand(String[] args) {
        this.args = args;
    }

    @Override
    public void execute(Context context) throws IOException {
        if (args.length == 2) {
            System.out.println(args[1]);
        } else {
            System.out.println("");
        }
    }
}
