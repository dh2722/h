package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product addProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product getProduct(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Product updateProduct(Integer id, Product product) {

        Product oldProduct = repository.findById(id).orElse(null);

        if (oldProduct != null) {

            oldProduct.setName(product.getName());
            oldProduct.setPrice(product.getPrice());

            return repository.save(oldProduct);
        }

        return null;
    }

    public String deleteProduct(Integer id) {

        repository.deleteById(id);

        return "Product Deleted Successfully";
    }
}