package com.soon.quiz;

public class Car {

    private static int sequence = 10000;

    private int id;

    public Car() {
        this.id = ++sequence;
    }

    public void showInfo() {
        System.out.println(this.id);
    }
}
