package com.project.one_to_one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneToOneApplication.class, args);
    }

}
/*
ONE_TO_ONE_P4 — POSTMAN TESTING


1. POST — ADD PERSON

URL: http://localhost:8083/api/persons

Body → raw → JSON

{
  "name": "Hasti",
  "email": "hasti@gmail.com"
}


2. GET ALL PERSONS

URL: http://localhost:8083/api/persons


3. GET PERSON BY ID

URL: http://localhost:8083/api/persons/1


4. POST — ADD ADDRESS

URL: http://localhost:8083/api/addresses

Body → raw → JSON

{
  "street": "Satellite Road",
  "city": "Ahmedabad"
}


5. GET ADDRESS BY ID

URL: http://localhost:8083/api/addresses/1


6. GET PERSON WITH ADDRESS

URL: http://localhost:8083/api/persons/1


7. PUT — UPDATE PERSON

URL: http://localhost:8083/api/persons/1

Body → raw → JSON

{
  "name": "Hasti Maniya",
  "email": "hasti.maniya@gmail.com"
}


8. DELETE — DELETE PERSON

URL: http://localhost:8083/api/persons/1
*/