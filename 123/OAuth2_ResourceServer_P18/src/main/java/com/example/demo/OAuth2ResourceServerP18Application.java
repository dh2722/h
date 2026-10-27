package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OAuth2ResourceServerP18Application {

	public static void main(String[] args) {
		SpringApplication.run(OAuth2ResourceServerP18Application.class, args);
	}

}
/*
OAUTH2_RESOURCE_SERVER_P18 — POSTMAN TESTING


1. GET — ACCESS WITHOUT TOKEN

URL: http://localhost:8083/api/messages

Authorization: No Auth


2. GET — ACCESS WITH TOKEN

URL: http://localhost:8083/api/messages

Authorization → Bearer Token

Token: YOUR_ACCESS_TOKEN


3. GET — ACCESS PROTECTED RESOURCE

URL: http://localhost:8083/api/users

Authorization → Bearer Token

Token: YOUR_ACCESS_TOKEN


4. GET — TEST INVALID TOKEN

URL: http://localhost:8083/api/messages

Authorization → Bearer Token

Token: invalid_token


5. GET — TEST EXPIRED TOKEN

URL: http://localhost:8083/api/messages

Authorization → Bearer Token

Token: YOUR_EXPIRED_TOKEN
*/