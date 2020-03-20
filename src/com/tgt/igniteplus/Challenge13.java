//Challenge 13:A program to count number of words in sentence.

package com.tgt.igniteplus;

import java.util.Scanner;

public class Challenge13 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the sentence");
        String str=in.nextLine();
        String[] tokens=str.split(" ");
        System.out.println("number of words in String is:"+tokens.length);
        in.close();
    }
}
