package com.company.linkedlist;

public class LinkedListInsertion {
    private Node head;

    static class Node{
        int data;
        Node next;
        private Node(int d) {
            data = d;
            next = null;
        }
    }

    // For pushing new data at the head position
    private void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        // Move the head to point to the new node
        head = new_node;
    }

    // Add a node after a given node
    private void insertAfterNode(Node prev_node, int new_data){
        if(prev_node == null){
            System.out.println("There is no previous node");
            return;
        }

        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;

    }

    // Add a node at the end

    private void addEndNode(int new_data){
        // allocate node and put the data
        Node new_node = new Node(new_data);

        if(head == null){
            head = new Node(new_data);
            return;
        }

        new_node.next = null;
        Node last = head;
        while(last.next != null){
            last = last.next;
            last.next = new_node;
            return;
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
      LinkedListInsertion list1 = new LinkedListInsertion();
      list1.addEndNode(6);
      list1.push(7);
      list1.push(1);
      list1.addEndNode(4);
      list1.insertAfterNode(list1.head.next, 8);
      list1.printList();
    }
}
