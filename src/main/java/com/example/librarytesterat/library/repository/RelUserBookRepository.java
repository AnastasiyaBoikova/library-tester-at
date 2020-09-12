package com.example.librarytesterat.library.repository;

import com.example.librarytesterat.library.model.RelUserBook;
import com.example.librarytesterat.library.model.RelUserBookKey;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RelUserBookRepository extends JpaRepository<RelUserBook, RelUserBookKey> {

    List<RelUserBook>findByIdUser(int idUser);
    List<RelUserBook>findByIdBook(int idBook);

}
