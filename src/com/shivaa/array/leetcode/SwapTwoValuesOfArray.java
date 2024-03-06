package com.shivaa.array.leetcode;

import java.util.Scanner;

public class SwapTwoValuesOfArray {
    public static void main(String[] args) {
        // array is passed as reference
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size of array = ");
        int n = scn.nextInt();

        System.out.println("enter array element");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("before swap");
        for (int value : arr){
            System.out.print(value+ " ");
        }
        System.out.println("enter the index 1 = ");
        int idx1 = scn.nextInt();
        System.out.println("enter the index 2 = ");
        int idx2 = scn.nextInt();

        swap(arr,idx1,idx2);

        System.out.println("after swap");
        for (int value : arr){
        System.out.print(value + " ");
        }
    }

    static void swap(int[] arr,int idx1,int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
