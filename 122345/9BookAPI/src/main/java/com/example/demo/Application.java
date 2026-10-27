package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* 
 * POST
http://localhost:8089/api/books

Body:
{
  "title": "Java Programming",
  "author": "James",
  "price": 500
}

GET ALL
http://localhost:8089/api/books

GET BY ID
http://localhost:8089/api/books/1

PUT
http://localhost:8089/api/books/1

Body:
{
  "title": "Advanced Java",
  "author": "James",
  "price": 700
}

DELETE
http://localhost:8089/api/books/1*/


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}