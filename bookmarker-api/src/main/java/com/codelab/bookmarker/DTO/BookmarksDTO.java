package com.codelab.bookmarker.DTO;

import com.codelab.bookmarker.domain.Bookmark;
import com.codelab.bookmarker.model.BookmarkModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.util.List;

@Setter
@Getter
public class BookmarksDTO {

    private List<BookmarkModel> data;
    private long totalElements;
    private int totalPages;
    private int currentPage;
    @JsonProperty("isFirstPage")
    private boolean isFirstPage;
    @JsonProperty("isLastPage")
    private boolean isLastPage;
    @JsonProperty("hasNextPage")
    private boolean hasNextPage;
    @JsonProperty("hasPreviousPage")
    private boolean hasPreviousPage;

    public BookmarksDTO(Page<BookmarkModel> bookmarkPage) {
        this.setData(bookmarkPage.getContent());
        this.setTotalElements(bookmarkPage.getTotalElements());
        this.setTotalPages(bookmarkPage.getTotalPages());
        this.setCurrentPage(bookmarkPage.getNumber() + 1);
        this.setFirstPage(bookmarkPage.isFirst());
        this.setLastPage(bookmarkPage.isLast());
        this.setHasNextPage(bookmarkPage.hasNext());
        this.setHasPreviousPage(bookmarkPage.hasPrevious());
    }

}
