package com.example.Assignment5.Services;

import com.example.Assignment5.Model.Student;
import com.example.Assignment5.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {
    @Autowired
    StudentRepository studentRepository;



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

    public List<Student> addStudent(List<Student> students) {
        return studentRepository.saveAll(students);
    }
}

