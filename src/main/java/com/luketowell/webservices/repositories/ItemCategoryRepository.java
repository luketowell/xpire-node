package com.luketowell.webservices.repositories;

import com.luketowell.webservices.models.ItemCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemCategoryRepository extends JpaRepository<ItemCategory, Long> {
}
