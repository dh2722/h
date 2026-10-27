package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/* 
 * POST COURSE
http://localhost:8086/api/courses

Body:
{
  "name": "Java"
}

GET COURSES
http://localhost:8086/api/courses

POST STUDENT
http://localhost:8086/api/students

Body:
{
  "name": "Hasti",
  "courses": [
    {
      "id": 1
    }
  ]
}

GET STUDENTS
http://localhost:8086/api/students*/


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}