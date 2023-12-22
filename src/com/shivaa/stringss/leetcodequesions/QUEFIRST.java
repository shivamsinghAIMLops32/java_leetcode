package com.shivaa.stringss.leetcodequesions;
import java.util.*;
public class QUEFIRST {
    public static void main(String[] args) {
//given a string , the task is to toggle all the characters of string i.e to convert UPPER CASE to LOWER CASE and vice-versa

//        input="sHiVAm";       output = ShIvaM

        // how to take input of string builder
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a string :- ");
        StringBuilder str = new StringBuilder(scn.nextLine());
        System.out.println(str);
        // toggle
        for (int i = 0; i < str.length(); i++) {
            String chk;
//            boolean flag;
            char ch = str.charAt(i);
            int ascii = (int)ch;    // to take asii value so diff bwtn A -a = 32
            if(ascii < 97 ) {
                chk = String.valueOf(ch).toLowerCase();
            }else chk = String.valueOf(ch).toUpperCase();

            System.out.print(chk);
        }
    }
}
