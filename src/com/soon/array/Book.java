package com.soon.array;

public class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void showBookInfo() {
        System.out.println(this.author + " : " + this.title);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;

    }

    public String getAuthor() {
        return this.author;
    }
}
