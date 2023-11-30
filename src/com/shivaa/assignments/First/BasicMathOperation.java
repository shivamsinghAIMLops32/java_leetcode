package com.shivaa.assignments.First;

import java.util.Scanner;

public class BasicMathOperation {
    public static void main(String[] args) {

        // QUE:- Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = scn.nextInt();
        System.out.println("Enter number 2");
        int num2 = scn.nextInt();

        // taking operator as in input
        System.out.println("Enter a operator from +,-,/,*");
        char operator = (char) scn.next().charAt(0);

        if (operator == '*' || operator == '/' || operator == '+'|| operator == '-'){
            if(operator == '*'){
                System.out.println("The multiple of two given numbers is "+(num1*num2));
            }
            else if (operator == '+') {
                System.out.println("The addition of two given numbers is "+(num1+num2));
            }
            else if (operator == '-') {
                System.out.println("The addition of two given numbers is "+(num1-num2));
            }
            else  {
                System.out.println("The addition of two given numbers is "+(num1/num2));
            }
        }
        else {
            System.out.println("Entered wrong maths operator");
        }
    }
}
