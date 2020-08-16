package com.luketowell.webservices.controllers;

import com.luketowell.webservices.error.CategoryNotFoundException;
import com.luketowell.webservices.models.ItemCategory;
import com.luketowell.webservices.repositories.ItemCategoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("itemcategory")
public class ItemCategoryController {

    private final ItemCategoryRepository itemCategoryRepository;

    public ItemCategoryController(ItemCategoryRepository itemCategoryRepository) {
        this.itemCategoryRepository = itemCategoryRepository;
    }

    @GetMapping("/all")
    public Iterable<ItemCategory> getItemCategories() {
        return itemCategoryRepository.findAll();
    }

    @GetMapping("/{id}")
    public ItemCategory getItemCategory(@PathVariable Long id) {
        return itemCategoryRepository.findById(id)
                .orElseThrow(() -> new CategoryNotFoundException(id));
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public ItemCategory newItemCategory(@RequestBody ItemCategory itemCategory){
        return itemCategoryRepository.save(itemCategory);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCategory ( @PathVariable Long id) {
        itemCategoryRepository.deleteById(id);
    }
}
