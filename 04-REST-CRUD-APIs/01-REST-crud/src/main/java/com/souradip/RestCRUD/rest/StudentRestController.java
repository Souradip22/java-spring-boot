package com.souradip.RestCRUD.rest;

import com.souradip.RestCRUD.classes.Student;
import com.souradip.RestCRUD.classes.StudentErrorResponse;
import com.souradip.RestCRUD.exceptions.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> studentRes = new ArrayList<>();

        studentRes.add(new Student("Lola", "Sing"));
        studentRes.add(new Student("Moni", "Ram"));
        studentRes.add(new Student("Mithhi", "Sing"));
        return studentRes;
    }

//    @ExceptionHandler
//    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc){
//        StudentErrorResponse error = new StudentErrorResponse();
//
//        error.setStatus(HttpStatus.NOT_FOUND.value());
//        error.setMessage(exc.getMessage());
//        error.setTimeStamp(System.currentTimeMillis());
//
//        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
//    }
//    //Handle the edge cases using generic exception
//    @ExceptionHandler
//    public ResponseEntity<StudentErrorResponse> handleException(Exception exc){
//        StudentErrorResponse error = new StudentErrorResponse();
//
//        error.setStatus(HttpStatus.BAD_REQUEST.value());
//        error.setMessage(exc.getMessage());
//        error.setTimeStamp(System.currentTimeMillis());
//
//        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
//    }

    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable int studentId) {
        List<Student> studentRes = new ArrayList<>();

        studentRes.add(new Student("Lola", "Sing"));
        studentRes.add(new Student("Moni", "Ram"));
        studentRes.add(new Student("Mithhi", "Sing"));

        if ((studentId > studentRes.size()) || (studentId < 0)) {
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }

        return studentRes.get(studentId);
    }
}
