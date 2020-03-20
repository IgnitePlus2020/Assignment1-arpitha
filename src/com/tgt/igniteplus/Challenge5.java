//Challenge 5:A program to check if a number is perfect square or not.

package com.tgt.igniteplus;

import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for (int i = 1; i * i <= n; i++) {

            if ((n % i == 0) && (n / i == i)) {
                System.out.println("yes, "+n+" is a perfect square");
                return;
            }
        }
        System.out.println("no, "+n+" is not a perfect square");
        in.close();
    }
}
