package com.shivaa.array.leetcode;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {3,2,4};
        int target = 6;
        int[] p = twoSum(nums,target);
        for (int i:p) {
            System.out.print(p[i]+" ,");
        }
    }
    public static int[] twoSum(int[] nums, int target){
        int f =0;
        int l = nums.length-1;
        if ((nums[nums.length-1]+nums[nums.length-2])== target) {
            return new int[]{nums[nums.length-1],nums[nums.length-2]};
        }

        while (f < l) {
            int sum = nums[f]+nums[l];

            if (sum == target) {
                return new int[]{f, l};
            } else if (sum < target) {
                f++;
            } else {
                l--;
            }
        }

        return new int[]{};
    }
}

