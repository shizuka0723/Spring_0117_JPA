package com.jpa.one2many.cars.dao;

import com.jpa.one2many.cars.entity.Price;
import org.springframework.data.repository.CrudRepository;

public interface PriceRepository extends CrudRepository<Price, Long>{
    
}
