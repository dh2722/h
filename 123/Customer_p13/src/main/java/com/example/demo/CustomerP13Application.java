package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerP13Application {

	public static void main(String[] args) {
		SpringApplication.run(CustomerP13Application.class, args);
	}

}
/*
POST — ADD CUSTOMER

URL: http://localhost:8083/api/customers

Body → raw → JSON

{
  "name": "Hasti",
  "email": "hasti@gmail.com",
  "city": "Ahmedabad",
  "age": 23
}


GET ALL CUSTOMERS

URL: http://localhost:8083/api/customers


GET CUSTOMER BY ID

URL: http://localhost:8083/api/customers/1


PUT — UPDATE CUSTOMER

URL: http://localhost:8083/api/customers/1

Body → raw → JSON

{
  "name": "Hasti Maniya",
  "email": "hasti.maniya@gmail.com",
  "city": "Gandhinagar",
  "age": 24
}


DELETE — DELETE CUSTOMER

URL: http://localhost:8083/api/customers/1
*/