package com.campusride.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.campusride.model.Trip;
import com.campusride.repository.TripRepository;

@Service
public class TripService extends CrudService<Trip> {

    private final TripRepository tripRepo;

    public TripService(TripRepository tripRepo) {
        super(tripRepo);
        this.tripRepo = tripRepo;
    }

    public List<Trip> search(String from, String to) {
        return tripRepo.findByDepartureCityNameAndArrivalCityName(from, to);
    }

    public List<Trip> cheaperThan(double max) {
        return tripRepo.findByPriceLessThanEqualOrderByDepartureTimeAsc(max);
    }

    public Double driverRating(Long driverId) {
        Double avg = tripRepo.averageRatingOfDriver(driverId);
        if (avg == null) {
            throw new NoSuchElementException("No reviews for driver " + driverId);
        }
        return avg;
    }
}
