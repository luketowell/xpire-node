package com.luketowell.webservices.controllers;

import com.luketowell.webservices.models.ItemCategory;
import com.luketowell.webservices.repositories.ItemCategoryRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("itemCategory")
public class ItemCategoryController {

    private final ItemCategoryRepository itemCategoryRepository;

    public ItemCategoryController(ItemCategoryRepository itemCategoryRepository) {
        this.itemCategoryRepository = itemCategoryRepository;
    }

    @GetMapping("/all")
    public Iterable<ItemCategory> getItemCategories() {
        return itemCategoryRepository.findAll();
    }
}
