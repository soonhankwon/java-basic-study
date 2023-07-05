package com.soon.stream;


import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {
    @Override
    public String apply(String s1, String s2) {
        return s1.getBytes().length >= s2.getBytes().length ? s1 : s2;
    }
}

public class ReduceTest {

    public static void main(String[] args) {
        String[] players = {"DURANT", "JAMES", "CURRY", "GREEN"};

        String res = Arrays.stream(players).reduce("", (s1, s2) -> {
            if (s1.getBytes().length >= s2.getBytes().length) {
                return s1;
            } else {
                return s2;
            }
        });

        System.out.println(res);

        String res2 = Arrays.stream(players).reduce(new CompareString()).get();
        System.out.println(res2);
    }
}
