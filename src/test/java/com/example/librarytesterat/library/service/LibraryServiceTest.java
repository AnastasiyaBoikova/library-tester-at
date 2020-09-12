package com.example.librarytesterat.library.service;

import com.example.librarytesterat.library.model.Book;
import com.example.librarytesterat.library.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class LibraryServiceTest {

    @Autowired
    LibraryService libraryService;

    @Test
    void getUserBooks() {

        List<Book> userBooks = libraryService.getUserBooks(2);
        Assertions.assertEquals(2, userBooks.size());

        List<Book> authorBook = libraryService.getAuthorBook(1);
        Assertions.assertEquals("Гарри Поттер и филосовский каммень", authorBook.get(0).getName());

        List<User> bookUser = libraryService.getBookUser(7);
        Assertions.assertEquals("Грут", bookUser.get(0).getName());

        List<User> authorUser = libraryService.getAuthorUser(2);
        Assertions.assertEquals("Танос", authorUser.get(1).getName());


    }
}