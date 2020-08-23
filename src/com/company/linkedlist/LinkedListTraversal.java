package com.company.linkedlist;

public class LinkedListTraversal {
    private Node head;

    static class Node{
        int data;
        Node next;
        private Node(int d) {
            data = d;
            next = null;
        }
    }


    // Traversal function
    private void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }
    // driver class
    public static void main (String[] args){
            LinkedListTraversal list = new LinkedListTraversal();
            list.head = new Node(1);
            Node second = new Node(2);
            Node third = new Node(3);

            list.head.next = second;
            second.next = third;

            list.printList();
    }
}
