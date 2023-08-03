package com.naite.bookingTour.model;


import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String username;
    
    private String password;
    
    private String email;
    
    @Column(name = "fullname")
    private String fullName;
    
    private String phone;
    
    private String address;
    
    private int role;

}
