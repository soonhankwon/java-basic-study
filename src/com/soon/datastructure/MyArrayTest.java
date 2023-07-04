package com.soon.datastructure;

public class MyArrayTest {

    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.addElement(10);
        myArray.addElement(20);
        myArray.addElement(30);
        myArray.insertElement(2, 50);
        myArray.removeElement(3);

        System.out.println(myArray);
    }
}
