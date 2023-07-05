package com.soon.lambda;

@FunctionalInterface
interface PrintString {
    void showString(String str);
}


public class TestLambda {
    public static void main(String[] args) {
        PrintString printString = System.out::println;
        printString.showString("hello, world");

        showMyString(printString);

        PrintString myString = returnString();
        myString.showString("hello");
    }

    public static void showMyString(PrintString str) {
        str.showString("hello, world2");
    }

    public static PrintString returnString() {
        return s -> System.out.println(s + ", world3");
    }
}
