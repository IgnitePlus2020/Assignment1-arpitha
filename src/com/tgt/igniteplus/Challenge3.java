//Challenge 3:A program to calculate and display discount and selling price for a pen with given cost and discount rate

package com.tgt.igniteplus;

public class Challenge3 {
    public static void main(String[] args){
        int cost=50;
        int discount_rate=12;
        int discount=(cost*discount_rate)/100;
        int selling_price=cost-discount;
        System.out.println("Discount for pen is $"+discount+" and Selling price of pen is $"+selling_price);
    }
}
