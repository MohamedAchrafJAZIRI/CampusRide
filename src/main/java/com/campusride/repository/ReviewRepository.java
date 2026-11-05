package com.campusride.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campusride.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
