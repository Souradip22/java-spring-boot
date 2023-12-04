package com.souradip.springboot.crudDemo.service;

import com.souradip.springboot.crudDemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee tempEmployee);
    void deleteById(int id);
}
