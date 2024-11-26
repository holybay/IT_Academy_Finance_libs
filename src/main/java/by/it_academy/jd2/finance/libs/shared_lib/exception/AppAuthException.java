package by.it_academy.jd2.finance.libs.shared_lib.exception;

public class AppAuthException extends ApplicationException {

    public AppAuthException() {
        super();
    }

    public AppAuthException(Throwable cause) {
        super(cause);
    }

    public AppAuthException(String message) {
        super(message);
    }

    public AppAuthException(String message, Throwable cause) {
        super(message, cause);
    }
}
