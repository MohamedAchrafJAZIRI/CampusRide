package com.campusride.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusride.model.Review;
import com.campusride.service.ReviewService;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController extends CrudController<Review> {
    public ReviewController(ReviewService service) {
        super(service);
    }
}
