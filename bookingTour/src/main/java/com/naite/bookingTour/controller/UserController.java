package com.naite.bookingTour.controller;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;  


import com.naite.bookingTour.model.User;
import com.naite.bookingTour.service.UserService;


import java.util.Optional;  

@Controller  
public class UserController {  
  @Autowired private UserService userService;  

  @GetMapping("/")  
  public String addOrEidt(ModelMap model) {  
    User u = new User(); 
    model.addAttribute("USER", u);
    model.addAttribute("ACTION", "saveOrUpdate");  
    return "userRegister";  
  }  

  @PostMapping("/saveOrUpdate")  
  public String saveOrUpdate(ModelMap model, @ModelAttribute("USER") User user) {  
    userService.saveUser(user);  
    return "userRegister";  
  }  

  @RequestMapping("/edit/{username}")  
  public String editUser(ModelMap model, @PathVariable(name="username")String username) {  
    Optional<User> u = userService.findUserById(username);  
    if (u.isPresent()) {
    	model.addAttribute("USER", u.get());
    }else {
    	model.addAttribute("USER", new User());
    }
    model.addAttribute("ACTION","/saveOrUpdate");
    return "userRegister";  
  }  


  @RequestMapping("/delete/{username}") 
  public String deleteUser(ModelMap model, @PathVariable(name="username")String username) {  	
    userService.deleteUser(username);
    model.addAttribute("USER", userService.findAll());
    return "userHome";  
  }  
  
  
  @RequestMapping("/home")
  public String userHome() {
	  return "userHome";
  }
}