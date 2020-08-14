package com.luketowell.webservices.repositories;

import com.luketowell.webservices.models.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, String> {
}
