package com.soon.exception;

public enum CustomErrorCode {
    CODE101("password can't be null"),
    CODE102("password must be at least 5 characters"),
    CODE103("password must be one special char and one number");

    private final String message;

    CustomErrorCode(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
