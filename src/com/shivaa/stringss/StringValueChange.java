package com.shivaa.stringss;

import java.util.Scanner;

public class StringValueChange {
    public static void main(String[] args) {
        // QUE1 to change value of string at particular index
        Scanner scn = new Scanner(System.in);
        System.out.print("enter string :- ");
        String str = scn.nextLine();

        System.out.print("enter the index where wanna change in str string :- ");
        int n = scn.nextInt();
        System.out.println("enter the character you wanna change at index "+n+" in given string "+str);
        char c = scn.next().charAt(0);
        changeAt(str,n,c);
    }
    static void changeAt(String str, int n,char c){
        str = str.substring(0,n) + c + str.substring(n+1,str.length());
        System.out.println(str);
    }
}
