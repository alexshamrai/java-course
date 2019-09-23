package com.playtika.javacourse.io;

import java.io.*;

public class CopyFile {

    public static void main(String[] args) throws IOException {
        try (InputStream in = new FileInputStream("C:\\Users\\oshamrai\\Documents\\V3 машины\\49 Dragons.txt");) {
            try (OutputStream out = new FileOutputStream("C:\\Users\\oshamrai\\Documents\\V3 машины\\javaCopy.txt");) {
                int counter;
                // read each line of a file
                while ((counter = in.read()) != -1) {
                    out.write(counter);
                }

            }
        }
    }
}
