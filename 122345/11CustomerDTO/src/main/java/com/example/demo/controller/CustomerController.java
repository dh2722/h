package com.example.demo.controller;

import com.example.demo.entity.Customer;
import com.example.demo.dto.CustomerDTO;
import com.example.demo.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        return repository.save(customer);
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return repository.findAll();
    }

    @GetMapping("/search/{name}")
    public List<Customer> searchCustomer(
            @PathVariable String name) {

        return repository.findByNameContaining(name);
    }
}