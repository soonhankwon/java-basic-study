package com.soon.exception;

public class ExceptionTest {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        try {
            arr[6] = 14;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        System.out.println("정상 흐름 회복");
    }
}
