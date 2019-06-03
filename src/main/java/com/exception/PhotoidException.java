package com.exception;

public class PhotoidException extends Exception {
    public PhotoidException() {
        super("enter photo id");
    }

    public PhotoidException(String message) {
        super(message);
    }
}
