package com.naite.bookingTour.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.naite.bookingTour.model.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	List<Category> findByName(String name);
	Optional<Category> findById(Long id);

}