package com.cfs.SecurityP01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    int balance = 1000;

    @GetMapping("/balance")
    public String getBalance(){
        return "10000";
    }

    @PostMapping("/add")
    public int updateBalance(@RequestParam String accountNumber, @RequestParam int amount){
        return balance + amount;
    }
}
