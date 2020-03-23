package com.jpa.all.company.dao;

import com.jpa.all.company.entity.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Integer>{
    
}
