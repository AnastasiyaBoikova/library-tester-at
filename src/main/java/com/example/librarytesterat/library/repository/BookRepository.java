package com.example.librarytesterat.library.repository;

import com.example.librarytesterat.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findById(int bookId);
    List<Book> findAllByAuthorId(int authorId);


}
