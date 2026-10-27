package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerP11Application {

	public static void main(String[] args) {
		SpringApplication.run(CustomerP11Application.class, args);
	}

}
/*

1. POST — Add Customer

URL: http://localhost:8081/api/customer

Body → raw → JSON

{
  "name": "Hasti",
  "city": "Ahmedabad",
  "age": 23
}


2. GET — Get Customer By ID

URL: http://localhost:8081/api/customer/1


3. GET — Search Customer

URL: http://localhost:8081/api/customer/search?city=Ahmedabad&minAge=18


4. PUT — Update Customer

URL: http://localhost:8081/api/customer/1

Body → raw → JSON

{
  "name": "Hasti Maniya",
  "city": "Gandhinagar",
  "age": 24
}


5. DELETE — Delete Customer

URL: http://localhost:8081/api/customer/1


6. GET — Test Wrong Customer ID

URL: http://localhost:8081/api/customer/9999


7. PUT — Test Wrong Customer ID

URL: http://localhost:8081/api/customer/9999

Body → raw → JSON

{
  "name": "Test",
  "city": "Surat",
  "age": 22
}


8. DELETE — Test Wrong Customer ID

URL: http://localhost:8081/api/customer/9999


9. POST — Test Invalid JSON

URL: http://localhost:8081/api/customer

Body → raw → JSON

{
  "name": "Hasti",
  "city": "Ahmedabad",
  "age":
}

*/