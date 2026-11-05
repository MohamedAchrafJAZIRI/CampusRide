package com.campusride.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Student extends BaseEntity {

    @NotBlank(message = "name is required")
    private String name;

    @NotBlank
    @Email(message = "invalid email")
    @Column(unique = true)
    private String email;

    @OneToMany(mappedBy = "owner")
    @JsonIgnore
    private List<Car> cars;

    @OneToMany(mappedBy = "driver")
    @JsonIgnore
    private List<Trip> trips;

    @OneToMany(mappedBy = "passenger")
    @JsonIgnore
    private List<Booking> bookings;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public List<Car> getCars() { return cars; }
    public void setCars(List<Car> cars) { this.cars = cars; }

    public List<Trip> getTrips() { return trips; }
    public void setTrips(List<Trip> trips) { this.trips = trips; }

    public List<Booking> getBookings() { return bookings; }
    public void setBookings(List<Booking> bookings) { this.bookings = bookings; }
}
