package com.codelab.bookmarker.controller;

import com.codelab.bookmarker.DTO.BookmarksDTO;
import com.codelab.bookmarker.domain.Bookmark;
import com.codelab.bookmarker.model.BookmarkModel;
import com.codelab.bookmarker.model.CreateBookmarkRequest;
import com.codelab.bookmarker.service.BookmarkService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookmarkApiController {

    private final BookmarkService bookmarkService;

    @GetMapping
    public BookmarksDTO getAllBookMarksByTitle(@RequestParam(name= "page", defaultValue = "1") Integer page,
                                        @RequestParam(name= "query", defaultValue = "") String query) {
        if(query == null || query.trim().length() == 0) {
            return  bookmarkService.getAllBookmarks(page);
        } else {
            return bookmarkService.searchBookMarkByTitle(query, page);
        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookmarkModel createBookmark(@RequestBody @Valid CreateBookmarkRequest request) {
        return bookmarkService.createBookmark(request);
    }

}
