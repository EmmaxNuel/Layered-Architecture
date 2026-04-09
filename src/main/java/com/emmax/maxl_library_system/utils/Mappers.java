package com.emmax.maxl_library_system.utils;

import com.emmax.maxl_library_system.data.model.Book;
import com.emmax.maxl_library_system.dto.AddBookResponse;
import com.emmax.maxl_library_system.dto.DeleteBookResponse;

public class Mappers {
    public static AddBookResponse mapAddBookResponse(Book book){
        AddBookResponse response = new AddBookResponse();
        response.setAuthor(book.getAuthor());
        response.setTitle(book.getTitle());
        response.setId(book.getId());
        response.setMessage(book.getTitle() + "  Added Successfully");
        return response;
    }

    public static DeleteBookResponse mapDeleteBookResponse(Book book){
        DeleteBookResponse response = new DeleteBookResponse();
        response.setMessage(book.getTitle() + " Deleted Successfully");
        return response;
    }
}
