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
	/**
	 * 
	 * @author PHUONG MINH
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "name")
	private String name;
	
	public Category(){
        super();
    }

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
