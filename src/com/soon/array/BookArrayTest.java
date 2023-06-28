package com.soon.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BookArrayTest {

    public static void main(String[] args) {

        Book[] books = new Book[5];
        IntStream.range(0, books.length).forEach(i -> {
            books[i] = new Book("귀멸의 칼날" + (i + 1), "SOON");
            books[i].showBookInfo();
        });

        System.out.println("=====================");

        // 얇은 복사 테스트 - 객체의 주소값을 복사
        Book[] library = new Book[5];
        System.arraycopy(books,0, library, 0, 5);

        books[3].setTitle("SLAMDUNK");

        Arrays.stream(library).forEach(Book::showBookInfo);
        String str1 = "test";
        String str2 = "test";
        String str3 = new String("test");
        String str4 = new String("test");
        System.out.println(str1 == str2);
        System.out.println(str3 == str4);
        System.out.println(str1.hashCode() + " : " + str3.hashCode() + " : " + str4.hashCode());

        Book book1 = new Book("1", "1");
        Book book2 = new Book("1", "1");

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
    }
}
