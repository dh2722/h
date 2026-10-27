package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*  
 * POST
http://localhost:8091/api/customers

Body:
{
  "name": "Hasti",
  "email": "hasti@gmail.com",
  "city": "Ahmedabad"
}

GET ALL
http://localhost:8091/api/customers

SEARCH
http://localhost:8091/api/customers/search/Hasti*/


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}