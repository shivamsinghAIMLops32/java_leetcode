package com.shivaa.linkedlList;

public class linkedListThird {

    public static class Node{
        int data;   // value
        Node next;  // address of next node

        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null;
        int size = 0;
        void insert(int value){
            Node newNode = new Node(value);
            head = newNode;
            size++;
        }
         void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println();
        }
//        void insertAtLastt(int value){
//            if(head!= null ){
//            Node newNode = new Node(value);
//            head = newNode;
//            size++;
//            }
//            Node newNode = new Node(value);
//            Node temp = head;
//            int length = 0;
//            while(temp!=null){
//              length++;
//              temp = temp.next;
//            }
//            Node temp2 = head;
//            for (int i = 0; i < length-2; i++) {
//                temp2 = temp2.next;
//            }
//            temp2.next = newNode;
//            size++;
//        }
        void insertAtLast(int value) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            size++;
        }
    }
    public static void main(String[] args) {
       linkedlist ll = new linkedlist();
       ll.insertAtLast(3);
       ll.insertAtLast(9);
       ll.insertAtLast(4);
       ll.display();
    }
    //function


    // recursively
    public static void displayRecursively(Node head){
//        Node temp = head;
        if(head== null) return;
        System.out.print(head.data+" ");
        displayRecursively(head.next);
    }
    public static void displayRecursivelyReverse(Node head){
//        Node temp = head;
        if(head== null) return;
        displayRecursivelyReverse(head.next);
        System.out.print(head.data+" ");
    }
    public static int length(Node head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }

    public static int lengthRecursively(Node head) {
        if(head==null) return 0;
        return 1 + lengthRecursively(head.next);
    }


}

