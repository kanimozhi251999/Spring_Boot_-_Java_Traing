package com.example.SampleWeb.Controller;

import com.example.SampleWeb.Service.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;
@RestController
public class Web {
    @Autowired
    Student student;
    @GetMapping("/hello")
    public String hello() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String name=sc.nextLine();
        System.out.println("LENGTH:"+name.length());
        System.out.println("Enter the year:");
        Integer a=sc.nextInt();
        switch(a){
            case 1:{
                return student.first();
            }
            case 2:{
                return student.second();
            }
            case 3:{
                return student.third();
            }
            default:
                break;
        }
        return name;
    }
}
