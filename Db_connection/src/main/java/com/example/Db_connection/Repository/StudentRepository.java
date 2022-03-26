package com.example.Db_connection.Repository;

import com.example.Db_connection.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,String > {
//   Student findByName(String name);
//    Student findByEmail(String email);
//   // Student findByPhoneNumber(String phonenumber);
//
//    Student findByPhonenumber(String phonenumber);
    Student findByNameOrEmailOrPhonenumber(String name, String name1, String name2);
}
