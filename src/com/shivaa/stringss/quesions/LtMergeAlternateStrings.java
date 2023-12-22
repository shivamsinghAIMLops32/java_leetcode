package com.shivaa.stringss.quesions;

import java.util.*;

public class LtMergeAlternateStrings {
    public static void main(String[] args) {
        // QUE1 :- Merge given two string as word1 = "abcd" and word2 = "xy" => output = "axbycd"
        Scanner scn = new Scanner(System.in);
        System.out.print("enter string1 :- ");
        String string1 = scn.nextLine();
        System.out.print("enter string2 :- ");
        String string2 = scn.nextLine();
        String ans = "";

        System.out.println(mergeString(string1,string2,ans));
    }
    // function
    public static String mergeString(String word1, String word2, String output){
        for (int i = 0; i < word1.length()|| i < word2.length(); i++) {
            if (i < word1.length()) {
                output+=word1.charAt(i);
            }
            if (i < word2.length()) {
                output+=word2.charAt(i);
            }
        }
        return output;
    }
}
