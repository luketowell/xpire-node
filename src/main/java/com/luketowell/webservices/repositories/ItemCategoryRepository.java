package com.luketowell.webservices.repositories;

import com.luketowell.webservices.models.ItemCategory;
import org.springframework.data.repository.CrudRepository;

public interface ItemCategoryRepository extends CrudRepository <ItemCategory, Long> {
}
