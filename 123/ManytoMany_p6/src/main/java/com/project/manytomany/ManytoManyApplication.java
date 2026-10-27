package com.project.manytomany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManytoManyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManytoManyApplication.class, args);
    }

}
/*
MANYTO MANY_P6 — POSTMAN TESTING


1. POST — ADD STUDENT

URL: http://localhost:8083/api/students

Body → raw → JSON

{
  "name": "Hasti",
  "email": "hasti@gmail.com"
}


2. GET ALL STUDENTS

URL: http://localhost:8083/api/students


3. GET STUDENT BY ID

URL: http://localhost:8083/api/students/1


4. POST — ADD COURSE

URL: http://localhost:8083/api/courses

Body → raw → JSON

{
  "courseName": "Java"
}


5. GET ALL COURSES

URL: http://localhost:8083/api/courses


6. ASSIGN COURSE TO STUDENT

URL: http://localhost:8083/api/students/1/courses/1


7. GET STUDENT WITH COURSES

URL: http://localhost:8083/api/students/1


8. DELETE — DELETE STUDENT

URL: http://localhost:8083/api/students/1
*/