package com.souradip.crudDemo.DAO;

import com.souradip.crudDemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);
    Student findById(int id);
    List<Student> findAll();
    List<Student> findByLastName(String lastName);
    List<Student> findByFirstOrLastName(String name);
    List<Student> findByDomainMailId();
    void update(Student student);
    void delete(Integer id);
    int deleteAll();

}
