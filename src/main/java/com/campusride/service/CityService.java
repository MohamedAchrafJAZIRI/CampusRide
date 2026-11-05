package com.campusride.service;

import org.springframework.stereotype.Service;

import com.campusride.model.City;
import com.campusride.repository.CityRepository;

@Service
public class CityService extends CrudService<City> {
    public CityService(CityRepository repo) {
        super(repo);
    }
}
