package com.bridgelabz.queue;

import com.bridgelabz.linkedlist.LinkedList;

public class MyQueue<Q extends Comparable> {
    private final LinkedList<Q> myLinkedList1;

    public MyQueue() {
        myLinkedList1 = new LinkedList<Q>();
    }

    public void enqueue(Q data) {
        myLinkedList1.push(data);
    }

    public void display() {
        myLinkedList1.display();
    }

    public void dequeue() {
        myLinkedList1.popLast();
    }
}