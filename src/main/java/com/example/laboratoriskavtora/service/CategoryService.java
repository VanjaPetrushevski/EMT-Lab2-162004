package com.example.laboratoriskavtora.service;

import com.example.laboratoriskavtora.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface CategoryService {
    List<Category> findAll();
    Category findById(Long id);
    List<Category> findAllByName(String name);
    Category save(Category category);
    Category update(Long id, Category category);
    Category updateName(String name, Long id);
    void deleteById(Long id);
}
