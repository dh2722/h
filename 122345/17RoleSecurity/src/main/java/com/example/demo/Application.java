package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
 * ADMIN API
GET
http://localhost:8097/admin

Username:
admin

Password:
1234


USER API
GET
http://localhost:8097/user

Username:
user

Password:
1234 */

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}