package com.campusride.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusride.model.Booking;
import com.campusride.service.BookingService;

@RestController
@RequestMapping("/api/bookings")
public class BookingController extends CrudController<Booking> {
    public BookingController(BookingService service) {
        super(service);
    }
}
