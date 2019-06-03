package com.exception;

public class InvalidPhoneException extends Exception {
    public InvalidPhoneException() {
        super("invalid phone number");
    }

    public InvalidPhoneException(String message) {
        super(message);
    }
}
