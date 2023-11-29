package com.shivaa.basics;

import java.util.Scanner;

public class inputTake {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your age :-");

        int age = scn.nextInt();
        System.out.println("your age is" + " "+ age);
    }
}
