package com.project.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductsApplication.class, args);
    }

}
/*
PRODUCTS_P2 — POSTMAN TESTING


1. POST — ADD PRODUCT

URL: http://localhost:8083/api/products

Body → raw → JSON

{
  "name": "Laptop",
  "price": 55000,
  "quantity": 10
}


2. GET ALL PRODUCTS

URL: http://localhost:8083/api/products


3. GET PRODUCT BY ID

URL: http://localhost:8083/api/products/1


4. PUT — UPDATE PRODUCT

URL: http://localhost:8083/api/products/1

Body → raw → JSON

{
  "name": "HP Laptop",
  "price": 60000,
  "quantity": 15
}


5. DELETE — DELETE PRODUCT

URL: http://localhost:8083/api/products/1
*/