package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookRepository repository;

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return repository.save(book);
    }

    @GetMapping
    public List<Book> getBooks() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Integer id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Book updateBook(
            @PathVariable Integer id,
            @RequestBody Book book) {

        Book oldBook = repository.findById(id).orElse(null);

        if (oldBook != null) {
            oldBook.setTitle(book.getTitle());
            oldBook.setAuthor(book.getAuthor());
            oldBook.setPrice(book.getPrice());

            return repository.save(oldBook);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Integer id) {

        repository.deleteById(id);

        return "Book Deleted Successfully";
    }
}