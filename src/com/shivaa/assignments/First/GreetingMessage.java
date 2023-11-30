package com.shivaa.assignments.First;

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {

        // QUE:- Take name as input and print a greeting message for that particular name.

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your name");
        String name =  scn.next();
        System.out.println("HELLO nice to meet you "+ name);
    }
}
