package com.shivaa.oops;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylist {
    public static class ArrayList {
        // lets starting me 5 size ka array ban jae
        int[] arr = new int[1];
        int idx = 0;
        int size = 0;

        public void add(int element) {
            if (size == arr.length) {
                int[] brr = Arrays.copyOf(arr, arr.length * 2);
                arr = new int[brr.length];
                arr = Arrays.copyOf(brr, brr.length);
            }
            arr[idx] = element;
            idx++;
            size++;
        }

        public void size() {
            System.out.println(size);
        }

        public void set(int index, int value) {
            arr[index] = value;
        }

        public void display() {
            for (int value : arr) {
                System.out.print(value + " ");
            }
        }

        public void remove(int index) {
            int[] brr = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                if(i == index){
                    continue;
                }
                brr[i] = arr[i];
            }
            arr = brr;
            size--;
            print(arr);
        }

        private static void print(int[] arr){
            for (int value : arr){
                if(value ==0){
                    continue;
                }
                System.out.print(value+" ");
            }
        }
    }

    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(2);
        arr.add(4);
        arr.add(9);
//        arr.size();

        arr.set(0, 10);
//        arr.display();
        arr.remove(2);
    }

}

