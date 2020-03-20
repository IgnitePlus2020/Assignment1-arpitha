//Challenge 14:A program to check if one string contains another string.

package com.tgt.igniteplus;

import java.util.Scanner;

public class Challenge14 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string");
        String str=in.next();
        System.out.println("enter the substring to be checked in string");
        String sub=in.next();
        if(str.contains(sub))
        {
            System.out.println("Yes "+sub+" is a substring of "+str);
        }
        else
        {
            System.out.println("No "+sub+" is not a substring of "+str);
        }
        in.close();
    }
}
