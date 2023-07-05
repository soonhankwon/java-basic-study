package com.soon.exception;

public class LoggerTest {
    public static void main(String[] args) {
        MyLogger myLogger = MyLogger.getInstance();
        myLogger.log("test");
    }
}
