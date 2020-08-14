package com.luketowell.webservices.repositories;

import com.luketowell.webservices.models.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
