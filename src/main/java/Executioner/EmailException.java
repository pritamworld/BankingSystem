package Executioner;

public class EmailException extends Exception {
    public EmailException() {
        super("enter email");
    }

    public EmailException(String message) {
        super(message);
    }
}
