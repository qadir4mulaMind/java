package com.csf.SecurityP03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BankController {

    @Autowired
    AccountService accountService;

    @GetMapping("/balance") // user
    public String getBalance(){
        return accountService.getBalance();
    }

    @PostMapping("/close") // admin
    public String closeAccount(){
        return accountService.closeAccount();
    }

    @GetMapping("/about")
    public String about(){
        return "hello sir we are not free right now.";
    }
}
