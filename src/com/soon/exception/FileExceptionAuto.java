package com.soon.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

public class FileExceptionAuto {

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("a.txt")){
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
