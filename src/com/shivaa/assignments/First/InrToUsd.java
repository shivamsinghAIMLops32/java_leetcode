package com.shivaa.assignments.First;

import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {
        // QUE:- Input currency in rupees and output in USD.

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the INR value: ");
        int inr = scn.nextInt();

        double usd = (inr*0.012);
        System.out.println(usd+"usd");
    }
}
