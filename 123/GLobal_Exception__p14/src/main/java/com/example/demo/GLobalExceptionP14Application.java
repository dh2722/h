package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GLobalExceptionP14Application {

	public static void main(String[] args) {
		SpringApplication.run(GLobalExceptionP14Application.class, args);
	}

}
/*
GLOBAL_EXCEPTION_P14 — POSTMAN TESTING


1. POST — ADD EMPLOYEE

URL: http://localhost:8083/api/employees

Body → raw → JSON

{
  "name": "Hasti",
  "department": "IT",
  "salary": 50000
}


2. GET ALL EMPLOYEES

URL: http://localhost:8083/api/employees


3. GET EMPLOYEE BY ID

URL: http://localhost:8083/api/employees/1


4. PUT — UPDATE EMPLOYEE

URL: http://localhost:8083/api/employees/1

Body → raw → JSON

{
  "name": "Hasti Maniya",
  "department": "HR",
  "salary": 60000
}


5. DELETE — DELETE EMPLOYEE

URL: http://localhost:8083/api/employees/1


6. TEST GLOBAL EXCEPTION — INVALID ID

URL: http://localhost:8083/api/employees/9999


7. TEST GLOBAL EXCEPTION — INVALID DATA

URL: http://localhost:8083/api/employees

Body → raw → JSON

{
  "name": "",
  "department": "",
  "salary": -100
}
*/