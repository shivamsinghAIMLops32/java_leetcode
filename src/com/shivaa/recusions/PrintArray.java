package com.shivaa.recusions;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {4,6,3,9,2};

        int size = arr.length;
        int index = 0;
        rPrintArray(arr,index,size);
    }
    // function
    static void rPrintArray(int[] array,int idx,int n){
        if (idx == n) {
            return;
        }

        System.out.println(array[idx]);

        rPrintArray(array,idx+1,n);
    }
}
