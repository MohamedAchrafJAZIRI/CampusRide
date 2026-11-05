package com.campusride.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campusride.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}
