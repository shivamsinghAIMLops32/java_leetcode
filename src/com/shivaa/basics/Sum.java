package com.shivaa.basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1+num2;
        System.out.println("the sum of given numbers "+ sum);

        int sub = num1 - num2;
        System.out.println("the subtract of two digit "+ sub);
    }
}
