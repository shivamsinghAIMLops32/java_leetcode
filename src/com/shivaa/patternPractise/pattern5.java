package com.shivaa.patternPractise;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
