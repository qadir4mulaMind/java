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

        return String.valueOf(this.balance);
    }

    @PostMapping("/add")
    public String updateBalance(@RequestParam String accountNumber, @RequestParam int amount){
        this.balance = this.balance + amount;
        return "Updated Balance: " + this.balance;
    }

    @GetMapping("/contact")
    public String contactUs(){
        return "You can contact us: 7455064261";
    }
}
