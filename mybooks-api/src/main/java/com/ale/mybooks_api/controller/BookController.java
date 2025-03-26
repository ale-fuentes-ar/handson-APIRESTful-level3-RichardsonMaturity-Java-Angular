package com.ale.mybooks_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ale.mybooks_api.model.Book;
import com.ale.mybooks_api.repository.BookRepository;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {

    private final BookRepository bookRepository;

    @GetMapping()
    public ResponseEntity<List<Book>> getAllBooks(@RequestParam String param) {
        return ResponseEntity.ok(bookRepository.findAll());
    }
    

}