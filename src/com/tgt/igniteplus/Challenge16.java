//Challenge 16:A program to find duplicate characters in a string.

package com.tgt.igniteplus;

import java.util.Scanner;

public class Challenge16 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string");
        String s=in.nextLine();
        char[] a=s.toCharArray();
        int c,j=0;
        for(int i=0;i<a.length;i++)
        {
            c=0;
            for(j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j]&&a[j]!=' ')
                    c++;
            }
            if(c>0)
                System.out.println("Duplicate Character "+a[i]);
        }
        in.close();
    }
}
