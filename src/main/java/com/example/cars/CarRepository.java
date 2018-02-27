package com.example.cars;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

public interface CarRepository extends CrudRepository<Cars, String>{
    Cars findByName(String name);
}