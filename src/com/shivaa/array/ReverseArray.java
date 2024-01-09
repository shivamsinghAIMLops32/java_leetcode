package com.shivaa.array;

public class ReverseArray {
    // function for reversing an array
    public static void reverseArray(int[] arr){
        int i;
        int j = arr.length-1;

        for(i =0; i<= j;i++){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j] = temp;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60};
        reverseArray(array);
        for(int value : array){
            System.out.print(value + " ");
        }
    }
}
