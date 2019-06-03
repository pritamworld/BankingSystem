package com.exception;

public class EmployeeIdException extends Exception {
    public EmployeeIdException() {
        super(("please enter employee id"));
    }

    public EmployeeIdException(String message) {
        super(message);
    }
}
