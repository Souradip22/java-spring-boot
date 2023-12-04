package com.souradip.springboot.crudDemo.dao;

import com.souradip.springboot.crudDemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
