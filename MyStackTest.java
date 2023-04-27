package com.bridgelabz;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> stackelement = new MyStack<>();
        stackelement.push(30);
        stackelement.push(20);
        stackelement.push(40);
        stackelement.display();
        stackelement.pop();
        stackelement.display();
        stackelement.pop();
        stackelement.display();
        stackelement.pop();
        stackelement.display();

    }
}
