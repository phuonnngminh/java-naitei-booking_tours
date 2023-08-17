package com.naite.bookingTour.service;

import java.util.List;
import java.util.Optional;

import com.naite.bookingTour.model.Booking;
import com.naite.bookingTour.model.Booking.BookingStatus;

public interface BookingService {
	List<Booking> findAll();
	Booking saveBooking(Booking booking);
	void updateBookingStatus(Long id, BookingStatus status);
	Optional<Booking> getBookingById(Long id);
	void deleteBooking(Long id);
}
