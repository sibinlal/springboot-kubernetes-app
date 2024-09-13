package com.codelab.bookmarker.mapper;

import com.codelab.bookmarker.domain.Bookmark;
import com.codelab.bookmarker.model.BookmarkModel;
import org.springframework.stereotype.Component;

import java.awt.print.Book;

@Component
public class BookmarkMapper {

    public BookmarkModel mapToBookmarkModel(Bookmark bookmark) {
        return new BookmarkModel(
                bookmark.getId(),
                bookmark.getTitle(),
                bookmark.getUrl(),
                bookmark.getCreatedAt()
        );
    }
}
