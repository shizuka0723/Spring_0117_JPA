package com.jpa.one2many.cars.dao;

import com.jpa.one2many.cars.entity.Driver;
import org.springframework.data.repository.CrudRepository;

public interface DriverRepository extends CrudRepository<Driver, Long>{
    
}
