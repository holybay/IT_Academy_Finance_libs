package by.it_academy.jd2.finance.libs.shared_lib.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Objects;

@JsonPropertyOrder({"number", "size", "total_pages", "total_elements", "first", "number_of_elements", "last", "content"})
public class PageOf<T> {

    private int number;
    private int size;

    @JsonProperty("total_pages")
    private int totalPages;

    @JsonProperty("total_elements")
    private long totalElements;
    private boolean first;

    @JsonProperty("number_of_elements")
    private int numberOfElements;
    private boolean last;
    private List<T> content;

    public PageOf(int number, int size, int totalPages, long totalElements, boolean first, int numberOfElements,
                  boolean last, List<T> content) {
        this.number = number;
        this.size = size;
        this.totalPages = totalPages;
        this.totalElements = totalElements;
        this.first = first;
        this.numberOfElements = numberOfElements;
        this.last = last;
        this.content = content;
    }

    public static <T> PageOf<T> convert(Page<T> page) {
        return new PageOf<>(page.getNumber(), page.getSize(), page.getTotalPages(), page.getTotalElements(),
                page.isFirst(), page.getNumberOfElements(), page.isLast(), page.getContent());
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PageOf<?> pageOf = (PageOf<?>) o;
        return number == pageOf.number && size == pageOf.size && totalPages == pageOf.totalPages && totalElements == pageOf.totalElements && first == pageOf.first && numberOfElements == pageOf.numberOfElements && last == pageOf.last && Objects.equals(content, pageOf.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, size, totalPages, totalElements, first, numberOfElements, last, content);
    }

    @Override
    public String toString() {
        return "PageOf{" +
                "number=" + number +
                ", size=" + size +
                ", totalPages=" + totalPages +
                ", totalElements=" + totalElements +
                ", first=" + first +
                ", numberOfElements=" + numberOfElements +
                ", last=" + last +
                ", content=" + content +
                '}';
    }
}
