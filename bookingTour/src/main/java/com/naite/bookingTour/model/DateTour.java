package com.naite.bookingTour.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "date_tour")
public class DateTour implements Serializable {
	/**
	 * 
	 * @author PHUONG MINH
	 */
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private DateTourId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("tourId")
    @JoinColumn(name = "tour_id")
    private Tour tour;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    public DateTour() {
        this.id = new DateTourId();
    }

    public DateTour(Tour tour, LocalDate startDate, LocalDate endDate) {
        this.id = new DateTourId();
        this.tour = tour;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}

@Embeddable
class DateTourId implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "tour_id")
    private Integer tourId;

    public DateTourId() {}

    public DateTourId(Integer tourId) {
        this.tourId = tourId;
    }
}