package com.company.linkedlist;
//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit.
// Add the two numbers and return it as a linked list.
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.
// Example:
//        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//        Output: 7 -> 0 -> 8
//        Explanation: 342 + 465 = 807.

// Needs to work on Again

public class AddTwoNumbers {
    static Node head;

    static class Node {
       Node next;
       int data;
       Node(int d){
           data = d;
           next = null;
       }
   }

   void printList(Node n){

        while(n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
   // Iterative method - Taking three pointers curr, next, prev
<<<<<<< HEAD
   Node reverseLinkedList(Node node){
        Node next, prev = null;
        Node curr = node;
        while(curr != null){
            next = curr.next;
            // Why curr.next = prev, for reversing the pointer ?
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        node = prev;
        return node;
   }
=======
//   Node reverseLinkedList(Node node){
//        Node next, prev = null;
//        Node curr = node;
//        while(curr != null){
//            next = curr.next;
//            // Why curr.next = prev, for reversing the pointer ?
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//
//        }
//        node = prev;
//        return node;
//   }
>>>>>>> dfe8e9b35bdb9b0c4a21adc2f5896716d70cdd3f


    // Driver class
    public static void main(String[] args){
        AddTwoNumbers list1 = new AddTwoNumbers();
        AddTwoNumbers list2 = new AddTwoNumbers();
        // List 1 entries
        list1.head = new Node(2);
        Node second = new Node(4);
        Node third = new Node(3);

        list1.head.next =second;
        second.next = third;

//        list1.printList(head);
<<<<<<< HEAD
        //List 2 entries
        list2.head = new Node(5);
        Node sSecond = new Node(6);
        Node tThird = new Node(4);

        list2.head.next = sSecond;
        sSecond.next = tThird;
//        list2.printList(head);

        head  = list1.reverseLinkedList(head);
        list1.printList(head);
        head = list2.reverseLinkedList(head);
        list2.printList(head);
=======
//        //List 2 entries
//        list2.head = new Node(5);
//        Node sSecond = new Node(6);
//        Node tThird = new Node(4);
////
//        list2.head.next = sSecond;
//        sSecond.next = tThird;
//        list2.printList(head);
//
//        head  = list1.reverseLinkedList(head);
        list1.printList(head);
//        head = list2.reverseLinkedList(head);
//        list2.printList(head);
>>>>>>> dfe8e9b35bdb9b0c4a21adc2f5896716d70cdd3f


    }
}
