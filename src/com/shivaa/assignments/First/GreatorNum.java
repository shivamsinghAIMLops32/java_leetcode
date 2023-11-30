package com.shivaa.assignments.First;

import java.util.Scanner;

public class GreatorNum {
    public static void main(String[] args) {
        // QUE:- Take 2 numbers as input and print the largest number.
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number 1");
        int num1 = scn.nextInt();
        System.out.println("Enter a number 2");
        int num2 = scn.nextInt();


        if(num1 != num2){
            if (num1 > num2){
                System.out.println(num1 + " is greator than "+ num2);
            }
            else{
                System.out.println(num2+ " is greator than "+ num1);
            }
        }
        else{
            System.out.println(num1+ " is equal to "+ num2);
        }
    }
}
