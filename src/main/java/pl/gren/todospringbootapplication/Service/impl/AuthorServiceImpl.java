package pl.gren.todospringbootapplication.Service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.gren.todospringbootapplication.Model.Author;
import pl.gren.todospringbootapplication.Repository.AuthorRepository;
import pl.gren.todospringbootapplication.Service.AuthorService;

import java.util.List;

@Service
@Transactional
public class AuthorServiceImpl implements AuthorService {


    @Autowired private AuthorRepository authorRepository;

    @Override
    public List<Author> getAllAuthors() {
        return (List<Author>) authorRepository.findAll();
    }
}
