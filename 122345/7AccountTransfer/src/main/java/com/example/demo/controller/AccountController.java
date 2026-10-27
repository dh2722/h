package com.example.demo.controller;

import com.example.demo.entity.Account;
import com.example.demo.repository.AccountRepository;
import com.example.demo.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @Autowired
    private AccountRepository repository;

    @Autowired
    private AccountService service;

    @PostMapping
    public Account addAccount(@RequestBody Account account) {
        return repository.save(account);
    }

    @GetMapping
    public List<Account> getAccounts() {
        return repository.findAll();
    }

    @PostMapping("/transfer")
    public String transfer(
            @RequestParam int fromId,
            @RequestParam int toId,
            @RequestParam double amount) {

        return service.transfer(fromId, toId, amount);
    }
}