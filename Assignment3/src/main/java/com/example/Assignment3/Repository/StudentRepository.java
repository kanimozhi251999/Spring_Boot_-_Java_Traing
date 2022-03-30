package com.example.Assignment3.Repository;

import com.example.Assignment3.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,String> {
    Student getByName(String name);

    void deleteById(String id);

    Student save(Student student);
}
