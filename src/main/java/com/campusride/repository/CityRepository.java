package com.campusride.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campusride.model.City;

public interface CityRepository extends JpaRepository<City, Long> {
}
