package com.naite.bookingTour.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naite.bookingTour.model.Booking;
import com.naite.bookingTour.model.Booking.BookingStatus;
import com.naite.bookingTour.repository.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService {
	@Autowired
	private BookingRepository bookingRepository;

	@Override
	public List<Booking> findAll() {
		return bookingRepository.findAll();
	}

	@Override
	public Booking saveBooking(Booking booking) {
		return bookingRepository.save(booking);
	}

	@Override
	public void updateBookingStatus(Long id, BookingStatus status) {
		Optional<Booking> booking = bookingRepository.findById(id);
		if (booking.isPresent()) {
			Booking b = booking.get();
			b.setStatus(status);
			bookingRepository.save(b);
		}
	}

	@Override
	public Optional<Booking> getBookingById(Long id) {
		return bookingRepository.findById(id);
	}

	@Override
	public void deleteBooking(Long id) {
		bookingRepository.deleteById(id);
	}
}
