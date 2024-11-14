package by.it_academy.jd2.finance.libs.shared_lib.exception;

public class ApplicationException extends RuntimeException {

    public ApplicationException() {
        super();
    }

    public ApplicationException(Throwable cause) {
        super(cause);
    }

    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }
}
