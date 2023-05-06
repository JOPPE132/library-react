package no.library.reactlibrary.controllers;

import no.library.reactlibrary.models.Author;
import no.library.reactlibrary.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @RequestMapping(value = "/authors", method = GET)
    public Iterable<Author> getAuthors(){
        return this.authorRepository.findAll();
    }

}
