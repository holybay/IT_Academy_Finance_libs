package by.it_academy.jd2.finance.libs.shared_lib.util;

import by.it_academy.jd2.finance.libs.shared_lib.exception.ApplicationStructuredException;
import by.it_academy.jd2.finance.libs.shared_lib.exception.dto.AppExceptionDtoSimple;
import by.it_academy.jd2.finance.libs.shared_lib.exception.dto.StructuredExceptionDto;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

public class Util {

    public static LocalDateTime longToLocalDateTime(long epochTime) {
        Instant instant = Instant.ofEpochMilli(epochTime);
        return LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
    }

    public static List<AppExceptionDtoSimple> getAppExceptionSimpleDto(Exception e) {
        List<AppExceptionDtoSimple> errors = new ArrayList<>();
        errors.add(new AppExceptionDtoSimple(e.getMessage()));
        return errors;
    }

    public static <T extends ApplicationStructuredException> List<StructuredExceptionDto> convertToStructuredExceptionDtoList(
            List<T> errors) {
        return errors.stream()
                     .map(e -> new StructuredExceptionDto(e.getField(), e.getMessage()))
                     .toList();
    }
}
