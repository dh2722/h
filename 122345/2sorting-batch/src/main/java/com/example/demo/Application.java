package com.example.demo;

/*
//POST    /api/products
//GET     /api/products
//GET     /api/products/{id}
//PUT     /api/products/{id}
//DELETE  /api/products/{id}
//POST    /api/products/batch
//GET     /api/products/sort/price/asc
//GET     /api/products/sort/price/desc
//GET     /api/products/sort/name

*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("=================================");
        System.out.println("   PRODUCT CRUD APPLICATION");
        System.out.println("   APPLICATION STARTED");
        System.out.println("=================================");
    }
}

