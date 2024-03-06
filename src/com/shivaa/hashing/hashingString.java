package com.shivaa.hashing;

public class hashingString {
    public static void main(String[] args) {
        // ascii -> A(65) TO Z(90) and a(97) to z(122)
//
//        int k = 'a';
//        System.out.println(k);

        // in case of only small letters are in array
        String str1 = new String("abcdabebbfc");

        int[] hashMap = new int[26];

        // precompute
        for (int i = 0; i < str1.length(); i++) {
            hashMap[str1.charAt(i) - 'a']++;
        }

        for (int value : hashMap){
            System.out.print(value+" ");
        }
    }
}
