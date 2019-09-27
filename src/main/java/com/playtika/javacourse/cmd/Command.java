package com.playtika.javacourse.cmd;

import java.io.IOException;

public interface Command {

    void execute(Context context) throws IOException;

}
