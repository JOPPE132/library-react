package no.library.reactlibrary.repositories;

import java.util.List;
import java.util.Optional;

import no.library.reactlibrary.models.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BookRepository extends CrudRepository<Book, Integer> {

    //Fetch cars by price
    List<Book> findByPublisher(@Param("publisher") String publisher);

    @Query("SELECT b FROM Book b WHERE b.name LIKE '%Jordan Peterson%'")
    List<Book> findBookByPublisher(String publisher);


    Optional<Book> findByName(String bookName);

    Optional<Book> findByBid(int bid);

}
