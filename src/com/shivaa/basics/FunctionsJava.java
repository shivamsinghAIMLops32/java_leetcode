package com.shivaa.basics;

public class FunctionsJava {
    public static void main(String[] args) {
        // in java funtion is passed by value always means a copy of global variable is get passed to function
        // function get defined out side psvm but inside class of file
        int a = 5;
        int b = 7;
        sum(a,b);
        printa(a,b);
        System.out.println("global a "+a);
    }
    // function
    static int sum(int k , int m){
        return (k+m);
    }

    static void printa(int a , int b){
        a--;
        System.out.println("function " + a);
    }
}
