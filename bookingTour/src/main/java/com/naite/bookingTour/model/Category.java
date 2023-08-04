package com.naite.bookingTour.model;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "categories")
public class Category implements Serializable {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String name;

    public Category(){
        super();
    }

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
