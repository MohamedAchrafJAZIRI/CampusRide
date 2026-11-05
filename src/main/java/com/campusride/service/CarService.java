package com.campusride.service;

import org.springframework.stereotype.Service;

import com.campusride.model.Car;
import com.campusride.repository.CarRepository;

@Service
public class CarService extends CrudService<Car> {
    public CarService(CarRepository repo) {
        super(repo);
    }
}
