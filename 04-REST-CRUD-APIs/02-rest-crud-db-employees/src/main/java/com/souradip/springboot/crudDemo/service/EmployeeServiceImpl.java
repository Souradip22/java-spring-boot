package com.souradip.springboot.crudDemo.service;

import com.souradip.springboot.crudDemo.dao.EmployeeDAO;
import com.souradip.springboot.crudDemo.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeDAO empDAO;

    public EmployeeServiceImpl() {
    }

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO tempEmpDAO){
        this.empDAO = tempEmpDAO;
    }
    @Override
    public List<Employee> findAll() {
        return this.empDAO.findAll();
    }

    @Override
    public Employee findById(int id) {
        return empDAO.findById(id);
    }
    @Transactional
    @Override
    public Employee save(Employee tempEmployee) {
        return empDAO.save(tempEmployee);
    }
    @Transactional
    @Override
    public void deleteById(int id) {
        empDAO.deleteById(id);
    }
}
