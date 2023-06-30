package com.soon.interfaceexam;

import java.util.Arrays;

public interface Calc {

    // static
    double PI = 3.14;
    int Error = -99999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description() {
        String str = privateMethodInterface();
        System.out.println(str + " INTERFACE DEFAULT METHOD");
    }

    default void descriptionV2() {
        String str = privateMethodInterface();
        System.out.println(str + " INTERFACE DEFAULT METHOD");
    }

    private String privateMethodInterface() {
        return "PRIVATE METHOD INTERFACE ------> BEFORE CALL";
    }

    static int staticMethodInterfaceTotal(int[] numbers) {
        System.out.println(PI + " : ACCESS : " + Error);
        System.out.println("Calc INTERFACE STATIC METHOD");
        return Arrays.stream(numbers).sum();
    }
}
