package by.it_academy.jd2.finance.libs.shared_lib.util;

import by.it_academy.jd2.finance.libs.shared_lib.dto.PageConfig;
import by.it_academy.jd2.finance.libs.shared_lib.dto.PageDto;
import by.it_academy.jd2.finance.libs.shared_lib.exception.ValidationException;
import by.it_academy.jd2.finance.libs.shared_lib.exception.ValidationStructuredException;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

public class PageUtil {

    public static PageRequest getPageRequest(int page, int size, PageConfig pageConfig, long totalElements, Sort sort) {
        int pageSize = Math.min(
                Math.max(pageConfig.getMinPageSize(), size),
                pageConfig.getMaxPageSize());
        int maxPageCount = 0;
        int calcPageCount = (int) (totalElements / pageSize);
        if (calcPageCount != 0) {
            maxPageCount = calcPageCount - 1;
        }
        return PageRequest.of(Math.min(page, maxPageCount), pageSize, sort);
    }

    public static void validatePage(PageDto pageDto) {
        List<ValidationStructuredException> errors = new ArrayList<>();
        if (pageDto.getPage() < 0) {
            errors.add(new ValidationStructuredException("page",
                    "Page value must be greater than zero! Provided value: " + pageDto.getPage()));
        }
        if (pageDto.getSize() <= 0) {
            errors.add(new ValidationStructuredException("size",
                    "Page size must not be negative or zero!! Provided value: " + pageDto.getPage()));
        }
        if (!errors.isEmpty()) {
            throw new ValidationException(errors);
        }
    }

}
