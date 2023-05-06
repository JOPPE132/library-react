package no.library.reactlibrary.controllers;
import java.util.List;
import no.library.reactlibrary.models.Book;
import no.library.reactlibrary.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController //Controller for RESTful web service
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(value = "/books", method = GET)
    public Iterable<Book> getBooks(){
        return this.bookRepository.findAll();
    }

}
