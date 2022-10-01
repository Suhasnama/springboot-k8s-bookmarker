package com.suhas.bookmarkerapi.domain;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {
    private final BookmarkRepository bookmarkRepository;

    @Transactional(readOnly = true)
    public BookmarkDTO getBookmarks(Integer page){
        Integer pageNo = page < 1 ? 0 : page-1;
        Pageable pageable = PageRequest.of(pageNo, 2,Sort.Direction.DESC,"createdAt");
        return new BookmarkDTO( bookmarkRepository.findAll(pageable));
    }
}
