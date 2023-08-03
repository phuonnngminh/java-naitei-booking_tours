package com.naite.bookingTour.model;


import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "tours")
public class Tour implements Serializable {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
	private Long id;
	
	@Size(max = 200)
	@Column(name = "tour_name", length = 200)
    private String name;

    @Column(name = "description", columnDefinition = "TEXT")
	private String description;

    @Column(name = "price", precision = 18, scale = 2)
    private BigDecimal price;
    
    @Column(name = "location", columnDefinition = "TEXT")
    private String location;
    
    @Column(name= "duration")
    private Integer duration;
    
    @Transient
    private String imageUrl;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category categoryId;
    
    public Tour() {
    	super();
	}

	public Tour(String name, String description, BigDecimal price, String location, Integer duration,
			String imageUrl, Category categoryId) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.location = location;
		this.duration = duration;
		this.imageUrl = imageUrl;
		this.categoryId = categoryId;
	}

}
