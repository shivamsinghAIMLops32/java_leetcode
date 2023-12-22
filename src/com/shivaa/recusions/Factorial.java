package com.shivaa.recusions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // base condition -> assumption -> relation or self work
        // give n!
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fact(n));
    }
    //fact recursion function
    static int fact(int num){
        if (num==1) return 1;
        return num * fact(num-1);
    }
}
