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
    }

}
