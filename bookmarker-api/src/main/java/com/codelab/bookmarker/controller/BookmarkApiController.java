package com.codelab.bookmarker.controller;

import com.codelab.bookmarker.DTO.BookmarksDTO;
import com.codelab.bookmarker.domain.Bookmark;
import com.codelab.bookmarker.service.BookmarkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookmarkApiController {

    private final BookmarkService bookmarkService;

    @GetMapping
    public BookmarksDTO getAllBookMarks(@RequestParam(name= "page", defaultValue = "1") Integer page,
                                        @RequestParam(name= "query", defaultValue = "") String query) {
        if(query == null || query.trim().length() == 0) {
            return  bookmarkService.getAllBookmarks(page);
        } else {
            return bookmarkService.searchBookMark(query, page);
        }

    }

}
