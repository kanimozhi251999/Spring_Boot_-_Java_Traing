package com.example.Db_connection.Controller;

import com.example.Db_connection.Model.Student;
import com.example.Db_connection.Repository.StudentRepository;
import com.example.Db_connection.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;
    @Autowired
    StudentRepository studentRepository;

//    @GetMapping("/studentname/{name}")
//    public Student getStudentName(@PathVariable("name") String name)
//    {
//        return  studentService.getStudent(name);
//    }
//    @GetMapping("/studentphonenumber/{phonenumber}")
//    public Student getStudentPhonenumber(@PathVariable("phonenumber") String phonenumber)
//    {
//        return  studentService.getPhoneNumber(phonenumber);
//    }
//    @GetMapping("/getEmail")
//    public Student getEmail(@RequestParam("email") String email)
//    {
//        return  studentService.getEmail(email);
//    }
    @PostMapping("/student")
    private List<Student> addAllStudent(@RequestBody List<Student> students)
    {
        return studentService.addStudent(students);


    }
    @GetMapping("/{get}")
    public Student findName(@RequestParam("name") String name){
        //Student student=studentRepository.findByNameOrEmailIdOrPhoneNumber(name,name,name);
        return studentService.findData(name);
    }
//    @GetMapping("/{get}")
//    public Student findName(@RequestParam("name") String name){
//        Student student=studentRepository.findByNameOrEmailIdOrPhoneNumber(name,name,name);
//        return student;
//    }

}
