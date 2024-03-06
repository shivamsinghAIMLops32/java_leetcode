package com.shivaa.array.leetcode;

import java.util.Scanner;

public class ReverseWholeArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size of array = > ");
        int n = scn.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the array element");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        for (int value : arr){
            System.out.print(value + " ");
        }

        System.out.println();
        System.out.println("enter the idx1 from where wanna start reversing values => ");
        int idx1 = scn.nextInt();

        System.out.println("enter the idx2 from where wanna start reversing values => ");
        int idx2 = scn.nextInt();

        reverseArray(arr,idx1,idx2);
        System.out.println("after reversing");
        for (int value : arr){
            System.out.print(value + " ");
        }

        reverseArray2(arr);
        System.out.println("after reversing");
        for (int value : arr){
            System.out.print(value + " ");
        }
    }

    static void reverseArray(int[] arr,int idx1,int idx2){

        while(idx1 < idx2){
            int temp = arr[idx1];
            arr[idx1] = arr[idx2];
            arr[idx2] = temp;

            idx1++;
            idx2--;
        }
    }

    // from first to last index
   static void reverseArray2(int[] arr){
        int i;
//        int j = arr.length-1;

       for (i = 0 ; i < arr.length/2; i++) {
           int temp = arr[i];
           arr[i] = arr[arr.length-i-1];
           arr[arr.length-i-1] = temp;
       }
   }
}
