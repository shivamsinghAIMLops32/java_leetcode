package com.shivaa.hashing;

public class hashingForAllString {
    public static void main(String[] args) {
        String str = "AAA";

        int[] hashMap = new int[256];

        // precompute
        for (int i = 0; i < str.length(); i++) {
            hashMap[str.charAt(i)]++;
        }

        System.out.println(hashMap[97]);
    }
}
