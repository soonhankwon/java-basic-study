package com.soon.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();
        sList.add("DURANT");
        sList.add("JAMES");
        sList.add("CURRY");

        Stream<String> stream = sList.stream();
        stream.forEach(System.out::println);
        sList.stream().sorted().forEach(System.out::println);
        sList.stream().map(s -> s.toLowerCase())
                .forEach(System.out::println);
        sList.stream().filter(s -> s.length() > 5)
                .forEach(System.out::println);
    }
}
