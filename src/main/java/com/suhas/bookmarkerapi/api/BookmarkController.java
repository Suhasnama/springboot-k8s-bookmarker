package com.suhas.bookmarkerapi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.suhas.bookmarkerapi.domain.BookmarkDTO;
import com.suhas.bookmarkerapi.domain.BookmarkService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/bookmarks")
@RequiredArgsConstructor
public class BookmarkController {
    private final BookmarkService bookmarkService;

    @GetMapping
    public BookmarkDTO getBookmarks(@RequestParam(name = "page", defaultValue = "1") Integer page){
        return bookmarkService.getBookmarks(page);
    }
}
