package com.shivaa.basics;

import java.util.*;

public class Primitivesdatatype {

    public static void main(String[] args) {
        // String is not primitive :- primitives are those data types which can't get further break.
        int rollno = 64;
        char letter = 'b';
        String name = "shivam";
        float percentage = 83.67f;
        double largestDecimalNumbers = 893749.3498;
        long largeInteger = 3283784L;
        boolean isLoggedIn = true;

        System.out.println(isLoggedIn);

        // non primitive are string,object,array,list,
        int[] arr = {1,5,6};
        int[] brr = arr;
        brr[1]=4;
        System.out.println(arr[1]);    // 4 cause same one they are pointing in heap so use new keyword

        int[] arr1 = {1,6,9,6};
        int[] brr1 = new int[]{1, 6, 9, 6};
        brr1[1]=4;
        System.out.println(arr1[1]);
    }
}
