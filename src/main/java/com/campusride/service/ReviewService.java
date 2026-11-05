package com.campusride.service;

import org.springframework.stereotype.Service;

import com.campusride.model.Review;
import com.campusride.repository.ReviewRepository;

@Service
public class ReviewService extends CrudService<Review> {
    public ReviewService(ReviewRepository repo) {
        super(repo);
    }
}
