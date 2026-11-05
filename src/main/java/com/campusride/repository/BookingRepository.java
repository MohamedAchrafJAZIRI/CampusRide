package com.campusride.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campusride.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
