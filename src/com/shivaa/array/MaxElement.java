package com.shivaa.array;

import java.util.Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] array = {10,40,60,80,30,-4,80,5};
        System.out.println("TC = O(n)");
        System.out.println("max element of array is "+maxElement(array));
        System.out.println("minimum element of array is "+minElement(array));
        System.out.println("TC = O(nlogn) + O(n)");
        System.out.println("greatest element of array is "+greatorElement(array));
        System.out.println("smallest element of array is "+smallestElement(array));
    }
    // max element in array
    public static int maxElement(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
    // another method by sorting array
       public static int greatorElement(int[] array){
           Arrays.sort(array);
        return array[array.length-1];
       }

       // minimum element in array
       public static int minElement(int[] array){
           int min = Integer.MAX_VALUE;
           for (int i = 0; i < array.length-1; i++) {
               if(min > array[i]){
                   min = array[i];
               }
           }
           return min;
       }

       // smallest element in array
       public static int smallestElement(int[] array){
           Arrays.sort(array);
           return array[0];
       }
}
