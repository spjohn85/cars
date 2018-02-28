package com.example.cars;

import org.springframework.stereotype.Service;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository=carRepository;
    }

    public Cars getCarDetails(String s) {
        Cars c= carRepository.findByName(s);
        if(c==null)
            throw new CarNotFoundException();
        return c;
    }
}
