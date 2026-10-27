package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/* 
 * POST   http://localhost:8084/api/countries
POST   http://localhost:8084/api/users
POST   http://localhost:8084/api/employees

GET    http://localhost:8084/api/countries
GET    http://localhost:8084/api/users
GET    http://localhost:8084/api/employees*/



@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}