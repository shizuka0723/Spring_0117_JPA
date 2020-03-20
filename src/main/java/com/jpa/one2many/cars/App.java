package com.jpa.one2many.cars;

import com.jpa.one2many.cars.entity.Car;
import com.jpa.one2many.cars.entity.Driver;
import com.jpa.one2many.cars.entity.Price;
import com.jpa.one2many.cars.service.CarService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    
    static CarService service;
    static {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.jpa");
        appContext.refresh();
        service = (CarService)appContext.getBean("CarService");
    }
    public static void main(String[] args) {
        save();
    }
    
    public static void save(){
        Driver driver = new Driver("John");
        Driver driver2 = new Driver("Mary");
        
        Price price = new Price(2000000);
        Price price2 = new Price(1800000);
        Price price3 = new Price(600000);
        
        Car car = new Car("Benz");
        Car car2 = new Car("BMW");
        Car car3 = new Car("TOYOTA");
        
        car.setDriver(driver);
        car.setPrice(price);
        car2.setDriver(driver2);
        car2.setPrice(price2);
        car3.setDriver(driver2);
        car3.setPrice(price3);
        
        service.getCarRepository().save(car);
        service.getCarRepository().save(car2);
        service.getCarRepository().save(car3);
    }
}
