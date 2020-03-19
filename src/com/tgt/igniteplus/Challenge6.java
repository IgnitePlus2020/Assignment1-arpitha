//Challenge 6:A program to check is a given year is leap year or not.

package com.tgt.igniteplus;

import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year");
        int year=in.nextInt();
        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
            System.out.println(year+" is a leap year");
        else
            System.out.println(year+" is not a leap year");
        in.close();

    }
}
