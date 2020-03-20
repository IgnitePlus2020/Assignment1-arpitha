//Challenge 18:A program to find largest of 3 numbers using terinary operators

package com.tgt.igniteplus;

import java.util.Scanner;

public class Challenge18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int largest = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest of three numbers is: " + largest);
        in.close();
    }

}
