package com.campusride.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.campusride.model.Trip;

public interface TripRepository extends JpaRepository<Trip, Long> {

    // Custom query 1: trips between two cities
    List<Trip> findByDepartureCityNameAndArrivalCityName(String from, String to);

    // Custom query 2: cheap trips, soonest first
    List<Trip> findByPriceLessThanEqualOrderByDepartureTimeAsc(double maxPrice);

    // Custom query 3: average rating of a driver
    @Query("SELECT AVG(r.rating) FROM Review r WHERE r.trip.driver.id = :driverId")
    Double averageRatingOfDriver(@Param("driverId") Long driverId);
}
