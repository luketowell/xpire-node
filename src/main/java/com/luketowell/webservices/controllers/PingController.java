package com.luketowell.webservices.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("ping")
public class PingController {
    public PingController() {
    }

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public String pingCheck(){
        return "Ping Successful";
    }
}
