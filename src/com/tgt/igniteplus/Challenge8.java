//Challenge 8:A program to create a file at given path.

package com.tgt.igniteplus;

import java.io.File;
import java.io.IOException;

public class Challenge8 {
    public static void main(String[] args) {
        File file = new File("namaste.txt");
        boolean result;
        try {
            result = file.createNewFile();  //creates a new file
            if (result) {
                System.out.println("file created with path " + file.getCanonicalPath());
            }
            else {
                System.out.println("File already exist at location: " + file.getCanonicalPath());
            }
        } catch (IOException e) {
            System.out.println("error creating file");
        }
    }
}
