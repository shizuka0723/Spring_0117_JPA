package com.jpa.all.company.service;

import com.jpa.all.company.dao.ClubRepository;
import com.jpa.all.company.dao.DepartmentRepository;
import com.jpa.all.company.dao.EmployeeRepository;
import com.jpa.all.company.dao.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ClubRepository clubRepository;
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private SalaryRepository salaryRepository;

    public EmployeeRepository getEmployeeRepository() {
        return employeeRepository;
    }

    public ClubRepository getClubRepository() {
        return clubRepository;
    }

    public DepartmentRepository getDepartmentRepository() {
        return departmentRepository;
    }

    public SalaryRepository getSalaryRepository() {
        return salaryRepository;
    }
    
    
}
