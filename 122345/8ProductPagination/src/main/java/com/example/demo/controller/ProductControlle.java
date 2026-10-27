package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductControlle {

    @Autowired
    private ProductRepository repository;

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return repository.save(product);
    }

    @GetMapping
    public Page<Product> getProducts(
            @RequestParam int page,
            @RequestParam int size) {

        return repository.findAll(
                PageRequest.of(page, size)
        );
    }

    @GetMapping("/sort")
    public Page<Product> sortProducts(
            @RequestParam int page,
            @RequestParam int size,
            @RequestParam String field) {

        return repository.findAll(
                PageRequest.of(
                        page,
                        size,
                        Sort.by(field)
                )
        );
    }
}