package com.shivaa.basics;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        // if input given as an integer it will be getting self converted into in bigger one which is float but VICE-VERSA isn't possible.
        // The source value should be smaller than destination value.  ex float > int => works
        System.out.println(num);

        // TYPE CONVERSION or TYPE CASTING or NARROWING CONVERSION
        int money = (int)(4837.76f);
        System.out.println(money);

        // Automatic type conversion in expressions
        int a = 257;
        byte b = (byte) (a);    // byte can store  256 so it's doing 257 % 256 =1
        System.out.println(b);

//        byte m = 40;
//        byte k = 30;
//        byte p = 55;
//        int ans = (m*k)/p;
//        System.out.println(ans);

//        byte bb = 50;
//        bb = bb*3;

        int number = 'a';       // a in ASCII = 97
        System.out.println(number);
 //       System.out.println("नमस्ते");      Java takes in Unicode values too.

        // int * float = float
        System.out.println(9*5.7f);

        // char to ascii
        char ch = 'b';
        int ascii = (int)ch;
        System.out.println(ascii);    // 98
    }
}
