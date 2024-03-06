package com.shivaa.array.leetcode;

public class SwapTwoValues {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("value of x before swap = "+x + " and value of y before swap = " + y);

        swap(x,y);
        System.out.println("value of x after swap = "+x + " and value of y after swap = " + y);

        //similar result for both cause value is passed by value but in array is different
    }

    static void swap(int x,int y){
        int temp = x;
        x = y;
        y = temp;
    }
}
