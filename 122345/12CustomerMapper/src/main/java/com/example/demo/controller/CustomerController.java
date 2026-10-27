package com.example.demo.controller;

import com.example.demo.entity.Customer;
import com.example.demo.dto.CustomerDTO;
import com.example.demo.mapper.CustomerMapper;
import com.example.demo.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @PostMapping
    public CustomerDTO addCustomer(
            @RequestBody CustomerDTO dto) {

        Customer customer =
                CustomerMapper.toEntity(dto);

        Customer saved =
                repository.save(customer);

        return CustomerMapper.toDTO(saved);
    }

    @GetMapping
    public List<CustomerDTO> getCustomers() {

        return repository.findAll()
                .stream()
                .map(CustomerMapper::toDTO)
                .collect(Collectors.toList());
    }
}