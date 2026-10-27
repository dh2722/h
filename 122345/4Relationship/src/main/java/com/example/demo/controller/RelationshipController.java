package com.example.demo.controller;

import com.example.demo.entity.Country;
import com.example.demo.entity.User;
import com.example.demo.entity.Employee;

import com.example.demo.repository.CountryRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RelationshipController {

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EmployeeRepository employeeRepository;


    // ==============================
    // COUNTRY
    // ==============================

    @PostMapping("/countries")
    public Country addCountry(@RequestBody Country country) {
        return countryRepository.save(country);
    }

    @GetMapping("/countries")
    public List<Country> getCountries() {
        return countryRepository.findAll();
    }


    // ==============================
    // USER
    // ==============================

    @PostMapping("/users")
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }


    // ==============================
    // EMPLOYEE
    // ==============================

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }
}