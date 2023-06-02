package com.soon.ch4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VariableTest {

    @Test
    void variable() {
        int age;
        age = 10;

        int level = 1000;
        assertThat(age).isEqualTo(10);
        assertThat(level).isEqualTo(1000);
    }
}