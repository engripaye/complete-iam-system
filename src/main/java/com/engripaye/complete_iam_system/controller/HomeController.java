package com.engripaye.complete_iam_system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "IAM APP IS RUNNING SUCCESSFULLY! ";
    }
}
