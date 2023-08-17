package com.naite.bookingTour.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naite.bookingTour.model.Booking;
import com.naite.bookingTour.service.BookingService;

@Component
@RequestMapping("admin/bookings")
public class BookingsController {
	@Autowired
    private BookingService bookingService;

	@GetMapping
    public String getBookings(Model model) {
        List<Booking> bookings = bookingService.findAll();
        model.addAttribute("bookings", bookings);
        return "admin/booking-list";
    }
	
	
}
