package com.bridgelabz;

import com.bridgelabz.linkedlist.LinkedList;
import com.bridgelabz.methods.New;

public class MyStack<K extends Comparable> {
     private final LinkedList<K> myLinkedList;

    public MyStack() {
        myLinkedList = new LinkedList<K>();
    }

    public void push(K data) {
        myLinkedList.push(data);
    }

    public void display(){
        myLinkedList.display();
    }

    public void pop() {
        myLinkedList.pop();
    }
     public vi
    
    
}
