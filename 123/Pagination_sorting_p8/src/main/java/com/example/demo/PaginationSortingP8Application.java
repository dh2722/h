package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaginationSortingP8Application {

	public static void main(String[] args) {
		SpringApplication.run(PaginationSortingP8Application.class, args);
	}

}
/*
PAGINATION_SORTING_P8 — POSTMAN TESTING


1. GET ALL EMPLOYEES

URL: http://localhost:8083/api/employees


2. PAGINATION — FIRST PAGE

URL: http://localhost:8083/api/employees?page=0&size=5


3. PAGINATION — SECOND PAGE

URL: http://localhost:8083/api/employees?page=1&size=5


4. SORT BY NAME — ASCENDING

URL: http://localhost:8083/api/employees?sortBy=name&direction=asc


5. SORT BY NAME — DESCENDING

URL: http://localhost:8083/api/employees?sortBy=name&direction=desc


6. SORT BY SALARY — ASCENDING

URL: http://localhost:8083/api/employees?sortBy=salary&direction=asc


7. SORT BY SALARY — DESCENDING

URL: http://localhost:8083/api/employees?sortBy=salary&direction=desc


8. PAGINATION + SORTING

URL: http://localhost:8083/api/employees?page=0&size=5&sortBy=name&direction=asc
*/