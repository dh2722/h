package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

    @Autowired
    private EmployeeRepository repository;

    // POST - Add Employee
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return repository.save(employee);
    }

    // GET - Get All Employees
    @GetMapping
    public Iterable<Employee> getAllEmployees() {
        return repository.findAll();
    }

    // GET - Get Employee By ID
    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Integer id) {
        return repository.findById(id).orElse(null);
    }

    // PUT - Update Employee
    @PutMapping("/{id}")
    public Employee updateEmployee(
            @PathVariable Integer id,
            @RequestBody Employee employee) {

        Employee oldEmployee = repository.findById(id).orElse(null);

        if (oldEmployee != null) {
            oldEmployee.setName(employee.getName());
            oldEmployee.setDepartment(employee.getDepartment());
            oldEmployee.setSalary(employee.getSalary());

            return repository.save(oldEmployee);
        }

        return null;
    }

    // DELETE - Delete Employee
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Integer id) {

        repository.deleteById(id);

        return "Employee Deleted Successfully";
    }
}