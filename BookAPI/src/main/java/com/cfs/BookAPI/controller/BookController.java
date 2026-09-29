package com.cfs.BookAPI.controller;

import com.cfs.BookAPI.entity.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/books")
public class BookController {
    private Map<String, Book> bookDB = new HashMap<>();

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks(){
        return ResponseEntity.ok(new ArrayList<>(bookDB.values()));
    }

    @PostMapping
    public ResponseEntity<Book> creatBook(@RequestBody Book book){
        bookDB.put(book.getId(), book);
        return ResponseEntity.status(HttpStatus.CREATED).body(book);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable String id){
        Book book = bookDB.get(id);
        if(book == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(book);
    }

    // Put: update book Fully
    @PutMapping("/{id}")
    public ResponseEntity<Void> updateBook(@PathVariable String id, @RequestBody Book book){
        Book existing = bookDB.get(id);
        if(book == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        bookDB.put(id, book);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build(); // 200 ok
    }

    @PatchMapping("/{id}/price")
    public ResponseEntity<Book> updatePrice(@PathVariable String id, @RequestBody Double newPrice){
        Book existing = bookDB.get(id);
        if(existing == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        existing.setPrice(newPrice);
        bookDB.put(id, existing);
        return ResponseEntity.ok(existing);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Book> updatePrice(@PathVariable String id){
        Book existing = bookDB.get(id);
        if(existing == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.noContent().build();
    }
}
