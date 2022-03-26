package com.example.OneToOne.Controller;

import com.example.OneToOne.Model.Address;
import com.example.OneToOne.Model.Student;
import com.example.OneToOne.Service.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DetailsController {
    @Autowired
    DetailsService detailsService;

    @PostMapping("/student")
    private Student addAllStudent(@RequestBody Student students)
    {
        return detailsService.addStudent(students);


    }
    @GetMapping("/get/{city}")
    public Address getAddressDetail(@PathVariable("city") String city)
    {
        return  detailsService.getAddress(city);
    }
    @GetMapping("/{pincode}")
    public Address getAddress(@PathVariable("pincode") String pincode)
    {
        return  detailsService.get(pincode);
    }
    }
