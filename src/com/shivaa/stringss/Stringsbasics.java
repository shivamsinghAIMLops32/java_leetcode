package com.shivaa.stringss;

import java.util.*;
public class Stringsbasics {
    public static void main(String[] args) {
        // this how you define a string and intilization
        String s = "hello world";
        System.out.println(s);

        Scanner scn = new Scanner(System.in);
        // how to take input form user but it will run only till space in input so use nextLine();
//        String str = scn.next();
//        System.out.println(str);

        String str1 = scn.nextLine();
        System.out.println(str1);
    }
}
