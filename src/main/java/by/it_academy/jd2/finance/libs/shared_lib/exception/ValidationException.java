package by.it_academy.jd2.finance.libs.shared_lib.exception;

public class ValidationException extends ApplicationStructuredException {

    public ValidationException(String field, String message) {
        super(field, message);
    }

    public ValidationException(String field, String message, Throwable cause) {
        super(field, message, cause);
    }
}
