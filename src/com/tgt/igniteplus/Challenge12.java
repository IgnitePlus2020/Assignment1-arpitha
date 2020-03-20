//Challenge 12:A program to concatenate two strings.

package com.tgt.igniteplus;

import java.util.Scanner;

public class Challenge12 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter string 1");
        String s1=in.next();
        System.out.println("enter string 2");
        String s2=in.next();
        String concat=s1+s2;
        System.out.println("Concatenated string is: "+concat);
        in.close();
    }
}
