package com.example.task03app.service;

import com.example.task03app.dto.BookDto;

import java.util.List;

public interface BookService {

    BookDto getBookDtoById(Long id);

    List<BookDto> getAllBookDtos();

    BookDto saveBookDto(BookDto bookDto);

    BookDto updateBookDto(BookDto bookDto);

    void deleteBook(Long id);

    boolean containsBook(Long id);

}
