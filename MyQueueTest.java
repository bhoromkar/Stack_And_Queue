package com.bridgelabz.queue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<Integer> queueelement = new MyQueue<>();
        queueelement.enqueue(20);
        queueelement.enqueue(30);
        queueelement.enqueue(40);
        queueelement.enqueue(50);
        queueelement.display();
        queueelement.dequeue();
        queueelement.display();
        queueelement.dequeue();
        queueelement.display();
        queueelement.dequeue();
        queueelement.display();


    }
}
