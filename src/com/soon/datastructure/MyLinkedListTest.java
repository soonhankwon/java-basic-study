package com.soon.datastructure;

public class MyLinkedListTest {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addElement("A");
        list.addElement("B");
        list.addElement("C");

        list.insertElement(1, "D");
        list.insertElement(2, "Z");
        list.removeElement(2);
        System.out.println(list);
    }
}
