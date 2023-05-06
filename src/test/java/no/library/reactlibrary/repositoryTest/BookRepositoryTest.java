package no.library.reactlibrary.repositoryTest;

import no.library.reactlibrary.models.Book;
import no.library.reactlibrary.repositories.BookRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test CRUD operations for repository
 */
@SpringBootTest
public class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    @DisplayName("Create")
    void findBookByName(){
        this.bookRepository.save(new Book("Demobook", 200, " Gyldendal"));
        assertThat(bookRepository.findByName("Demobook").isPresent()).isTrue();
    }

    @Test
    @DisplayName("Read")
    void findExistingBookById(){
        // Find the book with ID 1
        Optional<Book> optionalBook = bookRepository.findByBid(1);
        assertThat(optionalBook.isPresent()).isTrue();

        Book book = optionalBook.get();
        assertEquals("12 Rules of Life", book.getName());
    }

    @Test
    @DisplayName("Update")
    void updateBookByName() {
        // Find the book with ID 1
        Optional<Book> optionalBook = this.bookRepository.findByBid(1);
        assertThat(optionalBook.isPresent()).isTrue();

        // Update the book's name to "13 Rules of Life"
        Book book = optionalBook.get();
        book.setName("13 Rules of Life");

        // Save the updated book to the database
        Book updatedBook = this.bookRepository.save(book);

        // Check if the book's name has been updated
        assertEquals("13 Rules of Life", updatedBook.getName());
    }

    @Test
    @DisplayName("Delete")
    void deleteBookById() {
        // Find the book with ID 1
        Optional<Book> optionalBook = this.bookRepository.findByBid(1);
        assertThat(optionalBook.isPresent()).isTrue();

        // Delete the book from the database
        this.bookRepository.deleteById(1);

        // Try to find the book by ID and check if it's null
        Optional<Book> deletedBook = this.bookRepository.findByBid(1);
        assertThat(deletedBook.isPresent()).isFalse();
    }

}
