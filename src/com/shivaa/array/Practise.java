package com.shivaa.array;

public class Practise {
    public static void main(String[] args) {

        // create an array of 10 size.
        int[] age = new int[10];
        char[] grade = new char[10];

        String name[] = new String[20];

        System.out.println(name.length);
//        System.out.println(name[20]);   // index out of bound

        // another way of creating array
        int[] arr = {3,5,9,10,5};
        System.out.println(arr.length);
        System.out.println(arr[3]);

        // assigning values in array by using indices
        arr[3] = 30;
        System.out.println(arr[3]);


    }
}
