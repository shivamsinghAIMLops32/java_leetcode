package com.shivaa.basics;

public class Bitwiseoperators {
    public static void main(String[] args) {
        // &,|,~,^,<<,>>

        int a = 10;
        int b = 20;

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);
        System.out.println(a << 2);  // take 2 input first operand and second no of time left shift operation
        System.out.println(a >> 3);  // take 2 input first operand and second no of time right shift operation
    }
}
