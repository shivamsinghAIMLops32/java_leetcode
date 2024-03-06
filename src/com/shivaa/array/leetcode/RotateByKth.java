package com.shivaa.array.leetcode;

public class RotateByKth {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 1;
        rotate(arr,k);
        for(int value : arr){
            System.out.print(value +" ");
        }
    }

    public static void rotate(int[] array,int k){
        k = k% array.length;
        if(k<0){
            k = k + array.length;
        }

        int p = 1;
        while (p <=k) {
            int temp = array[0];
            for (int i = 1; i < array.length - 1; i++) {
                array[i] = array[i - 1];
            }
            array[array.length - 1] = temp;
            p++;
        }
    }
}
