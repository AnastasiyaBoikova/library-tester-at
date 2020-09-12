package com.example.librarytesterat.library.service;

import com.example.librarytesterat.library.model.Book;
import com.example.librarytesterat.library.model.RelUserBook;
import com.example.librarytesterat.library.model.User;
import com.example.librarytesterat.library.repository.AuthorRepository;
import com.example.librarytesterat.library.repository.BookRepository;
import com.example.librarytesterat.library.repository.UserRepository;
import com.example.librarytesterat.library.repository.RelUserBookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {


    private UserRepository userRepository;
    private RelUserBookRepository relUserBookRepository;
    private BookRepository bookRepository;
    private  AuthorRepository authorRepository;

    public LibraryService(UserRepository userRepository, RelUserBookRepository relUserBookRepository, BookRepository bookRepository, AuthorRepository authorRepository) {
        this.userRepository = userRepository;
        this.relUserBookRepository = relUserBookRepository;
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }


    public List<Book> getUserBooks(int userId) {

        List<RelUserBook> all = relUserBookRepository.findByIdUser(userId);
        List<Book> byName = new ArrayList<>();

        for (RelUserBook relUserBook : all) {
            byName.addAll(bookRepository.findById(relUserBook.getIdBook()));
        }
        return byName;

    }

    public List<Book> getAuthorBook(int authorId) {
        return bookRepository.findAllByAuthorId(authorId);
    }

    public List<User> getBookUser(int bookId) {

        List<RelUserBook> userId = relUserBookRepository.findByIdBook(bookId);
        List<User> userAll = new ArrayList<>();
        for (RelUserBook userIdBook : userId) {
            userAll.addAll(userRepository.findAllById(userIdBook.getIdUser()));
        }

        return userAll;
    }

    public List<User> getAuthorUser(int authorId) {

        List<Book> bookId = this.getAuthorBook(authorId);
        List<User> users = new ArrayList<>();
        for (Book book : bookId) {
            users.addAll(this.getBookUser(book.getId()));

        }
        return users;

    }

}
