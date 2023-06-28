package com.soon.array;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        double[] dArr = new double[5];
        dArr[0] = 1.1;
        dArr[1] = 2.1;
        dArr[2] = 3.1;

        double total = Arrays.stream(dArr)
                .filter(v -> v != 0)
                .reduce(1, (a, b) -> a * b);

        System.out.println(total);
    }
}
