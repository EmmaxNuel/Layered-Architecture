package com.emmax.maxl_library_system.controller;

import com.emmax.maxl_library_system.dto.AddBookRequest;
import com.emmax.maxl_library_system.dto.DeleteBookRequest;
import com.emmax.maxl_library_system.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping("")
@RestController
public class BookController {
    @Autowired
    public BookService service;

    @PostMapping("/book")
    public ResponseEntity<?> addBook(@RequestBody AddBookRequest request){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.addBook(request));
    }

    @GetMapping("/book/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable DeleteBookRequest request){
        return ResponseEntity.status(HttpStatus.FOUND).body(service.deleteBook(request));
    }

}
