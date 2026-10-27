package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* 
 * POST
http://localhost:8088/api/products

Body:
{
  "name": "Laptop",
  "price": 50000
}

GET PAGINATION
http://localhost:8088/api/products?page=0&size=2

GET SORTING
http://localhost:8088/api/products/sort?page=0&size=10&field=price*/
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}