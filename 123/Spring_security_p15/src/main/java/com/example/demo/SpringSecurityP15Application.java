package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityP15Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityP15Application.class, args);
	}

}
/*
SPRING_SECURITY_P15 — POSTMAN TESTING


1. GET — ACCESS WITHOUT LOGIN

URL: http://localhost:8083/api/hello

Authorization: No Auth


2. GET — ACCESS WITH LOGIN

URL: http://localhost:8083/api/hello

Authorization: Basic Auth

Username: user
Password: password


3. GET — ACCESS PROTECTED API

URL: http://localhost:8083/api/home

Authorization → Basic Auth

Username: user
Password: password


4. GET — TEST INVALID USERNAME

URL: http://localhost:8083/api/hello

Authorization → Basic Auth

Username: wronguser
Password: password


5. GET — TEST INVALID PASSWORD

URL: http://localhost:8083/api/hello

Authorization → Basic Auth

Username: user
Password: wrongpassword
*/
