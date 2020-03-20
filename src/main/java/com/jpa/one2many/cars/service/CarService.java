package com.jpa.one2many.cars.service;

import com.jpa.one2many.cars.dao.CarRepository;
import com.jpa.one2many.cars.dao.DriverRepository;
import com.jpa.one2many.cars.dao.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CarService")
public class CarService {
    @Autowired
    private CarRepository carRepository;
    
    @Autowired
    private DriverRepository driverRepository;
    
    @Autowired
    private PriceRepository priceRepository;

    public CarRepository getCarRepository() {
        return carRepository;
    }

    public DriverRepository getDriverRepository() {
        return driverRepository;
    }

    public PriceRepository getPriceRepository() {
        return priceRepository;
    }
    
    
}
