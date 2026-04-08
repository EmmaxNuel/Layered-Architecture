package com.emmax.maxl_library_system.data.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Book {
    @Id
    private String id;
    private String title;
    private String author;
}
