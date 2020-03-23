package com.jpa.all.company.dao;

import com.jpa.all.company.entity.Salary;
import org.springframework.data.repository.CrudRepository;

public interface SalaryRepository extends CrudRepository<Salary, Integer>{
    
}
