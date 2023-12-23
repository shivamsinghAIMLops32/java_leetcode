package com.shivaa.oops;

public class Practise {
    public static void main(String[] args) {
        Student x = new Student(2,"shivam");
        System.out.println("the name is "+x.name+" and roll number is "+x.roll);
        x.name = "raj";
        System.out.println(x.name + " name of x after changing from shivam");

        Student y = new Student(4,70f);


    }
    // class
    static class Student{
        int roll;
        String name;
        float marks;

        public Student(int roll,String name){
            this.roll = roll;
            this.name = name;
        }
        protected Student(int roll,float marks){
            this.roll = roll;
            this.marks = marks;
        }

    }
}
