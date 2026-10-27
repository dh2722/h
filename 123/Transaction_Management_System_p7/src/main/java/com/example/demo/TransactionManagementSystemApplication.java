package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TransactionManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionManagementSystemApplication.class, args);
	}

}
/*
TRANSACTION_MANAGEMENT_SYSTEM_P7 — POSTMAN TESTING


1. POST — CREATE ACCOUNT

URL: http://localhost:8083/api/accounts

Body → raw → JSON

{
  "accountHolder": "Hasti",
  "balance": 10000
}


2. GET ALL ACCOUNTS

URL: http://localhost:8083/api/accounts


3. GET ACCOUNT BY ID

URL: http://localhost:8083/api/accounts/1


4. POST — DEPOSIT MONEY

URL: http://localhost:8083/api/accounts/1/deposit

Body → raw → JSON

{
  "amount": 5000
}


5. POST — WITHDRAW MONEY

URL: http://localhost:8083/api/accounts/1/withdraw

Body → raw → JSON

{
  "amount": 2000
}


6. POST — TRANSFER MONEY

URL: http://localhost:8083/api/accounts/transfer

Body → raw → JSON

{
  "fromAccountId": 1,
  "toAccountId": 2,
  "amount": 1000
}


7. GET — CHECK ACCOUNT BALANCE

URL: http://localhost:8083/api/accounts/1


8. TEST — INSUFFICIENT BALANCE

URL: http://localhost:8083/api/accounts/1/withdraw

Body → raw → JSON

{
  "amount": 999999
}
*/