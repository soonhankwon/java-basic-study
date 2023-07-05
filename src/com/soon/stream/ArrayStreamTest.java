package com.soon.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayStreamTest {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.stream(arr).sum());
        System.out.println(Arrays.stream(arr).count());
        System.out.println(Arrays.stream(arr).min().getAsInt());
        System.out.println(Arrays.stream(arr).max().getAsInt());

        IntStream.range(0, 10).forEach(i -> System.out.print("="));
        System.out.println();
        Arrays.stream(arr).filter(i -> i > 2)
                .forEach(System.out::println);
        System.out.println(Arrays.stream(arr)
                .reduce(0, (a, b) -> a + b));
    }
}
