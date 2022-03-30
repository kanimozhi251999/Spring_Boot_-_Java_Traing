package com.example.Assignment4.Services;

import com.example.Assignment4.Model.HeandlingException;
import com.example.Assignment4.Repository.ExceptionHandeleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExceptionService {
    @Autowired
    ExceptionHandeleRepository exceptionHandeleRepository;

    public HeandlingException addStudent(HeandlingException heandlingException) {
        return exceptionHandeleRepository.save(heandlingException);
    }

    public  HeandlingException  getDetails(String id) {
        return  exceptionHandeleRepository.getById(id);
    }

}
