package com.shivaa.oops;

public class Linklist {

    public static void main(String[] args) {

        Linkedlist list = new Linkedlist();
        list.addFirst(5);
        Linkedlist list2 = new Linkedlist();
        list2.addFirst(7);
//        System.out.println(list2.value);
    }

    // class of node having a invoke instance function ll to use as this keyword passing value
   public static class Linkedlist{
        Node head;
        int size;

        // Node class
        public static class Node {
            int value;
            Node next;

            Node(int value){
                this.value = value;
                this.next = next;
            }

            Node(int value, Node next){
                this.value = value;
                this.next = next;
            }

        }
        // node class end and ADDFirst

        public void addFirst(int value){
            Node new_node = new Node(value);

            new_node.next = head;
            head = new_node;
        }
    }
}
