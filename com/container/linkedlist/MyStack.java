package com.container.linkedlist;

import java.util.LinkedList;

public class MyStack<T> {
    private LinkedList<T> linkedList = new LinkedList<T>();

    // 压栈
    public void push(T e) {
        linkedList.addFirst(e);
    }

    // 出栈
    public T pop() {
        return linkedList.removeFirst();
    }

    // 查看栈顶元素
    public T peek() {
        return linkedList.getFirst();
    }

    // 大小
    public int size() {
        return linkedList.size();
    }

    // 判空
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<String>();


        // 压栈
        myStack.push("Stack First");
        myStack.push("Stack Second");
        myStack.push("Stack Third");

        // 大小
        System.out.println("大小 : " + myStack.size());

        // 栈顶元素
        System.out.println("栈顶元素 : " + myStack.peek());

        // 出栈
        myStack.pop();

        // 遍历剩余栈元素
        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }
    }
}
