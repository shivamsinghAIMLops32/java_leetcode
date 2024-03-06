package com.shivaa.hashing;

public class hashingFirst {

    public static void main(String[] args) {
        // hashing is used to get the frequency of an value in array
        // STEP 1 :- INTIALIZE a new array as hashmap of (size = greatest element of array) with default value 0;
        // STEP 2 :- then traverse array and at hashmap[arr[i]]++

        int[] arr = {1,1,2,2,1,4,0,0,12,7,12,3,4,3,3,3,3};

        int[] hashMap = new int[maxElement(arr)+1];  // [0,1,2,3,4,5....,10,11,12]

        for (int i = 0; i < arr.length; i++) {
            hashMap[arr[i]]++;
        }

        for (int value : hashMap){
            System.out.print(value+" ");
        }
    }

    // function
    static int maxElement(int[] arr){
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(answer < arr[i]){
                answer = arr[i];
            }
        }
        return answer;
    }
}
