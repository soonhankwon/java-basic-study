package com.soon.lambda;

public class AddTest {

    public static void main(String[] args) {
        Add addF = (x, y) ->  x + y;
        System.out.println(addF.add(3, 5));

        MyMaxNumber max = (x, y) -> x >= y ? x : y;
        System.out.println(max.getMaxNumber(10, 9));
    }
}
