package com.example.Assignment3.Controller;

import ch.qos.logback.core.joran.conditional.IfAction;
import com.example.Assignment3.Model.Student;
import com.example.Assignment3.Repository.StudentRepository;
import com.example.Assignment3.Service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class StudentController {
    @Autowired
    StudentServices studentServices;
    @Autowired
    StudentRepository studentRepository;
    @PostMapping("/student")
    @ResponseStatus(value = HttpStatus.OK,reason = "Your data is correct")
    private Student addAllStudent(@RequestBody Student students)
    {

            return studentServices.addStudent(students);

    }
    @GetMapping("/get/{name}")
    public Student getStudentDetail(@PathVariable("name") String name)
    {
        return  studentServices.getDetails(name);
    }
    @PutMapping("/studentupdate/{id}")
    private Student update(@PathVariable("id") String id,@RequestBody Student student)
    {
        Student student1=studentRepository.getById(id);
        student1.setAge(student.getAge());
        student1.setHeight(student.getHeight());
        student1.setWeight(student.getWeight());
        return studentRepository.save(student1);

    }
    @DeleteMapping("/{id}")
    private void deleteStudent(@PathVariable("id") String id)
    {
        studentServices.delete(id);

    }
    @RequestMapping(value = "/{name}",method =RequestMethod.GET )
    public ResponseEntity<Student>getStudent(@PathVariable String name)
    {
        try
        {
            Student student=studentRepository.getByName(name);
            student.getAge();
            student.getHeight();
            student.getWeight();
            return new  ResponseEntity<>(student,HttpStatus.OK);
        }

        catch (Exception e)
        {
            return new ResponseEntity("Not present student details.",HttpStatus.BAD_REQUEST);
        }
    }
  }



