package geektime.spring.sdjpa.bootstrap;

import geektime.spring.sdjpa.domain.Book;
import geektime.spring.sdjpa.repository.BookRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Slf4j
@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        Book book1 = Book.builder()
                .title("Domain Driven Design")
                .isbn("123")
                .publisher("RandomHouse")
                .build();

        bookRepository.save(book1);
        log.info("Id1: {}", book1.getId());

        Book book2 = Book.builder()
                .title("Spring In Action")
                .isbn("456")
                .publisher("Oreily")
                .build();
        bookRepository.save(book2);
        log.info("Id2: {}", book2.getId());
    }
}
