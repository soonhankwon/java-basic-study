package com.soon.datastructure;

public class MyListNode {

    private String data;
    private MyListNode next;

    public MyListNode() {
        this.data = null;
        this.next = null;
    }

    public MyListNode(String data) {
        this.data = data;
        this.next = null;
    }

    public MyListNode(String data, MyListNode next) {
        this.data = data;
        this.next = next;
    }

    public String getData() {
        return this.data;
    }

    public MyListNode next() {
        return this.next;
    }

    public void setNext(MyListNode newNode) {
        this.next = newNode;
    }

    @Override
    public String toString() {
        return "MyListNode{" +
                "data='" + data + '\'' +
                ", next=" + next +
                '}';
    }
}
