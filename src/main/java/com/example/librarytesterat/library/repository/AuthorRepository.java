package com.example.librarytesterat.library.repository;

import com.example.librarytesterat.library.model.Author;
import com.example.librarytesterat.library.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {



}
