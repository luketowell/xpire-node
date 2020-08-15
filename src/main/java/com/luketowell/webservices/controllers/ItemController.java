package com.luketowell.webservices.controllers;

import com.luketowell.webservices.error.ItemNotFoundException;
import com.luketowell.webservices.models.Item;
import com.luketowell.webservices.repositories.ItemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("item")
public class ItemController {

    ItemRepository itemRepository;

    @GetMapping("/{upc}")
    public Item findItemById(@PathVariable String upc){
        return itemRepository.findById(upc)
                .orElseThrow(() -> new ItemNotFoundException(upc));
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Item insertNewItem(@RequestBody Item item){
        System.out.println(item.toString());
       return itemRepository.save(item);
    }
}
