package com.soon.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

public class FileExceptionTest {

    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e);
        } finally {
            System.out.println("finally");
            try {
                Objects.requireNonNull(fis).close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
