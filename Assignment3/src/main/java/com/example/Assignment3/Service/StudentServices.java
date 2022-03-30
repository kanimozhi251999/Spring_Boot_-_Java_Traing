package com.example.Assignment3.Service;

import com.example.Assignment3.Model.Student;
import com.example.Assignment3.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StudentServices {
    @Autowired
    StudentRepository studentRepository;

    public Student addStudent(Student students) {
        return studentRepository.save(students);
    }

    public  Student  getDetails(String name) {
        return  studentRepository.getByName(name);
    }

//    public Student saveOrUpdate(Student id) {
//        //Student student1=
//      //  return studentRepository.save(student);
//    }

    public void delete(String id) {
         studentRepository.deleteById(id);
    }
}
