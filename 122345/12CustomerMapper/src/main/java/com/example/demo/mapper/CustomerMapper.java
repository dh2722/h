package com.example.demo.mapper;

import com.example.demo.entity.Customer;
import com.example.demo.dto.CustomerDTO;

public class CustomerMapper {

    public static CustomerDTO toDTO(Customer customer) {

        CustomerDTO dto = new CustomerDTO();

        dto.setName(customer.getName());
        dto.setEmail(customer.getEmail());

        return dto;
    }

    public static Customer toEntity(CustomerDTO dto) {

        Customer customer = new Customer();

        customer.setName(dto.getName());
        customer.setEmail(dto.getEmail());

        return customer;
    }
}