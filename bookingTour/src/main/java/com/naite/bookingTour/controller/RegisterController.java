package com.naite.bookingTour.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.naite.bookingTour.model.User;
import com.naite.bookingTour.service.UserManagementService;

import jakarta.validation.Valid;

@Controller
public class RegisterController {

    private final UserManagementService userService;

    public RegisterController(UserManagementService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "pages/auth_register";
    }

    @PostMapping("/register/save")
    public String registration(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
        User existingUserEmail = userService.findByEmail(user.getEmail());

        if (existingUserEmail != null) {
            result.rejectValue("email", null, "There is already an account registered with the same email");
        }

        if (result.hasErrors()) {
            model.addAttribute("user", user);
            return "pages/auth_register";
        }

        userService.saveUser(user);
        return "redirect:/register?success";
    }
}
