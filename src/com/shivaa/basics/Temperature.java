package com.shivaa.basics;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the temp in C: ");

        float tempC = scn.nextFloat();

        float tempF = ( tempC * 9/5) + 32;
        System.out.println(tempF);

    }
}
