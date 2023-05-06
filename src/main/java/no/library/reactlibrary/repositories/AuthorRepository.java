package no.library.reactlibrary.repositories;

import org.springframework.data.repository.CrudRepository;
import no.library.reactlibrary.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Integer> {
}

