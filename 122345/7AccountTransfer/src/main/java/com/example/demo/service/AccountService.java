package com.example.demo.service;

import com.example.demo.entity.Account;
import com.example.demo.repository.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {

    @Autowired
    private AccountRepository repository;

    @Transactional
    public String transfer(int fromId, int toId, double amount) {

        Account from = repository.findById(fromId).orElse(null);
        Account to = repository.findById(toId).orElse(null);

        if (from == null || to == null) {
            return "Account not found";
        }

        if (from.getBalance() < amount) {
            return "Insufficient Balance";
        }

        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);

        repository.save(from);
        repository.save(to);

        return "Money Transferred Successfully";
    }
}