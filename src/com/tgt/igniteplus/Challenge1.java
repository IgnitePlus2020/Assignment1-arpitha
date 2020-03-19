//Challenge 1:A program to display current Date and Time

package com.tgt.igniteplus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Challenge1 {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time is: "+dtf.format(now));
    }
}
