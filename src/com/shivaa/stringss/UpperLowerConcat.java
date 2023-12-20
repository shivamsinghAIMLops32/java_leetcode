package com.shivaa.stringss;

public class UpperLowerConcat {
    public static void main(String[] args) {
        String name = "Shivam Singh";
        String str2 = " i am good";

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        // concat -> string1.concat(string2);
        System.out.println(name.concat(" heyy"));
        System.out.println(name.concat(str2));

        String str3 = "gud mrng";
        String answer = str2.concat(str3);
        System.out.println(answer);

    }
}
