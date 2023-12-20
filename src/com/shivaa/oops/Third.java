package com.shivaa.oops;

public class Third {
    public static void main(String[] args) {
        // create a class subject {subId, subName, subMarks, grade} with constructor for this keyword usage

        Subjects subject1 = new Subjects();
        subject1.cons(01, "shivam", 40.3f, 'A');
        System.out.println(subject1.subId);
    }
    // Subject class
    static  class Subjects{
        int subId;
        String subName;
        float subMarks;
        char grade;

        void cons(int subId, String subName, float subMarks, char grade){
            this.subId = subId;
            this.subName = subName;
            this.subMarks = subMarks;
            this.grade = grade;
        }
    }
}
