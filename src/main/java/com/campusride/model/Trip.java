package com.campusride.model;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Entity
public class Trip extends BaseEntity {

    @NotNull(message = "departureTime is required")
    @Future(message = "departureTime must be in the future")
    private LocalDateTime departureTime;

    @Positive(message = "price must be positive")
    private double price;

    @Min(value = 1, message = "at least 1 seat")
    @Max(value = 8, message = "at most 8 seats")
    private int seats;

    @ManyToOne
    @NotNull(message = "driver is required")
    private Student driver;

    @ManyToOne
    @NotNull(message = "departureCity is required")
    private City departureCity;

    @ManyToOne
    @NotNull(message = "arrivalCity is required")
    private City arrivalCity;

    @OneToMany(mappedBy = "trip")
    @JsonIgnore
    private List<Booking> bookings;

    @OneToMany(mappedBy = "trip")
    @JsonIgnore
    private List<Review> reviews;

    public LocalDateTime getDepartureTime() { return departureTime; }
    public void setDepartureTime(LocalDateTime departureTime) { this.departureTime = departureTime; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getSeats() { return seats; }
    public void setSeats(int seats) { this.seats = seats; }

    public Student getDriver() { return driver; }
    public void setDriver(Student driver) { this.driver = driver; }

    public City getDepartureCity() { return departureCity; }
    public void setDepartureCity(City departureCity) { this.departureCity = departureCity; }

    public City getArrivalCity() { return arrivalCity; }
    public void setArrivalCity(City arrivalCity) { this.arrivalCity = arrivalCity; }

    public List<Booking> getBookings() { return bookings; }
    public void setBookings(List<Booking> bookings) { this.bookings = bookings; }

    public List<Review> getReviews() { return reviews; }
    public void setReviews(List<Review> reviews) { this.reviews = reviews; }
}
