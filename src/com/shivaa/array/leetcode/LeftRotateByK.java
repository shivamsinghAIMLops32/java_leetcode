package com.shivaa.array.leetcode;

import java.util.Scanner;

public class LeftRotateByK {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] arr = {3,-2,1,4,6,9,8};
        for (int value : arr){
            System.out.print(value+" ");
        }

        System.out.println("enter the value of k = ");
        int k = scn.nextInt();

        k = k% arr.length;

        //IMP
        leftRotateByK(arr,0,arr.length-1);
        leftRotateByK(arr,0,k);
        leftRotateByK(arr,k+1,arr.length-1);

        //print array
        for (int value : arr){
            System.out.print(value+" ");
        }
    }

    static void leftRotateByK(int[] arr,int idx1,int idx2){
        while(idx1<idx2){
            int temp = arr[idx1];
            arr[idx1] = arr[idx2];
            arr[idx2] = temp;

            idx1++;
            idx2--;
        }
    }
}
