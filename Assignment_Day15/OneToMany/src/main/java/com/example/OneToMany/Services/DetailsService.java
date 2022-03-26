package com.example.OneToMany.Services;

import com.example.OneToMany.Model.Address;
import com.example.OneToMany.Model.Student;
import com.example.OneToMany.Repository.AddressRepository;
import com.example.OneToMany.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
