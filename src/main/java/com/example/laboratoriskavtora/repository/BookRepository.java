package com.example.laboratoriskavtora.repository;

import com.example.laboratoriskavtora.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository {
    List<Book> findAll();
    List<Book> findAllByCategoryId(Long categoryId);
    Optional<Book> findById(Long id);
    Book save(Book books);
    void deleteById(Long id);
}
