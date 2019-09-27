package com.playtika.javacourse.cmd;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class CommandLine {
    private CommandFactory commandFactory = new CommandFactory();

    public void run(Scanner scanner) {
        Context context = new Context();
        context.setPath(Paths.get("").normalize().toAbsolutePath());
        do {
            System.out.printf("<%s> ", context.getPath());
            String input = scanner.nextLine();
            try {
                commandFactory.getCommand(input).execute(context);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (true);

    }

    public static void main(String[] args) {
        CommandLine commandLine = new CommandLine();
        commandLine.run(new Scanner(System.in));
    }
}
