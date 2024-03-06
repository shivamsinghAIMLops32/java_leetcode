package com.shivaa.array;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        // print sum of array element

        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size of array -> ");

        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int result = printArray(arr);
        System.out.println("the array values sum is :-"+result);
    }

    static int printArray(int[] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
