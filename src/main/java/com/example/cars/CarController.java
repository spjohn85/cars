package com.example.cars;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarController {
    private CarService carService;

    @GetMapping("/cars/${name}")
    public Cars getCars(@PathVariable final String name){
        return carService.getCarDetails(name);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void CarNotFoundHandler(CarNotFoundException ex){

    }

}
