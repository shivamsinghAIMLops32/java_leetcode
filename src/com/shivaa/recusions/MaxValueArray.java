package com.shivaa.recusions;
import java.util.*;
public class MaxValueArray {
    public static void main(String[] args) {
        int[] arr = {3,10,3,2,5};
        int size = arr.length;
        int index =0;

        int ans = MaxValue(arr,index,size);
        System.out.println(ans);
    }
    // function
    static int MaxValue(int[] array,int idx,int n) {
        //base condition
        if (idx == n - 1) {
            return array[idx];
        }
        return Math.max(array[idx], MaxValue(array, idx + 1, n));
    }
}
