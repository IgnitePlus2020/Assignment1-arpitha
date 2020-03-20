//Challenge 19:A program to check if a number is ugly number or not.

package com.tgt.igniteplus;

import java.util.Scanner;

public class Challenge19 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(ugly(n))
            System.out.println("Yes a ugly number");
        else
            System.out.println("No not a ugly number");
    }

    static boolean ugly(int n){
        n=CheckPrime(n,2);
        n=CheckPrime(n,3);
        n=CheckPrime(n,5);
        if(n==1)
            return true;
        return false;
    }

    static int CheckPrime(int n,int d){
        while(n%d==0)
            n/=d;
        return n;
    }
}
