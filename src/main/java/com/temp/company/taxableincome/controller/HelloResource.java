package com.temp.company.taxableincome.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloResource {

    @GetMapping(value="greetings", produces = MediaType.APPLICATION_JSON_VALUE )
    public String greetings(){
        return "Welcome!";
    }
}
