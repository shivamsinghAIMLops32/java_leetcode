package com.shivaa.basics;
import java.util.*;
public class Operators {
    public static void main(String[] args) {
        // comparison operator -> (<,>,==,<=,>=) or relational operator
        int a = 7;
        int b = 6;

        if (a > b) {
            System.out.println(a +" is greator than "+b);
        } else if (a < b) {
            System.out.println(b +" is greator than "+a);
        } if (a == b) {
            System.out.println(a +" is equal to "+b);
        }

        // Arithmetic operator -> binary(+,-,%,/,^,*)  and unary (++,--)single operand needed

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a%b);
        System.out.println(a/b);
        System.out.println(a^b);
        System.out.println(a++);
        System.out.println(a--);

        // assignment opeartor -> (=,+=,-=,*=,/=)
        int x = 13;
        int y =x;
         y--;      // y = y-1;
        int i = 9;
        System.out.println(x);
        System.out.println(y);

        // logical -> (&&,||,!)
        int m = 45;
        int n = 50;
        if((m < n)|| (m>n)){
            System.out.println(Math.min(m,n));
        }
        if(!true){
            System.out.println("shivam");
        }

    }
}

