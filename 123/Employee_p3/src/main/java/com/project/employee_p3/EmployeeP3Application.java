package com.project.employee_p3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeP3Application {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeP3Application.class, args);
    }

}
/*
EMPLOYEE_P3 — POSTMAN TESTING


1. POST — ADD EMPLOYEE

URL: http://localhost:8083/api/employees

Body → raw → JSON

{
  "name": "Hasti",
  "email": "hasti@gmail.com",
  "department": "IT",
  "salary": 50000
}


2. GET ALL EMPLOYEES

URL: http://localhost:8083/api/employees


3. GET EMPLOYEE BY ID

URL: http://localhost:8083/api/employees/1


4. PUT — UPDATE EMPLOYEE

URL: http://localhost:8083/api/employees/1

Body → raw → JSON

{
  "name": "Hasti Maniya",
  "email": "hasti.maniya@gmail.com",
  "department": "HR",
  "salary": 60000
}


5. DELETE — DELETE EMPLOYEE

URL: http://localhost:8083/api/employees/1
*/