//Challenge2:A program to calculate and display the volume of cylinder

package com.tgt.igniteplus;

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter radius and height of the cylinder to calculate the volume");
        double r=in.nextDouble();
        double h=in.nextDouble();

        double volume=Math.PI*r*r*h;
        System.out.println("Voume of given cylinder is : "+volume);
        in.close();
    }
}
