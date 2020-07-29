package com.asda.xpire.controllers;

import com.asda.xpire.models.Item;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ItemController {

    private static final String template = "Get Item Hello World!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/items")
    public String ping(){
        return template;
    }
}
