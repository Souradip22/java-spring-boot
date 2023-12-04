package com.souradip.crudDemo;

import com.souradip.crudDemo.DAO.StudentDAO;
import com.souradip.crudDemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDao){
		return runner -> {
			createStudent(studentDao);
//			readStudent(studentDao);
//			readObjects(studentDao);
//			updateStudent(studentDao);
//			deleteStudent(studentDao);
//			deleteAllStudents(studentDao);
		};

	}

	private void deleteAllStudents(StudentDAO studentDao) {
		System.out.println("DELETING all data from students table" + studentDao.deleteAll());
	}

	private void deleteStudent(StudentDAO studentDao) {
		studentDao.delete(1);
	}

	private void updateStudent(StudentDAO studentDao) {
		int stuId = 1;
		System.out.println("Getting Student with ID: " + stuId);
		Student tempStudent = studentDao.findById(stuId);

		tempStudent.setFirstName("Updated FirstName");

		studentDao.update(tempStudent);
		System.out.println("Student Updated: " + tempStudent);

	}

	private void readObjects(StudentDAO studentDao) {
		System.out.println("Inside read objects...");

		System.out.println("findAll(): ");
		List<Student> res1 = studentDao.findAll();
		System.out.println("findAll() returned: " + res1);

		System.out.println("findByLastName(): ");
		List<Student> res2 = studentDao.findByLastName("Chandra");
		System.out.println("findByLastName() returned: " + res2);

		System.out.println("findByFirstOrLastName(): ");
		List<Student> res3 = studentDao.findByFirstOrLastName("souradip");
		System.out.println("findByFirstOrLastName() returned: " + res3);

		System.out.println("findByDomainMailId(): ");
		List<Student> res4 = studentDao.findByDomainMailId();
		System.out.println("findByDomainMailId() returned: " + res4);
	}

	private void readStudent(StudentDAO studentDao) {
		System.out.println("Inside read Student");
		Student student1 = new Student("Rahul", "Kumar", "rj@gmail.com");
		System.out.println("Save method calling...");
		studentDao.save((student1));
		System.out.println("Save successful");
		Student tempStudent = studentDao.findById((student1.getId()));
		System.out.println("Found the student: " + tempStudent);
	}

	private void createStudent(StudentDAO studentDao){
		System.out.println("Inside create Student");
		Student student1 = new Student("Lola", "Sing", "lola@gmail.com");
		System.out.println("Save method about to call");
		studentDao.save(student1);
		System.out.println("Save successful");
	}
}
