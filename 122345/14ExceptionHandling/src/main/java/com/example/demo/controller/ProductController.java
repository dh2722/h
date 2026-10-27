package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.exception.ProductNotFoundException;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable int id) {

        if (id != 1) {
            throw new ProductNotFoundException(
                    "Product not found");
        }

        Product p = new Product();
        p.setId(1);
        p.setName("Laptop");

        return p;
    }
}