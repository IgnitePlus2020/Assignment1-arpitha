//Challenge 11:A program to convert a string to Uppercase

package com.tgt.igniteplus;

import java.util.Scanner;

public class Challenge11 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter a string");
        String s=in.next();
        String S=s.toUpperCase();
        System.out.println("String in uppercase is:"+S);
        in.close();
    }
}
