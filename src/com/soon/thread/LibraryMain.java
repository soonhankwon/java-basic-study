package com.soon.thread;

import java.util.ArrayList;

class Library {

    private ArrayList<String> shelf = new ArrayList<>();

    public Library() {
        shelf.add("귀멸의 칼날1");
        shelf.add("귀멸의 칼날2");
        shelf.add("귀멸의 칼날3");
    }

    public synchronized String lendBook() throws InterruptedException {
        Thread t = Thread.currentThread();
        if(shelf.size() == 0) {
            System.out.println(t.getName() + "waiting start");
            wait();
            System.out.println(t.getName() + "waiting end");
        }
        String book = shelf.remove(0);
        System.out.println(t.getName() + book + " lend");
        return book;
    }

    public synchronized void returnBook(String book) {
        Thread t = Thread.currentThread();
        shelf.add(book);
        System.out.println(t.getName() + book + " return");
        notifyAll();
        System.out.println(t.getName() + " notify");
    }
}

class Student extends Thread {

    public void run() {
        try {
            String title = LibraryMain.library.lendBook();
            Thread.sleep(5000);
            LibraryMain.library.returnBook(title);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class LibraryMain {

    public static Library library = new Library();

    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        student.start();
        student2.start();
        student3.start();
        student4.start();
    }
}
