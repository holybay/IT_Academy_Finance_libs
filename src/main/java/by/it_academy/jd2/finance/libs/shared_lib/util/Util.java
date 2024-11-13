package by.it_academy.jd2.finance.libs.shared_lib.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Util {

    public static LocalDateTime longToLocalDateTime(long epochTime) {
        Instant instant = Instant.ofEpochMilli(epochTime);
        return LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
    }
}
