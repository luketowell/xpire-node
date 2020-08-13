package com.luketowell.webservices.error;

public class CategoryNotFoundException extends RuntimeException{
    public CategoryNotFoundException(Long id){
        super ("Sorry, the category with id: " + id + " was not found.");
    }
}
