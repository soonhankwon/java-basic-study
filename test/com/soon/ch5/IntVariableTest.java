package com.soon.ch5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IntVariableTest {

    @Test
    void dataTypeRange() {
        long v1 = 2147483648L;
        long v2 = -2147483649L;
        assertThat(v1 - 1).isEqualTo(Integer.MAX_VALUE);
        assertThat(v2 + 1).isEqualTo(Integer.MIN_VALUE);

        int v3 = 128;
        int v4 = -129;
        assertThat(v3 - 1).isEqualTo(Byte.MAX_VALUE);
        assertThat(v4 + 1).isEqualTo(Byte.MIN_VALUE);
    }
}