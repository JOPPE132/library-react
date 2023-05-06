package no.library.reactlibrary;

import no.library.reactlibrary.models.Book;
import no.library.reactlibrary.models.User;
import no.library.reactlibrary.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactLibraryApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(ReactLibraryApplication.class);

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(ReactLibraryApplication.class, args);
		logger.info("Application started..");
	}

	/**
	 * For CommandLineRunner //execute code before application start
	 *
	 * @param args
	 * @throws Exception
	 */
	@Override
	public void run(String... args) throws Exception {
	}
}
