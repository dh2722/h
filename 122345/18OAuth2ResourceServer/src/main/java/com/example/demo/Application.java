package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*  
 * PUBLIC API
GET
http://localhost:8098/public


SECURE API
GET
http://localhost:8098/secure

Authorization:
Bearer Token

Token:
<JWT TOKEN>*/

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}