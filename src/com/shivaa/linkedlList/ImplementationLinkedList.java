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
         int size  =0;

         // insert without tail
//        void insertAtLastHead(int value){
//            Node newNode = new Node(value);
//            if(head == null){
//                head = newNode;
//            }
//            else{
//                Node temp = head;
//                while(temp!=null){
//                    temp = temp.next;
//                }
//                temp.next = newNode;
//            }
//            size++;
//        }

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
            size++;
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
            size++;
        }
        void insertAtBeggining(int value){
            Node newNode = new Node(value);
            if(head == null){
                insertAtEnd(value);
            }
            else{ // non empty
                newNode.next = head;
                head = newNode;
            }
            size++;
            System.out.println();
        }

        void insertAtIndex(int idx,int value){
            if(idx == 0){
                insertAtFirst(value);
            } else if (idx == size()) {
                insertAtEnd(value);
                return;
            } else{
               Node newNode = new Node(value);
               // take temp as head on already given ll.
               Node temp = head;
               int count = 0;
               while(temp != null){
                   if(count == idx-1){
                       newNode.next = temp.next;
                       temp.next = newNode;
                       count++;
                   }
                   temp = temp.next;
                   count++;
               }
            }
        }

        void insertAt(int idx,int value){
            if(idx == 0){  // first index
                insertAtFirst(value);
                return;
            } else if (idx == size()) {  // last index
                insertAtEnd(value);
                return;
            } else if (idx < 0 || idx > size()) {
                throw new IndexOutOfBoundsException("index is either < 0 or > size of ll");
            } else{
                Node newNode = new Node(value);
                Node temp = head;
                for (int i = 0; i <=idx-1; i++) {
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
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

        int getAt(int idx){
            if(head == null){
                return 0;
            } else if (idx < 0 || idx > size()) {
                return -1;
            }
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public static void main(String[] args) {
          linkedlist ll = new linkedlist();
        ll.insertAtEnd(3);  //3
        ll.insertAtEnd(7);  // 3->7
        ll.insertAtEnd(9);  // 3->7->9
        ll.insertAtFirst(50);
        ll.display();

       ll.insertAtIndex(2,200);
       ll.display();

       ll.insertAt(3,999);
       ll.display();
        System.out.println(ll.size());
        System.out.println(ll.getAt(3));


    }
}