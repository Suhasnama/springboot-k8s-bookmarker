package com.suhas.bookmarkerapi;
import java.time.Instant;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.suhas.bookmarkerapi.domain.Bookmark;
import com.suhas.bookmarkerapi.domain.BookmarkRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner{

    private final BookmarkRepository bookmarkRepository;

    @Override
    public void run(String... args) throws Exception {
        bookmarkRepository.save(new Bookmark(null, "Google", "https://google.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Yahoo", "https://yahoo.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Bing", "https://bing.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Yandex", "https://yandex.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Apple", "https://apple.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Netflix", "https://netflix.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Hotstar", "https://hotstar.com", Instant.now()));
    }

}