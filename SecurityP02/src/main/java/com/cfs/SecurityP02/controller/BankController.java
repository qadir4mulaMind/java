package com.cfs.SecurityP02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    @GetMapping("/contactUs")
    public String contactUs(){
        return "contact us at: 7455064261";
    }

    @GetMapping("/transfer")
    public String transfer(){
        return "Your money transfer sucessfully...";
    }

    @GetMapping("/admin")
    public String admin(){
        return "Welcome Admin";
    }

    @GetMapping("/about")
    public String about(){
        return "Abdul Qadir founder of 4mula Bank";
    }
}
