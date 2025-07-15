package com.engripaye.complete_iam_system.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/public")
    public String publicEndpoint(){
        return "This is a public endpoint.";
    }

    @GetMapping("/user")
    public String userEndpoint(@AuthenticationPrincipal Jwt jwt){
        return "Hello, " + jwt.getSubject() + "! This is a user endpoint.";
    }

    @GetMapping("/admin")
    public String adminEndpoint(@AuthenticationPrincipal Jwt jwt){
        return "Hello, " + jwt.getSubject() + "! This is an admin endpoint.";
    }


}
