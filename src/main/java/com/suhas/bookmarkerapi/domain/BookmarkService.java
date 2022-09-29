package com.suhas.bookmarkerapi.domain;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {
    private final BookmarkRepository bookmarkRepository;

    @Transactional(readOnly = true)
    public List<Bookmark> getBookmarks(){
        return bookmarkRepository.findAll();
    }
}
