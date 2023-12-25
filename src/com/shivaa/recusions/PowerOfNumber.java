package com.shivaa.recusions;
import java.util.*;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter a number :-");
        int a = scn.nextInt();
        System.out.print("enter the power of number "+a+" to conclude :-");
        int b= scn.nextInt();

       int k= power(a,b);
        System.out.println(a+" to power "+b+" is equals to "+k);
        int p = newPower(a,b);
        System.out.println(a+" to power "+b+" is equals to "+k);
    }

    // function
    static int power(int x,int y){
        if (y==1) {
            return x;
        }
        if (y == 0) {
            return 1;
        }
        return x*power(x,y-1);
    }

    static int newPower(int x ,int y){
        // base 5^0 = 1
        if (y == 0) return 1;

        if(y%2 == 0){
            // even 5^4 = (5^2)*(5^2)
        int result = newPower(x,(y/2));
        return (result * result);
        }
        else{
            // odd 5^5 = 5*(5^2)*(5^2)
            int result = newPower(x,(y/2));
            return (x * result*result);
        }
    }
}
