package com.soon.exception;

public class PasswordException extends IllegalArgumentException {

    private CustomErrorCode customCode;

    public PasswordException(CustomErrorCode code) {
        this.customCode = code;
    }

    public CustomErrorCode getCustomCode() {
        return customCode;
    }
}
