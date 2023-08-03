package com.naite.bookingTour.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "reviews")
public class Review implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer rating;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "tour_id")
    private Tour tour;

    
	public Review() {
		super();
	}

	public Review(Long id, String name, Integer rating, LocalDateTime createdAt, User user, Tour tour) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.createdAt = createdAt;
		this.user = user;
		this.tour = tour;
	}

    
}
