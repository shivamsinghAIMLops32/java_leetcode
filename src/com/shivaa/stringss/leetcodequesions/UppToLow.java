package com.shivaa.stringss.leetcodequesions;

import java.util.Scanner;

public class UppToLow {
    public static void main(String[] args) {
        // leetcode 709 -> change a given string in lowercase if word is capital and return
        // ex -> input = "HelLLo" -> output ="hello"  dont convert small characters

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        System.out.println(UppertoLowerCase(str));
    }

    // function
    static String UppertoLowerCase(String s){
        String ans = new String("");   // empty answer for returning

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);       // strong every character of string in ch char variable
            if(ch == ' '){        // if ch is space then add it  to answer and move ahead
                ans+=ch;
                continue;
            }

            // char to ascii
            int ascii = (int)ch;       // every value of ch get converted to integer and compared
            if (ascii < 97) {        // ch < 97 means UPPERCASEVALUE
                ans+= String.valueOf(ch).toLowerCase();      // change in lowercase and add to answer
            }
            else ans+= String.valueOf(ch);        // if !ch<97 measn its lowercase already so add into ans
        }
        return ans;
    }
}
