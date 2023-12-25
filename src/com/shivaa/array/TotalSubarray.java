package com.shivaa.array;

import java.util.ArrayList;

public class TotalSubarray {
    public static void main(String[] args) {

        int[] nums = {6,5,7,8};
        subArray(nums);

    }
    static void subArray(int[] nums){
        ArrayList<Integer> newSubArray = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                newSubArray.add(nums[i],nums[j]);
            }
            System.out.println(newSubArray);
        }
    }
}
