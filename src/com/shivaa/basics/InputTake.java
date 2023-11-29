package com.shivaa.basics;

import java.util.Scanner;

public class InputTake {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your age :-");

        int age = Integer.parseInt(scn.nextLine());
        System.out.println("your age is" + " "+ age);

        System.out.println("Enter your name :-");
        String name = scn.nextLine();
        System.out.println("hello" + " " +name + " " + "your age is " +age);
    }
}
