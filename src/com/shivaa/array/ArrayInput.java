package com.shivaa.array;

import java.util.*;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = scn.nextInt();

        int[] arr = new int[n];

        // taking input in array
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        printArray(arr);
    }

    static void printArray(int[] arr){
        for (int value :arr){
            System.out.print(value + " ");
        }
    }

}
