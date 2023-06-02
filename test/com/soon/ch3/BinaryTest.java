package com.soon.ch3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class BinaryTest {

    @Test
    void binary() {
        int num = 10;
        int bNum = 0b1010; //2진수
        int oNum = 012; //8진수
        int xNum = 0XA; //16진수
        assertThat(num).isEqualTo(bNum);
        assertThat(num).isEqualTo(oNum);
        assertThat(num).isEqualTo(xNum);

        int a = 65;
        assertThat((char)a).isEqualTo('A');
        assertThat(a).isEqualTo('A');
        // 10진수 65 -> char 'A'와 같다.
    }
}