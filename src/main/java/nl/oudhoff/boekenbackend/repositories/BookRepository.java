package nl.oudhoff.boekenbackend.repositories;

import nl.oudhoff.boekenbackend.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findBookByTitle(String title);
}
