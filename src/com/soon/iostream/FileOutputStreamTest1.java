package com.soon.iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

    public static void main(String[] args) throws FileNotFoundException {

        FileOutputStream fos = new FileOutputStream("output.txt");

        try(fos) {
            fos.write(65);
            fos.write(66);
            fos.write(67);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("END");
    }
}
