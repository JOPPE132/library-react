package no.library.reactlibrary.controllerTests;

import no.library.reactlibrary.controllers.BookController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class BookControllerTest {

    @Autowired
    private BookController bookController;

    @Test
    @DisplayName("Test1: Test if bookController is not null, and injected successfully")
    void contextLoads(){
        assertThat(bookController).isNotNull();
    }



}
