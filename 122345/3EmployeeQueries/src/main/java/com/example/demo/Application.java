package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*/
POST
http://localhost:8083/api/employees

Body:
{
  "name": "Hasti",
  "department": "IT",
  "salary": 50000
}

GET ALL
http://localhost:8083/api/employees

GET BY ID
http://localhost:8083/api/employees/1

BY DEPARTMENT
http://localhost:8083/api/employees/department/IT

SALARY GREATER
http://localhost:8083/api/employees/salary/greater/40000

SALARY LESS
http://localhost:8083/api/employees/salary/less/50000

BY NAME
http://localhost:8083/api/employees/name/Hasti

DEPARTMENT + SALARY
http://localhost:8083/api/employees/search/IT/40000
*/




@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("Done!!");    }
}
