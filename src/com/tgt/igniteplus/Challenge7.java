//Challenge 7:A program to find average of numbers in array

package com.tgt.igniteplus;

import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of list");
        int size=in.nextInt();
        int[] numlist=new int[size];
        System.out.println("Enter the elements in list");
        for(int i=0;i<size;i++)
            numlist[i]=in.nextInt();
        float sum=0;
        for(int i=0;i<size;i++){
            sum+=numlist[i];
        }
        float average=sum/size;
        System.out.println("The average of numbers in array is: "+average);
        in.close();
    }
}
