package com.naite.bookingTour.model;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

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
	
	@Size(max = 255)
	@Column(name = "name", length = 255)
	private String name;

    @Column(name = "description", columnDefinition = "TEXT")
	private String description;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;
    
    @Column(name = "location", columnDefinition = "TEXT")
    private String location;
    
    @Column(name= "duration", columnDefinition = "TEXT")
    private String duration;
    
    @Transient
    private String imageUrl;
    
    
    @ManyToMany
    @JoinTable(
        name = "tour_category",
        joinColumns = @JoinColumn(name = "tour_id"),
        inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Category> categories;
    
    public Tour() {
    	super();
	}

	public Tour(Long id, @Size(max = 255) String name, String description, BigDecimal price, String location,
			String duration, String imageUrl, List<Category> categories) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.location = location;
		this.duration = duration;
		this.imageUrl = imageUrl;
		this.categories = categories;
	}

		

}
