package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RbacSpringSecurityP17Application {

	public static void main(String[] args) {
		SpringApplication.run(RbacSpringSecurityP17Application.class, args);
	}

}
/*
RBAC_SPRING_SECURITY_P17 — POSTMAN TESTING


1. POST — LOGIN

URL: http://localhost:8083/auth/login

Body → raw → JSON

{
  "username": "admin",
  "password": "admin123"
}


2. GET — PUBLIC API

URL: http://localhost:8083/api/public


3. GET — USER ROLE API

URL: http://localhost:8083/api/user

Authorization → Bearer Token

Token: YOUR_USER_TOKEN


4. GET — ADMIN ROLE API

URL: http://localhost:8083/api/admin

Authorization → Bearer Token

Token: YOUR_ADMIN_TOKEN


5. GET — ACCESS WITHOUT TOKEN

URL: http://localhost:8083/api/admin

Authorization: No Auth


6. GET — ACCESS WITH USER TOKEN TO ADMIN API

URL: http://localhost:8083/api/admin

Authorization → Bearer Token

Token: YOUR_USER_TOKEN
*/