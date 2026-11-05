package com.campusride.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusride.model.Car;
import com.campusride.service.CarService;

@RestController
@RequestMapping("/api/cars")
public class CarController extends CrudController<Car> {
    public CarController(CarService service) {
        super(service);
    }
}
