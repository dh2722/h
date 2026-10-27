package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductP10Application {

	public static void main(String[] args) {
		SpringApplication.run(ProductP10Application.class, args);
	}

}
/*
PRODUCT_P10 — POSTMAN TESTING


1. POST — ADD PRODUCT

URL: http://localhost:8083/api/products

Body → raw → JSON

{
  "name": "Laptop",
  "description": "Dell Laptop",
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
  "description": "HP Laptop 15",
  "price": 60000,
  "quantity": 15
}


5. DELETE — DELETE PRODUCT

URL: http://localhost:8083/api/products/1
*/
