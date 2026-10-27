package com.example.demo.repository;

import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository
        extends JpaRepository<Employee, Integer> {

    // Find employees by department
    List<Employee> findByDepartment(String department);

    // Find employees whose salary is greater than given salary
    List<Employee> findBySalaryGreaterThan(double salary);

    // Find employees whose salary is less than given salary
    List<Employee> findBySalaryLessThan(double salary);

    // Find employees by name
    List<Employee> findByName(String name);

    // Find employees by department and salary
    List<Employee> findByDepartmentAndSalaryGreaterThan(
            String department,
            double salary
    );
}