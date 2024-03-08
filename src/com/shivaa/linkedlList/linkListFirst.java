package com.shivaa.linkedlList;

public class linkListFirst {
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

        System.out.println(a.next.next.data);
        System.out.println(b.next.next.next.data);
    }
}
