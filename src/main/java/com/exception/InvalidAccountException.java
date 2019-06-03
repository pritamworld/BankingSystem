package com.exception;

public class InvalidAccountException extends Exception {
    public InvalidAccountException() {
        super("invalid age");
    }

    public InvalidAccountException(String message) {
        super(message);
    }
}
