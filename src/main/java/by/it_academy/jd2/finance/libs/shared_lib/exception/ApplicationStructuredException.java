package by.it_academy.jd2.finance.libs.shared_lib.exception;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Map;

public class ApplicationStructuredException extends ApplicationException {

    public static final String KEY_FIELD = "field";
    public static final String KEY_MESSAGE = "message";
    public final String field;

    public ApplicationStructuredException(String field, String message) {
        super(message);
        this.field = field;
    }

    public ApplicationStructuredException(String field, String message, Throwable cause) {
        super(message, cause);
        this.field = field;
    }

    @JsonValue
    public Map<String, String> getBriefInfo() {
        return Map.of(KEY_FIELD, field, KEY_MESSAGE, getMessage());
    }
}
