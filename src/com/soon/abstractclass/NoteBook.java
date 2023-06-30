package com.soon.abstractclass;

public class NoteBook extends Computer{

    @Override
    void typing() {
        System.out.println("NoteBook.typing");
    }

    @Override
    void display() {
        System.out.println("NoteBook.display");
    }
}
