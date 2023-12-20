package com.shivaa.stringss;

public class InterningAndNew {
    public static void main(String[] args) {
        // java strings are immutable
        // these both will reference to same memory location in heap.but changing one value wont affect other.
        String str1 = "hello";
        String str2 = "hello";
        str2 = "abc";
        System.out.println(str1);

//        String name = "shivam";
//        name.charAt(1) = 'd';                   this is wrong
    }
}
