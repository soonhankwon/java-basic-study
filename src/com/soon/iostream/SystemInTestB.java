package com.soon.iostream;

import java.io.IOException;

public class SystemInTestB {

    public static void main(String[] args) {
        System.out.println("write one alphabet and press enter");

        int i;
        try {
            while((i = System.in.read()) != '\n') {
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
