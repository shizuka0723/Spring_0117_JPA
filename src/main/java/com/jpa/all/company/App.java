package com.jpa.all.company;

import com.jpa.all.company.entity.Club;
import com.jpa.all.company.entity.Department;
import com.jpa.all.company.entity.Employee;
import static com.jpa.all.company.entity.Employee_.department;
import com.jpa.all.company.entity.Salary;
import com.jpa.all.company.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    static EmployeeService service;
    static {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.jpa");
        appContext.refresh();
        service = (EmployeeService) appContext.getBean("employeeService");
    }
    public static void main(String[] args) {
        save();
    }
    public static void save(){
        Salary salary = new Salary(50000);
        Salary salary2 = new Salary(40000);
        Salary salary3 = new Salary(30000);
        Salary salary4 = new Salary(20000);
        
        Club club = new Club("A");
        Club club2 = new Club("B");
        service.getClubRepository().save(club);
        service.getClubRepository().save(club2);
        
        Department department = new Department("IT");
        Department department2 = new Department("Sales");
        service.getDepartmentRepository().save(department);
        service.getDepartmentRepository().save(department2);
        
        Employee employee = new Employee("Vincent", salary, department);
        employee.getClubs().add(club);
        employee.getClubs().add(club2);
        Employee employee2 = new Employee("Anita", salary2, department2);
        Employee employee3 = new Employee("Howard", salary3, department2);
        employee3.getClubs().add(club2);
        Employee employee4 = new Employee("Joanna", salary4, department);
        
        service.getEmployeeRepository().save(employee);
        service.getEmployeeRepository().save(employee2);
        service.getEmployeeRepository().save(employee3);
        service.getEmployeeRepository().save(employee4);
    }
}
