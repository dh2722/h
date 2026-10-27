package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/public")
    public String publicApi() {
        return "Public API Working";
    }

    @GetMapping("/secure")
    public String secureApi() {
        return "Secure API Working";
    }

    @PostMapping("/secure")
    public String postSecureApi(@RequestBody String data) {
        return "Data Received: " + data;
    }
}