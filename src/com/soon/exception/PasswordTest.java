package com.soon.exception;

import java.util.Scanner;

public class PasswordTest {

    private String password;

    public PasswordTest() {
    }

    public PasswordTest(String password) {
        if (password == null) {
            throw new PasswordException(CustomErrorCode.CODE101);
        }

        if (password.length() < 5) {
            throw new PasswordException(CustomErrorCode.CODE102);
        }

        if (!password.matches("^(?=.*\\d)(?=.*[^a-zA-Z0-9]).*$")) {
            throw new PasswordException(CustomErrorCode.CODE103);
        }
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public static void main(String[] args) {
        System.out.println("TRY INPUT PASSWORD");
        Scanner scanner = new Scanner(System.in);
        try {
            PasswordTest test = new PasswordTest(scanner.nextLine());
            System.out.println("PASSWORD : " + test.getPassword());
        } catch (PasswordException e) {
            System.out.println(e.getCustomCode().getMessage());
            main(new String[]{});
        }
        scanner.close();
    }
}
