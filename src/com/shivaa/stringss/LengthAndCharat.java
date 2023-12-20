package com.shivaa.stringss;

import java.util.*;
public class LengthAndCharat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string:- ");
        String str = scn.nextLine();
        System.out.println(str +" is having length of :- "+ str.length());

//        char[] name = new char[10]; thats how we use to access via indexes in char array
        char[] name = {'s','i','v','k','m'};
        System.out.println(name[3]);
        System.out.println(name.length);

//        but in terms of string we will use charAt(); function

        // 1. by storing in char
        char answer = str.charAt(3);
        System.out.println(answer);

        // 2. by directly printing
        System.out.println(str.charAt(6));
    }
}
