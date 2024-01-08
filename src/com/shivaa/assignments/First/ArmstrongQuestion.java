package com.shivaa.assignments.First;

public class ArmstrongQuestion {
    public static void main(String[] args) {
        int value = 54637;
        if (isArmstrong(value)) {
            System.out.println(value + " is an Armstrong number.");
        } else {
            System.out.println(value + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int number) {
        int size = digitLength(number);
        int ans = 0;
        int temp = number;         // copying the passed number
        while (temp > 0) {
            int p = temp % 10;
            ans = ans + (int) Math.pow(p, size);      // the basic approach
            temp = temp / 10;
        }
        if (ans == number) {
            return true;
        } else {
            return false;
        }
    }

    public static int digitLength(int number) {
        String str = String.valueOf(number);      // changing to string so can get length
        int k = str.length();
        return k;
    }
}

