package com.soon.hybrid;

import com.soon.array.Book;

public class BookAppTest {

    public static void main(String[] args) {

        BookShelf shelf = new BookShelf();
        Book javaBook = new Book("JAVA BOOK", "SOON");
        Book springBook = new Book("SPRING BOOK", "TOBY");
        Book jpaBook = new Book("JPA BOOK", "KIM");

        shelf.add(javaBook);
        shelf.add(springBook);
        shelf.add(jpaBook);
        Book poll = shelf.poll();
        System.out.println(poll);

        System.out.println("=================");
        for (Book book : shelf.shelf) {
            System.out.println(book);
        }
    }
}
