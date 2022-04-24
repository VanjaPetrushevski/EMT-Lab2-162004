package com.example.laboratoriskavtora.service.impl;

import com.example.laboratoriskavtora.model.Author;
import com.example.laboratoriskavtora.model.exceptions.AuthorNotFoundException;
import com.example.laboratoriskavtora.repository.AuthorRepository;
import com.example.laboratoriskavtora.service.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    @Override
    public Author findById(Long authorId) {
        return this.authorRepository.findById(authorId)
                .orElseThrow(()-> new AuthorNotFoundException(authorId));
    }
}
