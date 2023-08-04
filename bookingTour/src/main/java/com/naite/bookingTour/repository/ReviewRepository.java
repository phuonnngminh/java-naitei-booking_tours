package com.naite.bookingTour.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naite.bookingTour.model.Review;
import com.naite.bookingTour.model.Tour;
import com.naite.bookingTour.model.User;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByTour(Tour tour);

    List<Review> findByUser(User user);

    Optional<Review> findById(Long id);

    List<Review> findAll();
}