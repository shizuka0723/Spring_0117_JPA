package com.jpa.one2many.cars.dao;

import com.jpa.one2many.cars.entity.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long>{
    
}
