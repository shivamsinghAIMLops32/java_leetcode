package com.shivaa.array;

public class ArrayCopying {
    public static void main(String[] args) {
        int[] age = {10,60,47,40,26,47};
        // limitation of EnhancedLoop is its read only and only moves forward
        for (int value : age){
            System.out.println(value);
        }

        System.out.println("----------------");

//      both are pointing the same array.No new array creation taken place
        int[] array = new int[4];
        System.out.println(array);                         //[I@3feba861
        int[] array1 = array;
        System.out.println(array1);                       // [I@3feba861
        array1[2] = 4;
        System.out.println(array[2]);                     // 4


        System.out.println("---------SWAP----------");
        int[] arr = {10,40,20,40,60};
        int i = 0;
        int j = 3;
        System.out.println(arr[i] + "," + arr[j]);               // 10,40
        swap(arr[i],arr[j]);
        System.out.println(arr[i] + "," + arr[j]);               // 10,40

        swap(arr,i,j);
        System.out.println(arr[i] + "," + arr[j]);             // 40,10
    }

    // swap funtion
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    // array value swap
    public static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
