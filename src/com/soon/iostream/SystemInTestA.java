package com.soon.iostream;

import java.io.IOException;

public class SystemInTestA {

    public static void main(String[] args) {
        System.out.println("write one alphabet and press enter");

        int i;
        try {
            i = System.in.read();
            System.out.println(i);
            System.out.println((char)i);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
