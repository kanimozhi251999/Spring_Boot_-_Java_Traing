package com.example.Assignment4.Controller;

import com.example.Assignment4.Exceptions.ResourseNotFound;
import com.example.Assignment4.Model.HeandlingException;
import com.example.Assignment4.Repository.ExceptionHandeleRepository;
import com.example.Assignment4.Services.ExceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExceptionController {
    @Autowired
    ExceptionService exceptionService;
    @Autowired
    ExceptionHandeleRepository exceptionHandeleRepository;

    @PostMapping("/student")
    @ResponseStatus(value = HttpStatus.OK, reason = "Your data is correct")
    private HeandlingException addAllStudent(@RequestBody HeandlingException heandlingException) {

        return exceptionService.addStudent(heandlingException);

    }
    @GetMapping("/{id}")
    public HeandlingException getId(@PathVariable(value = "id") String id) {
        return this.exceptionHandeleRepository.findById(id).orElseThrow(() -> new ResourseNotFound("Not Found"));
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<HeandlingException> getStudentDetail(@PathVariable("id") String id) {
        HeandlingException heandlingException = exceptionHandeleRepository.getById(id);
        if (heandlingException.getPassword() == null) {
            return new ResponseEntity("No information", HttpStatus.EXPECTATION_FAILED);
        } else if (heandlingException.getPassword().equals(2599)) {
            return new ResponseEntity(heandlingException, HttpStatus.OK);
        } else {
            return new ResponseEntity("Unauthorized", HttpStatus.UNAUTHORIZED);
        }
    }
}
