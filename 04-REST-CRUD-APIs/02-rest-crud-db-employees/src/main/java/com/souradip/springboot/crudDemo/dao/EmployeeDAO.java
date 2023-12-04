package com.souradip.springboot.crudDemo.dao;

import com.souradip.springboot.crudDemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee tempEmployee);
    void deleteById(int id);
}
