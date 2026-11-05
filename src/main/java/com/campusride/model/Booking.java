package com.campusride.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

@Entity
public class Booking extends BaseEntity {

    private LocalDateTime bookedAt = LocalDateTime.now();

    @ManyToOne
    @NotNull(message = "passenger is required")
    private Student passenger;

    @ManyToOne
    @NotNull(message = "trip is required")
    private Trip trip;

    public LocalDateTime getBookedAt() { return bookedAt; }
    public void setBookedAt(LocalDateTime bookedAt) { this.bookedAt = bookedAt; }

    public Student getPassenger() { return passenger; }
    public void setPassenger(Student passenger) { this.passenger = passenger; }

    public Trip getTrip() { return trip; }
    public void setTrip(Trip trip) { this.trip = trip; }
}
