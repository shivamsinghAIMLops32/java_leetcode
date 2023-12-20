package com.shivaa.stringss;
import java.util.*;
public class StringAddIntCharString {

    public static void main(String[] args) {

        // string + int/string/char
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a string :- ");
        String str = scn.nextLine();

        str = str + " abcd";
        System.out.println(str);

        String str2 = "hello";
        str2 = str2 + str;
        System.out.println(str2);

        //   str + int
        System.out.print("enter the subject name :- ");
        String subject = scn.nextLine();

        System.out.print("enter the marks of " + subject+ ":- ");
        int marks = scn.nextInt();
        System.out.println(subject +" marks = "+marks);

        System.out.println("enter "+ subject+ " grade :- ");
        char grade = scn.next().charAt(0);
        System.out.println(subject + " marks = "+ marks + " grade = "+ grade);

        System.out.println("name" +6 +7);
        System.out.println("name" +(6 +7));
    }
}
