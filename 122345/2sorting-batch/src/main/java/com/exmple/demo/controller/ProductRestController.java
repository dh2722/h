package com.exmple.demo.controller;

import com.example.demo.entity.Product;
import com.exmple.demo.Repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {

    @Autowired
    private ProductRepository repository;

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return repository.save(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Integer id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Product updateProduct(
            @PathVariable Integer id,
            @RequestBody Product product) {

        Product oldProduct = repository.findById(id).orElse(null);

        if (oldProduct != null) {
            oldProduct.setName(product.getName());
            oldProduct.setPrice(product.getPrice());
            oldProduct.setCategory(product.getCategory());
            oldProduct.setQuantity(product.getQuantity());

            return repository.save(oldProduct);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Integer id) {
        repository.deleteById(id);
        return "Product Deleted Successfully";
    }
}