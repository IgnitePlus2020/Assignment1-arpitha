//Challenge 9:A program to write into a file

package com.tgt.igniteplus;

import java.io.FileOutputStream;

public class Challenge9 {
    public static void main(String args[]){

        try{
            FileOutputStream fout=new FileOutputStream("namaste.txt");
            String s="Welcome to Java World.";
            byte b[]=s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("success...");
        }
        catch(Exception e){
            System.out.println("error writing to file");
        }
    }
}
