package com.shivaa.basics;
import java.util.*;
public class ConditionalStatements {
    public static void main(String[] args) {
        int a = 10;
        int b = 40;
        // 1. if and if else and if else if and nested if else  -> switch and ternary

        if (a > b) {
            System.out.println(a +" is greator than "+b);
        } else if (a < b) {
            System.out.println(b +" is greator than "+a);
        } else System.out.println(a +" is equal to "+b);

        // ternary
        // variable = condition?statement1:statement2;
        int larger = (5>4)?5:4;
        System.out.println(larger);

        // switch operator
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
//           Outputs "Thursday" (day 4)
    }
}
