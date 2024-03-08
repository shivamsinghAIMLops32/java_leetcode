package com.shivaa.linkedlList;

public class linkedListThird {
    public static class Node{
        int data;   // value
        Node next;  // address of next node

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(6);
        Node e = new Node(5);
        //(2->4->3->6->5)

        a.next= b;  // b ka address in a ke next me (2->4 3 6 5)
        b.next = c;   // (2->4->3 6 5)
        c.next = d;   //(2->4->3->6 5)
        d.next = e;   //(2->4->3->6->5)

        displayRecursively(a);
        System.out.println();
        displayRecursivelyReverse(a);

        System.out.println();
        int len = length(a);
        System.out.println(len);

        System.out.println();
        int lent = lengthRecursively(a);
        System.out.println(lent);
    }
    //function
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }

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

