package com.shivaa.basics;

import java.util.Scanner;

public class Inputs {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        System.out.println("please enter a Integer input :- ");
//        int rollno = scn.nextInt();
//        System.out.println("print your rollno is :- "+rollno);

        // QUE what is literals and identifier
        // if define a variable then the values assigned as is called LITERALS.
        // And the variable_name, file,folder,main,function by which we identify the declaration is IDENTIFIERS.

        int a = 50;   // a = identifier AND 50 = literal

        // QUE how to store 530 million in integer
        int networth = 530_00_000;           // here underscore will get ignored
        System.out.println(networth);

        String stdName = scn.next();
        System.out.println(stdName);

        float marks = scn.nextFloat();
        System.out.println(marks);

        long largeNum = scn.nextLong();
        System.out.println(largeNum);

        double bigDeciNum = scn.nextDouble();
        System.out.println(bigDeciNum);
    }
}
