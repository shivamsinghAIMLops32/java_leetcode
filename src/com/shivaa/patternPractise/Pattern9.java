package com.shivaa.patternPractise;

public class Pattern9 {
    public static void main(String[] args) {
        // 1. for upp pyramid
        for (int i = 1; i <= 5; i++) {
            // for blank
            for (int j = 0; j < 5-i; j++) {
                System.out.print(" ");
            }
            //for star
            for (int j = 1; j < i*2; j++) {
                System.out.print("*");
            }
            // for blank
            for (int j = 0; j < 5-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }


        // 2. for inverted pyramid
        for (int i = 0; i < 5; i++) {
            // for blank
            for (int j = 0; j < i;j++){
                System.out.print(" ");
            }

            // for star
            for (int j = 0; j < 5*2-(i*2+1); j++) {
                System.out.print("*");
            }

            // for blank
            for (int j = 0; j < i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
