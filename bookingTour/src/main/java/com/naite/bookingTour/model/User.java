package com.naite.bookingTour.model;


import java.io.Serializable;

import com.naite.bookingTour.model.Booking.BookingStatus;

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
    
    @Column(unique = true)
    private String username;
    
    private String password;
    
    @Column(unique = true)
    private String email;
    
    @Column(name = "fullname")
    private String fullName;
    
    @Column(unique = true)
    private String phone;
    
    private String address;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;
    
    public enum Role {
    	ADMIN,
    	USER
    }

	public User() {
		super();
	}

	public User(Long id, String username, String password, String email, String fullName, String phone, String address,
			Role role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.fullName = fullName;
		this.phone = phone;
		this.address = address;
		this.role = role;
	}

}
