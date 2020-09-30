package com.company.linkedlist;
//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit.
// Add the two numbers and return it as a linked list.
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.
// Example:
//        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//        Output: 7 -> 0 -> 8
//        Explanation: 342 + 465 = 807.

// Needs to work on Again

// (2, ptr) --> next --> (2,ptr)
// Node --> ptr -->Node

public class AddTwoNumbers {

    static Node head1 , head2;
    static class Node{
        int data;
        Node next;
        // Created data type Node
        // next is node , data is contained in Node
        Node(int d){
            data = d;
            next = null;
        }
       // print Linkedlist
       public void printList(Node head){
            while(head != null){
                System.out.println(head.next + " ");
                head.next = head;

            }
       }

       static void main(String[] args){
         AddTwoNumbers list = new AddTwoNumbers();
             

        }
    }
}
