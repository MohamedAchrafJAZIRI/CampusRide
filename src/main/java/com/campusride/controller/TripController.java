package com.campusride.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.campusride.model.Trip;
import com.campusride.service.TripService;

@RestController
@RequestMapping("/api/trips")
public class TripController extends CrudController<Trip> {

    private final TripService tripService;

    public TripController(TripService tripService) {
        super(tripService);
        this.tripService = tripService;
    }

    // GET /api/trips/search?from=Tunis&to=Sousse
    @GetMapping("/search")
    public List<Trip> search(@RequestParam String from, @RequestParam String to) {
        return tripService.search(from, to);
    }

    // GET /api/trips/cheap?max=10
    @GetMapping("/cheap")
    public List<Trip> cheap(@RequestParam double max) {
        return tripService.cheaperThan(max);
    }

    // GET /api/trips/driver/1/rating
    @GetMapping("/driver/{id}/rating")
    public Double rating(@PathVariable Long id) {
        return tripService.driverRating(id);
    }
}
