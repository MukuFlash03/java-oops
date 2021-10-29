package Java.Basic.ExceptionHandling;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String str) {
        super(str);
    }
}

