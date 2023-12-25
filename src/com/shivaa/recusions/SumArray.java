package com.shivaa.recusions;

public class SumArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,20,12};    // output = 42
        int size = arr.length;
        int index = 0;

        int ans = sum(arr,index,size);
        System.out.println("the sum of given array is "+ans);
    }
    // function
    static int sum(int[] array,int idx,int n){
        // base
        if (idx == n-1) {
            return array[idx];
        }
        // assumption and self work => return 2 + {3,5,20,1}
        return array[idx]+sum(array,idx+1,n);
    }
}
