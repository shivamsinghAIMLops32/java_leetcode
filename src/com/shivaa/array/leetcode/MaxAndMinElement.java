package com.shivaa.array.leetcode;

import java.util.Scanner;

public class MaxAndMinElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i<arr.length; i++){
            System.out.println("enter"+(i+1) +"element of array :-");
            arr[i] = scn.nextInt();
        }

        int maxResult = maxiElement(arr);
        System.out.println("the greatest element of array is -> "+maxResult);

        int minResult = minElement(arr);
        System.out.println("the smallest element of array is -> "+minResult);
    }

    static int maxiElement(int[] arr){
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (answer<arr[i]){
                answer = arr[i];
            }
        }
        return answer;
    }
    static int minElement(int[] arr){
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(answer > arr[i]){
                answer = arr[i];
            }
        }
        return answer;
    }
}
