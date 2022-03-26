package com.example.Db_connection.Service;

import com.example.Db_connection.Model.Student;
import com.example.Db_connection.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
//
//    public List<Student> getAllStudent(List<Student> student)
//    {
//        //List<Student> student = new ArrayList<Student>();
//        studentRepository.findAll().forEach(student1 -> student.add(student1));
//        return student;
//
//
//    }
//
//    public Student getStudent(String name) {
//        return studentRepository.findByName(name);
//    }
//
//    public Student getEmail(String email) {
//        return studentRepository.findByEmail(email);
//    }
    public List<Student> addStudent(List<Student> students) {
        return studentRepository.saveAll(students);
    }
//
//    public Student getPhoneNumber(String phonenumber) {
//        return studentRepository.findByPhonenumber(phonenumber);
//    }


    public Student findData(String name) {
        return studentRepository.findByNameOrEmailOrPhonenumber(name,name,name);
    }
}
