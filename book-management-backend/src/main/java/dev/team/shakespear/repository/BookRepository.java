package dev.team.shakespear.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dev.team.shakespear.model.Book;

@Repository
public class BookRepository {


    private List<Book> runs = new ArrayList<>();

    public List<Book> findAll(){
        return runs;
    }


    private void init(){
        runs.add(new Book(id: 1,
        title:"lotr",
        author: "Tolkien",
        publishedYear : 1952,
        price : 28.25,
        
        ));
    }
    
}
