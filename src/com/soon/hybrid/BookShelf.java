package com.soon.hybrid;

import com.soon.array.Book;

public class BookShelf extends Shelf implements Queue {

    @Override
    public void add(Book book) {
        super.shelf.add(book);
    }

    @Override
    public Book poll() {
        if(super.shelf.isEmpty()) {
            return null;
        }
        Book book = super.shelf.get(0);
        super.shelf.remove(book);

        return book;
    }
}
