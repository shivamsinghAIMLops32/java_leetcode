package com.shivaa.recusions;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter a digit whose is to be taken :- ");
        int n = scn.nextInt();
        System.out.println("the digit "+n+" sum is "+digitSum(n));
    }

    //  function
    static int digitSum(int num){
        if ((num < 10)&&(num >= 0)) return num;

        return (num%10 + digitSum(num/10));
    }
}

