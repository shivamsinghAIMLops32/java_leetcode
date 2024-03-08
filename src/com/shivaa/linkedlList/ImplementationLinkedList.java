package com.shivaa.linkedlList;

public class ImplementationLinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
        }
    }

    public static class linkedlist{
         Node head = null;
         Node tail = null;

        // when there is a linked list previously
        void insertAtEnd(int val){
            Node temp = new Node(val);    // temp is new node with value by class Node
            if(head == null){  // there wasnt any list exist so head and tail = temp
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
        }

        void insertAtFirst(int value){
            Node newNode = new Node(value);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{ // non empty
                newNode.next = head;
                head = newNode;
            }
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            Node temp = head;
            int count = 0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            System.out.println();
            return count;
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(3);  //3
        ll.insertAtEnd(7);  // 3->7
        ll.insertAtEnd(9);  // 3->7->9

        System.out.println(ll.tail.data);
        ll.display();
        System.out.println(ll.tail.next);

        int length = ll.size();
        System.out.println(length);

        ll.insertAtEnd(31);
        ll.display();
        System.out.println();
        System.out.println(ll.size());

        ll.insertAtFirst(30);
        ll.display();
        ll.insertAtFirst(35);
        ll.display();

        ll.insertAtEnd(99);
        ll.display();
       ll.insertAtFirst(6);
       ll.display();
       ll.insertAtFirst(5);
       ll.display();
       ll.size();
    }
}
