package com.naite.bookingTour.service;

import java.util.List;  

import com.naite.bookingTour.model.User;  

public interface UserManagementService {  
  List<User> getAllUser();  

  void saveUser(User user);  

  void deleteUser(Long id);  

  User findUserById(Long id);  
  
  User findByEmail(String email);
}