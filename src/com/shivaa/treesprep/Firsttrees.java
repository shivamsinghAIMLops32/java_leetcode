package com.shivaa.treesprep;

public class Firsttrees {
    public static class Node{        // creating a tree node class store left,right,data
        Node left;
        Node right;
        int data;
        Node(int data){          // constructor of Tree node class
            this.data = data;
            left=null;
            right=null;
        }

        public static void main(String[] args) {
            Node root = new Node(5);       // creating objects with data value
//            root.left =root1;
            Node child1 = new Node(7);
            Node child2 = new Node(19);
            Node child3 = new Node(40);
            Node child4 = new Node(6);
            Node child5 = new Node(22);
            Node child6 = new Node(23);

            root.left = child1;
            root.right = child2;

            child1.left = child3;

            child2.left = child3;
            child2.right = child4;

            child3.right = child5;
            child5.left = child6;

            traversePreorder(root);
 //           traversePostorder(root);
 //           traverseInorder(root);
        }
        public static void traversePreorder(Node root){
            if (root == null) {
                return;
             }
            //preorder
            System.out.print(root.data + " -> ");       //5 -> 7 -> 40 -> 22 -> 23 -> 19 -> 40 -> 22 -> 23 -> 6 ->
            traversePreorder(root.left);
            traversePreorder(root.right);
        }
        public static void traversePostorder(Node root){
            if (root == null) {
                return;
            }
            traversePostorder(root.left);
            traversePreorder(root.right);
            // postorder
            System.out.print(root.data + " -> ");      //23 -> 22 -> 40 -> 7 -> 23 -> 22 -> 40 -> 6 -> 19 -> 5 ->
        }
        public static void traverseInorder(Node root){
            if (root == null) {
                return;
            }
            traverseInorder(root.left);
            //inorder
            System.out.print(root.data + " -> ");        //40 -> 23 -> 22 -> 7 -> 5 -> 40 -> 23 -> 22 -> 19 -> 6 ->
            traverseInorder(root.right);
        }
    }
}
