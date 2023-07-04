package com.soon.stringclass;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringClassTest {

    @Test
    void newString() {
        String java = new String("java");
        String java1 = new String("java");

        assertThat(java).isNotSameAs(java1);

        String java2 = "java";
        String java3 = "java";

        assertThat(java2).isSameAs(java3);
    }

    @Test
    void modifyString() {
        // immutable String
        String java = "java";
        int hashCode = System.identityHashCode(java);

        String spring = "spring";
        java = java.concat(spring);
        // 새 객체가 생성된다. 기존 hashcode 의 String 객체는 GC의 대상이 된다.
        assertThat(System.identityHashCode(java)).isNotEqualTo(hashCode);
    }

    @Test
    void stringBuilder() {
        // mutable
        StringBuilder sb = new StringBuilder();
        int sbHashCode = System.identityHashCode(sb);

        sb.append("java");
        sb.append("spring");

        // 기존 StringBuilder 에 가변적으로 추가된다. 새 객체 생성 X
        assertThat(System.identityHashCode(sb)).isEqualTo(sbHashCode);
    }

    @Test
    void stringBuffer() {
        // mutable & thread safe
        StringBuffer sb = new StringBuffer();
        int sbHashCode = System.identityHashCode(sb);

        sb.append("java");
        sb.append("spring");

        // 기존 StringBuffer 에 가변적으로 추가된다. 새 객체 생성 X
        assertThat(System.identityHashCode(sb)).isEqualTo(sbHashCode);
    }
}
