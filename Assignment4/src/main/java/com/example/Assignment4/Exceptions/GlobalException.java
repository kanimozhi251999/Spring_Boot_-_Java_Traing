package com.example.Assignment4.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(ResourseNotFound.class)
    public ResponseEntity<?> responseEntity(ResourseNotFound exception, WebRequest request) {
        Errordetails errordetail = new Errordetails(new Date(), exception.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errordetail, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(Unauthorized.class)
    public ResponseEntity<?> unauthorizedException(HttpClientErrorException.Unauthorized ex) {
       // ExceptionResponse response=new ExceptionResponse();
       // response.setErrorCode("UNAUTHORIZED");
        //response.setErrorMessage(ex.getMessage());
        //response.setTimestamp(LocalDateTime.now());
//        Errordetails errordetail = new Errordetails(new Date(), exception.getMessage(), request.getDescription(false));
//        return new ResponseEntity<>(errordetail, HttpStatus.BAD_REQUEST);

        return new ResponseEntity("Unauthorized", HttpStatus.UNAUTHORIZED);
    }
}
