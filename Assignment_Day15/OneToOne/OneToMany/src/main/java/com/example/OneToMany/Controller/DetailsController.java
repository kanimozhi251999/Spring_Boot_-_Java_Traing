package com.example.OneToMany.Controller;

import com.example.OneToMany.Model.Address;
import com.example.OneToMany.Model.Student;
import com.example.OneToMany.Services.DetailsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


