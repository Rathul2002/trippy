package com.trippy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    private String get() {
        return "Hello World";
    }

    @GetMapping("/name")
    private String setName(@RequestParam String name) {
        return "Name = "+name;
    }
}
