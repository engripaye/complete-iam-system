package com.engripaye.complete_iam_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/login")
    public String login() {
        return "login"; // You need to have login.html in src/main/resources/templates/
    }

    @GetMapping("/home")
    public String home() {
        return "home"; // You need to have home.html in src/main/resources/templates/
    }

    @GetMapping("/welcome")
    public String index() {
        return "redirect:/login";
    }
}
