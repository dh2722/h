package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;


    // =====================================
    // ADD EMPLOYEE
    // =====================================

    @PostMapping
    public Employee addEmployee(
            @RequestBody Employee employee) {

        return repository.save(employee);
    }


    // =====================================
    // GET ALL EMPLOYEES
    // =====================================

    @GetMapping
    public List<Employee> getAllEmployees() {

        return repository.findAll();
    }


    // =====================================
    // GET EMPLOYEE BY ID
    // =====================================

    @GetMapping("/{id}")
    public Employee getEmployee(
            @PathVariable Integer id) {

        return repository.findById(id).orElse(null);
    }


    // =====================================
    // FIND BY DEPARTMENT
    // =====================================

    @GetMapping("/department/{department}")
    public List<Employee> getByDepartment(
            @PathVariable String department) {

        return repository.findByDepartment(department);
    }


    // =====================================
    // SALARY GREATER THAN
    // =====================================

    @GetMapping("/salary/greater/{salary}")
    public List<Employee> getSalaryGreater(
            @PathVariable double salary) {

        return repository.findBySalaryGreaterThan(salary);
    }


    // =====================================
    // SALARY LESS THAN
    // =====================================

    @GetMapping("/salary/less/{salary}")
    public List<Employee> getSalaryLess(
            @PathVariable double salary) {

        return repository.findBySalaryLessThan(salary);
    }


    // =====================================
    // FIND BY NAME
    // =====================================

    @GetMapping("/name/{name}")
    public List<Employee> getByName(
            @PathVariable String name) {

        return repository.findByName(name);
    }


    // =====================================
    // DEPARTMENT + SALARY
    // =====================================

    @GetMapping("/search/{department}/{salary}")
    public List<Employee> searchEmployee(
            @PathVariable String department,
            @PathVariable double salary) {

        return repository.findByDepartmentAndSalaryGreaterThan(
                department,
                salary
        );
    }
}