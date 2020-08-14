package com.company.linkedlist;

public class SimpleLinkedListThreeNodes {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next =null;
        }
    }
    // driver class
    public static void main(String[] args){
        SimpleLinkedListThreeNodes list = new SimpleLinkedListThreeNodes();
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
    }

}
