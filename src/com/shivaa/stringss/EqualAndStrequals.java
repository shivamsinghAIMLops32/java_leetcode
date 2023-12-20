package com.shivaa.stringss;

public class EqualAndStrequals {
    public static void main(String[] args) {
        // == and str.equals()

        String str = "hey";
        String str2 = "hey";
        System.out.println(str == str2); // true because both reference to same location in heap

        String str3 = new String("hey");
        System.out.println(str == str3);         // false cause of new str3 is created which point at different string hey

        // that's why we will use str.equals()
        System.out.println(str.equals(str3));     // true
    }
}
