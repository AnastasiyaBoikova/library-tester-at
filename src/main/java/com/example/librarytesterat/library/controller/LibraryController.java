package com.example.librarytesterat.library.controller;

import com.example.librarytesterat.library.model.Book;
import com.example.librarytesterat.library.model.User;
import com.example.librarytesterat.library.service.LibraryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibraryController {

    private LibraryService libraryService;


    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }


    public List<User> getUserBooks(int userId) {
        return libraryService.getBookUser(userId);
    }

    public List<Book> getAuthorBook(int authorId) {
        return libraryService.getAuthorBook(authorId);
    }

    public List<User> getBookUser(int bookId) {
        return libraryService.getBookUser(bookId);
    }

    public List<User> getAuthorUser(int authorId) {
        return libraryService.getAuthorUser(authorId);
    }

}
