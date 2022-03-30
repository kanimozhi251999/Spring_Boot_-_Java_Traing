package com.example.Assignment5.Controller;

import com.example.Assignment5.Model.Student;
import com.example.Assignment5.Repository.StudentRepository;
import com.example.Assignment5.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentServices studentServices;
    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/api/student")
    @ResponseStatus(value = HttpStatus.OK, reason = "Your data is correct")
    private List<Student> addAllStudent(@RequestBody List<Student> students) {

        return (List<Student>) studentServices.addStudent(students);

    }

    @GetMapping("/api/get/{name}")
    public Student getStudentDetail(@PathVariable("name") String name) {
        return studentServices.getDetails(name);
    }

    @PutMapping("/api/studentupdate/{id}")
    private Student update(@PathVariable("id") String id, @RequestBody Student student) {
        Student student1 = studentRepository.getById(id);
        student1.setAge(student.getAge());
        return studentRepository.save(student1);

    }

    @DeleteMapping("/api/{id}")
    private void deleteStudent(@PathVariable("id") String id) {
        studentServices.delete(id);

    }

}