package com.tgt.igniteplus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD
	// write your code here
        Scanner in=new Scanner(System.in);
        System.out.println("enter principal amount in rupees:");
        double p=in.nextDouble();
        System.out.println("enter time in years:");
        int t=in.nextInt();
        System.out.println("enter interest rate ");
        int r=in.nextInt();
        System.out.println("Calculated Simple interest is:"+((p*t*r)/100));
=======
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number n");
        int n=in.nextInt();
        if(n%2==0)
            System.out.println("the number is even");
        else
            System.out.print("the number is odd");
        in.close();
>>>>>>> 79fef16d62bed78df9f87d8849a5b6c48b723f51
    }
}
