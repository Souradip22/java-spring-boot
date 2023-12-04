package com.souradip.springboot.crudDemo.rest;

import com.souradip.springboot.crudDemo.entity.Employee;
import com.souradip.springboot.crudDemo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    //quick and dirty: inject employee dao
    private EmployeeService tempEmpService;
    public EmployeeRestController(EmployeeService empService) {
        tempEmpService = empService;
    }
    // expose "/employees" endpoint and return list of employees
    @GetMapping("/employees")
    List<Employee> findAll() {
        return this.tempEmpService.findAll();
    }
    @GetMapping("/employees/{employeeId}")
    Employee getEmployee(@PathVariable int employeeId) {
        Employee theEmployee = this.tempEmpService.findById(employeeId);
        if (theEmployee == null){
            throw new RuntimeException("Employee id not found " + employeeId);
        }
        return theEmployee;
    }

    @PostMapping("/employees")
    Employee addEmployee(@RequestBody Employee theEmployee){

        // just in case client pass an id in JSON... set  id to 0
        // this is to force a save of new item ... instead of update
        theEmployee.setId(0);
        Employee dbEmployee = tempEmpService.save(theEmployee);
        return dbEmployee;
    }

    @PutMapping("/employees")
    Employee updateEmployee(@RequestBody Employee theEmployee){
        Employee dbEmployee = tempEmpService.save(theEmployee);
        return dbEmployee;
    }

    @DeleteMapping("employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){
        Employee tempEmployee = tempEmpService.findById(employeeId);

        if (tempEmployee == null){
            throw new RuntimeException("Employee id not found " + employeeId);
        }
        tempEmpService.deleteById(employeeId);
        return "Deleted employee id " + employeeId;
    }
}
