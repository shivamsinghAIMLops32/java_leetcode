package com.shivaa.stringss;

public class Performance {
    public static void main(String[] args) {
        // low performace due to immutibilty of string create multiple copies.
        String str = "hello";   // str pointing to hello in heap
        str += "shivam";        // now str pointing at new string helloshivam
        str += "singh";         // now str will point at new string helloshivamsingh
        System.out.println(str);
    }
}
