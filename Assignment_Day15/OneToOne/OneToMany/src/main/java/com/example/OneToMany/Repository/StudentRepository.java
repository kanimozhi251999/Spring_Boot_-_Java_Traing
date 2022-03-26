package com.example.OneToMany.Repository;

import com.example.OneToMany.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,String> {
    Student save(Student students);
}
