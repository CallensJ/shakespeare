package dev.team.shakespear.service;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import dev.team.shakespear.model.Book;
import dev.team.shakespear.repository.BookRepository;

@Service
public class BookService {
    

   private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(int id) {
        return bookRepository.findById(id);
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }
}
