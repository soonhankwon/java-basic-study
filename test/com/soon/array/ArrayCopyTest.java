package com.soon.array;

import org.assertj.core.api.Assertions;
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

        // 객체 주소 값을 복사함으로 ==
        assertThat(copyBooks).isEqualTo(books);

        // 객체 주소 값을 복사함으로 원본 객체 배열 수정시 값은 값이 바뀜
        books[3].setTitle("SLAMDUNK");
        assertThat(copyBooks[3].getTitle()).isEqualTo("SLAMDUNK");
    }
}
