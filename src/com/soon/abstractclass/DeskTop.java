package com.soon.abstractclass;

public class DeskTop extends Computer{

    @Override
    void display() {
        System.out.println("DeskTop.display");
    }

    @Override
    void typing() {
        System.out.println("DeskTop.typing");
    }
}
