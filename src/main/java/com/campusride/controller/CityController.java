package com.campusride.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusride.model.City;
import com.campusride.service.CityService;

@RestController
@RequestMapping("/api/cities")
public class CityController extends CrudController<City> {
    public CityController(CityService service) {
        super(service);
    }
}
