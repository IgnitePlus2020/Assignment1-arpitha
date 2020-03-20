//Challenge 10:A program to read from a file and write into another file

package com.tgt.igniteplus;

import java.io.*;
import java.io.IOException;

public class Challenge10 {
    public static void main(String[] args) {

        try {
            FileInputStream instream = new FileInputStream("namaste.txt");
            File outfile = new File("hi.txt");
            FileOutputStream outstream = new FileOutputStream(outfile);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = instream.read(buffer)) > 0) {
                outstream.write(buffer, 0, length);
            }

            instream.close();
            outstream.close();

            System.out.println("File copied successfully!!");

        } catch (IOException ioe) {
            System.out.println("error while copying");
        }
    }
}
