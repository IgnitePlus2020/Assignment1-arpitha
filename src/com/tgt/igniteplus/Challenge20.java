//Challenge 20:A program to replace all 'a' with '$' in the sentence.

package com.tgt.igniteplus;

import java.util.Scanner;

public class Challenge20 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the sentence");
        String str=in.nextLine();
        String result=str.replace('a','$');
        System.out.println("String after replacing 'a' with '$' is: "+result);
        in.close();
    }
}
