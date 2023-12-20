package com.shivaa.stringss;

public class IndexAndCompare {
    public static void main(String[] args) {
        // 1. indexOf();  -> it will return the index of passed character index and in case of duplicate occurence it will return the first occurence
        String str = "helllo";
        System.out.println(str.indexOf('h',2,str.length()-1));
        System.out.println(str.indexOf('h'));
        System.out.println(str.indexOf('l'));

        // 2. str1.compareTo(str2); -> returns (0 if str1 == str2) or (+ve if str1 > str2 lexographically) or (-ve if str1 < str2 lexographically)
        String str2 = "shi";
        String str3 = "shi";
        System.out.println(str2.compareTo(str3));

        String str4 = "dbc";
        String str5 = "abc";
        System.out.println(str4.compareTo(str5));

        String str6 = "dbc";
        String str7 = "zbc";
        System.out.println(str6.compareTo(str7));
        System.out.println(str7.compareTo(str6));
    }
}
