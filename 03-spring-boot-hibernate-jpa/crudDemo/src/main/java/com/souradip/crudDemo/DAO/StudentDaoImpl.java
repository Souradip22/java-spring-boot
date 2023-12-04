package com.souradip.crudDemo.DAO;

import com.souradip.crudDemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDAO{

    private EntityManager entityManager;
    @Autowired
    public StudentDaoImpl(EntityManager tempEntityManager) {
        this.entityManager = tempEntityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        this.entityManager.persist(student);
    }

    @Override
    public Student findById(int id) {
        return this.entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> tempQuery = entityManager.createQuery("FROM Student order by lastName desc", Student.class);
        return tempQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        TypedQuery<Student> tempQuery = entityManager.createQuery("FROM Student WHERE lastName=:inpLastName", Student.class);
        tempQuery.setParameter("inpLastName", lastName);
        return tempQuery.getResultList();
    }

    @Override
    public List<Student> findByFirstOrLastName(String name) {
        TypedQuery<Student> tempQuery = entityManager.createQuery("FROM Student WHERE lastName=:inpName or firstName=:inpName", Student.class);
        tempQuery.setParameter("inpName", name);
        return tempQuery.getResultList();
    }

    @Override
    public List<Student> findByDomainMailId() {
        TypedQuery<Student> tempQuery = entityManager.createQuery("FROM Student WHERE email LIKE '%rocketmail.com'", Student.class);
        return tempQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Student tempStudent = entityManager.find(Student.class, id);
        entityManager.remove(tempStudent);
    }

    @Override
    @Transactional
    public int deleteAll() {
        int rowsAffected = entityManager.createQuery("DELETE FROM Student").executeUpdate();
        return rowsAffected;
    }
}
