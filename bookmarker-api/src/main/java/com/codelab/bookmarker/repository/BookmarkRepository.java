package com.codelab.bookmarker.repository;

import com.codelab.bookmarker.domain.Bookmark;
import com.codelab.bookmarker.model.BookmarkModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {

    @Query("select new com.codelab.bookmarker.model.BookmarkModel(b.id, b.title, b.url, b.createdAt) from Bookmark b")
    Page<BookmarkModel> findAllBookMarks(Pageable pageable);

    @Query("select new com.codelab.bookmarker.model.BookmarkModel(b.id, b.title, b.url, b.createdAt) " +
            " from Bookmark b " +
            "where lower(b.title) like lower(concat('%',:query,'%'))")
    Page<BookmarkModel> searchBookMarks(String query, Pageable pageable);

    Page<BookmarkModel> findByTitleContainsIgnoreCase(String query, Pageable pageable);
}
