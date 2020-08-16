package com.luketowell.webservices.controllers;

import com.luketowell.webservices.error.StatusNotFoundException;
import com.luketowell.webservices.models.Status;
import com.luketowell.webservices.repositories.StatusRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("status")
public class StatusController {
    StatusRepository statusRepository;

    public StatusController(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }

    @GetMapping("/all")
    public Iterable<Status> getAllStatus() {
       return statusRepository.findAll();
    }

    @GetMapping("/{id}")
    public Status getStatusById(@PathVariable Long id){
        return statusRepository.findById(id)
                .orElseThrow(() -> new StatusNotFoundException(id));
    }
}
