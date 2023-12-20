package com.shivaa.stringss;

public class ContainsAndStartwith {
    public static void main(String[] args) {
        // 1. contains("string")
        String str = "shivam Singh";
        System.out.println(str.contains("iv"));
        System.out.println(str.contains("vi"));
        System.out.println(str.contains("am s"));

        // 2. startsWith("string")  or endsWith("string")
        System.out.println(str.startsWith("shi"));
        System.out.println(str.startsWith("rhi"));
        System.out.println(str.endsWith("gh"));
        System.out.println(str.endsWith("kh"));
    }
}
