package com.spring.securiy.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @GetMapping("/hello")
    public String hello(){
       return "hello";

    }


    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String hey(){
        return "hello admin";

    }
}
