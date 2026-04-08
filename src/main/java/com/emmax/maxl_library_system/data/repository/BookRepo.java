package com.emmax.maxl_library_system.data.repository;

import com.emmax.maxl_library_system.data.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo extends MongoRepository<Book, String> {
}
