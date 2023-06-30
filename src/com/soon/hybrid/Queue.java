package com.soon.hybrid;

import com.soon.array.Book;

public interface Queue {
    void add(Book book);
    Book poll();
}
