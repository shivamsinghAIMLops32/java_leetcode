package com.shivaa.assignments.First;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        // QUE1:- Write a program to print whether a number is even or odd, also take input from the user.

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a integer num");
        int a = scn.nextInt();

        if(a % 2 == 0){
            System.out.println("Entererd number is even");
        }
        else{
            System.out.println("Entered number is odd");
        }
    }

}
