package com.luketowell.webservices.repositories;

import com.luketowell.webservices.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ItemRepository extends JpaRepository <Item, String> {
}
