package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * POST DEPARTMENT
http://localhost:8085/api/departments

Body:
{
  "name": "IT"
}

GET DEPARTMENTS
http://localhost:8085/api/departments

POST EMPLOYEE
http://localhost:8085/api/employees

Body:
{
  "name": "Hasti",
  "salary": 50000,
  "department": {
    "id": 1
  }
}

GET EMPLOYEES
http://localhost:8085/api/employees*/

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}