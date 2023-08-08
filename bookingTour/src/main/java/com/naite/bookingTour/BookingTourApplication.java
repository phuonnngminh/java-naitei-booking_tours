package com.naite.bookingTour;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })

public class BookingTourApplication {
	public static void main(String[] args) {
		SpringApplication.run(BookingTourApplication.class, args);
	}
}
