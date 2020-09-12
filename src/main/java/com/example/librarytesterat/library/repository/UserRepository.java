package com.example.librarytesterat.library.repository;

import com.example.librarytesterat.library.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findAllById (int idUser);

}
