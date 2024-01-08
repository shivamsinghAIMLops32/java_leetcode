package com.shivaa.basics;

public class FuntionOverloading {
    public static void main(String[] args) {
      // in java two functions/methods can have same name if they're having(different parameters)
// (different type of parameters,different NO. of parameters or both) then the method will be known as method overloading

        // void func(){...};
        // void func(int a){...};
        // int func(int b){...};
        // int func(double a){...};
        // void func(double a,int b){...};

        // Method overloading isn't associated by return type means return type can be same. It's just associated with
        // parameters

        System.out.println(formatNumber(10));
        System.out.println(formatNumber(87.685));
        System.out.println(formatNumber("546"));
    }
    // functions
    public static String formatNumber(int value){
        return String.format("%d",value);
    }
    public static String formatNumber(double value){
        return String.format("%.2f",value);    // only two values after decimals
    }
    public static String formatNumber(String value){
        return String.format("%.2f",Double.parseDouble(value));          // change string in double then format
    }
}
