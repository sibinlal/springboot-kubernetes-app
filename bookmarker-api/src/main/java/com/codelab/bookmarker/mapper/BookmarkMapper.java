package com.codelab.bookmarker.mapper;

import com.codelab.bookmarker.domain.Bookmark;
import com.codelab.bookmarker.model.BookmarkModel;
import org.springframework.stereotype.Component;

import java.awt.print.Book;

@Component
public class BookmarkMapper {

    public BookmarkModel mapToBookmarkModel(Bookmark bookmark) {
        BookmarkModel model = new BookmarkModel();
        model.setId(bookmark.getId());
        model.setTitle(bookmark.getTitle());
        model.setUrl(bookmark.getUrl());
        model.setCreatedAt(bookmark.getCreatedAt());
        return model;
    }
}
