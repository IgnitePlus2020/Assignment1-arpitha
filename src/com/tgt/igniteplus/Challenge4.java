//Challenge 4:A program to print ascii value of a character.

package com.tgt.igniteplus;

import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a character");
        String str=in.next();
        byte[] ascii=str.getBytes();
        System.out.println(ascii[0]);
        in.close();

    }
}
