//Challenge 17:A program to find permutations of a string.

package com.tgt.igniteplus;

import java.util.Scanner;

public class Challenge15 {
    static public void StringPermutation(String input)
    {
        StringPermutation("", input);
    }

    private static void StringPermutation(String permutation, String input)
    {
        if(input.length() == 0)
        {
            System.out.println(permutation);
        }
        else
        {
            for (int i = 0; i < input.length(); i++)
            {
                StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()));
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string");
        String str=in.next();
        StringPermutation(str);
        in.close();
    }
}
