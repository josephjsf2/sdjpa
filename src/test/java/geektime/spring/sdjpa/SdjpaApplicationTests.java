package geektime.spring.sdjpa;

import geektime.spring.sdjpa.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SdjpaApplicationTests {

    @Autowired
    BookRepository bookRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testBookRepository(){
        long count = bookRepository.count();
        assertThat(count).isGreaterThan(0);
    }

}
