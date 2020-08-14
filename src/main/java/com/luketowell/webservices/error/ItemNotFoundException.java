package com.luketowell.webservices.error;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class ItemNotFoundException extends RuntimeException {

    public ItemNotFoundException(String upc){
        super ("Sorry, item with upc: " + upc + " has not been found");
    }
}
