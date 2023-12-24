package com.shivaa.treesprep;

public class Firsttrees {
    public static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
        }

        public static void main(String[] args) {
            Node root = new Node(5);
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

            traverse(root);
        }
        public static void traverse(Node root){
            if (root == null) {
                return;
            }
            System.out.print(root.data + " -> ");
            traverse(root.left);
            traverse(root.right);
        }
    }
}
