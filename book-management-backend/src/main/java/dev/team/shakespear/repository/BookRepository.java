package dev.team.shakespear.repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import dev.team.shakespear.model.Book;

@Repository
public class BookRepository {
    

    private final List<Book> books = new ArrayList<>();
    


    public List<Book> findAll(){
      return books;  
    }

    public Optional<Book> findById(int id){
        return books.stream().filter(book-> book.getId().equals(id)).findFirst();
    }

    public Book save(Book book){
        if (book.getId() == null) { // Nouveau livre
            book.setId(generateId());
            books.add(book);
        } else { // Mise à jour
            deleteById(book.getId());
            books.add(book);
        }
        return book;
    }

    private int generateId(){
        return books.isEmpty() ? 1 : books.get(books.size() - 1).getId() + 1;
    }

    public void deleteById(int id) {
        books.removeIf(book -> book.getId().equals(id));
    }
}
