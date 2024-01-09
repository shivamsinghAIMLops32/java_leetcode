package com.shivaa.array.leetcode;

import java.util.ArrayList;

public class RotateByK {
    public static void main(String[] args) {
 //       Input: nums = [1,2,3,4,5,6,7], k = 3     k will be positive & < arr.length
 //       Output: [5,6,7,1,2,3,4]
 //       Explanation:
 //       rotate 1 steps to the right: [7,1,2,3,4,5,6]
 //       rotate 2 steps to the right: [6,7,1,2,3,4,5]
 //       rotate 3 steps to the right: [5,6,7,1,2,3,4]

 //       int[] nums = {1,2,3,4,5,6,7};
        int[] nums = {-1,-100,3,99};
        int k = 2;
        ArrayList<Integer> resultArray = rotate(nums,k);
        for (int value : resultArray){
            System.out.print(value + " ");
        }
    }
    //function
    public static ArrayList<Integer> rotate(int[] arr, int k){
        ArrayList<Integer> resultArray =new ArrayList<Integer>();
//             k to last values first added in arraylist. k%4 cause array repeat itself after every 4 steps
        for (int i = (arr.length-(k% arr.length)); i < arr.length; i++) {
            resultArray.add(arr[i]);
        }
//             0 to k values first added in arraylist
        for (int i = 0; i < (arr.length-(k% arr.length)); i++) {
            resultArray.add(arr[i]);
        }
        return resultArray;
    }
}
