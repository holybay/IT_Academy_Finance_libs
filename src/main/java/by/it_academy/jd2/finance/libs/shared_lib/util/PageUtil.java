package by.it_academy.jd2.finance.libs.shared_lib.util;

import by.it_academy.jd2.finance.libs.shared_lib.dto.PageConfig;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

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

}
