package com.example.demo;

import org.springframework.boot.SpringApplication;


/*
 * 
 * POST
http://localhost:8081/api/employees

Body:
{
  "name": "Hasti",
  "department": "IT",
  "salary": 50000
}

GET
http://localhost:8081/api/employees

GET BY ID
http://localhost:8081/api/employees/1

PUT
http://localhost:8081/api/employees/1

Body:
{
  "name": "Hasti Maniya",
  "department": "IT",
  "salary": 60000
}

DELETE
http://localhost:8081/api/employees/1*/
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeCrudApplication {

    public static void main(String[] args) {

        SpringApplication.run(EmployeeCrudApplication.class, args);

        System.out.println("=================================");
        System.out.println("   APPLICATION RUN SUCCESSFULLY  ");
        System.out.println("   Employee CRUD API Started     ");
        System.out.println("=================================");
    }
}