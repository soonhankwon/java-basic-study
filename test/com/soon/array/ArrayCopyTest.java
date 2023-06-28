package com.soon.array;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayCopyTest {
    @Test
    void thinCopy() {
        Book[] books = new Book[5];
        IntStream.range(0, books.length)
                .forEach(i -> books[i] = new Book("귀멸의 칼날" + (i + 1), "SOON"));

        Book[] copyBooks = new Book[5];

        System.arraycopy(books, 0 , copyBooks, 0, 5);

        // 객체 주소 값을 복사하지만 books 와 copybooks 의 객체 주소값은 다르다.
        assertThat(copyBooks).isNotSameAs(books);
        // 객체 배열 요소들의 값은 같다.
        assertThat(copyBooks).isEqualTo(books);

        // 객체 주소 값을 복사함으로 원본 객체 배열 요소 수정시 해당 객체를 참조하는 복사 배열 요소 값이 바뀜
        books[3].setTitle("SLAMDUNK");
        assertThat(copyBooks[3].getTitle()).isEqualTo("SLAMDUNK");
    }

    @Test
    void deepCopy() {
        Book[] books = new Book[5];
        IntStream.range(0, books.length)
                .forEach(i -> books[i] = new Book("귀멸의 칼날" + (i + 1), "SOON"));

        Book[] copyBooks = new Book[5];
        IntStream.range(0, books.length)
                .forEach(i -> copyBooks[i] = new Book(books[i].getTitle(), books[i].getAuthor()));

        // 원본 배열 객체 요소의 값만 복사하고 객체 주소값은 다름
        assertThat(copyBooks).isNotEqualTo(books);

        // 객체 주소값이 다르므로 원본 배열의 수정에 영향을 받지 않는다. 깊은 복사
        books[3].setTitle("SLAMDUNK");
        assertThat(copyBooks[3].getTitle()).isNotEqualTo("SLAMDUNK");
    }
}
