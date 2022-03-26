package com.example.OneToOne.Service;

import com.example.OneToOne.Model.Address;
import com.example.OneToOne.Model.Student;
import com.example.OneToOne.Repository.AddressRepository;
import com.example.OneToOne.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DetailsService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    AddressRepository addressRepository;
    public Student addStudent(Student students) {
        return studentRepository.save(students);
    }
    public Address getAddress(String city) {
        return  addressRepository.findByCity(city);
    }
    public Address get(String pincode) {
        return  addressRepository.findByPincode(pincode);
    }
}
