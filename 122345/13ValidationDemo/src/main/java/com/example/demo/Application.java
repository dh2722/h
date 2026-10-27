package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* 
 * POST
http://localhost:8093/api/students

VALID BODY:
{
  "name": "Hasti",
  "email": "hasti@gmail.com",
  "age": 22
}

INVALID BODY:
{
  "name": "",
  "email": "wrong",
  "age": 15
} */

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}