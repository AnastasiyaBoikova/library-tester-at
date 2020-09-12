package com.example.librarytesterat.library.model;

import javax.persistence.*;

@Entity
@IdClass(RelUserBookKey.class)
@Table(name = "rel_user_book")
public class RelUserBook {

    @Id
    @Column(name="id_user")
    private int idUser;
    @Id
    @Column(name="id_book")
    private int idBook;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    @Override
    public String toString() {
        return "RelUserBook{" +
                "idUser=" + idUser +
                ", idBook=" + idBook +
                '}';
    }
}
