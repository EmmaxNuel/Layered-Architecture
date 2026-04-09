package com.emmax.maxl_library_system.service;

import com.emmax.maxl_library_system.data.model.Book;
import com.emmax.maxl_library_system.data.repository.BookRepo;
import com.emmax.maxl_library_system.dto.AddBookRequest;
import com.emmax.maxl_library_system.dto.AddBookResponse;
import com.emmax.maxl_library_system.dto.DeleteBookRequest;
import com.emmax.maxl_library_system.dto.DeleteBookResponse;
import com.emmax.maxl_library_system.utils.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepo repo;

    public AddBookResponse addBook(AddBookRequest request){
        Book book = new Book();
        book.setAuthor(request.getAuthor());
        book.setTitle(request.getTitle());
        repo.save(book);
        AddBookResponse response = new AddBookResponse();
        return Mappers.mapAddBookResponse(book);
    }

    public


}
