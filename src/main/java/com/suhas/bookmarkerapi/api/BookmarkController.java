package com.suhas.bookmarkerapi.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suhas.bookmarkerapi.domain.Bookmark;
import com.suhas.bookmarkerapi.domain.BookmarkService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/bookmarks")
@RequiredArgsConstructor
public class BookmarkController {
    private final BookmarkService bookmarkService;

    @GetMapping
    public List<Bookmark> getBookmarks(){
        return bookmarkService.getBookmarks();
    }
}
