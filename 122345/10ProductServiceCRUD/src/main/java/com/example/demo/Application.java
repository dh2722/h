package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* 
 * POST
http://localhost:8090/api/products

Body:
{
  "name": "Laptop",
  "price": 50000
}

GET ALL
http://localhost:8090/api/products

GET BY ID
http://localhost:8090/api/products/1

PUT
http://localhost:8090/api/products/1

Body:
{
  "name": "Gaming Laptop",
  "price": 70000
}

DELETE
http://localhost:8090/api/products/1*/



@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}