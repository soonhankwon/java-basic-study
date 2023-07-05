package com.soon.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExceptionTest {

    public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);

        return c;
    }

    public static void main(String[] args) {
        ThrowsExceptionTest test = new ThrowsExceptionTest();

        try {
            test.loadClass("a.txt", "java.lang.Strin");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(Exception e) {

        }

        System.out.println("정상 흐름 회복");
    }
}
