package com.shivaa.array;

public class ArrayBasics {
    public static void main(String[] args) {
        // array can have similar data type and the array could of primitive datatypes{int,double,string,objects,char etc}

        // array declaration
        int[] arr;
        // array allocating
        arr = new int[5];    // allocated 5 size array of name as arr

        // string type array initialization
        String[] strArray = new String[3];
        System.out.println(strArray);                   // [Ljava.lang.String;@3feba861

        // double array
        double[] arrDouble = new double[5];

        // another way of initializing array
        int[] likes = {5,10,35,67,87};


        int[] age = new int[5];
        System.out.println(age);                         // [I@5b480cf9
        System.out.println(age.length);                  //  5
        // accessing array element via using index  {0 - arrayLength-1}
        System.out.println(age[0]);                      // 0
        System.out.println(age[1]);                      // 0
        System.out.println(age[2]);                      // 0
        System.out.println(age[3]);                      // 0
//      System.out.println(age[5]);                       Index 5 out of bounds for length 5

        age[3] = 44;
        printArray(age);

    }

    // print array element function
    public static void printArray(int[] array){
        for (int i = 0; i <= array.length-1; i++) {
            System.out.println(array[i]);
        }
    }

    // enhanced for loop
    public static void printEl(int[] array){
        // limitation of EL is its read only and only moves forward
        for (int value : array){
            System.out.println(value);
        }
    }
}
