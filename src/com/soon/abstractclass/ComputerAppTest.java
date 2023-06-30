package com.soon.abstractclass;

public class ComputerAppTest {

    public static void main(String[] args) {
        Computer deskTop = new DeskTop();
        deskTop.turnOn();
        deskTop.typing();
        deskTop.display();
        deskTop.turnOff();

        Computer noteBook = new NoteBook();
        noteBook.turnOn();
        noteBook.typing(); //override
        noteBook.display(); //override
        noteBook.turnOff();

        Computer myNoteBook = new MyNoteBook();
        myNoteBook.turnOn();
        myNoteBook.typing(); //override
        myNoteBook.display();
        myNoteBook.turnOff();
    }
}
