package com.shivaa.oops;

public class Linklist {

    public static void main(String[] args) {

        Node node1 = new Node();
        node1.ll(5);
        System.out.println("the node1 value is " + node1.value + "-> " + node1.next);

        Node node2 = new Node();
        node2.ll(7, node1);
        System.out.println("the node2 value is " + node2.value + "-> " + node2.next.value);

    }

    // class of node having a invoke instance function ll to use as this keyword passing value
    public static class Node {
        int value;
        Node next;

        public void ll(int value) {
            this.value = value;
            this.next = null;
        }

        public void ll(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
