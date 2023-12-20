package com.shivaa.oops;

public class Second {
    public static void main(String[] args) {


        // QUE :- create a class Students which has rollno and name, marks
        Students std1 = new Students();
        std1.rollno = 50;
        std1.name = "shivam";
        std1.marks = 30.4f;
        System.out.println(std1.name);
        System.out.println(std1.rollno);
    }
    // class and object
    // CLASS :- classes are logical construct
    // OBJECTS :- while objects are real entity the physical reality in heap and the value stored in this will be instance of object

    static class Students{
        int rollno;
        String name;
        float marks;
    }
}
