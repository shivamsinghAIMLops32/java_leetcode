package com.shivaa.stringss;

import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

//        String str = "abcdefsdbg";
//        System.out.println(str.substring(0,3));   // abc
//        System.out.println(str.substring(1,str.indexOf('f')));    // (1,3)
//
//        System.out.println(str.substring(3));

        // QUE1 :- take a string name,print all substrings of name.
        System.out.println("enter your name :- ");
        String name = scn.nextLine();
        System.out.println("enter the index from where wanna print substring :- ");
        int n = scn.nextInt();
        for (int i = name.indexOf(name.charAt(n)); i <= name.length(); i++) {
            if (name.length() == 0){
                System.out.println("invalid string");
            }else System.out.println(name.substring(i));
        }
    }
}
