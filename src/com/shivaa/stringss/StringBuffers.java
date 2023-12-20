package com.shivaa.stringss;

public class StringBuffers {
    public static void main(String[] args) {

        // slower than sting builder cause it is synchronous in nature
        StringBuffer str =new StringBuffer("Hellobhai");
        System.out.println(str.append(" shivam"));

        System.out.println(str.delete(1,4));
        System.out.println(str.deleteCharAt(4));

        System.out.println(str.reverse());
        System.out.println(str.capacity());

        System.out.println(str.insert(2,"delhi"));
        System.out.println(str.replace(1,6,"mumbai"));
    }
}
