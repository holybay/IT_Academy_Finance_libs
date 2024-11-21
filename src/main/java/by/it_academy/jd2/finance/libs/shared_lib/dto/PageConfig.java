package by.it_academy.jd2.finance.libs.shared_lib.dto;

public class PageConfig {

    private int minPageSize = 5;
    private int maxPageSize = 50;

    public PageConfig() {
    }

    public PageConfig(int minPageSize, int maxPageSize) {
        this.minPageSize = minPageSize;
        this.maxPageSize = maxPageSize;
    }

    public int getMinPageSize() {
        return minPageSize;
    }

    public void setMinPageSize(int minPageSize) {
        this.minPageSize = minPageSize;
    }

    public int getMaxPageSize() {
        return maxPageSize;
    }

    public void setMaxPageSize(int maxPageSize) {
        this.maxPageSize = maxPageSize;
    }
}
