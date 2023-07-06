package com.soon.iostream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

    public static void main(String[] args) {


        try (FileInputStream fis = new FileInputStream("input.txt")){
            int i;
            while((i = fis.read()) != -1) {
                System.out.print((char)i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("END");
    }
}
