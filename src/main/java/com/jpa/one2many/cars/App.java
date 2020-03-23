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
        service.getDriverRepository().save(driver);
        service.getDriverRepository().save(driver2);
        
        
        Price price = new Price(2000000);
        Price price2 = new Price(1800000);
        Price price3 = new Price(600000);
        
       Car car = new Car("Benz", price, driver);
       Car car2 = new Car("BMW", price2, driver2);
       Car car3 = new Car("TOYOTA", price3, driver);
        
        service.getCarRepository().save(car);
        service.getCarRepository().save(car2);
        service.getCarRepository().save(car3);
    }
}
