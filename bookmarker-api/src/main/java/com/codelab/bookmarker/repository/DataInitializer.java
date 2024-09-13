package com.codelab.bookmarker.repository;

import com.codelab.bookmarker.domain.Bookmark;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final BookmarkRepository repository;

    @Override
    public void run(String... args) throws Exception {
        //repository.save(new Bookmark(null, "codeLab", "abc.com", Instant.now()));
        //repository.save(new  Bookmark(null, "sbnlal", "sbn.com", Instant.now()));
    }
}
