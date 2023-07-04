package com.soon.datastructure;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyArray {

    int[] intArr;
    int count;

    private static int ARRAY_CAPACITY;

    public MyArray() {
        count = 0;
        ARRAY_CAPACITY = 10;
        intArr = new int[ARRAY_CAPACITY];
    }

    public MyArray(int size) {
        count = 0;
        ARRAY_CAPACITY = size;
        intArr = new int[size];
    }


    public void addElement(int num) {
        if(count >= ARRAY_CAPACITY) {
            System.out.println("not enough memory");
            return;
        }
        intArr[count++] = num;
    }

    public void insertElement(int position, int num) {
        if(count >= ARRAY_CAPACITY) {
            System.out.println("not enough memory");
            return;
        }

        if(position < 0 || position > count) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for(int i = count - 1; i >= position; i--) {
            intArr[i + 1] = intArr[i];
        }

        intArr[position] = num;
        count++;
    }

    public int removeElement(int position) {
        if(isEmpty()) {
            throw new NoSuchElementException("no element");
        }
        if(position < 0 || position > count) {
            throw new ArrayIndexOutOfBoundsException("insert error");
        }

        int ret = intArr[position];
        for(int i = position; i < count; i++) {
            intArr[i] = intArr[i + 1];
        }
        count--;
        return ret;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return "MyArray{" +
                "intArr=" + Arrays.toString(intArr) +
                ", count=" + count +
                '}';
    }
}
