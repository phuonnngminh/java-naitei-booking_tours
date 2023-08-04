package com.naite.bookingTour.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login() {
        return "pages/auth_login";
    }
    
    @GetMapping("/register")
    public String register() {
    	return "pages/auth_register";
    }
}