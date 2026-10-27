package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/* 
 * 
 * POST ACCOUNT
http://localhost:8087/api/accounts

Body:
{
  "name": "Hasti",
  "balance": 10000
}

POST ACCOUNT
http://localhost:8087/api/accounts

Body:
{
  "name": "Rahul",
  "balance": 5000
}

GET ACCOUNTS
http://localhost:8087/api/accounts

TRANSFER
POST
http://localhost:8087/api/accounts/transfer?fromId=1&toId=2&amount=2000*/

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}