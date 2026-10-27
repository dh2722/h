package com.project.one_to_many_p5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToManyP5Application {

    public static void main(String[] args) {
        SpringApplication.run(OneToManyP5Application.class, args);
    }

}
/*
ONE_TO_MANY_P5 — POSTMAN TESTING


1. POST — ADD DEPARTMENT

URL: http://localhost:8083/api/departments

Body → raw → JSON

{
  "name": "IT"
}


2. GET ALL DEPARTMENTS

URL: http://localhost:8083/api/departments


3. GET DEPARTMENT BY ID

URL: http://localhost:8083/api/departments/1


4. POST — ADD EMPLOYEE TO DEPARTMENT

URL: http://localhost:8083/api/departments/1/employees

Body → raw → JSON

{
  "name": "Hasti",
  "salary": 50000
}


5. GET DEPARTMENT WITH EMPLOYEES

URL: http://localhost:8083/api/departments/1


6. GET ALL EMPLOYEES

URL: http://localhost:8083/api/employees


7. DELETE — DELETE DEPARTMENT

URL: http://localhost:8083/api/departments/1
*/