package com.emmax.maxl_library_system.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddBookResponse {
    private String message;
    private String title;
    private String author;
    private String id;

}
