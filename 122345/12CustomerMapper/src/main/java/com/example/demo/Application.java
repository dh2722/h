package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* 
 * POST
http://localhost:8092/api/customers

Body:
{
  "name": "Hasti",
  "email": "hasti@gmail.com"
}

GET ALL
http://localhost:8092/api/customers*/

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}