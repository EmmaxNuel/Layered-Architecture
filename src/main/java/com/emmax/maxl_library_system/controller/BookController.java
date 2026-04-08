package com.emmax.maxl_library_system.controller;

import com.emmax.maxl_library_system.dto.AddBookRequest;
import com.emmax.maxl_library_system.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("")
@RestController
public class BookController {
    @Autowired
    public BookService service;

    @PostMapping("/book")
    public ResponseEntity<?> addBook(@RequestBody AddBookRequest request){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.addBook(request));
    }
}
