package com.shivaa.assignments.First;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

    // QUE:- Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the principle value");
        int princ = scn.nextInt();

        System.out.println("Enter the time value");
        float time = scn.nextFloat();
        System.out.println("Enter the rate value");
        float rate = scn.nextFloat();

        float interest = princ*time*rate;
        System.out.println("The simple interest is "+ interest);
    }
}
