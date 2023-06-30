package com.soon.abstractclass;

public abstract class Computer {

    abstract void display();

    abstract void typing();

    void turnOn() {
        System.out.println("Computer.turnOn");
    }

    void turnOff() {
        System.out.println("Computer.turnOff");
    }
}
