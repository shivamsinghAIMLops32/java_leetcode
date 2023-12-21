package com.shivaa.patternPractise;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a number :- ");
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            // For printing the spaces before stars in each row
            for (int j =0; j<i; j++)
            {
                System.out.print(" ");
            }

            // For printing the stars in each row
            for(int j=0;j< 2*n -(2*i +1);j++){

                System.out.print("*");
            }

            // For printing the spaces after the stars in each row
            for (int j =0; j<i; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
