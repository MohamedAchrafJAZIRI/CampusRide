package com.campusride.service;

import org.springframework.stereotype.Service;

import com.campusride.model.Booking;
import com.campusride.repository.BookingRepository;

@Service
public class BookingService extends CrudService<Booking> {
    public BookingService(BookingRepository repo) {
        super(repo);
    }
}
