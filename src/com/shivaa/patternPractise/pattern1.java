package com.shivaa.patternPractise;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the input:");
        int n = input.nextInt();

        for(int i =0; i< n; i++){
            for(int j = 0; j<n ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
