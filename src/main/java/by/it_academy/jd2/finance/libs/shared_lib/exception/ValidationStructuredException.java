package by.it_academy.jd2.finance.libs.shared_lib.exception;

public class ValidationStructuredException extends ApplicationStructuredException {

    public ValidationStructuredException(String field, String message, Throwable cause) {
        super(field, message, cause);
    }

    public ValidationStructuredException(String field, String message) {
        super(field, message);
    }
}
