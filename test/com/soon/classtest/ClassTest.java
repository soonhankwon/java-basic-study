package com.soon.classtest;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class ClassTest {

    @Test
    void classTest() throws ClassNotFoundException {

        String s;
        s = "java.lang.String"; //runtime 시 원하는 클래스 로딩해서 binding 가능
        Class c = s.getClass();
        assertThat(c.getName()).isEqualTo("java.lang.String");

        Class c2 = Class.forName("java.lang.String");
        assertThat(c2.getName()).isEqualTo("java.lang.String");

        Constructor<String>[] constructors = c2.getConstructors();
        Arrays.stream(constructors).forEach(System.out::println);

        Method[] methods = c2.getMethods();
        Arrays.stream(methods).iterator().forEachRemaining(System.out::println);
    }
}
