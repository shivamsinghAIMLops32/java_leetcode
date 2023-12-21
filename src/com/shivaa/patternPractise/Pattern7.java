package com.shivaa.patternPractise;

import java.util.*;
public class Pattern7 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            // for space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            // for star
            for (int j = 1; j < i*2; j++) {       // or j < j*2-1
                System.out.print("*");
            }

            // again space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
