package com.shivaa.oops;

import java.sql.SQLOutput;

public class Fraction {
    public static int gcd(int num,int den){
        int min  = Math.min(num,den);

        for (int i = min; i >= 1 ; i--) {
            if(num%1==0 && den%i==0) return i;
        }
        return min;
    }

    public static Fractionn add(Fractionn f1,Fractionn f2){
        int numerator= (f1.num * f2.den) + (f2.num * f1. den);
        int denominator = f1.den * f2.den;
        Fractionn f3 = new Fractionn(numerator,denominator);
        return f3;
    }

    public static Fractionn sub(Fractionn f1,Fractionn f2){
        int numerator= (f1.num * f2.den) - (f2.num * f1. den);
        int denominator = f1.den * f2.den;
        Fractionn f3 = new Fractionn(numerator,denominator);
        return f3;
    }

    public static Fractionn multiply(Fractionn f1,Fractionn f2){
        int numerator= (f1.num *f1.num);
        int denominator = f1.den * f2.den;
        Fractionn f3 = new Fractionn(numerator,denominator);
        return f3;
    }


    public static class Fractionn{
        int num;
        int den;
        //constructor of fraction class
       public Fractionn(int num,int den){
           this.num = num;
           this.den = den;
           simplify();
       }

        public void simplify() {
          int hcf = gcd(num,den);
          num /= hcf;
          den /= hcf;
        }
    }

    // main
    public static void main(String[] args) {
        Fractionn f1 = new Fractionn(5,10);
        System.out.println(f1.num + "/"+ f1.den);

        Fractionn f2 = new Fractionn(4,9);
        System.out.println(f2.num + "/"+ f2.den);

        Fractionn f3 = add(f1,f2);
        System.out.println(f3.num + "/"+ f3.den);

        Fractionn f4 = sub(f1,f2);
        System.out.println(f4.num + "/"+ f4.den);

        Fractionn f5 = multiply(f1,f2);
        System.out.println(f5.num + "/"+ f5.den);
    }
}
