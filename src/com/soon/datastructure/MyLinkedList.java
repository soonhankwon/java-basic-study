package com.soon.datastructure;

import java.util.NoSuchElementException;

public class MyLinkedList {

    private MyListNode head;
    int count;

    public MyLinkedList() {
        head = null;
        count = 0;
    }

    public void addElement(String data) {
        MyListNode newNode;
        if (head == null) {
            newNode = new MyListNode(data);
            head = newNode;
        } else {
            newNode = new MyListNode(data);
            MyListNode tempNode = head;
            while (tempNode.next() != null) {
                tempNode = tempNode.next();
            }
            tempNode.setNext(newNode);
        }
        count++;
    }

    public void insertElement(int position, String data) {
        int i;
        MyListNode tempNode = head;
        MyListNode newNode = new MyListNode(data);

        if (position < 0 || position > count) {
            throw new NoSuchElementException();
        }

        if (position == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            MyListNode preNode = null;
            for (i = 0; i < position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next();
            }

            newNode.setNext(preNode.next());
            preNode.setNext(newNode);
        }
        count++;
    }

    public void removeElement(int position) {
        int i;
        MyListNode tempNode = head;

        if (position < 0 || position >= count) {
            throw new NoSuchElementException();
        }

        if (position == 0) {
            head = tempNode.next();
        } else {
            MyListNode preNode = null;
            for (i = 0; i < position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next();
            }
            preNode.setNext(tempNode.next());
        }

        count--;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", count=" + count +
                '}';
    }
}
