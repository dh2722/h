package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RegisterLoginPswP16Application {

	public static void main(String[] args) {
		SpringApplication.run(RegisterLoginPswP16Application.class, args);
	}

}
/*
REGISTER_LOGIN_PSW_P16 — POSTMAN TESTING


1. POST — REGISTER

URL: http://localhost:8083/api/auth/register

Body → raw → JSON

{
  "username": "hasti",
  "email": "hasti@gmail.com",
  "password": "Hasti@123"
}


2. POST — LOGIN

URL: http://localhost:8083/api/auth/login

Body → raw → JSON

{
  "username": "hasti",
  "password": "Hasti@123"
}


3. POST — LOGIN WITH WRONG PASSWORD

URL: http://localhost:8083/api/auth/login

Body → raw → JSON

{
  "username": "hasti",
  "password": "Wrong@123"
}


4. POST — REGISTER WITH EXISTING USERNAME

URL: http://localhost:8083/api/auth/register

Body → raw → JSON

{
  "username": "hasti",
  "email": "hasti@gmail.com",
  "password": "Hasti@123"
}


5. POST — REGISTER WITH INVALID DATA

URL: http://localhost:8083/api/auth/register

Body → raw → JSON

{
  "username": "",
  "email": "invalid-email",
  "password": ""
}
*/